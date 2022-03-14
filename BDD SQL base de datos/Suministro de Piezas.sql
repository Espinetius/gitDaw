CREATE TABLE suministrador
 (num_sum varchar2(7) NOT NULL,
 nom_sum varchar2(10),
 categoria NUMBER(9),
 ciudad varchar2(7),
 PRIMARY KEY (num_sum)); 
 
CREATE TABLE piezas
 (num_piez varchar2(7) NOT NULL,
 nom_piez varchar2(10),
 color varchar2(15),
 peso NUMBER(4),
 ciudad varchar2(7),
 PRIMARY KEY (num_piez));
  
CREATE TABLE suministro_piezas
(num_sum varchar2(7) NOT NULL,
num_piez varchar2(7) NOT NULL,
cantidad NUMBER(9));

INSERT INTO suministrador VALUES ('S1','Javier',20,'Londres');
INSERT INTO suministrador VALUES ('S2','Juan',10,'París');
INSERT INTO suministrador VALUES ('S3','Blas',30,'París');
INSERT INTO suministrador VALUES ('S4','Carlos',20,'Londres');
INSERT INTO suministrador VALUES ('S5','Andrés',30,'Atenas');

INSERT INTO piezas VALUES ('P1','Tuerca','Rojo',12,'Londres');
INSERT INTO piezas VALUES ('P2','Cerrojo','Verde',17,'París');
INSERT INTO piezas VALUES ('P3','Tornillo','Azul',17,'Roma');
INSERT INTO piezas VALUES ('P4','Rueda','Rojo',14,'Londres');
INSERT INTO piezas VALUES ('P5','Leva','Azul',12,'París');
INSERT INTO piezas VALUES ('P6','Rueda','Rojo',19,'Londres');

INSERT INTO suministro_piezas VALUES ('S1','P1',300);
INSERT INTO suministro_piezas VALUES ('S1','P2',200);
INSERT INTO suministro_piezas VALUES ('S1','P3',400);
INSERT INTO suministro_piezas VALUES ('S1','P4',200);
INSERT INTO suministro_piezas VALUES ('S1','P5',100);
INSERT INTO suministro_piezas VALUES ('S1','P6',100);
INSERT INTO suministro_piezas VALUES ('S2','P1',300);
INSERT INTO suministro_piezas VALUES ('S2','P2',400);
INSERT INTO suministro_piezas VALUES ('S3','P2',200);
INSERT INTO suministro_piezas VALUES ('S4','P2',200);
INSERT INTO suministro_piezas VALUES ('S4','P4',300);
INSERT INTO suministro_piezas VALUES ('S4','P5',400); 
