create table fabricante(
  id_fab number primary key,
  nombre varchar2(50),
  pais   varchar2(30));
 
create table programa(
  codigo number primary key,
  nombre varchar2(50),
  version varchar2(50));

create table comercio(
  cif number primary key, 
  nombre varchar2(50),
  ciudad varchar2(50));

create table cliente(
  dni number primary key,
  nombre varchar2(50),
  edad number);

create table desarrolla(
  id_fab number,
  codigo number,
  primary key(id_fab,codigo));

create table distribuye(
  cif number,
  codigo number,
  cantidad number,
  primary key(cif,codigo));

create table registra(
  cif number,
  dni number,
  codigo number,
  medio varchar2(20),
  primary key(cif,dni));

insert into fabricante values(1,'Oracle','Estados Unidos');
insert into fabricante values(2,'Microsoft','Estados Unidos');
insert into fabricante values(3,'IBM','Estados Unidos');
insert into fabricante values(4,'Dinamic','España');
insert into fabricante values(5,'Borland','Estados Unidos');
insert into fabricante values(6,'Symantec','Estados Unidos');

insert into programa values(1,'Application Server','9i');
insert into programa values(2,'Database','8i');
insert into programa values(3,'Database','9i');
insert into programa values(4,'Database','10g');
insert into programa values(5,'Developer','6i');
insert into programa values(6,'Access','97');
insert into programa values(7,'Access','2000');
insert into programa values(8,'Access','XP');
insert into programa values(9,'Windows','98');
insert into programa values(10,'Windows','XP Professional');
insert into programa values(11,'Windows','XP Home Edition');
insert into programa values(12,'Windows','2003 Server');
insert into programa values(13,'Norton Internet Security','2004');
insert into programa values(14,'Freddy Hardest',NULL);
insert into programa values(15,'Paradox','2');
insert into programa values(16,'C++ Builder','5.5');
insert into programa values(17,'DB/2','2.0');
insert into programa values(18,'OS/2','1.0');
insert into programa values(19,'JBuilder','X');
insert into programa values(20,'La prisión','1.0');

insert into comercio values(1,'El Corte Inglés','Sevilla');
insert into comercio values(2,'El Corte Inglés','Madrid');
insert into comercio values(3,'Jump','Valencia');
insert into comercio values(4,'Centro Mail','Sevilla');
insert into comercio values(5,'FNAC','Barcelona');

insert into cliente values(1,'Pepe Pérez',45);
insert into cliente values(2,'Juan González',45);
insert into cliente values(3,'María Gómez',33);
insert into cliente values(4,'Javier Casado',18);
insert into cliente values(5,'Nuria Sánchez',29);
insert into cliente values(6,'Antonio Navarro',58);

insert into desarrolla values(1,1);
insert into desarrolla values(1,2);
insert into desarrolla values(1,3);
insert into desarrolla values(1,4);
insert into desarrolla values(1,5);
insert into desarrolla values(2,6);
insert into desarrolla values(2,7);
insert into desarrolla values(2,8);
insert into desarrolla values(2,9);
insert into desarrolla values(2,10);
insert into desarrolla values(2,11);
insert into desarrolla values(2,12);
insert into desarrolla values(6,13);
insert into desarrolla values(4,14);
insert into desarrolla values(5,15);
insert into desarrolla values(5,16);
insert into desarrolla values(3,17);
insert into desarrolla values(3,18);
insert into desarrolla values(5,19);
insert into desarrolla values(4,20);

insert into distribuye values(1,1,10);
insert into distribuye values(1,2,11);
insert into distribuye values(1,6,5);
insert into distribuye values(1,7,3);
insert into distribuye values(1,10,5);
insert into distribuye values(1,13,7);
insert into distribuye values(2,1,6);
insert into distribuye values(2,2,6);
insert into distribuye values(2,6,4);
insert into distribuye values(2,7,7);
insert into distribuye values(3,10,8);
insert into distribuye values(3,13,5);
insert into distribuye values(4,14,3);
insert into distribuye values(4,20,6);
insert into distribuye values(5,15,8);
insert into distribuye values(5,16,2);
insert into distribuye values(5,17,3);
insert into distribuye values(5,19,6);
insert into distribuye values(5,8,8);

insert into registra values(1,1,1,'Internet');
insert into registra values(1,3,4,'Tarjeta postal');
insert into registra values(4,2,10,'Teléfono');
insert into registra values(4,1,10,'Tarjeta postal');
insert into registra values(5,2,12,'Internet');
insert into registra values(2,4,15,'Internet');

1.
SELECT DNI FROM CLIENTE;
2.
SELECT * FROM PROGRAMA;
3.
SELECT NOMBRE FROM PROGRAMA;
4.
SELECT * FROM COMERCIO;
5.
SELECT DISTINCT(CIUDAD) FROM COMERCIO;
6.
SELECT DISTINCT(NOMBRE) FROM PROGRAMA;
7.
SELECT DNI, DNI+4 AS "DNI + 4" FROM CLIENTE;
8.
SELECT CODIGO, CODIGO*7 AS "CODIGO MULTIPLICADO POR 7" FROM PROGRAMA;
9.
SELECT * FROM PROGRAMA WHERE CODIGO <= 7;
10.
SELECT * FROM PROGRAMA WHERE CODIGO = 11;
11.
SELECT * FROM FABRICANTE WHERE PAIS = 'Estados Unidos';
12.
SELECT * FROM FABRICANTE WHERE PAIS IN (SELECT PAIS FROM FABRICANTE WHERE PAIS NOT LIKE 'España');
13.
SELECT * FROM PROGRAMA WHERE NOMBRE LIKE 'Windows';
14.
SELECT CIUDAD FROM COMERCIO WHERE NOMBRE LIKE 'El Corte%';
15.
SELECT * FROM COMERCIO WHERE NOMBRE IN (SELECT NOMBRE FROM COMERCIO WHERE NOMBRE NOT LIKE 'El Corte%');
16.
SELECT CODIGO, NOMBRE FROM PROGRAMA WHERE NOMBRE IN (SELECT NOMBRE FROM PROGRAMA WHERE NOMBRE = 'Access' OR NOMBRE = 'Windows') ORDER BY NOMBRE, CODIGO;
17.
SELECT * FROM CLIENTE WHERE EDAD BETWEEN 10 AND 25 OR EDAD >50;
18.
SELECT DISTINCT(NOMBRE) FROM COMERCIO WHERE CIUDAD IN (SELECT CIUDAD FROM COMERCIO WHERE CIUDAD  LIKE 'Madrid' OR CIUDAD LIKE 'Sevilla');
19.
SELECT * FROM CLIENTE WHERE NOMBRE LIKE '%o';
20.
SELECT * FROM CLIENTE WHERE NOMBRE LIKE '%o' AND EDAD > 50;
21.
SELECT * FROM PROGRAMA WHERE VERSION LIKE '%i' OR NOMBRE LIKE 'U%';
22.
SELECT * FROM PROGRAMA WHERE VERSION LIKE '%i' OR (NOMBRE LIKE 'A%');
23.
SELECT * FROM PROGRAMA WHERE VERSION LIKE '%i' AND NOMBRE NOT LIKE 'A%';
24.
SELECT * FROM FABRICANTE ORDER BY NOMBRE ASC;
25.
SELECT * FROM FABRICANTE ORDER BY NOMBRE DESC;
26.
SELECT * FROM PROGRAMA ORDER BY VERSION;
27.
SELECT PROGRAMA.NOMBRE, PROGRAMA.VERSION FROM FABRICANTE, PROGRAMA, DESARROLLA WHERE FABRICANTE.ID_FAB=DESARROLLA.ID_FAB AND PROGRAMA.CODIGO=DESARROLLA.CODIGO AND FABRICANTE.NOMBRE LIKE 'Oracle' ORDER BY VERSION;
28.
SELECT COMERCIO.NOMBRE FROM COMERCIO, DISTRIBUYE, PROGRAMA WHERE PROGRAMA.CODIGO=DISTRIBUYE.CODIGO AND DISTRIBUYE.CIF=COMERCIO.CIF AND PROGRAMA.NOMBRE LIKE 'Windows';
29.
SELECT PROGRAMA.NOMBRE FROM COMERCIO, DISTRIBUYE, PROGRAMA WHERE PROGRAMA.CODIGO=DISTRIBUYE.CODIGO AND DISTRIBUYE.CIF=COMERCIO.CIF AND COMERCIO.NOMBRE LIKE 'El Corte%';
30.
SELECT FABRICANTE.NOMBRE FROM FABRICANTE, PROGRAMA, DESARROLLA WHERE FABRICANTE.ID_FAB=DESARROLLA.ID_FAB AND PROGRAMA.CODIGO=DESARROLLA.CODIGO AND PROGRAMA.NOMBRE LIKE 'Freddy Hardest';
31.
SELECT NOMBRE FROM PROGRAMA, REGISTRA WHERE PROGRAMA.CODIGO=REGISTRA.CODIGO AND MEDIO LIKE 'Internet';
32.
SELECT CLIENTE.NOMBRE FROM CLIENTE, REGISTRA WHERE CLIENTE.DNI=REGISTRA.DNI AND MEDIO LIKE 'Internet';
33.
SELECT MEDIO FROM REGISTRA, CLIENTE WHERE REGISTRA.DNI=CLIENTE.DNI AND CLIENTE.NOMBRE LIKE 'Pepe Pérez';
34.
SELECT NOMBRE FROM CLIENTE, REGISTRA WHERE CLIENTE.DNI=REGISTRA.DNI AND MEDIO LIKE 'Internet';
35.
SELECT PROGRAMA.NOMBRE FROM PROGRAMA, REGISTRA WHERE REGISTRA.CODIGO=PROGRAMA.CODIGO AND REGISTRA.MEDIO LIKE 'Tarjeta postal';
36.
SELECT DISTINCT(CIUDAD) FROM COMERCIO, REGISTRA WHERE REGISTRA.CIF=COMERCIO.CIF AND MEDIO LIKE 'Internet';
37.
SELECT CLIENTE.NOMBRE, PROGRAMA.NOMBRE FROM CLIENTE, PROGRAMA, REGISTRA WHERE REGISTRA.CODIGO=PROGRAMA.CODIGO AND REGISTRA.DNI=CLIENTE.DNI AND MEDIO LIKE 'Internet';
38.
SELECT CLIENTE.NOMBRE, PROGRAMA.NOMBRE, REGISTRA.MEDIO, COMERCIO.NOMBRE FROM CLIENTE, PROGRAMA, REGISTRA, COMERCIO WHERE CLIENTE.DNI=REGISTRA.DNI AND REGISTRA.CODIGO=PROGRAMA.CODIGO AND REGISTRA.CIF=COMERCIO.CIF;
39.
SELECT NOMBRE FROM FABRICANTE WHERE PAIS = ( SELECT PAIS FROM FABRICANTE WHERE NOMBRE LIKE 'Oracle');
40.
SELECT * FROM CLIENTE WHERE EDAD=(SELECT EDAD FROM CLIENTE WHERE NOMBRE LIKE 'Pepe Pérez');
41.
SELECT * FROM COMERCIO WHERE CIUDAD IN (SELECT CIUDAD FROM COMERCIO WHERE NOMBRE LIKE 'El Corte Inglés') ORDER BY CIF;
42.
SELECT DISTINCT(CLIENTE.NOMBRE) FROM CLIENTE, REGISTRA WHERE CLIENTE.DNI=REGISTRA.DNI AND REGISTRA.MEDIO IN (SELECT MEDIO FROM CLIENTE, REGISTRA WHERE CLIENTE.DNI=REGISTRA.DNI AND CLIENTE.NOMBRE LIKE 'Pepe Pérez');
43.
SELECT COUNT(PROGRAMA.CODIGO) FROM PROGRAMA, DISTRIBUYE WHERE PROGRAMA.CODIGO=DISTRIBUYE.CODIGO AND CIF IN (SELECT CIF FROM COMERCIO WHERE CIUDAD LIKE 'Sevilla');
44.
SELECT COUNT(PROGRAMA.CODIGO) FROM PROGRAMA, DESARROLLA WHERE PROGRAMA.CODIGO=DESARROLLA.CODIGO AND ID_FAB IN (SELECT ID_FAB FROM FABRICANTE WHERE PAIS LIKE 'Estados Unidos');
