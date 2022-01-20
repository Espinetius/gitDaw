CREATE TABLE EDITORIALES (
editorial         NUMBER(2) PRIMARY KEY,
nombre            VARCHAR2(30) NOT NULL,
localidad         VARCHAR2(15)
); 
 
INSERT INTO EDITORIALES VALUES (10, 'PARANINFO', 'MADRID');
INSERT INTO EDITORIALES VALUES (20, 'RAMA', 'MADRID');
INSERT INTO EDITORIALES VALUES (30, 'MCGRAW-HILL', 'ARAVACA');
INSERT INTO EDITORIALES VALUES (40, 'DONOSTIARRA', 'SAN SEBASTIAN');

CREATE TABLE LIBROS (
codigo 		NUMBER(4) PRIMARY KEY,
titulo            VARCHAR2(40) NOT NULL,
autor             VARCHAR2(50) NOT NULL,
editorial         NUMBER(2),
unidades_vendidas NUMBER(5),
fecha_publicacion VARCHAR2(10)
);

INSERT INTO LIBROS VALUES (1647, 'VIRUS INFORMATICOS',
      'RICHAR B.LEVIN', 30,1500, '1991-02-10');
INSERT INTO LIBROS VALUES (0281, 'GUIA COMPLETA PARA PC',
      'RON GILSTER',30, 1800, '2001-11-01');
INSERT INTO LIBROS VALUES (1416, 'GUIA DE SQL',
       'J.R.GROFF, P.N.WEINBERG',	30, 2301, '2000-06-01');
INSERT INTO LIBROS VALUES (3654, 'FUNDAMENTOS DE BASES DE DATOS',
       'SILBERSCHATZ, KORTH, SUDARSHAN',30, 1900, '2002-03-11');
INSERT INTO LIBROS VALUES (3214, 'INGENIERIA DEL SOFTWARE',
           	 'ROGER S.PRESSMAN',30, 2300, '2002-04-04');

INSERT INTO LIBROS VALUES (9732, 'SQL PARA USUARIOS Y PROGRAMADORES',
               	'E.RIVERO, L.MARTINEZ, y OTROS',10, 2500, '2002-03-01');
INSERT INTO LIBROS VALUES (2232, 'SERVICIOS DE INFORMACION ELECTRONICA', 
               	'M.GONZALEZ, R.CHAMORRO y otros',10, 1200, '1995-04-11');
INSERT INTO LIBROS VALUES (5044, 'MANTO.DE PORTALES DE INFORMACION',
               	'E.QUERO, A.GARCIA y otros',10, 600, '2006-02-01');
INSERT INTO LIBROS VALUES (8609, 'INSTALACIONES ELECTRICAS', 
               	'J.L.SANZ SERRANO',10, 1004, '2005-02-01');
INSERT INTO LIBROS VALUES (4897, 'REDES DE AREA LOCAL', 
               	'J.M.HUIDIBORO y otros',10, 500, '2006-02-01');
INSERT INTO LIBROS VALUES (7254, 'WINDOWS 2000 PROF.', 
               	'A.GONZALEZ MANGAS',10, 1500, '2002-06-05');

INSERT INTO LIBROS VALUES (530, 'DISENO Y DESARROLLO MULTIMEDIA', 
               	'M.A.CASTRO, A.COLMENAR y otros',20, 1356, '2002-11-01');
INSERT INTO LIBROS VALUES (455, 'XML A TRAVES DE EJEMPLOS', 
               	'A.GUTIERREZ, R.MARTINEZ',20, 1876, '2001-02-01');
INSERT INTO LIBROS VALUES (503, 'REDES IP', 
               	'J.G.TOMAS, J.L.RAYA y OTROS',20, 1008, '2002-03-15');
INSERT INTO LIBROS VALUES (506, 'SQL Y JAVA', 
               	'J.MELTON, A.EISENBERG',20, 2300, '2002-01-24');

COMMIT;
1.
SELECT NOMBRE, EDITORIAL FROM EDITORIALES WHERE NOMBRE LIKE 'M%';
2.
SELECT CODIGO, TITULO, AUTOR FROM LIBROS WHERE CODIGO>=1000 AND CODIGO<=3000;
3. 
SELECT CODIGO, TITULO, AUTOR, UNIDADES_VENDIDAS FROM LIBROS, EDITORIALES  WHERE EDITORIALES.EDITORIAL=LIBROS.EDITORIAL AND EDITORIALES.NOMBRE='MCGRAW-HILL';
4.
SELECT SUM(UNIDADES_VENDIDAS) AS "SUMA TOTAL UNIDADES VENDIDAS" FROM LIBROS;
5.
SELECT COUNT(TITULO) AS "N� TOTAL LIBROS" FROM LIBROS;
6.
SELECT * FROM LIBROS ORDER BY EDITORIAL, TITULO;
7.
SELECT TITULO, AUTOR, UNIDADES_VENDIDAS, FECHA_PUBLICACION FROM LIBROS WHERE FECHA_PUBLICACION LIKE '2006%';
8.
SELECT COUNT(TITULO) AS "LIBROS ARAVACA" FROM LIBROS, EDITORIALES WHERE LIBROS.EDITORIAL=EDITORIALES.EDITORIAL AND LOCALIDAD='ARAVACA';
9.
SELECT AVG(UNIDADES_VENDIDAS) AS "PROMEDIO PARANINFO" FROM LIBROS, EDITORIALES WHERE EDITORIALES.EDITORIAL=LIBROS.EDITORIAL AND NOMBRE='PARANINFO';
10.
SELECT MAX(UNIDADES_VENDIDAS) FROM LIBROS;
11.
UPDATE EDITORIALES SET LOCALIDAD='POZUELO' WHERE NOMBRE='MCGRAW-HILL';
12.
UPDATE EDITORIALES SET LOCALIDAD='ARAVACA' WHERE NOMBRE='MCGRAW-HILL';
13.
INSERT INTO EDITORIALES VALUES (50, 'SEVILLANA', 'SEVILLA');
INSERT INTO EDITORIALES VALUES (60, 'MA�A', 'ZARAGOZA');
INSERT INTO EDITORIALES VALUES (70, 'VALENCIANA', 'VALENCIA');
14.
DELETE EDITORIALES WHERE EDITORIAL>=50;