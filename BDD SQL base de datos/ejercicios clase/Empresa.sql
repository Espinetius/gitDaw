CREATE TABLE departamentos (
 dept_no  NUMBER(2) NOT NULL,
 dnombre  VARCHAR2(15), 
 loc      VARCHAR2(15)
);

INSERT INTO departamentos VALUES (10,'CONTABILIDAD','SEVILLA');
INSERT INTO departamentos VALUES (20,'INVESTIGACION','MADRID');
INSERT INTO departamentos VALUES (30,'VENTAS','BARCELONA');
INSERT INTO departamentos VALUES (40,'PRODUCCION','BILBAO');
COMMIT;

CREATE TABLE empleados (
 emp_no    NUMBER(4) NOT NULL,
 apellido  VARCHAR2(10),
 oficio    VARCHAR2(10),
 dir       NUMBER,
 fecha_alt VARCHAR2(10),
 salario   NUMBER(6,2),
 comision  NUMBER(6,2),
 dept_no   NUMBER(2) NOT NULL
);

INSERT INTO empleados VALUES (7369,'SANCHEZ','EMPLEADO',7902,'1990/12/17',
                        1040,NULL,20);
INSERT INTO empleados VALUES (7499,'ARROYO','VENDEDOR',7698,'1990/02/20',
                        1500,390,30);
INSERT INTO empleados VALUES (7521,'SALA','VENDEDOR',7698,'1991/02/22',
                        1625,650,30);
INSERT INTO empleados VALUES (7566,'JIMENEZ','DIRECTOR',7839,'1991/04/02',
                        2900,NULL,20);
INSERT INTO empleados VALUES (7654,'MARTIN','VENDEDOR',7698,'1991/09/29',
                        1600,1020,30);
INSERT INTO empleados VALUES (7698,'NEGRO','DIRECTOR',7839,'1991/05/01',
                        3005,NULL,30);
INSERT INTO empleados VALUES (7782,'CEREZO','DIRECTOR',7839,'1991/06/09',
                        2885,NULL,10);
INSERT INTO empleados VALUES (7788,'GIL','ANALISTA',7566,'1991/11/09',
                        3000,NULL,20);
INSERT INTO empleados VALUES (7839,'REY','PRESIDENTE',NULL,'1991/11/17',
                        4100,NULL,10);
INSERT INTO empleados VALUES (7844,'TOVAR','VENDEDOR',7698,'1991/09/08',
                        1350,0,30);
INSERT INTO empleados VALUES (7876,'ALONSO','EMPLEADO',7788,'1991/09/23',
                        1430,NULL,20);
INSERT INTO empleados VALUES (7900,'JIMENO','EMPLEADO',7698,'1991/12/03',
                        1335,NULL,30);
INSERT INTO empleados VALUES (7902,'FERNANDEZ','ANALISTA',7566,'1991/12/03',
                        3000,NULL,20);
INSERT INTO empleados VALUES (7934,'MUNOZ','EMPLEADO',7782,'1992/01/23',
                        1690,NULL,10);

COMMIT;

1. 
SELECT EMP_NO, APELLIDO, OFICIO, DIR, FECHA_ALT, SALARIO, COMISION FROM EMPLEADOS WHERE OFICIO LIKE 'DIRECTOR%';
2.
SELECT EMP_NO, APELLIDO, OFICIO FROM EMPLEADOS WHERE OFICIO='VENDEDOR' AND FECHA_ALT LIKE '1991%';
3.
SELECT COUNT(OFICIO) AS "ANALISTAS" FROM EMPLEADOS WHERE OFICIO='ANALISTA';
4.
SELECT EMP_NO, APELLIDO, OFICIO FROM EMPLEADOS, DEPARTAMENTOS WHERE EMPLEADOS.DEPT_NO=DEPARTAMENTOS.DEPT_NO AND DNOMBRE='INVESTIGACION';
5.
SELECT EMP_NO, APELLIDO, OFICIO, FECHA_ALT FROM EMPLEADOS, DEPARTAMENTOS WHERE EMPLEADOS.DEPT_NO=DEPARTAMENTOS.DEPT_NO AND DNOMBRE='CONTABILIDAD' AND OFICIO NOT LIKE 'PRESIDENTE';
6.
SELECT MAX(SALARIO) AS "MAS DINERO" FROM EMPLEADOS;
SELECT EMP_NO, APELLIDO, MAX(SALARIO) AS "MAS DINERO" FROM EMPLEADOS WHERE SALARIO IN(SELECT MAX(SALARIO) FROM EMPLEADOS) GROUP BY EMP_NO, APELLIDO;
7.
SELECT MIN(SALARIO) AS "MENOS DINERO" FROM EMPLEADOS;
SELECT EMP_NO, APELLIDO, SALARIO AS " MENOS DINERO" FROM EMPLEADOS WHERE SALARIO IN(SELECT MIN(SALARIO) FROM EMPLEADOS);
8.
SELECT AVG(SALARIO) AS "PROMEDIO SALARIOS" FROM EMPLEADOS;
9.
SELECT * FROM EMPLEADOS WHERE COMISION IS NULL OR COMISION = 0;
10.
INSERT INTO DEPARTAMENTOS VALUES (50, 'INFORMATICA', 'MADRID');
INSERT INTO DEPARTAMENTOS VALUES (60, 'INFORMATICA', 'BARCELONA');
INSERT INTO DEPARTAMENTOS VALUES (70, 'INFORMATICA', 'VENTAS');
INSERT INTO DEPARTAMENTOS VALUES (80, 'INFORMATICA', 'PRODUCCION');
11.
DELETE FROM DEPARTAMENTOS WHERE DEPT_NO>=50;
12.
SELECT EMP_NO, APELLIDO, OFICIO FROM EMPLEADOS WHERE EMPLEADOS.DEPT_NO=(SELECT DEPARTAMENTOS.DEPT_NO FROM DEPARTAMENTOS WHERE DNOMBRE='VENTAS') AND OFICIO='EMPLEADO';
DROP TABLE EMPLEADOS;
DROP TABLE DEPARTAMENTOS;