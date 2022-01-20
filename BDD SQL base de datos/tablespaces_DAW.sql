CREATE TABLESPACE "DAW" LOGGING
DATAFILE 'C:\oraclexe\app\oracle\oradata\XE\DAW.dbf' SIZE 24M 
EXTENT MANAGEMENT LOCAL SEGMENT SPACE MANAGEMENT AUTO;


DROP USER daw CASCADE;

CREATE USER daw IDENTIFIED BY daw
       DEFAULT TABLESPACE DAW
       TEMPORARY TABLESPACE temp
       ACCOUNT UNLOCK;

GRANT "CONNECT" TO daw;
GRANT "RESOURCE" TO daw;

GRANT ALTER ANY INDEX TO daw;
GRANT ALTER ANY SEQUENCE TO daw;
GRANT ALTER ANY TABLE TO daw;
GRANT ALTER ANY TRIGGER TO daw;
GRANT CREATE ANY INDEX TO daw;
GRANT CREATE ANY SEQUENCE TO daw;
GRANT CREATE ANY SYNONYM TO daw;
GRANT CREATE ANY TABLE TO daw;
GRANT CREATE ANY TRIGGER TO daw;
GRANT CREATE ANY VIEW TO daw;
GRANT CREATE PROCEDURE TO daw;
GRANT CREATE PUBLIC SYNONYM TO daw;
GRANT CREATE TRIGGER TO daw;
GRANT CREATE VIEW TO daw;
GRANT DELETE ANY TABLE TO daw;
GRANT DROP ANY INDEX TO daw;
GRANT DROP ANY SEQUENCE TO daw;
GRANT DROP ANY TABLE TO daw;

