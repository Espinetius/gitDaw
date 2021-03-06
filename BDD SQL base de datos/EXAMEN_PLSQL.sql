--EXAMEN PLSQL MARTES 17/05/2022
--------------------------------
SET SERVEROUTPUT ON;

--------------------------------
--EJERCICIO 1
--------------------------------
DECLARE
  TYPE DEPARTAMENTOS IS VARRAY(7) OF VARCHAR(25);
  DEPARTAMENTO DEPARTAMENTOS;
  DEPA NUMBER;
  EMPLEADOS NUMBER;
BEGIN
  DEPARTAMENTO:=DEPARTAMENTOS(10,20,30,40,50,60,70);
  DEPA:=DEPARTAMENTO.COUNT;
  SELECT COUNT(*) INTO EMPLEADOS FROM EMPLE;
  DBMS_OUTPUT.PUT_LINE('HAY '||EMPLEADOS||' EMPLEADOS EN LA EMPRESA');
  FOR I IN 1..DEPA LOOP    
      SELECT COUNT(*) INTO EMPLEADOS FROM EMPLE WHERE DEPT_NO=DEPARTAMENTO(I);
      IF EMPLEADOS>0 THEN
        DBMS_OUTPUT.PUT_LINE('EL DEPARTAMENTO '||DEPARTAMENTO(I)||' TIENE '||EMPLEADOS||' EMPLEADOS');
      END IF;
  END LOOP;
END;
----------------------------------------------
--EJERCICIO 2
----------------------------------------------
CREATE OR REPLACE PROCEDURE OFICIOMAYOR
IS
  TRABAJO VARCHAR2(25);
  INCREMENTO NUMBER;
  EMPLEADOS NUMBER;
BEGIN
  SELECT MAX(COUNT(*)) INTO EMPLEADOS FROM EMPLE GROUP BY DEPT_NO;
  SELECT OFICIO INTO TRABAJO FROM EMPLE HAVING COUNT(*)=(SELECT MAX(COUNT(*)) FROM EMPLE GROUP BY OFICIO) GROUP BY OFICIO;
  DBMS_OUTPUT.PUT_LINE('EL OFICIO CON MAS EMPLEADOS ES '||TRABAJO||' Y TIENE '||EMPLEADOS||' EMPLEADOS');
  IF TRABAJO LIKE 'ANALISTA' THEN
    INCREMENTO:=10000;
    UPDATE EMPLE SET SALARIO=SALARIO+INCREMENTO WHERE OFICIO LIKE 'ANALISTA';
  END IF;
  IF TRABAJO LIKE 'VENDEDORES' THEN
    INCREMENTO:=1000;
    UPDATE EMPLE SET SALARIO=SALARIO+INCREMENTO WHERE OFICIO LIKE 'VENDEDORES';
  END IF;
  IF TRABAJO LIKE 'EMPLEADO' THEN
    INCREMENTO:=1000;
    UPDATE EMPLE SET SALARIO=SALARIO+INCREMENTO WHERE OFICIO LIKE 'EMPLEADO';
  END IF;
  IF TRABAJO LIKE 'PRESIDENTE' THEN
    INCREMENTO:=20000;
    UPDATE EMPLE SET SALARIO=SALARIO+INCREMENTO WHERE OFICIO LIKE 'PRESIDENTE';
  END IF;
END;
---------------------------------------------------
--EJERCICIO 3
---------------------------------------------------
DECLARE
  APE VARCHAR(25);
  TRABAJO VARCHAR(25);
  DEPARTAMENTO NUMBER;
  MEDIASALARIO NUMBER;
  SUELDO NUMBER;
  CONTADOR NUMBER:=0;
BEGIN
  SELECT AVG(SALARIO) INTO MEDIASALARIO FROM EMPLE HAVING AVG(SALARIO)=(SELECT MAX(AVG(SALARIO)) FROM EMPLE GROUP BY DEPT_NO) GROUP BY DEPT_NO;
  SELECT DEPT_NO INTO DEPARTAMENTO FROM EMPLE HAVING AVG(SALARIO)=(SELECT AVG(SALARIO) FROM EMPLE HAVING AVG(SALARIO)=(SELECT MAX(AVG(SALARIO)) FROM EMPLE GROUP BY DEPT_NO) GROUP BY DEPT_NO) GROUP BY DEPT_NO;
  SELECT APELLIDO INTO APE FROM EMPLE WHERE DEPT_NO=DEPARTAMENTO AND SALARIO=(SELECT MAX(SALARIO) FROM EMPLE);
  SELECT OFICIO INTO TRABAJO FROM EMPLE WHERE APELLIDO=APE;
  DBMS_OUTPUT.PUT_LINE('EMPLEADO QUE MAS GANA DEL DEPARTAMENTO CON LA MEDIA SALARIAL MAS ALTA');
  DBMS_OUTPUT.PUT_LINE('-APELLIDO: '||APE);
  DBMS_OUTPUT.PUT_LINE('OFICIO: '||TRABAJO);
  DBMS_OUTPUT.PUT_LINE('-DEPTO: '||DEPARTAMENTO);
  SELECT SALARIO INTO SUELDO FROM EMPLE WHERE APELLIDO=APE;
  IF SUELDO>600000 THEN
    UPDATE EMPLE SET SALARIO=SALARIO+100000 WHERE APELLIDO=APE;
  ELSIF SUELDO<600000 THEN
    UPDATE EMPLE SET SALARIO=SALARIO-100000 WHERE APELLIDO=APE;
  END IF;
  DBMS_OUTPUT.PUT_LINE('---------');
  DBMS_OUTPUT.PUT_LINE('NUMERO DE CARACTERES DEL APELLIDO: '||LENGTH(APE));
  DBMS_OUTPUT.PUT_LINE('NUMERO DE CARACTERES DEL OFICIO: '||LENGTH(TRABAJO));
  FOR I IN 1..(LENGTH(APE)) LOOP
    IF I=(LENGTH(APE)) THEN
      DBMS_OUTPUT.PUT_LINE('EL ULTIMO CARACTER DEL APELLIDO ES: '||SUBSTR(APE,I,1)));
    END IF;
    IF I=(LENGTH(APE)-1) THEN
      DBMS_OUTPUT.PUT_LINE('EL PENULTIMO CARACTER DEL APELLIDO ES: '||SUBSTR(APE,I,1));
    END IF;
  END LOOP;
  FOR I IN 1..(LENGTH(APE)) LOOP
    IF SUBSTR(APE,I,1)='R' THEN
      CONTADOR:=CONTADOR+1;
    END IF;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('EL APELLIDO TIENE :'||CONTADOR||' Rs');
END;