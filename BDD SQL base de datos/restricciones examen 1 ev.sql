CREATE TABLE espectaculos (
  cod_espectaculo VARCHAR(8) NOT NULL,
  nombre VARCHAR(80) NOT NULL,
  tipo VARCHAR(80) NOT NULL,
  fecha_inicial DATE ,
  fecha_final DATE,
  interprete VARCHAR(80) NOT NULL,
  cod_recinto VARCHAR(8)
);
CREATE TABLE precios_espectaculos (
  cod_espectaculo VARCHAR(8) NOT NULL,
  cod_recinto VARCHAR(8) NOT NULL,
  zona VARCHAR(80) NOT NULL,
  precio DECIMAL NOT NULL
);
CREATE TABLE recintos (
  cod_recinto VARCHAR(8) NOT NULL,
  nombre VARCHAR(80) NOT NULL,
  direccion VARCHAR(80) NOT NULL,
  ciudad VARCHAR(80) NOT NULL,
  telefono VARCHAR(80),
  horario VARCHAR(80) NOT NULL
);
CREATE TABLE zonas_recintos (
  cod_recinto VARCHAR(8) NOT NULL,
  zona VARCHAR(80) NOT NULL,
  capacidad INTEGER NOT NULL
);
CREATE TABLE asientos (
  cod_recinto VARCHAR(8) NOT NULL,
  zona VARCHAR(80) NOT NULL,
  fila INTEGER NOT NULL,
  numero INTEGER NOT NULL
);
CREATE TABLE representaciones (
  cod_espectaculo VARCHAR(8) NOT NULL,
  fecha DATE NOT NULL,
  hora VARCHAR(8) NOT NULL
);
CREATE TABLE entradas (
  cod_espectaculo VARCHAR(8) NOT NULL,
  fecha DATE NOT NULL,
  hora VARCHAR(8) NOT NULL,
  cod_recinto VARCHAR(8) NOT NULL,
  fila INTEGER,
  numero INTEGER,
  zona VARCHAR(80),
  dni_cliente VARCHAR(9)
);
CREATE TABLE espectadores (
  dni_cliente VARCHAR(9) NOT NULL,
  nombre VARCHAR(80) NOT NULL,
  direccion VARCHAR(80),
  telefono  VARCHAR(80),
  ciudad VARCHAR(80),
  ntarjeta VARCHAR(20) NOT NULL
 );
 
 Restricciones:
 ALTER TABLE espectaculos ADD CONSTRAINT pk_espectaculos PRIMARY KEY (cod_espectaculo);
 ALTER TABLE recintos ADD CONSTRAINT pk_recintos PRIMARY KEY (cod_recinto);
 ALTER TABLE espectadores ADD CONSTRAINT pk_espectadores PRIMARY KEY (dni_cliente);
 ALTER TABLE precios_espectaculos ADD CONSTRAINT pk_precioespectaculo PRIMARY KEY (cod_espectaculo, cod_recinto, zona);
 ALTER TABLE espectaculos ADD CONSTRAINT fk_espectaculos FOREIGN KEY (cod_recinto) REFERENCES recintos(cod_recinto);
 ALTER TABLE zonas_recintos ADD CONSTRAINT pk_zonasrecintos PRIMARY KEY (cod_recinto, zona);
 ALTER TABLE asientos ADD CONSTRAINT pk_asientos PRIMARY KEY (zona, fila, numero);
 ALTER TABLE asientos ADD CONSTRAINT fk_asientos FOREIGN KEY (cod_recinto) REFERENCES recintos(cod_recinto);
 ALTER TABLE representaciones ADD CONSTRAINT pk_representaciones PRIMARY KEY (cod_espectaculo, fecha, hora);
 ALTER TABLE entradas ADD CONSTRAINT fk_entradas PRIMARY KEY (cod_espectaculo, fecha, hora, cod_recinto);
 ALTER TABLE entradas ADD CONSTRAINT fktrue_entradas FOREIGN KEY (dni_cliente) REFERENCES espectadores(dni_cliente);
 