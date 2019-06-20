/* Populate tabla clientes */
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(1, 'Ancon');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(2, 'Ate');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(3, 'Barranco');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(4, 'Breña');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(5, 'Carabayllo');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(6, 'Chorrillos');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(7, 'Cieneguilla');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(8, 'Comas');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(9, 'El Agustino');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(10, 'Huaycán');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(11, 'Independencia');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(12, 'La Molina');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(13, 'La Victoria');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(14, 'Lima');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(15, 'Lince');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(16, 'Los Olivos');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(17, 'Lurín');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(18, 'Magdalena del Mar');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(19, 'Miraflores');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(20, 'Pachacamac');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(21, 'Pucusana');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(22, 'Pueblo Libre');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(23, 'Puente Piedra');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(24, 'Punta Hermosa');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(25, 'Punta Negra');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(26, 'Rimac');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(27, 'San Bartolo');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(28, 'San Borja');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(29, 'San Isidro');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(30, 'San Juan de Lurigancho');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(31, 'San Juan de Miraflores');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(32, 'San Luis');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(33, 'San Martin de Porres');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(34, 'San Miguel');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(35, 'Santa Anita');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(36, 'Santa Maria de Huachipa');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(37, 'Santa Maria del Mar');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(38, 'Santiago de Surco');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(39, 'Santa Rosa');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(40, 'Surquillo');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(41, 'Villa El Salvador');
INSERT INTO distritos (iddistritos, dis_nombre) VALUES(42, 'Villa Maria del Triunfo');

INSERT INTO oficios(idoficios, tra_nombre) VALUES (1, 'Electricista');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (2, 'Carpintero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (3, 'Chef');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (4, 'Mecanico');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (5, 'Bombero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (6, 'Carnicero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (7, 'Carpintero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (8, 'Cartero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (9, 'Conductor de taxi');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (10, 'Coreógrafo');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (11, 'Estibador');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (12, 'Fotoperiodista');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (13, 'Gasfitero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (14, 'Jornalero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (15, 'Lector de medidores');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (16, 'Leñador');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (17, 'Limpiador de carros');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (18, 'Maquinista');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (19, 'Marinero');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (20, 'Obrero de construcción');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (21, 'Paramédico');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (22, 'Paseador de perros');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (23, 'Profesor particular');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (24, 'Recolector de basura');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (25, 'Repartidor de comida');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (26, 'Reportero (de diario)');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (27, 'Soldador');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (28, 'Trabajador de granja');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (29, 'Trabajador de láminas de metal');
INSERT INTO oficios(idoficios, tra_nombre) VALUES (30, 'Trabajador metalúrgico');


INSERT INTO usuarios (idusuarios,id_firebase,usu_nombre,usu_telefono,usu_email,usu_estado,usu_disponibilidad,usu_descripcion,usu_horarios,usu_foto,distritos_iddistritos,oficios_idoficios1,oficios_idoficios2,oficios_idoficios3) VALUES (1,'xxx','marcos','1234567','abc@gmail.com',1,1,'xxx','4pm','xxx',5,2,3,4);

INSERT INTO usuarios (idusuarios,id_firebase,usu_nombre,usu_telefono,usu_email,usu_estado,usu_disponibilidad,usu_descripcion,usu_horarios,usu_foto,distritos_iddistritos,oficios_idoficios1,oficios_idoficios2,oficios_idoficios3) VALUES (2,'xxx','andres','1234567','abc@gmail.com',1,1,'xxx','4pm','xxx',1,2,4,1);

INSERT INTO usuarios (idusuarios,id_firebase,usu_nombre,usu_telefono,usu_email,usu_estado,usu_disponibilidad,usu_descripcion,usu_horarios,usu_foto,distritos_iddistritos,oficios_idoficios1,oficios_idoficios2,oficios_idoficios3) VALUES (3,'xxx','ana','1234567','abc@gmail.com',1,1,'xxx','4pm','xxx',8,8,5,4);


INSERT INTO publicaciones (idpublicaciones,pub_titulo,pub_descripcion,pub_email,pub_telefono,pub_habilidades,pub_estado,pub_disponibilidad,pub_fecha,pub_calificacion_emp,pub_calificacion_clien,usuarios_idusuarios,distritos_iddistritos,oficios_idoficios) VALUES (1,'titulo','descripcion','abc@gmail','1234567','habilidades',1,1,'2010-01-12 10:50:43',5,4,1,6,1);

INSERT INTO publicaciones (idpublicaciones,pub_titulo,pub_descripcion,pub_email,pub_telefono,pub_habilidades,pub_estado,pub_disponibilidad,pub_fecha,pub_calificacion_emp,pub_calificacion_clien,usuarios_idusuarios,distritos_iddistritos,oficios_idoficios) VALUES (2,'titulo','descripcion','abc@gmail','1234567','habilidades',1,1,'2010-01-12 10:50:43',5,4,2,3,2);

INSERT INTO ofertas(idofertas, cotizar,detalle,estado,publicacion_idpublicaciones,usuario_idusuarios) VALUES (1, 150.00,'Alta experiencia',1,1,1);

INSERT INTO ofertas(idofertas, cotizar,detalle,estado,publicacion_idpublicaciones,usuario_idusuarios) VALUES (2, 120.00,'Rapido servicio',1,1,2);

