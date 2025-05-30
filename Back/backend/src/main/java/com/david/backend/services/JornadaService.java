package com.david.backend.services;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Arbitro;
import com.david.backend.entities.Equipo;
import com.david.backend.entities.Jornada;
import com.david.backend.entities.JornadaConPartidosDTO;
import com.david.backend.entities.Partido;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoArbitro;
import com.david.backend.repos.RepoJornada;
import com.david.backend.repos.RepoPartido;

@Service
public class JornadaService implements Crud<Jornada, Integer>{
    private final RepoJornada repo;
    private final RepoPartido partidoRepo;
    private final RepoArbitro arbitroRepo; // Asumiendo que tienes un repositorio para árbitros

    public JornadaService(RepoJornada repo, RepoPartido partidoRepo, RepoArbitro arbitroRepo) {
        this.repo = repo;
        this.partidoRepo = partidoRepo; // Asumiendo que RepoPartido es un repositorio similar a RepoJornada
        this.arbitroRepo = arbitroRepo; // Asumiendo que RepoPartido es un repositorio similar a RepoJornada

    }

    @Override
    public void save(Jornada jornada) {
        this.repo.save(jornada);
    }

    @Override
    
    public Optional<Jornada> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Jornada> findAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        if (existsById(id)) {
            repo.deleteById(id);
        }      
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }

    //metodo para jenerar todas las jornadas automaticamente
public List<JornadaConPartidosDTO> generarJornadas(List<Equipo> equipos) {
    int numEquipos = equipos.size();
    boolean impar = numEquipos % 2 != 0;

    if (impar) {
        equipos.add(null);
        numEquipos++;
    }

    int totalJornadasPorVuelta = numEquipos - 1;
    int totalJornadas = totalJornadasPorVuelta * 2;

    List<Equipo> equiposRotables = new ArrayList<>(equipos);
    equiposRotables.remove(0);

    Date fechaBase = Date.valueOf("2025-09-01");

    List<Arbitro> arbitros = arbitroRepo.findAll();
    int numArbitros = arbitros.size();
    if (numArbitros == 0) {
        throw new IllegalStateException("No hay árbitros disponibles en la base de datos.");
    }

    // DTO que vamos a devolver
    List<JornadaConPartidosDTO> jornadasDTO = new ArrayList<>();

    for (int ronda = 0; ronda < totalJornadas; ronda++) {
        long diasEnMilis = 7L * 24 * 60 * 60 * 1000;
        Date fechaReferencia = new Date(fechaBase.getTime() + ronda * diasEnMilis);

        Jornada jornada = new Jornada(null, ronda + 1, fechaReferencia);
        List<Partido> partidosDeJornada = new ArrayList<>();

        int numPartidos = numEquipos / 2;

        for (int i = 0; i < numPartidos; i++) {
            Equipo local, visitante;

            if (i == 0) {
                local = equipos.get(0);
                visitante = equiposRotables.get(ronda % equiposRotables.size());
            } else {
                int firstIndex = (ronda + i) % equiposRotables.size();
                int secondIndex = (ronda + equiposRotables.size() - i) % equiposRotables.size();
                local = equiposRotables.get(firstIndex);
                visitante = equiposRotables.get(secondIndex);
            }

            if (local == null || visitante == null) continue;

            boolean esSegundaVuelta = ronda >= totalJornadasPorVuelta;
            if (esSegundaVuelta) {
                Equipo temp = local;
                local = visitante;
                visitante = temp;
            }

            Partido partido = new Partido();
            partido.setEquipoLocal(local);
            partido.setEquipoVisitante(visitante);
            partido.setJornada(jornada);

            Arbitro arbitroAsignado = arbitros.get((ronda + i) % numArbitros);
            partido.setArbitro(arbitroAsignado);

            partido.setFechaInicio(fechaReferencia);
            partido.setFechaPrevista(fechaReferencia);

            partidosDeJornada.add(partido);
        }

        repo.save(jornada);
        partidoRepo.saveAll(partidosDeJornada);

        // Creamos el DTO sin necesidad de setPartidos en la entidad
        JornadaConPartidosDTO dto = new JornadaConPartidosDTO(jornada, partidosDeJornada);
        jornadasDTO.add(dto);
    }

    return jornadasDTO;
}









//     public void generarJornadas(List<Equipo> equipos) {
//     int numEquipos = equipos.size();
//     boolean impar = numEquipos % 2 != 0;

//     // Si hay un número impar de equipos, añadimos un "equipo fantasma" para los descansos
//     if (impar) {
//         //represento el equipo vacío como null
//         equipos.add(null); 
//         numEquipos++;
//     }

//     // Calculamos el número total de jornadas y lo duplicamos para la ida y la vuelta
//     int totalJornadasPorVuelta = numEquipos - 1;
//     int totalJornadas = totalJornadasPorVuelta * 2;

//     //copio todos los equipos menos el primero, que se queda fijo
//     List<Equipo> equiposRotables = new ArrayList<>(equipos);
//     equiposRotables.remove(0);

//     //
//     for (int ronda = 0; ronda < totalJornadas; ronda++) {
//         //se crea una jornada por ronda y hay tantas rondas como Jornadas totales
//         Jornada jornada = new Jornada(null, ronda + 1, null); // puedes agregar fecha lógica si quieres
//         List<Partido> partidosDeJornada = new ArrayList<>();

//         int fixedIndex = 0;
//         int numPartidos = numEquipos / 2;

//         //se crean los partidos de cada jornada a partir de los partidos que tendrá toda la liga
//         for (int i = 0; i < numPartidos; i++) {
//             Equipo local;
//             Equipo visitante;

//             //este if se ejecuta solo en la primera vuelta del bucle 
//             if (i == 0) {
//                 local = equipos.get(0);
//                 //emparejo el equipo que no rota con un equipo que rota
//                 //(ronda) % equiposRotables.size() hará que se recorra los equipos rotables de forma circular
//                 visitante = equiposRotables.get((ronda) % equiposRotables.size());
//             } else {
//                 //aqui i siempre sera mayor que 0 ya que si cuando es 0 se trata en el if anterior
//                 int firstIndex = (ronda + i) % equiposRotables.size();
//                 int secondIndex = (ronda + equiposRotables.size() - i) % equiposRotables.size();

//                 local = equiposRotables.get(firstIndex);
//                 visitante = equiposRotables.get(secondIndex);
//             }

//             // Saltamos partidos con "bye"
//             if (local == null || visitante == null) continue;

//             // Ida o vuelta: invertimos local/visitante en la segunda vuelta
//             boolean esSegundaVuelta = ronda >= totalJornadasPorVuelta;
//             if (esSegundaVuelta) {
//                 Equipo temp = local;
//                 local = visitante;
//                 visitante = temp;
//             }

//             Partido partido = new Partido();
//             partido.setEquipoLocal(local);
//             partido.setEquipoVisitante(visitante);
//             partido.setJornada(jornada);
//             partidosDeJornada.add(partido);
//         }

//         // jornada.setPartidos(partidosDeJornada); // si reactivas esta relación
//         // Guardar la jornada y sus partidos
//         repo.save(jornada);
//         partidoRepo.saveAll(partidosDeJornada);
//     }
// }


}
