SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION NEMPLEADOS(DEPART NUMBER)
RETURN NUMBER
IS NUM_EMPLE NUMBER;
BEGIN
  SELECT COUNT(*) INTO NUM_EMPLE FROM EMPLE WHERE DEPT_NO=DEPART;
  RETURN(NUM_EMPLE);
END;

DECLARE
  N_DEPART NUMBER;
  NUM NUMBER;
BEGIN
  N_DEPART:=&INTRODUCENUMERO;
  NUM:=NEMPLEADOS(N_DEPART);
  IF (NUM<=0) THEN
    DBMS_OUTPUT.PUT_LINE('NO TIENE LETRAS A');
  ELSIF 
    DBMS_OUTPUT.PUT_LINE('TIENE '||NUM||' LETRAS A');
  END IF;
END;

CREATE OR REPLACE FUNCTION CONTARLETRASA(PALABRA VARCHAR2)
RETURN NUMBER
IS CONTADOR NUMBER:=0; SUBSTRING VARCHAR2(25);
BEGIN
  FOR I IN 1..LENGTH(PALABRA) LOOP
    SUBSTRING:=SUBSTR(PALABRA,I,1);
    IF (SUBSTRING='A') THEN
      CONTADOR:=CONTADOR+1;
    END IF;
  END LOOP;
  RETURN(CONTADOR);
END CONTARLETRASA;

DECLARE
  PALABRA VARCHAR2(25);
  NUM NUMBER;
BEGIN
  PALABRA:='HOLA';
  NUM:=CONTARLETRASA(PALABRA);
  IF (NUM<=0) THEN
    DBMS_OUTPUT.PUT_LINE('NO TIENE LETRAS A');
  ELSIF (NUM>0) THEN
    DBMS_OUTPUT.PUT_LINE('TIENE '||NUM||' LETRAS A');
  END IF;
END;
