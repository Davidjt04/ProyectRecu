use laliga;
-- Inserts para Jornada
select * from jornada;
INSERT INTO Jornada (idJornada, Numero, FechaReferencia) VALUES
(1, 1, '2024-08-16'),
(2, 2, '2024-08-23'),
(3, 3, '2024-08-30'),
(4, 4, '2024-09-06'),
(5, 5, '2024-09-13'),
(6, 6, '2024-09-20'),
(7, 7, '2024-09-27'),
(8, 8, '2024-10-04'),
(9, 9, '2024-10-11'),
(10, 10, '2024-10-18'),
(11, 11, '2024-10-25'),
(12, 12, '2024-11-01'),
(13, 13, '2024-11-08'),
(14, 14, '2024-11-15'),
(15, 15, '2024-11-22'),
(16, 16, '2024-11-29'),
(17, 17, '2024-12-06'),
(18, 18, '2024-12-13'),
(19, 19, '2024-12-20'),
(20, 20, '2025-01-03'),
(21, 21, '2025-01-10'),
(22, 22, '2025-01-17'),
(23, 23, '2025-01-24'),
(24, 24, '2025-01-31'),
(25, 25, '2025-02-07'),
(26, 26, '2025-02-14'),
(27, 27, '2025-02-21'),
(28, 28, '2025-02-28'),
(29, 29, '2025-03-07'),
(30, 30, '2025-03-14'),
(31, 31, '2025-03-21'),
(32, 32, '2025-03-28'),
(33, 33, '2025-04-04'),
(34, 34, '2025-04-11'),
(35, 35, '2025-04-18'),
(36, 36, '2025-04-25'),
(37, 37, '2025-05-02'),
(38, 38, '2025-05-09');
DELETE FROM jornada;

-- Inserts para Equipo
select * from Equipo;
DELETE FROM Equipo;
/*insert de los equipos de la liga*/
INSERT INTO Equipo (idEquipo, Nombre, AnioFundacion, Ciudad, Escudo, FotoOficial) VALUES
(1, 'FC Barcelona', '1899-11-29',  'Barcelona', 'EscudoBarcelona.jpg', 'PlantillaBarcenlona.png'),
(2, 'Real Madrid', '1902-03-06', 'Madrid', 'EscudoMadrid.png', 'PlantillaMadrid.png'),
(3, 'Atlético de Madrid', '1903-04-26', 'Madrid', 'EscudoAtleticoMadrid.jfif', 'PlantillaAtleticoMadrid.jfif'),
(4, 'Sevilla FC', '1890-01-25',  'Sevilla', 'EscudoSevilla.png', 'PlantillaSevilla.jfif'),
(5, 'Real Betis', '1907-09-12', 'Sevilla', 'EscudoBetis.png', 'PlantillaBetis.jfif'),
(6, 'Real Sociedad', '1909-09-07', 'San Sebastián', 'EscudoRealSociedad.png', 'PlantillaRealSociedad.jfif'),
(7, 'Villarreal CF', '1923-03-10', 'Villarreal', 'EscudoVillareal.png', 'PlantillaVillareal.jfif'),
(8, 'Athletic Club', '1898-01-01', 'Bilbao', 'EscudoAthleti.png', 'PlantillaAthletiClub.jfif'),
(9, 'Valencia CF', '1919-03-18', 'Valencia', 'EscudoValencia.png', 'PlantillaValencia.jfif'),
(10, 'CA Osasuna', '1920-10-24', 'Pamplona', 'EscudoOsasuna.png', 'PlantillaOsasuna.jfif'),
(11, 'RC Celta', '1923-08-23', 'Vigo', 'EscudoCelta.png', 'PlantillaCelta.jfif'),
(12, 'Rayo Vallecano', '1924-05-29', 'Madrid', 'EscudoMadrid.png', 'PlantillaMadrid.png'),
(13, 'Deportivo Alavés', '1921-01-23', 'Vitoria-Gasteiz', 'EscudoAlaves.jfif', 'PlantillaAlavés.jfif'),
(14, 'RCD Espanyol',  '1900-10-28', 'Barcelona', 'EscudoEspanyoljfif.jfif', 'PlantillaEspanyol.jfif'),
(15, 'UD Las Palmas', '1949-08-22', 'Las Palmas de Gran Canaria', 'EscudoLasPalmas.png', 'PlantillaLasPalmas.jfif'),
(16, 'Getafe CF',  '1983-02-24',  'Getafe', 'EscudoGetafe.jfif', 'PlantillaGetafe.jfif'),
(17, 'RCD Mallorca',  '1916-03-05', 'Palma de Mallorca', 'EscudoGetafe.jfif', 'PlantillaMallorca.jfif'),
(18, 'CD Leganés',  '1928-06-23', 'Leganés', 'EscudoLeganes.png', 'EscudoLeganes.png'),
(19, 'Real Valladolid CF', '1928-06-20', 'Valladolid', 'EscudoValladolid.jfif', 'PlantillaValladolid.jfif'),
(20, 'Girona FC', '1930-07-23', 'Girona', 'EscudoGirona.png', 'PlantillaGirona.jfif');
DELETE FROM Equipo;


-- Inserts para Arbitro
select * from Arbitro;
INSERT INTO Arbitro (idArbitro, FechaNac, Nombre, Federacion, Foto) VALUES
(1, '1980-04-15', 'José María Sánchez Martínez', 'Comité Murciano de Árbitros', 'José María Sánchez Martínez.jfif'),
(2, '1983-09-20', 'Alejandro Muñiz Ruiz', 'Comité Gallego de Árbitros', 'Alejandro Muñiz Ruiz.jfif'),
(3, '1988-05-12', 'Mateo Busquets Ferrer', 'Comité Balear de Árbitros', 'Mateo Busquets Ferrer.jfif'),
(4, '1985-07-07', 'Javier Alberola Rojas', 'Comité de Castilla-La Mancha', 'Javier Alberola Rojas.jfif'),
(5, '1977-12-01', 'Ricardo de Burgos Bengoetxea', 'Comité Vasco de Árbitros', 'Ricardo de Burgos Bengoetxea.jfif'),
(6, '1982-03-22', 'Mario Melero López', 'Comité Andaluz de Árbitros', 'Mario Melero López.jfif'),
(7, '1986-11-11', 'Pablo González Fuertes', 'Comité Asturiano de Árbitros', 'Pablo González Fuertes.jfif'),
(8, '1981-01-25', 'Miguel Ángel Ortiz Arias', 'Comité Madrileño de Árbitros', 'Miguel Ángel Ortiz Arias.jfif'),
(9, '1984-06-18', 'Víctor García Verdura', 'Comité Catalán de Árbitros', 'Víctor García Verdura.jfif'),
(10, '1979-08-30', 'Francisco José Hernández Maeso', 'Comité de Castilla-La Mancha', 'Francisco José Hernández Maeso.jfif'),
(11, '1987-02-14', 'Adrián Cordero Vega', 'Comité Cántabro de Árbitros', 'Adrián Cordero Vega.jfif'),
(12, '1983-04-28', 'Juan Martínez Munuera', 'Comité Valenciano de Árbitros', 'Juan Martínez Munuera.jfif'),
(13, '1978-10-10', 'José Luis Munuera Montero', 'Comité Andaluz de Árbitros', 'José Luis Munuera Montero.jfif'),
(14, '1982-09-04', 'Alejandro Quintero González', 'Comité Andaluz de Árbitros', 'Alejandro Quintero González.jfif'),
(15, '1980-03-19', 'Jesús Gil Manzano', 'Comité Extremeño de Árbitros', 'Jesús Gil Manzano.jfif'),
(16, '1985-05-23', 'César Soto Grado', 'Comité de Castilla y León', 'César Soto Grado.jfif'),
(17, '1976-12-07', 'Isidro Díaz de Mera Escuderos', 'Comité de Castilla-La Mancha', 'Isidro Díaz de Mera Escuderos.jfif'),
(18, '1989-07-01', 'Guillermo Cuadra Fernández', 'Comité Madrileño de Árbitros', 'Guillermo Cuadra Fernández.jfif'),
(19, '1986-05-20', 'Alejandro José Hernández Hernández', 'Comité Canario de Árbitros', 'Alejandro José Hernández Hernández.jfif');

-- Inserts para Partido
select * from partido;
INSERT INTO Partido (idPartido, FechaPrevista, FechaInicio, Estadio, EquipoVisitante, Jornada_idJornada, EquipoLocal, Arbitro_idArbitro) VALUES
(1, '2024-01-01', '2024-01-01', 'Finalizado', 1, 1, 2,1),
(2, '2024-01-08', '2024-01-08', 'Finalizado', 2, 2, 3,2),
(3, '2024-01-15', '2024-01-15', 'Finalizado', 3, 3, 4,3),
(4, '2024-01-22', '2024-01-22', 'Finalizado', 4, 4, 5,4),
(5, '2024-01-22', '2024-01-22', 'Finalizado', 4, 9, 6,5),
(6, '2024-02-05', '2024-01-29', 'Programado', 6, 6, 7,6),
(7, '2024-02-12', '2024-01-29', 'Programado', 7, 7, 8,7),
(8, '2024-02-19', '2024-01-29', 'Programado', 8, 8, 9,8),
(9, '2024-02-26', '2024-01-29', 'Programado', 9, 9, 10,9),
(10, '2024-03-04', '2024-01-29', 'Programado', 10, 10, 3,10);

-- Inserts para TipoEvento
select * from tipoevento;
INSERT INTO tipoevento (idTipoEvento, Nombre) VALUES
-- Eventos de inicio de partido
(1, 'Inicio'),
(2,'FinalPrimeraParte'),
(3,'TiempoExtra1'),
(4,'InicioSegundaParte'),
(5,'TiempoExtra2'),
(6, 'Final'),

-- Eventos de inicio 1 jugador
(7,'OnceInicial'),
(8, 'Gol'),
(9, 'Tarjeta Amarilla'),
(10, 'Tarjeta Roja'),
(11, 'Fuera de juego'),
(12, 'Saque de esquina'),
(13,'Saque de banda'),
(14,'Asistencia'),
(15,'GolEnPropia'),
(16,'Parada'),
(17,'DisparoAPuerta'),
(18,'DisparoFUera'),
(19,'Lesion'),

-- Eventos de inicio 2 jugadores
(20,'JugadorSalida'),
(21,'JugadorEntrada'),
(22, 'Falta'),
(23,'PenaltiCometido'),
(24,'FaltaRecivida'),
(25,'PenaltiRecivido');

-- Inserts para Jugador
select * from Jugador;
/* INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(1, 'Juan Pérez', 'Juampi', '1995-03-15', 'juan.jpg', 10, 'Delantero', 'Argentina', 1),
(2, 'Carlos Ruiz', 'Charly', '1996-07-22', 'carlos.jpg', 8, 'Mediocampista', 'México', 3),
(3, 'Luis Soto', 'El Gato', '1993-11-10', 'luis.jpg', 1, 'Portero', 'Chile', 2),
(4, 'Pedro León', 'Pele', '1998-02-01', 'pedro.jpg', 4, 'Defensa', 'Uruguay', 2),
(5, 'Diego Gómez', 'El Rayo', '1997-08-17', 'diego.jpg', 7, 'Delantero', 'Colombia', 2),
(6, 'José Torres', 'JT', '1994-12-05', 'jose.jpg', 11, 'Extremo', 'Argentina', 2),
(7, 'Marco Díaz', 'MD10', '1992-09-25', 'marco.jpg', 5, 'Mediocampista', 'México', 3),
(8, 'Ricardo Salas', 'Richi', '1999-04-30', 'ricardo.jpg', 2, 'Defensa', 'Perú', 3),
(9, 'Andrés Vela', 'Velita', '2000-01-20', 'andres.jpg', 6, 'Delantero', 'Ecuador', 4),
(10, 'Fernando López', 'Ferni', '1991-06-11', 'fernando.jpg', 3, 'Portero', 'Paraguay', 4);*/

-- Jugadores del Barcelona
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(1, 'Marc-André ter Stegen', 'Ter Stegen', '1992-04-30', 'terstegen.jfif', 1, 'Portero', 'Alemán', 1),
(2, 'Ronald Araújo', 'Araújo', '1999-03-07', 'araujo.jfif', 4, 'Defensa', 'Uruguayo', 1),
(3, 'Jules Koundé', 'Koundé', '1998-11-12', 'kunde.jfif', 23, 'Defensa', 'Francés', 1),
(4, 'Andreas Christensen', 'Christensen', '1996-04-10', 'christensen.jfif', 15, 'Defensa', 'Danés', 1),
(5, 'Alejandro Balde', 'Balde', '2003-10-10', 'balde.jfif', 18, 'Defensa', 'Español', 1),
(6, 'Frenkie de Jong', 'De Jong', '1997-05-12', 'dejong.jfif', 21, 'Centrocampista', 'Holandés', 1),
(7, 'Pedri', 'Pedri', '2002-11-25', 'pedri.jfif', 8, 'Centrocampista', 'Español', 1),
(8, 'Gavi', 'Gavi', '2004-08-05', 'gavi.jfif', 6, 'Centrocampista', 'Español', 1),
(9, 'Sergio Busquets', 'Busquets', '1988-07-16', 'busquets.jfif', 5, 'Centrocampista', 'Español', 1),
(10, 'Raphinha', 'Raphinha', '1996-12-14', 'raphinha.jfif', 10, 'Extremo', 'Brasileño', 1),
(11, 'Robert Lewandowski', 'Lewandowski', '1988-08-21', 'lewandowski.jfif', 9, 'Delantero', 'Polaco', 1),
(12, 'Ousmane Dembélé', 'Dembélé', '1997-05-15', 'dembele.jfif', 7, 'Extremo', 'Francés', 1),
(13, 'Ansu Fati', 'Ansu', '2002-10-31', 'ansu.jfif', 31, 'Delantero', 'Español', 1),
(14, 'Franck Kessié', 'Kessié', '1996-12-19', 'kessie.jfif', 19, 'Centrocampista', 'Marfileño', 1),
(15, 'Jordi Alba', 'Alba', '1989-03-21', 'alba.jfif', 3, 'Defensa', 'Español', 1);

-- Jugadores del Madrid
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(16, 'Thibaut Courtois', 'Courtois', '1992-05-11', 'courtois.jfif', 1, 'Portero', 'Belga', 2),
(17, 'Dani Carvajal', 'Carvajal', '1992-01-11', 'carvajal.jfif', 2, 'Defensa', 'Español', 2),
(18, 'Éder Militão', 'Militão', '1998-01-18', 'militao.jfif', 3, 'Defensa', 'Brasileño', 2),
(19, 'Antonio Rüdiger', 'Rüdiger', '1993-03-03', 'rudiger.jfif', 22, 'Defensa', 'Alemán', 2),
(20, 'Ferland Mendy', 'Mendy', '1995-06-08', 'mendy.jfif', 23, 'Defensa', 'Francés', 2),
(21, 'Jude Bellingham', 'Bellingham', '2003-06-29', 'bellingham.jfif', 5, 'Centrocampista', 'Inglés', 2),
(22, 'Aurélien Tchouaméni', 'Tchouaméni', '2000-01-27', 'tchouameni.jfif', 18, 'Centrocampista', 'Francés', 2),
(23, 'Luka Modrić', 'Modrić', '1985-09-09', 'modric.jfif', 10, 'Centrocampista', 'Croata', 2),
(24, 'Federico Valverde', 'Valverde', '1998-07-22', 'valverde.jfif', 15, 'Centrocampista', 'Uruguayo', 2),
(25, 'Vinícius Júnior', 'Vinícius', '2000-07-12', 'vinicius.jfif', 7, 'Extremo', 'Brasileño', 2),
(26, 'Rodrygo', 'Rodrygo', '2001-01-09', 'rodrygo.jfif', 21, 'Extremo', 'Brasileño', 2),
(27, 'Karim Benzema', 'Benzema', '1987-12-19', 'benzema.jfif', 9, 'Delantero', 'Francés', 2),
(28, 'Marco Asensio', 'Asensio', '1996-01-21', 'asensio.jfif', 11, 'Extremo', 'Español', 2),
(29, 'Eduardo Camavinga', 'Camavinga', '2002-11-10', 'camavinga.jfif', 12, 'Centrocampista', 'Francés', 2),
(30, 'Dani Ceballos', 'Ceballos', '1996-08-07', 'ceballos.jfif', 24, 'Centrocampista', 'Español', 2);
-- Jugdores del Atletico de Madrid
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(31, 'Jan Oblak', 'Oblak', '1993-01-07', 'oblak.jfif', 13, 'Portero', 'Esloveno', 3),
(32, 'Kieran Trippier', 'Trippier', '1990-09-19', 'trippier.jfif', 23, 'Defensa', 'Inglés', 3),
(33, 'José María Giménez', 'Giménez', '1995-01-20', 'gimenez.jfif', 2, 'Defensa', 'Uruguayo', 3),
(34, 'Stefan Savić', 'Savić', '1991-01-08', 'savic.jfif', 15, 'Defensa', 'Montenegrino', 3),
(35, 'Renan Lodi', 'Lodi', '1998-04-08', 'lodi.jfif', 16, 'Defensa', 'Brasileño', 3),
(36, 'Koke', 'Koke', '1992-01-08', 'koke.jfif', 6, 'Centrocampista', 'Español', 3),
(37, 'Rodrigo De Paul', 'De Paul', '1994-05-24', 'depaul.jfif', 5, 'Centrocampista', 'Argentino', 3),
(38, 'Marcos Llorente', 'Llorente', '1995-01-30', 'llorente.jfif', 14, 'Centrocampista', 'Español', 3),
(39, 'Thomas Lemar', 'Lemar', '1995-11-12', 'lemar.jfif', 11, 'Extremo', 'Francés', 3),
(40, 'Ángel Correa', 'Correa', '1995-03-09', 'correa.jfif', 10, 'Delantero', 'Argentino', 3),
(41, 'Antoine Griezmann', 'Griezmann', '1991-03-21', 'griezmann.jfif', 8, 'Delantero', 'Francés', 3),
(42, 'João Félix', 'Félix', '1999-11-10', 'joaofelix.jfif', 7, 'Delantero', 'Portugués', 3),
(43, 'Matheus Cunha', 'Cunha', '1999-05-27', 'cunha.jfif', 9, 'Delantero', 'Brasileño', 3),
(44, 'Felipe', 'Felipe', '1990-02-19', 'felipe.jfif', 3, 'Defensa', 'Brasileño', 3),
(45, 'Ricardo Rodríguez', 'Rodríguez', '1992-08-25', 'rodriguez.jfif', 13, 'Defensa', 'Suizo', 3);

-- Jugadores del Sevilla
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(46, 'Yassine Bounou', 'Bono', '1991-04-05', 'bono.jfif', 1, 'Portero', 'Marroquí', 4),
(47, 'Marcos Acuña', 'Acuña', '1991-10-28', 'acuna.jfif', 8, 'Defensa', 'Argentino', 4),
(48, 'Gonzalo Montiel', 'Montiel', '1997-05-01', 'montiel.jfif', 2, 'Defensa', 'Argentino', 4),
(49, 'Jules Koundé', 'Koundé', '1998-11-12', 'kounde.jfif', 23, 'Defensa', 'Francés', 4),
(50, 'Diego Carlos', 'Diego Carlos', '1993-05-15', 'diegocarlos.jfif', 3, 'Defensa', 'Brasileño', 4),
(51, 'Fernando', 'Fernando', '1987-07-25', 'fernando.jfif', 14, 'Centrocampista', 'Brasileño', 4),
(52, 'Joan Jordán', 'Jordán', '1994-07-21', 'jordan.jfif', 16, 'Centrocampista', 'Español', 4),
(53, 'Ivan Rakitić', 'Rakitić', '1988-03-10', 'rakitic.jfif', 10, 'Centrocampista', 'Croata', 4),
(54, 'Óliver Torres', 'Óliver', '1994-11-10', 'olivertorres.jfif', 22, 'Centrocampista', 'Español', 4),
(55, 'Suso', 'Suso', '1993-11-19', 'suso.jfif', 7, 'Extremo', 'Español', 4),
(56, 'Youssef En-Nesyri', 'En-Nesyri', '1997-06-01', 'ennesyri.jfif', 9, 'Delantero', 'Marroquí', 4),
(57, 'Rafa Mir', 'Rafa Mir', '1997-05-02', 'rafamir.jfif', 11, 'Delantero', 'Español', 4),
(58, 'Lucas Ocampos', 'Ocampos', '1994-07-11', 'ocampos.jfif', 17, 'Extremo', 'Argentino', 4),
(59, 'Jesus Navas', 'Navas', '1985-11-21', 'navas.jfif', 16, 'Extremo', 'Español', 4),
(60, 'Sergio Reguilón', 'Reguilón', '1996-12-16', 'reguilon.jfif', 18, 'Defensa', 'Español', 4);

-- Jugadores del Betis
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(61, 'Claudio Bravo', 'Bravo', '1983-04-13', 'bravo.jfif', 1, 'Portero', 'Chileno', 5),
(62, 'Marc Bartra', 'Bartra', '1991-01-15', 'bartra.jfif', 15, 'Defensa', 'Español', 5),
(63, 'Germán Pezzella', 'Pezzella', '1991-06-27', 'bartra.jfif', 4, 'Defensa', 'Argentino', 5),
(64, 'Víctor Ruiz', 'Ruiz', '1989-01-27', 'ruiz.jfif', 5, 'Defensa', 'Español', 5),
(65, 'Álex Moreno', 'Moreno', '1993-01-08', 'moreno.jfif', 3, 'Defensa', 'Español', 5),
(66, 'Guido Rodríguez', 'Rodríguez', '1994-04-12', 'guido.jfif', 16, 'Centrocampista', 'Argentino', 5),
(67, 'Sergio Canales', 'Canales', '1991-02-16', 'canales.jfif', 10, 'Centrocampista', 'Español', 5),
(68, 'Nabil Fekir', 'Fekir', '1993-07-18', 'fekir.jfif', 8, 'Centrocampista', 'Francés', 5),
(69, 'William Carvalho', 'Carvalho', '1992-04-07', 'carvalho.jfif', 14, 'Centrocampista', 'Portugués', 5),
(70, 'Juanmi', 'Juanmi', '1993-05-20', 'juanmi.jfif', 7, 'Delantero', 'Español', 5),
(71, 'Borja Iglesias', 'Borja', '1993-01-17', 'borja.jfif', 9, 'Delantero', 'Español', 5),
(72, 'Álex Alegría', 'Alegría', '1993-03-06', 'alegria.jfif', 19, 'Delantero', 'Español', 5),
(73, 'Sergio Pezzella', 'Pezzella', '1995-10-29', 'pezzella2.jfif', 20, 'Delantero', 'Argentino', 5),
(74, 'Juan Miranda', 'Miranda', '1999-01-19', 'miranda.jfif', 12, 'Defensa', 'Español', 5),
(75, 'Emerson', 'Emerson', '1997-03-14', 'emerson.jfif', 22, 'Defensa', 'Brasil', 5);

-- Jugadores de la Real Sociedad
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(76, 'Álex Remiro', 'Remiro', '1995-02-24', 'remiro.jfif', 1, 'Portero', 'Español', 6),
(77, 'Aihen Muñoz', 'Muñoz', '1997-06-17', 'muñoz.jfif', 3, 'Defensa', 'Español', 6),
(78, 'Robin Le Normand', 'Le Normand', '1996-11-11', 'lenormand.jfif', 2, 'Defensa', 'Francés', 6),
(79, 'Joseba Zaldua', 'Zaldua', '1992-02-24', 'zaldua.jfif', 4, 'Defensa', 'Español', 6),
(80, 'Igor Zubeldia', 'Zubeldia', '1997-04-30', 'zubeldia.jfif', 6, 'Centrocampista', 'Español', 6),
(81, 'Mikel Merino', 'Merino', '1996-06-22', 'merino.jfif', 8, 'Centrocampista', 'Español', 6),
(82, 'David Silva', 'Silva', '1986-01-08', 'silva.jfif', 21, 'Centrocampista', 'Español', 6),
(83, 'Martin Zubimendi', 'Zubimendi', '1999-08-22', 'zubimendi.jfif', 16, 'Centrocampista', 'Español', 6),
(84, 'Mikel Oyarzabal', 'Oyarzabal', '1997-04-21', 'oyarzabal.jfif', 10, 'Delantero', 'Español', 6),
(85, 'Alexander Isak', 'Isak', '1999-09-21', 'isak.jfif', 14, 'Delantero', 'Sueco', 6),
(86, 'Takefusa Kubo', 'Kubo', '2001-06-04', 'kubo.jfif', 7, 'Extremo', 'Japones', 6),
(87, 'Adnan Januzaj', 'Januzaj', '1995-02-05', 'januzaj.jfif', 11, 'Extremo', 'Belga', 6),
(88, 'Portu', 'Portu', '1992-04-21', 'portu.jfif', 17, 'Extremo', 'Español', 6),
(89, 'Carlos Fernández', 'Fernández', '1996-05-23', 'fernandez.jfif', 9, 'Delantero', 'Español', 6);

-- Jugadores del villareal
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(90, 'Gerónimo Rulli', 'Rulli', '1992-05-20', 'rulli.jfif', 1, 'Portero', 'Argentino', 7),
(91, 'Pau Torres', 'Torres', '1997-01-16', 'pau_torres.jfif', 4, 'Defensa', 'Español', 7),
(92, 'Raúl Albiol', 'Albiol', '1985-09-04', 'albiol.jfif', 17, 'Defensa', 'Español', 7),
(93, 'Aïssa Mandi', 'Mandi', '1991-10-25', 'mandi.jfif', 23, 'Defensa', 'Argelino', 7),
(94, 'Juan Foyth', 'Foyth', '1998-01-12', 'foyth.jfif', 2, 'Defensa', 'Argentino', 7),
(95, 'Manu Trigueros', 'Trigueros', '1994-01-17', 'trigueros.jfif', 21, 'Centrocampista', 'Español', 7),
(96, 'Dani Parejo', 'Parejo', '1989-04-16', 'parejo.jfif', 8, 'Centrocampista', 'Español', 7),
(97, 'Étienne Capoue', 'Capoue', '1988-07-11', 'capoue.jfif', 6, 'Centrocampista', 'Francés', 7),
(98, 'Samuel Chukwueze', 'Chukwueze', '1999-05-22', 'chukwueze.jfif', 11, 'Extremo', 'Nigeriano', 7),
(99, 'Arnaut Danjuma', 'Danjuma', '1997-01-31', 'danjuma.jfif', 19, 'Delantero', 'Nigeriano', 7),
(100, 'Boulaye Dia', 'Dia', '1996-11-16', 'dia.jfif', 9, 'Delantero', 'Senegalés', 7),
(101, 'Moi Gómez', 'Moi', '1994-05-24', 'moi.jfif', 7, 'Centrocampista', 'Español', 7),
(102, 'Yeremy Pino', 'Pino', '2002-10-20', 'pino.jfif', 28, 'Delantero', 'Español', 7);

-- Jugadores del Athletic Club
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(103, 'Unai Simón', 'Simón', '1997-06-11', 'simon.jfif', 1, 'Portero', 'Español', 8),
(104, 'Iñigo Martínez', 'Martínez', '1991-05-17', 'inigo_martinez.jfif', 4, 'Defensa', 'Español', 8),
(105, 'Yeray Álvarez', 'Yeray', '1995-01-27', 'yeray.jfif', 12, 'Defensa', 'Español', 8),
(106, 'Óscar De Marcos', 'De Marcos', '1989-04-21', 'de_marcos.jfif', 2, 'Defensa', 'Español', 8),
(107, 'Iker Muniain', 'Muniain', '1992-12-19', 'muniain.jfif', 10, 'Centrocampista', 'Español', 8),
(108, 'Mikel Vesga', 'Vesga', '1993-02-11', 'vesga.jfif', 8, 'Centrocampista', 'Español', 8),
(109, 'Unai López', 'Unai López', '1994-05-30', 'unai_lopez.jfif', 6, 'Centrocampista', 'Español', 8),
(110, 'Raúl García', 'Raúl García', '1986-07-11', 'raul_garcia.jfif', 19, 'Delantero', 'Español', 8),
(111, 'Iñaki Williams', 'Williams', '1994-06-15', 'williams.jfif', 9, 'Delantero', 'Español', 8),
(112, 'Nico Williams', 'Nico', '2002-07-30', 'nico_williams.jfif', 22, 'Delantero', 'Español', 8),
(113, 'Asier Villalibre', 'Villalibre', '1997-03-30', 'villalibre.jfif', 20, 'Delantero', 'Español', 8);

-- Jugadores del Valencia
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(114, 'Jaume Doménech', 'Jaume', '1990-04-08', 'jaume.jfif', 13, 'Portero', 'Español', 9),
(115, 'Gabriel Paulista', 'Gabriel', '1990-11-26', 'gabriel_paulista.jfif', 4, 'Defensa', 'Brasileño', 9),
(116, 'José Gayà', 'Gayà', '1995-05-25', 'gaya.jfif', 14, 'Defensa', 'Español', 9),
(117, 'Hugo Guillamón', 'Guillamón', '2000-01-31', 'guillamon.jfif', 3, 'Defensa', 'Español', 9),
(118, 'Daniel Wass', 'Wass', '1989-05-31', 'wass.jfif', 2, 'Centrocampista', 'Danés', 9),
(119, 'Carlos Soler', 'Soler', '1997-01-02', 'soler.jfif', 8, 'Centrocampista', 'Español', 9),
(120, 'Álex Blanco', 'Blanco', '1998-05-28', 'blanco.jfif', 7, 'Centrocampista', 'Español', 9),
(121, 'Uros Racic', 'Racic', '1998-02-17', 'racic.jfif', 6, 'Centrocampista', 'Serbio', 9),
(122, 'Maxi Gómez', 'Maxi', '1996-08-14', 'maxi.jfif', 9, 'Delantero', 'Uruguayo', 9),
(123, 'Gonçalo Guedes', 'Guedes', '1996-11-29', 'guedes.jfif', 11, 'Delantero', 'Portugués', 9),
(124, 'Hugo Duro', 'Duro', '1999-05-10', 'duro.jfif', 20, 'Delantero', 'Español', 9);

-- Jugadores del Osasuna
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(125, 'Roberto Fernández', 'Roberto', '1996-03-22', 'roberto.jfif', 1, 'Portero', 'Español', 10),
(126, 'Unai García', 'Unai', '1992-05-11', 'unai_garcia.jfif', 5, 'Defensa', 'Español', 10),
(127, 'David García', 'David', '1994-04-11', 'david_garcia.jfif', 4, 'Defensa', 'Español', 10),
(128, 'Nacho Vidal', 'Nacho', '1994-06-11', 'nacho_vidal.jfif', 15, 'Defensa', 'Español', 10),
(129, 'Jon Moncayola', 'Moncayola', '1998-09-19', 'moncayola.jfif', 6, 'Centrocampista', 'Español', 10),
(130, 'Bruno Martínez', 'Bruno', '2003-07-06', 'bruno_martinez.jfif', 3, 'Centrocampista', 'Español', 10),
(131, 'Kike Barja', 'Barja', '1997-05-18', 'barja.jfif', 11, 'Extremo', 'Español', 10),
(132, 'Chimy Ávila', 'Chimy', '1996-04-06', 'chimy_avila.jfif', 7, 'Delantero', 'Argentino', 10),
(133, 'Ezequiel Avila', 'Ezequiel', '1996-06-14', 'ezequiel_avila.jfif', 9, 'Delantero', 'Argentino', 10),
(134, 'Rubén Peña', 'Peña', '1986-09-07', 'ruben_pena.jfif', 16, 'Defensa', 'Español', 10),
(135, 'Toni Martínez','Toni', '1997-01-30', 'toni_martinez.jfif', 17, 'Delantero', 'Español', 10),
(136, 'Areso', 'Areso', '1999-06-24', 'areso.jfif', 21, 'Defensa', 'Español', 10),
(137, 'Kike García', 'Kike', '1989-01-06', 'kike_garcia.jfif', 22, 'Delantero', 'Español', 10),
(138, 'Ander Martín', 'Ander', '1999-08-17', 'ander_martin.jfif', 24, 'Centrocampista', 'Español', 10);

-- Jugadores del celta
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(139, 'Matías Dituro', 'Dituro', '1987-07-22', 'dituro.jfif', 1, 'Portero', 'Chileno', 11),
(140, 'Joseph Aidoo', 'Aidoo', '1996-07-29', 'aidoo.jfif', 4, 'Defensa', 'Ghanés', 11),
(141, 'José Fontán', 'Fontán', '2000-02-21', 'fontan.jfif', 3, 'Defensa', 'Español', 11),
(142, 'Néstor Araujo', 'Araujo', '1991-08-29', 'araujo.jfif', 2, 'Defensa', 'Mexicano', 11),
(143, 'Fran Beltrán', 'Beltrán', '1999-05-09', 'beltran.jfif', 6, 'Centrocampista', 'Español', 11),
(144, 'Brais Méndez', 'Brais', '1997-07-07', 'brais_mendez.jfif', 8, 'Centrocampista', 'Español', 11),
(145, 'Denis Suárez', 'Denis', '1994-01-06', 'denis_suarez.jfif', 10, 'Centrocampista', 'Español', 11),
(146, 'Iago Aspas', 'Aspas', '1987-08-01', 'aspas.jfif', 7, 'Delantero', 'Español', 11),
(147, 'Santi Mina', 'Mina', '1995-01-07', 'mina.jfif', 9, 'Delantero', 'Español', 11),
(148, 'Gabriel Veiga', 'Veiga', '2002-01-28', 'veiga.jfif', 18, 'Centrocampista', 'Español', 11),
(149, 'Javi Galán', 'Galán', '1994-02-25', 'javi_galan.jfif', 15, 'Defensa', 'Español', 11),
(150, 'Rubén Blanco', 'Blanco', '1995-07-27', 'ruben_blanco.jfif', 13, 'Portero', 'Español', 11),
(151, 'Thiago Galhardo', 'Galhardo', '1989-04-28', 'thiago_galhardo.jfif', 20, 'Delantero', 'Brasileño', 11),
(152, 'Augusto Solari', 'Solari', '1992-06-24', 'augusto_solari.jfif', 16, 'Centrocampista', 'Argentino', 11);

-- Jugadores del Rayo Vallecano
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(153, 'Stole Dimitrievski', 'Dimitrievski', '1993-07-25', 'dimitrievski.jfif', 1, 'Portero', 'Macedonio', 12),
(154, 'Sergio Moreno', 'Moreno', '1992-11-25', 'sergio_moreno.jfif', 17, 'Delantero', 'Español', 12),
(155, 'Iván Balliu', 'Balliu', '1992-05-02', 'ivan_balliu.jfif', 2, 'Defensa', 'Albanés', 12),
(156, 'Isi Palazón', 'Isi', '1995-09-02', 'isi_palazon.jfif', 10, 'Centrocampista', 'Español', 12),
(157, 'Alejandro Catena', 'Catena', '1994-04-06', 'catena.jfif', 4, 'Defensa', 'Español', 12),
(158, 'Unai López', 'Unai', '1995-05-30', 'unai_lopez.jfif', 8, 'Centrocampista', 'Español', 12),
(159, 'Álvaro García', 'Álvaro', '1991-07-30', 'alvaro_garcia.jfif', 7, 'Extremo', 'Español', 12),
(160, 'Santi Comesaña', 'Santi', '1996-08-25', 'comesana.jfif', 6, 'Centrocampista', 'Español', 12),
(161, 'Pathé Ciss', 'Ciss', '1994-11-06', 'pathe_ciss.jfif', 20, 'Centrocampista', 'Senegalés', 12),
(162, 'Óscar Valentín', 'Óscar', '1994-04-23', 'oscar_valentin.jfif', 14, 'Centrocampista', 'Español', 12),
(163, 'Álex Moreno', 'Álex', '1993-01-08', 'alex_moreno.jfif', 3, 'Defensa', 'Español', 12),
(164, 'Fran García', 'Fran', '1995-04-04', 'fran_garcia.jfif', 21, 'Defensa', 'Español', 12),
(165, 'Isi Palazón', 'Isi', '1995-09-02', 'isi_palazon.jfif', 10, 'Centrocampista', 'Español', 12),
(166, 'Andoni López', 'Andoni', '1997-06-06', 'andoni_lopez.jfif', 19, 'Defensa', 'Español', 12);

-- Jugdores del Alavés
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(167, 'Fernando Pacheco', 'Pacheco', '1992-01-18', 'pacheco.jfif', 1, 'Portero', 'Español', 13),
(168, 'Rubén Duarte', 'Duarte', '1995-03-05', 'duarte.jfif', 3, 'Defensa', 'Español', 13),
(169, 'Víctor Laguardia', 'Laguardia', '1987-04-5', 'laguardia.jfif', 5, 'Defensa', 'Español', 13),
(170, 'Manu García', 'Manu', '1998-02-26', 'manu_garcia.jfif', 6, 'Centrocampista', 'Español', 13),
(171, 'Toni Moya', 'Moya', '1998-03-26', 'tonimoya.jfif', 8, 'Centrocampista', 'Español', 13),
(172, 'Joselu', 'Joselu', '1990-03-27', 'joselu.jfif', 9, 'Delantero', 'Español', 13),
(173, 'Luis Rioja', 'Rioja', '1993-10-17', 'rioja.jfif', 11, 'Extremo', 'Español', 13),
(174, 'Jota', 'Jota', '1999-06-19', 'jota.jfif', 7, 'Delantero', 'Español', 13),
(175, 'Lucas Pérez', 'Lucas', '1988-09-10', 'lucas_perez.jfif', 10, 'Delantero', 'Español', 13),
(176, 'Guillermo Maripán', 'Maripán', '1994-05-06', 'maripan.jfif', 2, 'Defensa', 'Chileno', 13),
(177, 'Rubén Sobrino', 'Sobrino', '1992-07-01', 'sobrino.jfif', 14, 'Delantero', 'Español', 13),
(178, 'Ximo Navarro', 'Ximo', '1988-10-08', 'ximo_navarro.jfif', 4, 'Defensa', 'Español', 13),
(179, 'Dani Calvo', 'Calvo', '1990-06-16', 'calvo.jfif', 15, 'Defensa', 'Español', 13),
(180, 'Mubarak Wakaso', 'Wakaso', '1990-05-25', 'wakaso.jfif', 16, 'Centrocampista', 'Ghanés', 13),
(181, 'Joselu', 'Joselu', '1990-03-27', 'joselu.jfif', 18, 'Delantero', 'Español', 13);

-- Jugadores del Espanyol
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(182, 'Diego López', 'Diego', '1981-11-03', 'diego_lopez.jfif', 1, 'Portero', 'Español', 14),
(183, 'Adrià Pedrosa', 'Pedrosa', '1998-02-11', 'adria_pedrosa.jfif', 3, 'Defensa', 'Español', 14),
(184, 'Óscar Gil', 'Óscar', '1997-02-11', 'oscar_gil.jfif', 5, 'Defensa', 'Español', 14),
(185, 'Nico Melamed', 'Nico', '2001-05-06', 'nico_melamed.jfif', 10, 'Centrocampista', 'Español', 14),
(186, 'Wu Lei', 'Wu', '1991-11-19', 'wu_lei.jfif', 7, 'Delantero', 'Chino', 14),
(187, 'Raúl de Tomás', 'RDT', '1994-10-17', 'raul_de_tomas.jfif', 9, 'Delantero', 'Español', 14),
(188, 'Javi Puado', 'Puado', '1998-03-25', 'javi_puado.jfif', 17, 'Delantero', 'Español', 14),
(189, 'Leandro Cabrera', 'Cabrera', '1989-07-23', 'leandro_cabrera.jfif', 6, 'Defensa', 'Uruguayo', 14),
(190, 'Vinicius Souza', 'Vinicius', '1999-06-06', 'vinicius_souza.jfif', 18, 'Centrocampista', 'Brasileño', 14),
(191, 'Ricard Sánchez', 'Ricard', '2000-02-26', 'ricard_sanchez.jfif', 4, 'Defensa', 'Español', 14),
(192, 'Embarba', 'Embarba', '1992-02-10', 'embarba.jfif', 11, 'Centrocampista', 'Español', 14),
(193, 'Óscar Duarte', 'Duarte', '1989-05-03', 'oscar_duarte.jfif', 2, 'Defensa', 'Costarricense', 14),
(194, 'Pablo López', 'Pablo', '1998-05-20', 'pablo_lopez.jfif', 16, 'Centrocampista', 'Español', 14),
(195, 'Didac Vilà', 'Didac', '1989-11-17', 'didac_vila.jfif', 15, 'Defensa', 'Español', 14),
(196, 'Fran Mérida', 'Fran', '1990-03-04', 'fran_merida.jfif', 8, 'Centrocampista', 'Español', 14);

-- Jugadores de Las Palmas
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(197, 'Álvaro Valles', 'Valles', '1997-08-11', 'alvaro_valles.jfif', 1, 'Portero', 'Español', 15),
(198, 'Ale Díez', 'Ale', '2002-03-15', 'ale_diez.jfif', 2, 'Defensa', 'Español', 15),
(199, 'Pepe, Juan José Expósito', 'Pepe', '1995-01-28', 'pepe.jfif', 3, 'Defensa', 'Español', 15),
(200, 'Marc Cardona', 'Cardona', '1995-10-10', 'marc_cardona.jfif', 7, 'Delantero', 'Español', 15),
(201, 'Jesé Rodríguez', 'Jesé', '1993-02-26', 'jese.jfif', 9, 'Delantero', 'Español', 15),
(202, 'Pedri', 'Pedri', '2002-11-25', 'pedri.jfif', 16, 'Centrocampista', 'Español', 15),
(203, 'Jonathan Viera', 'Viera', '1989-08-21', 'jonathan_viera.jfif', 10, 'Centrocampista', 'Español', 15),
(204, 'Jesús Valentín', 'Valentín', '1986-07-18', 'jesus_valentin.jfif', 4, 'Defensa', 'Español', 15),
(205, 'Eric Curbelo', 'Curbelo', '1997-01-05', 'eric_curbelo.jfif', 15, 'Defensa', 'Español', 15),
(206, 'Alejandro Gálvez', 'Gálvez', '1986-07-14', 'alejandro_galvez.jfif', 5, 'Defensa', 'Español', 15),
(207, 'Jesús Areso', 'Areso', '1997-10-17', 'jesus_areso.jfif', 6, 'Defensa', 'Español', 15),
(208, 'Kirian Rodríguez', 'Kirian', '1996-06-15', 'kirian_rodriguez.jfif', 14, 'Centrocampista', 'Español', 15),
(209, 'Javi Castellano', 'Castellano', '1987-11-05', 'javi_castellano.jfif', 8, 'Centrocampista', 'Español', 15),
(210, 'Iván Ramis', 'Ramis', '1984-11-10', 'ivan_ramis.jfif', 20, 'Defensa', 'Español', 15),
(211, 'Raúl Fernández', 'Raúl', '1992-01-15', 'raul_fernandez.jfif', 18, 'Portero', 'Español', 15);

-- Jugadores del Getafe
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(212, 'Rubén Yáñez', 'Yáñez', '1993-08-27', 'ruben_yanez.jfif', 1, 'Portero', 'Español', 16),
(213, 'Damián Suárez', 'Suárez', '1988-06-27', 'damian_suarez.jfif', 2, 'Defensa', 'Uruguayo', 16),
(214, 'Leandro Cabrera', 'Cabrera', '1989-07-23', 'leandro_cabrera.jfif', 3, 'Defensa', 'Uruguayo', 16),
(215, 'Erick Cabaco', 'Cabaco', '1997-03-30', 'erick_cabaco.jfif', 4, 'Defensa', 'Uruguayo', 16),
(216, 'Djene Dakonam', 'Djene', '1992-07-31', 'djene_dakonam.jfif', 5, 'Defensa', 'Togolés', 16),
(217, 'Marc Cucurella', 'Cucu', '1998-07-22', 'marc_cucurella.jfif', 6, 'Defensa', 'Español', 16),
(218, 'Sergio Mora', 'Mora', '1995-04-24', 'sergio_mora.jfif', 7, 'Centrocampista', 'Español', 16),
(219, 'Carles Aleñá', 'Aleñá', '1998-01-05', 'carles_alena.jfif', 8, 'Centrocampista', 'Español', 16),
(220, 'Nemanja Maksimović', 'Maksimović', '1993-02-26', 'nemanja_maksimovic.jfif', 10, 'Centrocampista', 'Serbio', 16),
(221, 'Mathieu Flamini', 'Flamini', '1984-03-07', 'mathieu_flamini.jfif', 12, 'Centrocampista', 'Francés', 16),
(222, 'Jorge Molina', 'Molina', '1982-04-22', 'jorge_molina.jfif', 14, 'Delantero', 'Español', 16),
(223, 'Enes Ünal', 'Ünal', '1997-05-10', 'enes_unal.jfif', 9, 'Delantero', 'Turco', 16),
(224, 'Ángel Rodríguez', 'Ángel', '1987-02-07', 'angel_rodriguez.jfif', 11, 'Delantero', 'Español', 16),
(225, 'Marc Navarro', 'Navarro', '1995-10-25', 'marc_navarro.jfif', 15, 'Defensa', 'Español', 16),
(226, 'Bebé', 'Bebé', '1990-01-12', 'bebe.jfif', 16, 'Centrocampista', 'Portugués', 16);

-- Jugadores del Mallorca
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(227, 'Manolo Reina', 'Reina', '1985-02-14', 'manolo_reina.jfif', 1, 'Portero', 'Español', 17),
(228, 'Antonio Raíllo', 'Raíllo', '1987-05-08', 'antonio_raillo.jfif', 2, 'Defensa', 'Español', 17),
(229, 'Ángel Rodríguez', 'Ángel', '1987-02-07', 'angel_rodriguez.jfif', 3, 'Delantero', 'Español', 17),
(230, 'Takefusa Kubo', 'Kubo', '2001-06-04', 'takefusa_kubo.jfif', 7, 'Centrocampista', 'Japonés', 17),
(231, 'Salva Sevilla', 'Sevilla', '1984-10-01', 'salva_sevilla.jfif', 10, 'Centrocampista', 'Español', 17),
(232, 'Brian Oliván', 'Oliván', '1994-05-10', 'brian_olivan.jfif', 4, 'Defensa', 'Español', 17),
(233, 'Aleix Febas', 'Febas', '1996-06-08', 'aleix_febas.jfif', 6, 'Centrocampista', 'Español', 17),
(234, 'Vedat Muriqi', 'Muriqi', '1994-04-08', 'vedat_muriqi.jfif', 9, 'Delantero', 'Kosovar', 17),
(235, 'Lumor Agbenyenu', 'Lumor', '1996-09-07', 'lumor_agbenyenu.jfif', 15, 'Defensa', 'Ghanés', 17),
(236, 'Martin Valjent', 'Valjent', '1995-02-17', 'martin_valjent.jfif', 14, 'Defensa', 'Eslovaco', 17),
(237, 'Martin Valjent', 'Valjent', '1995-02-17', 'martin_valjent.jfif', 13, 'Defensa', 'Eslovaco', 17),
(238, 'Jaume Costa', 'Costa', '1988-06-02', 'jaume_costa.jfif', 5, 'Defensa', 'Español', 17),
(239, 'Salva Ruiz', 'Ruiz', '1997-05-14', 'salva_ruiz.jfif', 16, 'Defensa', 'Español', 17),
(240, 'Sergio Rico', 'Rico', '1993-09-01', 'sergio_rico.jfif', 12, 'Portero', 'Español', 17),
(241, 'Alejandro Pozo', 'Pozo', '1999-02-15', 'alejandro_pozo.jfif', 8, 'Centrocampista', 'Español', 17);

-- Jugadores del Leganés
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(242, 'Iván Cuéllar', 'Pichu', '1984-05-27', 'ivan_cuellar.jfif', 1, 'Portero', 'Español', 18),
(243, 'Unai Bustinza', 'Bustinza', '1992-01-05', 'unai_bustinza.jfif', 2, 'Defensa', 'Español', 18),
(244, 'Diego Rico', 'Rico', '1993-07-21', 'diego_rico.jfif', 3, 'Defensa', 'Español', 18),
(245, 'Martin Braithwaite', 'Braithwaite', '1991-03-05', 'martin_braithwaite.jfif', 7, 'Delantero', 'Danés', 18),
(246, 'Rubén Pérez', 'Rubén', '1989-02-06', 'ruben_perez.jfif', 8, 'Centrocampista', 'Español', 18),
(247, 'José Arnáiz', 'Arnáiz', '1995-05-19', 'jose_arnaiz.jfif', 9, 'Delantero', 'Español', 18),
(248, 'Alexander Szymanowski', 'Szymanowski', '1988-05-10', 'alexander_szymanowski.jfif', 10, 'Centrocampista', 'Argentino', 18),
(249, 'Óscar Rodríguez', 'Óscar', '1998-06-28', 'oscar_rodriguez.jfif', 11, 'Centrocampista', 'Español', 18),
(250, 'José Ángel', 'José Ángel', '1992-09-03', 'jose_angel.jfif', 12, 'Defensa', 'Español', 18),
(251, 'Rodrigo Tarín', 'Tarín', '1993-05-09', 'rodrigo_tarin.jfif', 13, 'Defensa', 'Español', 18),
(252, 'Rubén Duarte', 'Duarte', '1995-02-10', 'ruben_duarte.jfif', 14, 'Defensa', 'Español', 18),
(253, 'Óscar Mena', 'Mena', '1980-03-21', 'oscar_mena.jfif', 15, 'Centrocampista', 'Español', 18),
(254, 'Luis Perea', 'Perea', '1986-12-06', 'luis_perea.jfif', 16, 'Centrocampista', 'Colombiano', 18),
(255, 'Nabil El Zhar', 'El Zhar', '1986-03-29', 'nabil_elzhar.jfif', 17, 'Delantero', 'Marroquí', 18),
(256, 'Rubén Sobrino', 'Sobrino', '1992-11-01', 'ruben_sobrino.jfif', 18, 'Delantero', 'Español', 18);

-- Jugadores del Valladolid
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(257, 'José Sáez', 'Sáez', '1985-07-24', 'jose_saez.jfif', 1, 'Portero', 'Español', 19),
(258, 'Javi Sánchez', 'Javi', '1997-02-24', 'javi_sanchez.jfif', 2, 'Defensa', 'Español', 19),
(259, 'Omar Govea', 'Govea', '1996-04-15', 'omar_govea.jfif', 3, 'Centrocampista', 'Mexicano', 19),
(260, 'Shon Weissman', 'Weissman', '1996-04-09', 'shon_weissman.jfif', 9, 'Delantero', 'Israelí', 19),
(261, 'Kike Pérez', 'Kike', '1997-06-06', 'kike_perez.jfif', 8, 'Centrocampista', 'Español', 19),
(262, 'Anuar Tuhami', 'Anuar', '1995-01-28', 'anuar_tuhami.jfif', 10, 'Centrocampista', 'Español', 19),
(263, 'Javi Mier', 'Mier', '1999-01-20', 'javi_mier.jfif', 14, 'Centrocampista', 'Español', 19),
(264, 'Rubén Alcaraz', 'Alcaraz', '1991-01-02', 'ruben_alcaraz.jfif', 6, 'Centrocampista', 'Español', 19),
(265, 'Kiko Olivas', 'Olivas', '1990-11-14', 'kiko_olivas.jfif', 5, 'Defensa', 'Español', 19),
(266, 'Luis Pérez', 'Luis', '1995-08-16', 'luis_perez.jfif', 4, 'Defensa', 'Español', 19),
(267, 'Nacho Martínez', 'Nacho', '1990-11-27', 'nacho_martinez.jfif', 7, 'Centrocampista', 'Español', 19),
(268, 'Javi Sánchez', 'Javi', '1997-02-24', 'javi_sanchez.jfif', 12, 'Defensa', 'Español', 19),
(269, 'Sergio González', 'Sergio', '1987-09-10', 'sergio_gonzalez.jfif', 15, 'Centrocampista', 'Español', 19),
(270, 'Óscar Plano', 'Plano', '1991-03-02', 'oscar_plano.jfif', 11, 'Centrocampista', 'Español', 19),
(271, 'Juanjo Narváez', 'Narváez', '1995-06-10', 'juanjo_narvaez.jfif', 16, 'Delantero', 'Colombiano', 19);

-- Jufadores del Girona
INSERT INTO Jugador (idJugador, Nombre, Apodo, FechaNac, Foto, Dorsal, Posicion, Nacionalidad, Equipo_idEquipo) VALUES
(272, 'Juan Carlos', 'Juan Carlos', '1990-11-15', 'juan_carlos.jfif', 1, 'Portero', 'Español', 20),
(273, 'Borja García', 'Borja', '1987-03-02', 'borja_garcia.jfif', 2, 'Centrocampista', 'Español', 20),
(274, 'Sergi Enrich', 'Sergi', '1989-06-29', 'sergi_enrich.jfif', 9, 'Delantero', 'Español', 20),
(275, 'Aleix García', 'Aleix', '1997-09-28', 'aleix_garcia.jfif', 10, 'Centrocampista', 'Español', 20),
(276, 'Nahuel Bustos', 'Nahuel', '1998-05-05', 'nahuel_bustos.jfif', 11, 'Delantero', 'Argentino', 20),
(277, 'Cristian Herrera', 'Cristian', '1994-08-06', 'cristian_herrera.jfif', 7, 'Delantero', 'Español', 20),
(278, 'Mamadou Sylla', 'Sylla', '1994-05-01', 'mamadou_sylla.jfif', 17, 'Delantero', 'Guineano', 20),
(279, 'José Ángel Esmorís', 'José Ángel', '2000-01-26', 'jose_angel_esmoris.jfif', 4, 'Defensa', 'Español', 20),
(280, 'Bruno Saltor', 'Bruno', '1980-08-28', 'bruno_saltor.jfif', 5, 'Defensa', 'Español', 20),
(281, 'Aleix Viladot', 'Viladot', '1996-07-14', 'aleix_viladot.jfif', 3, 'Defensa', 'Español', 20),
(282, 'Carles Planas', 'Carles', '1991-02-11', 'carles_planas.jfif', 6, 'Defensa', 'Español', 20),
(283, 'Arnau Martínez', 'Arnau', '2001-06-21', 'arnau_martinez.jfif', 14, 'Defensa', 'Español', 20),
(284, 'Marc Muniesa', 'Muniesa', '1992-02-27', 'marc_muniesa.jfif', 15, 'Defensa', 'Español', 20),
(285, 'Portu', 'Portu', '1992-11-17', 'portu.jfif', 8, 'Centrocampista', 'Español', 20),
(286, 'Aleix Coch', 'Aleix', '1991-10-12', 'aleix_coch.jfif', 13, 'Defensa', 'Español', 20);

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
DELETE FROM evento;





SELECT user, host FROM mysql.user;
SELECT user, host, authentication_string FROM mysql.user;
describe arbitro;
SHOW CREATE TABLE Arbitro;
ALTER TABLE Arbitro MODIFY idArbitro INT NOT NULL AUTO_INCREMENT;



