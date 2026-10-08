DELETE FROM factures;
DELETE FROM reserva;
DELETE FROM tasca_empleats;
DELETE FROM tasca;
DELETE FROM clients;
DELETE FROM empleats;
DELETE FROM usuari;
DELETE FROM habitacions;
DELETE FROM hotels;
DELETE FROM categories;

INSERT INTO categories (id, nom) VALUES (1, 'Motel');
INSERT INTO categories (id, nom) VALUES (2, '1 estrella');
INSERT INTO categories (id, nom) VALUES (3, '2 estrelles');
INSERT INTO categories (id, nom) VALUES (4, '3 estrelles');
INSERT INTO categories (id, nom) VALUES (5, '4 estrelles');
INSERT INTO categories (id, nom) VALUES (6, '5 estrelles');

INSERT INTO hotels (id, nom, adresa, ciutat, categoria_id) VALUES (1, "Palace", "Gran Via de les Corts Catalanes 668", "Barcelona", 6);
INSERT INTO hotels (id, nom, adresa, ciutat, categoria_id) VALUES (2, "Palacio del Intendente", "Plaza Nicolas Kerche 2", "Guarroman", 4);
INSERT INTO hotels (id, nom, adresa, ciutat, categoria_id) VALUES (3, "Futurotel Room Spa Garden", "Tablas 8", "Granada", 1);


INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (1, 100, 5, "Suite de luxe amb vistes al mar", 500, 250, 'SUITE', 'OCUPADA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (2, 101, 2, "Habitacio doble amb vistes al mar", 250, 70, 'DOBLE', 'OCUPADA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (3, 205, 1, "Habitacio simple amb vistes al mar", 160, 70, 'SIMPLE', 'EN_NETEJA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (4, 001, 1, "Habitacio a peu de carrer", 25, 10, 'SIMPLE', 'OCUPADA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (5, 601, 2, "Habitacio a l'ultima planta amb vistes a absolutament tot", 2500, 700, 'SUITE', 'EN_NETEJA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (6, 102, 2, "Habitacio doble amb vistes al carrer", 250, 70, 'DOBLE', 'OCUPADA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (7, 103, 2, "Habitacio doble amb vistes al carrer", 250, 70, 'DOBLE', 'DISPONIBLE', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (8, 104, 2, "Habitacio Simple amb vistes al mar", 170, 45, 'SIMPLE', 'EN_NETEJA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (9, 105, 2, "Habitacio doble amb vistes al mar", 250, 70, 'DOBLE', 'OCUPADA', 1);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (10, 106, 2, "Habitacio doble amb vistes al mar", 250, 70, 'DOBLE', 'EN_NETEJA', 1);


INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (11, 340, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'DISPONIBLE', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (12, 341, 5, "Suite amb vistes a la ciutat", 500, 250, 'SUITE', 'DISPONIBLE', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (13, 342, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'EN_NETEJA', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (14, 343, 1, "Habitacio simple amb vistes a la ciutat", 20, 10, 'SIMPLE', 'OCUPADA', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (15, 344, 2, "Habitacio doble amb vistes a la ciutat", 200, 50, 'DOBLE', 'EN_NETEJA', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (16, 345, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'OCUPADA', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (17, 346, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'DISPONIBLE', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (18, 347, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'EN_NETEJA', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (19, 348, 1, "Habitacio simple amb vistes a la ciutat", 200, 100, 'SIMPLE', 'OCUPADA', 2);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (20, 349, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'EN_NETEJA', 2);




INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (21, 28, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'DISPONIBLE', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (22, 20, 2, "Habitacio doble amb vistes a la ciutat", 20, 10, 'DOBLE', 'EN_NETEJA', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (23, 27, 2, "Habitacio doble amb vistes a la ciutat", 100, 50, 'DOBLE', 'OCUPADA', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (24, 30, 7, "suite amb vistes a la ciutat", 10, 5, 'SUITE', 'OCUPADA', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (25, 21, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'DISPONIBLE', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (26, 22, 2, "Habitacio doble amb vistes a la ciutat", 20, 10, 'DOBLE', 'EN_NETEJA', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (27, 23, 1, "Habitacio simple amb vistes a la ciutat", 10, 50, 'SIMPLE', 'OCUPADA', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (28, 24, 2, "Habitacio doble amb vistes a la ciutat", 20, 10, 'DOBLE', 'EN_NETEJA', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (29, 25, 1, "Habitacio simple amb vistes a la ciutat", 100, 50, 'SIMPLE', 'DISPONIBLE', 3);

INSERT INTO habitacions (id, numero, capacitat, descripcio, preu_nitad, preu_nitmp, tipus, estat, hotel_id) 
VALUES (30, 26, 2, "Habitacio doble amb vistes al mar", 25, 17, 'DOBLE', 'OCUPADA', 3);

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1001, 1, 'mama199@vidalibarraquer.net', '12345', 'ROLE_CLIENT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1002, 1, 'roca578@vidalibarraquer.net', '12345', 'ROLE_CLIENT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1003, 1, 'ose789@vidalibarraquer.net', '12345', 'ROLE_CLIENT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1004, 1, 'dague034@vidalibarraquer.net', '12345', 'ROLE_CLIENT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1005, 1, 'eles340@vidalibarraquer.net', '12345', 'ROLE_CLIENT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1006, 1, 'ikfue783@vidalibarraquer.net', '12345', 'ROLE_CLIENT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1007, 1, 'rama82@gmail.com', '123456', 'ROLE_ADMIN');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1008, 1, 'admin@admin', 'admin', 'ROLE_ADMIN');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1009, 1, 'mocap8@gmail.com', 'usuari', 'ROLE_EMPLEAT');

INSERT INTO usuari (id, actiu, email, password, rol)
VALUES(1010, 1, 'empleat@empleat', 'empleat', 'ROLE_EMPLEAT');

INSERT INTO clients (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, data_alta, targeta, tipusc)
VALUES (1, "49646199D", "Francolí 16", "Machado", "2000-12-14", "mama199@vidalibarraquer.net", "Marc", "671767676", 1001, "2023-03-12", "123412341234", 'VIP');

INSERT INTO clients (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, data_alta, targeta, tipusc)
VALUES (2, "02943578R", "Civaderia 23", "Campbei", "2001-03-18", "roca578@vidalibarraquer.net", "Robert", "698946652", 1002, "2024-04-27", "3987450974", 'VIP');

INSERT INTO clients (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, data_alta, targeta, tipusc)
VALUES (3, "08097789M", "Tortosa 40", "Serrano", "2005-11-17", "ose789@vidalibarraquer.net", "Oliver", "654651336", 1003, "2022-12-27", "656456461654", 'VIP');

INSERT INTO clients (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, data_alta, targeta, tipusc)
VALUES (4, "04574034S", "Ramon y Cajal 40", "Guevara", "1995-03-18", "dague034@vidalibarraquer.net", "Danna", "656987451", 1004, "2019-02-26", "98998764655", 'NORMAL');

INSERT INTO clients (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, data_alta, targeta, tipusc)
VALUES (5, "03495340W", "Sant Benilde 6", "Escobedo", "2001-03-18", "eles340@vidalibarraquer.net", "Eloy", "698946658", 1005, "2024-04-27", "123412341234", 'NORMAL');

INSERT INTO clients (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, data_alta, targeta, tipusc)
VALUES (6, "14495783A", "Sant Benilde 67", "Fuertes", "2003-03-18", "ikfue783@vidalibarraquer.net", "Iker", "698946568", 1006, "2024-04-15", "123412341258", 'VIP');


INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, contractacio, llocfeina, salari, tipuse)
VALUES (10001, "4589582X", "Reus 12", "Martinez", "2005-07-01", "rama82@gmail.com", "Raul", "685555555", 1007, "2023-01-01", "neteja", "300.5", 'ACTIU');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, contractacio, llocfeina, salari, tipuse)
VALUES (10002, "4589581X", "Reus 12", "Martinez", "2006-12-01", "admin@admin", "Ramon", "685555556", 1008, "2023-01-01", "cap de planta", "1500.5", 'ACTIU');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, contractacio, llocfeina, salari, tipuse)
VALUES (10003, "4589548X", "Reus 12", "Capdevila", "2005-07-14", "mocap8@gmail.com", "Montse", "685785953", 1009, "2022-02-01", "cap de planta", "980.5", 'BAIXA');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, user_id, contractacio, llocfeina, salari, tipuse)
VALUES (10004, "9879845X", "Torrent 54", "Berenguer", "2005-07-01", "mabe45@gmail.com", "Marc", "68589898", 1010, "2019-05-17", "botons", "700.7", 'PERMIS');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, contractacio, llocfeina, salari, tipuse)
VALUES (10005, "4589898L", "Nogales 12", "De la Torre", "2001-08-26", "alde898@gmail.com", "Almudena", "685555555", "2023-01-01", "cafeteria", "850.5", 'ACTIU');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, contractacio, llocfeina, salari, tipuse)
VALUES (10006, "4589584D", "Reus 34", "Lorenzo", "2006-09-27", "jolo584@gmail.com", "Jorge", "685555985", "2023-12-17", "botons", "660.7", 'ACTIU');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, contractacio, llocfeina, salari, tipuse)
VALUES (10007, "3023834A", "Reus 78", "Vicens", "2008-07-01", "tovi834@gmail.com", "Toni", "685555578", "2020-12-07", "botons", "850.5", 'ACTIU');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, contractacio, llocfeina, salari, tipuse)
VALUES (10008, "6984986F", "Torrent 56", "Federica", "2007-11-11", "vife986@gmail.com", "Victoria", "685559684", "2022-01-27", "recepcio", "900.5", 'ACTIU');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, contractacio, llocfeina, salari, tipuse)
VALUES (10009, "1254898S", "Nogales 78", "Jaime", "1967-09-11", "jano@gmail.com", "Jairo", "685556684", "2009-04-14", "recepcio", "1200.5", 'BAIXA');

INSERT INTO empleats (id, dni, adresa, cognom, datanaix, email, nom, telefon, contractacio, llocfeina, salari, tipuse)
VALUES (10010, "0348570F", "Reus 1", "Joan", "2004-07-21", "jojo570@gmail.com", "Joel", "685555698", "2025-01-25", "recepcio", "990.8", 'ACTIU');



INSERT INTO tasca (id, data_creacio, data_execucio, descripcio, tipus_estat)
VALUES (1, "2025-02-10", "2025-02-18", "aspiradora per tot l'hotel", 'COMPLETADA');

INSERT INTO tasca (id, data_creacio, data_execucio, descripcio, tipus_estat)
VALUES (2, "2024-12-11", "2025-02-18", "fregar habitacions", 'EN_PROGRES');

INSERT INTO tasca (id, data_creacio, data_execucio, descripcio, tipus_estat)
VALUES (3, "2024-12-31", "2025-03-27", "backup base de dades de l'hotel", 'PENDENT');

INSERT INTO tasca (id, data_creacio, data_execucio, descripcio, tipus_estat)
VALUES (4, "2023-08-24", "2024-11-27", "reforma vestíbul", 'COMPLETADA');

INSERT INTO tasca (id, data_creacio, data_execucio, descripcio, tipus_estat)
VALUES (5, "2022-08-27", "2022-09-11", "reorganització decoració habitacions", 'COMPLETADA');

INSERT INTO tasca (id, data_creacio, data_execucio, descripcio, tipus_estat)
VALUES (6, "2025-02-11", "2025-02-13", "servei de catering", 'PENDENT');


INSERT INTO tasca_empleats (tasques_id, empleats_id) 
VALUES (1, 10001);

INSERT INTO tasca_empleats (tasques_id, empleats_id) 
VALUES (3, 10002);

INSERT INTO tasca_empleats (tasques_id, empleats_id) 
VALUES (2, 10004);

INSERT INTO tasca_empleats (tasques_id, empleats_id) 
VALUES (6, 10005);

INSERT INTO tasca_empleats (tasques_id, empleats_id) 
VALUES (6, 10004);

/*INSERT INTO reserva (id, data_inici, data_reserva, preu_total_reserva, tipusiva, tipus_reserva, client_id, habitacio_id, data_fi)
VALUES(1, "2023-09-27", "2023-09-25", "700.55", "0.21", 'AD', 3, 30, "2023-10-09");

INSERT INTO reserva (id, data_inici, data_reserva, preu_total_reserva, tipusiva, tipus_reserva, client_id, habitacio_id, data_fi)
VALUES(2, "2023-10-15", "2023-10-20", "890.55", "0.21", 'MP', 2, 29, "2023-10-25");*/


/*INSERT INTO factures (id, iva, base_imposable, data_emissio, metode_pagament, total, reserva_id)
VALUES (1, 0.21, 600, "2023-09-25", "tarjeta", 700.55, 1);

INSERT INTO factures (id, iva, base_imposable, data_emissio, metode_pagament, total, reserva_id)
VALUES (2, 0.21, 700, "2023-10-19", "efectiu", 890.55, 2); */
