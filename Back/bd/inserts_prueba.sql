use laliga;
-- Inserts para Jornada
select * from jornada;
INSERT INTO jornada (idJornada, Numero, FechaReferencia) VALUES
(1, 1, '2024-01-01'),
(2, 2, '2024-01-08'),
(3, 3, '2024-01-15'),
(4, 4, '2024-01-22'),
(5, 5, '2024-01-29'),
(6, 6, '2024-02-05'),
(7, 7, '2024-02-12'),
(8, 8, '2024-02-19'),
(9, 9, '2024-02-26'),
(10, 10, '2024-03-04');

-- Inserts para Equipo
select * from Equipo;
INSERT INTO Equipo (idEquipo, Nombre, AnioFundacion, Ciudad, Escudo, FotoOficial) VALUES
(1, 'Tigres FC', '1960-06-01', 'Monterrey', 'escudo_tigres.png', 'foto_tigres.jpg'),
(2, 'Águilas Doradas', '1985-04-12', 'Bogotá', 'escudo_aguilas.png', 'foto_aguilas.jpg'),
(3, 'Racing Club', '1903-01-01', 'Buenos Aires', 'escudo_racing.png', 'foto_racing.jpg'),
(4, 'Leones FC', '1998-07-14', 'Medellín', 'escudo_leones.png', 'foto_leones.jpg'),
(5, 'Universitarios', '1977-09-30', 'Lima', 'escudo_universitarios.png', 'foto_uni.jpg'),
(6, 'Guerreros', '2001-03-10', 'Quito', 'escudo_guerreros.png', 'foto_guerreros.jpg'),
(7, 'Atlético Sur', '1989-05-20', 'Cali', 'escudo_sur.png', 'foto_sur.jpg'),
(8, 'Dragones', '1990-12-11', 'Caracas', 'escudo_dragones.png', 'foto_dragones.jpg'),
(9, 'Centauros', '2005-02-02', 'Montevideo', 'escudo_centauros.png', 'foto_centauros.jpg'),
(10, 'Halcones Rojos', '1970-08-08', 'Santiago', 'escudo_halcones.png', 'foto_halcones.jpg');

-- Inserts para Arbitro
select * from Arbitro;
INSERT INTO Arbitro (idArbitro, FechaNac, Nombre, Federacion, Foto) VALUES
(1, '1980-05-12', 'Luis Márquez', 'FIFA', 'luis.jpg'),
(2, '1975-09-23', 'Roberto Díaz', 'UEFA', 'roberto.jpg'),
(3, '1985-01-14', 'Mario Gómez', 'CONMEBOL', 'mario.jpg'),
(4, '1982-07-08', 'José Palacios', 'FIFA', 'jose.jpg'),
(5, '1988-11-30', 'Andrés Silva', 'CAF', 'andres.jpg'),
(6, '1983-03-03', 'Samuel Ortega', 'AFC', 'samuel.jpg'),
(7, '1979-12-15', 'Daniel Ramos', 'FIFA', 'daniel.jpg'),
(8, '1987-06-21', 'Carlos Ramírez', 'CONCACAF', 'carlos.jpg'),
(9, '1990-10-17', 'Fernando Rivas', 'UEFA', 'fernando.jpg'),
(10, '1984-08-25', 'Jorge Suárez', 'FIFA', 'jorge.jpg');

-- Inserts para Partido
select * from partido;
INSERT INTO Partido (idPartido, FechaPrevista, FechaInicio, Estadio, EquipoVisitante, Jornada_idJornada, EquipoLocal, Arbitro_idArbitro) VALUES
(1, '2024-01-01', '2024-01-01', 'Finalizado', 1, 1, 2,1),
(2, '2024-01-08', '2024-01-08', 'Finalizado', 2, 2, 3,2),
(3, '2024-01-15', '2024-01-15', 'Finalizado', 3, 3, 4,3),
(4, '2024-01-22', '2024-01-22', 'Finalizado', 4, 4, 5,4),
(5, '2024-01-22', '2024-01-22', 'Finalizado', 4, 8, 6,5),
(6, '2024-02-05', '2024-01-29', 'Programado', 6, 6, 7,6),
(7, '2024-02-12', '2024-01-29', 'Programado', 7, 7, 8,7),
(8, '2024-02-19', '2024-01-29', 'Programado', 8, 8, 9,8),
(9, '2024-02-26', '2024-01-29', 'Programado', 9, 9, 10,9),
(10, '2024-03-04', '2024-01-29', 'Programado', 10, 10, 3,10);

-- Inserts para TipoEvento
select * from tipoevento;
INSERT INTO tipoevento (idTipoEvento, Nombre) VALUES
(1, 'Gol'),
(2, 'Tarjeta Amarilla'),
(3, 'Tarjeta Roja'),
(4, 'Cambio'),
(5, 'Falta'),
(6, 'Penalti'),
(7, 'Fuera de juego'),
(8, 'Saque de esquina'),
(9, 'Inicio'),
(10, 'Final');

-- Inserts para Jugador
select * from Jugador;
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(1, 'Juan Pérez', 'Juampi', '1995-03-15', 'juan.jpg', 10, 'Delantero', 'Argentina', 1),
(2, 'Carlos Ruiz', 'Charly', '1996-07-22', 'carlos.jpg', 8, 'Mediocampista', 'México', 3),
(3, 'Luis Soto', 'El Gato', '1993-11-10', 'luis.jpg', 1, 'Portero', 'Chile', 2),
(4, 'Pedro León', 'Pele', '1998-02-01', 'pedro.jpg', 4, 'Defensa', 'Uruguay', 2),
(5, 'Diego Gómez', 'El Rayo', '1997-08-17', 'diego.jpg', 7, 'Delantero', 'Colombia', 2),
(6, 'José Torres', 'JT', '1994-12-05', 'jose.jpg', 11, 'Extremo', 'Argentina', 2),
(7, 'Marco Díaz', 'MD10', '1992-09-25', 'marco.jpg', 5, 'Mediocampista', 'México', 3),
(8, 'Ricardo Salas', 'Richi', '1999-04-30', 'ricardo.jpg', 2, 'Defensa', 'Perú', 3),
(9, 'Andrés Vela', 'Velita', '2000-01-20', 'andres.jpg', 6, 'Delantero', 'Ecuador', 4),
(10, 'Fernando López', 'Ferni', '1991-06-11', 'fernando.jpg', 3, 'Portero', 'Paraguay', 4);

-- Inserts para Evento
select * from evento;
INSERT INTO evento (idEvento, TiempoPartido, Partido_idPartido, Tipo_Evento_idTipo_Evento,Jugador_idJugador) VALUES
(1, '00:05:00', 1, 1,1),
(2, '00:10:00', 1, 2,2),
(3, '00:15:00', 1, 5,3),
(4, '00:22:00', 2, 1,4),
(5, '45:00:00', 2, 3,4),
(6, '45:00:00', 2, 4,6),
(7, '45:00:00', 3, 4,7),
(8, '45:00:00', 3, 2,8),
(9, '45:00:00', 3, 5,9),
(10, '45:00:00', 4, 6,10);





SELECT user, host FROM mysql.user;
SELECT user, host, authentication_string FROM mysql.user;
describe arbitro;
SHOW CREATE TABLE Arbitro;
ALTER TABLE Arbitro MODIFY idArbitro INT NOT NULL AUTO_INCREMENT;



