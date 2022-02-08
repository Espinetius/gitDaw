create table articulos(
T varchar2(2) primary key,
Tnombre varchar2(20) NOT NULL,
ciudad varchar2(20) not null 
);

INSERT into ARTICULOS VALUES ('T1','CLASIFICADORA','MADRID');
INSERT into ARTICULOS VALUES ('T2','PERFORADORA','MALAGA');
INSERT into ARTICULOS VALUES ('T3','LECTORA','CACERES');
INSERT into ARTICULOS VALUES ('T4','CONSOLA','CACERES');
INSERT into ARTICULOS VALUES ('T5','MEZCLADORA','SEVILLA');
INSERT into ARTICULOS VALUES ('T6','TERMINAL','BARCELONA');
INSERT into ARTICULOS VALUES ('T7','CNUMBERA','SEVILLA');

create table componentes(
C varchar2(2) primary key,
cnombre varchar2(20) not null,
color varchar2(20) not null,
peso NUMBER(5) not null,
ciudad varchar2(20) not null
); 
 
INSERT into COMPONENTES VALUES ('C1','X3A','ROJO',12,'SEVILLA');
INSERT into COMPONENTES VALUES ('C2','B85','VERDE',17,'MADRID');
INSERT into COMPONENTES VALUES ('C3','C4B','AZUL',17,'MALAGA');
INSERT into COMPONENTES VALUES ('C4','C4B','ROJO',14,'SEVILLA');
INSERT into COMPONENTES VALUES ('C5','VT8','AZUL',12,'MADRID');
INSERT into COMPONENTES VALUES ('C6','C30','ROJO',19,'SEVILLA');

create table ENVIOS(
ID varchar2(5) PRIMARY KEY,
P varchar2(2) NOT NULL,
C varchar2(2) not null,
T varchar2(2) not null,
Cantidad NUMBER(5) not null
);

insert into ENVIOS VALUES (1,'P1','C1','T1',200);
insert into ENVIOS VALUES (2,'P1','C1','T4',700);
insert into ENVIOS VALUES (3,'P2','C3','T1',400);
insert into ENVIOS VALUES (4,'P2','C3','T2',200);
insert into ENVIOS VALUES (5,'P2','C3','T3',200);
insert into ENVIOS VALUES (6,'P2','C3','T4',500);
insert into ENVIOS VALUES (7,'P2','C3','T5',600);
insert into ENVIOS VALUES (8,'P2','C3','T6',400);
insert into ENVIOS VALUES (9,'P2','C3','T7',800);
insert into ENVIOS VALUES (10,'P2','C5','T2',100);
insert into ENVIOS VALUES (11,'P3','C3','T1',200);
insert into ENVIOS VALUES (12,'P3','C4','T2',500);
insert into ENVIOS VALUES (13,'P4','C6','T3',300);
insert into ENVIOS VALUES (14,'P4','C6','T7',300);
insert into ENVIOS VALUES (15,'P5','C2','T3',200);
insert into ENVIOS VALUES (16,'P5','C2','T4',100);
insert into ENVIOS VALUES (17,'P5','C5','T4',500);
insert into ENVIOS VALUES (18,'P5','C5','T7',100);
insert into ENVIOS VALUES (19,'P5','C6','T2',200);
insert into ENVIOS VALUES (20,'P5','C1','T4',100);
insert into ENVIOS VALUES (21,'P5','C3','T4',200);
insert into ENVIOS VALUES (22,'P5','C4','T4',800);
insert into ENVIOS VALUES (23,'P5','C5','T5',400);
insert into ENVIOS VALUES (24,'P5','C6','T4',500);

create table proveedores(
P varchar2(2) primary key,
pnombre varchar2(20) not null,
categoria NUMBER(5) not null,
ciudad varchar2(20) not null
);
  
INSERT into PROVEEDORES VALUES ('P1','CARLOS',20,'SEVILLA');
INSERT into PROVEEDORES VALUES ('P2','JUAN',10,'MADRID');
INSERT into PROVEEDORES VALUES ('P3','JOSE',30,'SEVILLA');
INSERT into PROVEEDORES VALUES ('P4','INMA',20,'SEVILLA');
INSERT into PROVEEDORES VALUES ('P5','EVA',30,'CACERES');