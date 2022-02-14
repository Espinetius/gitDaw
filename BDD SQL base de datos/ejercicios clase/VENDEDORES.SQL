CREATE TABLE OFICINAS
( NUM_OFI     NUMBER(2) NOT NULL,
  CIUDAD      VARCHAR2(30) NOT NULL,
  REGION      VARCHAR2(10) NOT NULL,
  NUM_DIR     NUMBER(3) ,
  OBJETIVO    NUMBER(10),
  VENTAS      NUMBER(10) NOT NULL
);

insert into oficinas values(11,'MADRID','Este',106,575000,696637);
insert into oficinas values(12,'BARCELONA','Este',104,800000,735042);
insert into oficinas values(13,'SEVILLA','Este',105,350000,367911);
insert into oficinas values(21,'ZARAGOZA','Oeste',108,725000,835915);
insert into oficinas values(22,'VALLADOLID','Oeste',108,300000,186042);

CREATE TABLE  VENDEDORES
( NUM_EMP     NUMBER(3) NOT NULL,
  NOMBRE      VARCHAR2(30) NOT NULL,
  EDAD        NUMBER(2) NOT NULL,
  NUM_OFI     NUMBER(2),   
  OFICIO      VARCHAR2(10),
  FECHA_CONT  VARCHAR2(10),
  NUM_DIR     NUMBER(3),
  CUOTA       NUMBER(10) NOT NULL,
  VENTAS      NUMBER(10)                                        
);

insert into vendedores values(105,'Luis Perez',37,13,'Rep Ventas','12/02/98',104,350000,367911);
insert into vendedores values(109,'Pedro Lopez',31,11,'Rep Ventas','12/10/03',106,300000,392725);
insert into vendedores values(102,'Angel Ferrer',48,21,'Rep Ventas','10/12/96',108,350000,474050);
insert into vendedores values(106,'Lorenzo Casado',52,11,'VP Ventas','14/06/98',NULL,275000,299912);
insert into vendedores values(104,'Luis Alvarez',33,12,'Dir Ventas','19/05/97',106,200000,142594);
insert into vendedores values(101,'Felix Gomez',45,12,'Rep Ventas','20/10/96',104,300000,305673);
insert into vendedores values(110,'Cesar Gonzalez',41,NULL ,'Rep Ventas','13/01/99',101,0,75985);
insert into vendedores values(108,'Carlos Ruiz',62,21,'Dir Ventas','12/10/99',106,350000,361865);
insert into vendedores values(103,'Jesus Serrano',29,12,'Rep Ventas','1/03/97',104,275000,286755);
insert into vendedores values(107,'David Camacho',49,22,'Rep Ventas','14/11/98',108,300000,186042);

CREATE TABLE  CLIENTES
( NUM_CLI        NUMBER(4)    NOT NULL,
  EMPRESA        VARCHAR2(20) NOT NULL,
  NUM_EMP        NUMBER(3)    NOT NULL,
  LIMITE_CREDITO NUMBER(10)   NOT NULL                                             
);

insert into clientes values(2111, 'Control S.L.', 103, 50000);
insert into clientes values(2102, 'Zeta Corp.', 101, 65000);
insert into clientes values(2103, 'Carter and Sonido', 105, 50000);
insert into clientes values(2123, 'Avances S.A.', 102, 40000);
insert into clientes values(2107, 'Escape S.L.', 110, 35000);
insert into clientes values(2115, 'Asociacion  S.L.', 101, 20000);
insert into clientes values(2101, 'Controladores S.A.', 106, 65000);
insert into clientes values(2112, 'AAA Rail', 108, 50000);
insert into clientes values(2121, 'Transmision S.L.', 103, 45000);
insert into clientes values(2114, 'Orion Corp.', 102, 20000);
insert into clientes values(2124, 'Anstrong S.L.', 107, 40000);
insert into clientes values(2108, 'Rico Manager', 109, 55000);
insert into clientes values(2117, 'Managers S.A.', 106, 35000);
insert into clientes values(2122, 'CCC Union', 105, 30000);
insert into clientes values(2120, 'Cont Asociacion', 102, 50000);
insert into clientes values(2106, 'SASTIN S.L.', 102, 65000);
insert into clientes values(2119, 'Lent Control S.L.', 109, 25000);
insert into clientes values(2118, 'Zeta S.L.', 108, 60000);
insert into clientes values(2113, 'J.P. Musin', 104, 20000);
insert into clientes values(2109, 'Col and Pss', 103, 25000);
insert into clientes values(2105, 'Ventral S.L.', 101, 45000);


CREATE TABLE  PRODUCTOS
( ID_FAB         VARCHAR2(3)   NOT NULL,
  ID_PROD        VARCHAR2(5)   NOT NULL,
  DESCRIPCION    VARCHAR2(30) NOT NULL,
  PRECIO         NUMBER(5)    NOT NULL,
  EXISTENCIAS    NUMBER(5)                                            
);

insert into productos values ('REI','2A45C','Union Trinquete', 79, 210);
insert into productos values ('ACI','4100Y','Desmontador', 2750, 25);
insert into productos values ('QSA','XK47','Reductor', 335, 38);
insert into productos values ('BIC','41672','Placa', 180, 0);
insert into productos values ('IMM','779C','Abrazadera 900-Lb',1875, 9);
insert into productos values ('ACI','41003','Articulo Tipo 3', 107, 207);
insert into productos values ('ACI','41004','Articulo Tipo 4', 117, 139);
insert into productos values ('BIC','41003','Tirador', 652, 3);
insert into productos values ('IMM','887P','Perno Abrazadera', 250, 24);
insert into productos values ('QSA','XK48','Reductor', 134, 203);
insert into productos values ('REI','2A44L','Bisagra Izq.',4500, 12);
insert into productos values ('FEA','112','Cubierta', 148, 115);
insert into productos values ('IMM','887H','Soporte Abrazadera', 54, 223);
insert into productos values ('BIC','41089','Reten', 225, 78);
insert into productos values ('ACI','41001','Articulo Tipo 1', 55, 277);
insert into productos values ('IMM','775C','Abrazadera 500-lb', 1425, 5);
insert into productos values ('ACI','4100Z','Montador', 2500, 28);
insert into productos values ('QSA','XK48A','Reductor', 117, 37);
insert into productos values ('ACI','41002','Articulo Tipo 2', 76, 167);
insert into productos values ('REI','2A44R','Bisagra Dcha.', 4500, 12);
insert into productos values ('IMM','773C','Abrazadera 300-lb', 975, 28);
insert into productos values ('ACI','4100X','Ajustador', 25, 37);
insert into productos values ('FEA','114','Bancada Motor', 243, 15);
insert into productos values ('IMM','887X','Reten Abrazadera', 475, 32);
insert into productos values ('REI','2A44G','Pasador Bisagra', 350, 14);

CREATE TABLE  PEDIDOS
( NUM_PED        NUMBER(4)    NOT NULL,
  FECHA_PED      DATE,
  NUM_CLI        NUMBER(4)    NOT NULL,
  NUM_EMP        NUMBER(3)    NOT NULL,
  ID_FAB         VARCHAR2(3)   NOT NULL,
  ID_PROD        VARCHAR2(5)   NOT NULL,
  CANTI          NUMBER(5)    DEFAULT 1,
  IMPORTE        NUMBER(10)   NOT NULL
);


insert into pedidos values(2961,'17/12/03',2117,106,'REI','2A44R',7,31500);
insert into pedidos values(3012,'11/01/04',2111,105,'ACI','41003',35,3745);
insert into pedidos values(2989,'03/01/04',2101,106,'FEA','114',6,1458);
insert into pedidos values(3051,'10/02/04',2118,108,'QSA','XK47',4,1420);
insert into pedidos values(2968,'12/10/03',2102,101,'ACI','41004',34,3978);
insert into pedidos values(3036,'30/01/04',2107,110,'ACI','4100Z',9,22500);
insert into pedidos values(3045,'02/02/04',2112,108,'REI','2A44R',10,45000);
insert into pedidos values(2963,'17/12/03',2103,105,'ACI','41004',28,3276);
insert into pedidos values(3013,'14/01/04',2118,108,'BIC','41003',1,652);
insert into pedidos values(3058,'23/02/04',2108,109,'FEA','112',10,1480);
insert into pedidos values(2997,'08/01/03',2124,107,'BIC','41003',1,652);
insert into pedidos values(2983,'27/12/03',2103,105,'ACI','41004',6,702);
insert into pedidos values(3024,'20/01/04',2114,108,'QSA','XK47',20,7100);
insert into pedidos values(3062,'24/02/04',2124,107,'FEA','114',10,2430);
insert into pedidos values(2979,'12/10/03',2114,102,'ACI','4100Z',6,15000);
insert into pedidos values(3027,'22/01/04',2103,105,'ACI','41002',54,4104);
insert into pedidos values(3007,'08/01/04',2112,108,'IMM','773C',3,2925);
insert into pedidos values(3069,'02/03/04',2109,107,'IMM','775C',22,31350);
insert into pedidos values(3034,'29/01/04',2107,110,'REI','2A45C',8,632);
insert into pedidos values(2992,'04/11/03',2118,108,'ACI','41002',10,760);
insert into pedidos values(2975,'12/10/03',2111,103,'REI','2A44G',6,2100);
insert into pedidos values(3055,'15/02/04',2108,101,'ACI','4100X',6,150);
insert into pedidos values(3048,'10/02/04',2120,102,'IMM','779C',2,3750);
insert into pedidos values(2993,'04/01/04',2106,102,'REI','2A45C',24,1896);
insert into pedidos values(3065,'27/02/04',2106,102,'QSA','XK47',6,2130);
insert into pedidos values(3003,'25/01/04',2108,109,'IMM','779C',3,5625);
insert into pedidos values(3049,'10/02/04',2118,108,'QSA','XK47',2,776);
insert into pedidos values(2987,'31/12/03',2103,105,'ACI','4100Y',11,27500);
insert into pedidos values(3057,'18/02/04',2111,103,'ACI','4100X',24,600);
insert into pedidos values(3042,'02/02/04',2113,101,'REI','2A44G',5,22500);

1.
SELECT CIUDAD, NUM_OFI, VENTAS FROM OFICINAS;
2.
SELECT NOMBRE, NUM_OFI VENTAS, CUOTA FROM VENDEDORES;
3.
SELECT NOMBRE, VENTAS, CUOTA, VENTAS-CUOTA AS "VALOR" FROM VENDEDORES;
4.
SELECT NOMBRE, VENTAS, CUOTA, VENTAS-CUOTA AS "VALOR" FROM VENDEDORES WHERE VENTAS-CUOTA<1;
5.
SELECT * FROM PEDIDOS WHERE IMPORTE>25000 ORDER BY FECHA_PED;
6.
SELECT AVG(IMPORTE) FROM PEDIDOS;
7.
SELECT AVG(IMPORTE) FROM PEDIDOS WHERE NUM_CLI=2103;
8.
SELECT NUM_CLI, SUM(IMPORTE) FROM PEDIDOS GROUP BY NUM_CLI ORDER BY NUM_CLI;
9.
SELECT NOMBRE, FECHA_CONT FROM VENDEDORES WHERE FECHA_CONT >= '10/12/96';
10.
SELECT DISTINCT(NUM_DIR) FROM OFICINAS ORDER BY NUM_DIR;
11.
SELECT NOMBRE, VENTAS FROM VENDEDORES WHERE NUM_DIR=104;
12.
SELECT * FROM PEDIDOS WHERE NUM_CLI IN (SELECT NUM_CLI FROM PEDIDOS WHERE NUM_CLI=2108 OR NUM_CLI=2118) ORDER BY NUM_CLI, FECHA_PED;
SELECT * FROM PEDIDOS WHERE NUM_CLI IN (2108,2118) ORDER BY NUM_CLI, FECHA_PED;
13.
SELECT NOMBRE, EDAD, CUOTA, OFICIO FROM VENDEDORES WHERE EDAD BETWEEN 30 AND 45 ORDER BY CUOTA;
14.
SELECT ID_FAB, ID_PROD, EXISTENCIAS, DESCRIPCION FROM PRODUCTOS WHERE DESCRIPCION LIKE 'Abrazadera%';
15.
SELECT NUM_OFI, OFICIO, COUNT(NUM_EMP) FROM VENDEDORES GROUP BY NUM_OFI, OFICIO ORDER BY NUM_OFI, OFICIO;
16.
SELECT OFICIO, COUNT(NUM_EMP) FROM VENDEDORES HAVING COUNT(NUM_EMP)>1 GROUP BY OFICIO;
17.
SELECT NUM_OFI, OFICIO, COUNT(NUM_EMP) FROM VENDEDORES HAVING COUNT(NUM_EMP)>1 GROUP BY OFICIO, NUM_OFI; 
18.
SELECT NOMBRE, CIUDAD, EDAD, VENDEDORES.NUM_OFI, OFICIO FROM VENDEDORES, OFICINAS WHERE VENDEDORES.NUM_OFI=OFICINAS.NUM_OFI ORDER BY CIUDAD;
19.
SELECT CIUDAD, NOMBRE, OFICIO FROM OFICINAS, VENDEDORES WHERE OFICINAS.NUM_DIR=VENDEDORES.NUM_EMP;
20.
SELECT NOMBRE, VENDEDORES.NUM_OFI, CIUDAD, OFICIO FROM OFICINAS, VENDEDORES WHERE OFICINAS.NUM_OFI=VENDEDORES.NUM_OFI AND OFICIO LIKE 'Dir Ventas';
21.
SELECT NUM_PED, IMPORTE, DESCRIPCION FROM PRODUCTOS, PEDIDOS WHERE PRODUCTOS.ID_PROD=PEDIDOS.ID_PROD AND PRODUCTOS.ID_FAB=PEDIDOS.ID_FAB ORDER BY NUM_PED;
22.
SELECT NUM_PED, IMPORTE, EMPRESA, NOMBRE FROM VENDEDORES, PEDIDOS, CLIENTES WHERE CLIENTES.NUM_CLI=PEDIDOS.NUM_CLI AND VENDEDORES.NUM_EMP=PEDIDOS.NUM_EMP AND IMPORTE>25000;
23.
SELECT V1.NOMBRE, V1.NUM_EMP, 'TRABAJA PARA' AS "CURRITO", V2.NOMBRE, V2.NUM_EMP FROM VENDEDORES V1, VENDEDORES V2 WHERE V1.NUM_DIR=V2.NUM_EMP;
SELECT V1.NOMBRE AS "JEFE", V1.NUM_EMP,'TIENE DE EMPLEADO', V2.NOMBRE, V2.NUM_EMP FROM VENDEDORES V1, VENDEDORES V2 WHERE V1.NUM_EMP=V2.NUM_DIR;
24.
SELECT VENTAS AS "VENTAS TOTALES", NUM_OFI FROM OFICINAS;
25.
SELECT NOMBRE, CUOTA FROM VENDEDORES WHERE CUOTA>(SELECT AVG(CUOTA)FROM VENDEDORES) ORDER BY CUOTA DESC;
26.
SELECT CLIENTES.EMPRESA FROM CLIENTES WHERE NUM_EMP=( SELECT NUM_EMP FROM VENDEDORES WHERE NOMBRE LIKE 'Jesus Serrano');
27.
SELECT VENDEDORES.NOMBRE FROM VENDEDORES, OFICINAS WHERE VENDEDORES.NUM_OFI=OFICINAS.NUM_OFI AND OFICINAS.NUM_DIR != (SELECT NUM_EMP FROM VENDEDORES WHERE NOMBRE LIKE 'Carlos Ruiz');
28.
SELECT NUM_CLI, CANTI, IMPORTE FROM PEDIDOS, PRODUCTOS WHERE PEDIDOS.ID_FAB=PRODUCTOS.ID_FAB AND DESCRIPCION = 'Tirador';