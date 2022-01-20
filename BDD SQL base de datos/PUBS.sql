CREATE TABLE pub (
	cod_pub VARCHAR2(5) NOT NULL,
	nombre VARCHAR2(60) NOT NULL,
	licencia_fiscal VARCHAR2(60) NOT NULL,
	domicilio VARCHAR2(60) ,
	fecha_apertura DATE NOT NULL,
	horario VARCHAR2(60) NOT NULL,
	cod_localidad NUMBER NOT NULL
);
CREATE TABLE titular (
	dni_titular VARCHAR2(10) NOT NULL,
	nombre VARCHAR2(60) NOT NULL,
	domicilio VARCHAR2(60) NOT NULL,
	cod_pub VARCHAR2(5) NOT NULL
);
CREATE TABLE empleado (
	dni_empleado VARCHAR2(10) NOT NULL,
	nombre VARCHAR2(60) NOT NULL,
	domicilio VARCHAR2(60)
);
CREATE TABLE existencias (
	cod_articulo VARCHAR2(5) NOT NULL,
	nombre VARCHAR2(60) NOT NULL,
	cantidad NUMBER NOT NULL,
	precio NUMBER NOT NULL,
	cod_pub VARCHAR2(5) NOT NULL
);
CREATE TABLE localidad (
	cod_localidad NUMBER NOT NULL,
	nombre VARCHAR2(60) NOT NULL
);
CREATE TABLE pub_empleado (
	cod_pub VARCHAR2(5) NOT NULL,
	dni_empleado VARCHAR2(10) NOT NULL,
	funcion VARCHAR2(60) NOT NULL
);
ALTER TABLE pub ADD CONSTRAINT pk_pub PRIMARY KEY (cod_pub);
ALTER TABLE pub ADD CONSTRAINT fk_pub_localidad FOREIGN KEY (cod_localidad) REFERENCES localidad(cod_localidad);
ALTER TABLE localidad ADD CONSTRAINT pk_localidad PRIMARY KEY (cod_localidad);
ALTER TABLE titular ADD CONSTRAINT pk_titular PRIMARY KEY (dni_titular);
ALTER TABLE empleado ADD CONSTRAINT pk_empleado PRIMARY KEY (dni_empleado);
ALTER TABLE existencias ADD CONSTRAINT pk_existencias PRIMARY KEY (cod_articulo);
ALTER TABLE pub_empleado ADD CONSTRAINT pk_pub_empleado PRIMARY KEY (cod_pub, dni_empleado, funcion);
ALTER TABLE pub_empleado ADD CONSTRAINT fk_pub_empleado FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub); 
ALTER TABLE pub_empleado ADD CONSTRAINT fk1_pub_empleados FOREIGN KEY (dni_empleado) REFERENCES empleado(dni_empleado);
ALTER TABLE pub_empleado DROP PRIMARY KEY;
ALTER TABLE pub ADD CONSTRAINT ck_horario CHECK (horario IN('HOR1', 'HOR2', 'HOR3'));
ALTER TABLE existencias ADD CONSTRAINT ck_precio CHECK (precio!=0);
ALTER TABLE pub_empleado ADD CONSTRAINT ck_funcion CHECK (funcion IN('CAMARERO', 'SEGURIDAD', 'LIMPIEZA'));
ALTER TABLE titular ADD CONSTRAINT cod_pub FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub);
ALTER TABLE existencias ADD CONSTRAINT cod_pub_existencias FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub);


a.
INSERT INTO pub VALUES (001, 'Los DB´s', 'es ilegal', 'calle del coco', TO_DATE('2021-11-04', 'YYYY-MM-DD'), 'HOR0', 001);
b.
INSERT INTO pub VALUES ('Los DB´s', 'es ilegal', 'calle del coco', TO_DATE('2021-11-04', 'YYYY-MM-DD'), 'HOR01', 001);
c.
INSERT INTO pub VALUES (001,'Los DB´s', 'es ilegal', 'calle del coco', 2021-02-05, 'HOR01', 001);
d.
INSERT INTO existencias VALUES (001, 'Pañales', 5, 0, 001);
e.
INSERT INTO pub_empleado VALUES (001,'1234567890', 'RECEPCIONISTA');