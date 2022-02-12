CREATE DATABASE  IF NOT EXISTS `ciclos` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ciclos`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: ciclos
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ciclo`
--

DROP TABLE IF EXISTS `ciclo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciclo` (
  `Código` varchar(5) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Tipo` enum('Básico','Medio','Superior') DEFAULT NULL,
  PRIMARY KEY (`Código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciclo`
--

LOCK TABLES `ciclo` WRITE;
/*!40000 ALTER TABLE `ciclo` DISABLE KEYS */;
INSERT INTO `ciclo` VALUES ('ASIR','Administración de Sistemas Informáticos en Red','Superior'),('DAM','Desarrollo de Aplicaciones Multiplataforma','Superior'),('DAW','Desarrollo de Aplicaciones Web','Superior'),('IC','Informática y Comunicaciones','Básico'),('IO','Informática de Oficina','Básico'),('SMR','Sistemas Microinformáticos y Redes','Medio');
/*!40000 ALTER TABLE `ciclo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `NIF` varchar(10) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Nacionalidad` varchar(45) DEFAULT NULL,
  `FechaNacimiento` date NOT NULL,
  `CódigoCiclo` varchar(5) DEFAULT NULL,
  `Tipo` enum('Beca','Erasmus+','Normal') NOT NULL DEFAULT 'Normal',
  PRIMARY KEY (`NIF`),
  KEY `fk_Estudiante_Ciclo_idx` (`CódigoCiclo`),
  CONSTRAINT `fk_Estudiante_Ciclo` FOREIGN KEY (`CódigoCiclo`) REFERENCES `ciclo` (`Código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES ('0256435S','Mario','Flores','España','1995-02-27','DAW','Normal'),('0418445J','Nerea','Socola','Perú','1999-12-05','ASIR','Normal'),('0456887G','Lucía','Castro','Argentina','1998-07-03','DAW','Beca'),('1234567A','Javier','Guzmán','España','2000-01-23','ASIR','Normal'),('23425253','Andrei','Atskov','Estonia','2000-05-02','ASIR','Erasmus+'),('3455352H','Laura','Páez','España','2003-12-30','IC','Normal'),('3543456J','Adrián','Delgado','España','1999-06-06','DAW','Normal'),('3554756Z','Daniela','Molina','Venezuela','1999-11-05','DAM','Normal'),('4364787G','Diego','Fernández','España','2004-07-05','IO','Beca'),('45345367A','Sara','Castillo','España','2002-09-21','DAM','Normal'),('45345376Z','Daniela','Flores','Ecuador','2004-12-23','IO','Normal'),('4578764J','Carla','Ramírez','España','2003-12-03','IC','Normal'),('4579653H','Alejandro','Juárez','España','1998-05-04','DAM','Normal'),('4642444E','Hugo','Figueroa','Colombia','1992-04-30','ASIR','Normal'),('4764967J','Sergio','Ortiz','Venezuela','2000-03-05','DAM','Beca'),('53453454','Jón','Birgisson','Islandia','2001-02-02','DAW','Erasmus+'),('5754558G','Sergio','Ruiz','España','1999-08-15','DAW','Normal'),('6864367S','Claudia','Ruiz','España','2000-04-04','ASIR','Normal'),('T4357543H','Alejandro','Ponce','España','2000-07-03','SMR','Normal'),('X3238533F','Marta','Molina','México','2002-06-23','IO','Normal'),('X3453564R','Paula','Vega','España','2001-01-04','SMR','Normal');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudianteconbeca`
--

DROP TABLE IF EXISTS `estudianteconbeca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudianteconbeca` (
  `NIF_Estudiante` varchar(10) NOT NULL,
  `ImporteBeca` int NOT NULL,
  PRIMARY KEY (`NIF_Estudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudianteconbeca`
--

LOCK TABLES `estudianteconbeca` WRITE;
/*!40000 ALTER TABLE `estudianteconbeca` DISABLE KEYS */;
INSERT INTO `estudianteconbeca` VALUES ('0456887G',1100),('4364787G',1500),('4764967J',1000);
/*!40000 ALTER TABLE `estudianteconbeca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `módulo`
--

DROP TABLE IF EXISTS `módulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `módulo` (
  `Código` varchar(10) NOT NULL,
  `Nombre` varchar(90) NOT NULL,
  `HorasSemanales` smallint DEFAULT NULL,
  `Curso` tinyint DEFAULT NULL,
  PRIMARY KEY (`Código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `módulo`
--

LOCK TABLES `módulo` WRITE;
/*!40000 ALTER TABLE `módulo` DISABLE KEYS */;
INSERT INTO `módulo` VALUES ('AD','Acceso a Datos',6,2),('AO','Aplicaciones Ofimáticas',8,1),('ASGBD','Administración de sistemas gestores de bases de datos',3,2),('ASO','Administración de Sistemas Operativos',6,2),('AW','Aplicaciones Web',5,2),('BD','Bases de Datos',6,1),('CAI','Ciencias Aplicacas I',5,1),('CAII','Ciencias Aplicadas II',5,2),('CSI','Comunicación y Sociedad I',7,1),('CSII','Comunicación y Sociedad II',7,2),('DAW','Despliegue de Aplicaciones Web',4,2),('DI','Desarrollo de Interfaces',6,2),('DIW','Diseño de Interfaces Web',6,2),('DWEC','Desarrollo Web en Entorno Cliente',6,2),('DWES','Desarrollo Web en Entorno Servidor',9,2),('ED','Entornos de Desarrollo',3,1),('EEE','Equipos Eléctricos y Electrónicos',9,2),('EIE','Empresa e Iniciativa Emprendedora',3,2),('FCT','Formación en Centros de Trabajo',370,2),('FCTCMES','Formación en Centros de Trabajo: Configuración, Mantenimiento y Explotación de Sistemas',160,1),('FCTMMER','Formación en Centros de Trabajo: Montaje y Mantenimiento de Equipos y Redes',160,2),('FCTSAG','Formación en Centros de Trabajo: Servicios Administrativos Generales',160,2),('FH','Fundamentos de hardware',3,1),('FOL','Formación y Orientación Laboral',3,1),('GBD','Gestión de Bases de Datos',6,1),('IAW','Implantación de Aplicaciones Web',5,2),('IMRTD','Instalación y Mantenimiento de Redes para Transmisión de Datos',8,2),('ISO','Implantación de Sistemas Operativos',8,1),('IT','Inglés Técnico ',2,2),('LMSGI','Lenguajes de Marcas y Sistemas de Gestión de Información',4,1),('MME','Montaje y Mantenimiento de Equipos',6,1),('MMSCI','Montaje y Mantenimiento de Sistemas y Componentes Informáticos',9,1),('OACE','Operaciones Auxiliares para la Configuración y la Explotación',6,1),('OAD','Ofimática y Archivo de Documentos',9,2),('P','Programación',8,1),('PAR','Planificación y Administración de Redes',6,1),('PMDM','Programación Multimedia y Dispositivos Móviles',4,2),('PRL','Prevención de Riesgos Laborables',2,1),('PROY','Proyecto',30,2),('PSP','Programación de Servicios y Procesos',4,2),('RL','Redes Locales',7,1),('SAD','Seguridad y Alta Disponibilidad',5,2),('SGE','Sistemas de Gestión Empresarial',5,2),('SI','Seguridad Informática',4,2),('SIN','Sistemas Informáticos',6,1),('SOM','Sistemas Operativos Monopuesto',6,1),('SOR','Sistemas Operativos en Red',8,2),('SR','Servicios en Red',8,2),('SRI','Servicios de Red e Internet',6,2),('T1','Tutoría Primero',1,1),('T2','Tutoría Segundo ',1,2);
/*!40000 ALTER TABLE `módulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pertenece`
--

DROP TABLE IF EXISTS `pertenece`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pertenece` (
  `CódigoCiclo` varchar(5) NOT NULL,
  `CódigoMódulo` varchar(10) NOT NULL,
  PRIMARY KEY (`CódigoCiclo`,`CódigoMódulo`),
  KEY `fk_MóduloPerteneceACiclo_Ciclo1_idx` (`CódigoCiclo`),
  KEY `fk_MóduloPerteneceACiclo_Módulo1_idx` (`CódigoMódulo`),
  CONSTRAINT `fk_MóduloPerteneceACiclo_Ciclo1` FOREIGN KEY (`CódigoCiclo`) REFERENCES `ciclo` (`Código`),
  CONSTRAINT `fk_MóduloPerteneceACiclo_Módulo1` FOREIGN KEY (`CódigoMódulo`) REFERENCES `módulo` (`Código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pertenece`
--

LOCK TABLES `pertenece` WRITE;
/*!40000 ALTER TABLE `pertenece` DISABLE KEYS */;
INSERT INTO `pertenece` VALUES ('ASIR','ASGBD'),('ASIR','ASO'),('ASIR','EIE'),('ASIR','FCT'),('ASIR','FH'),('ASIR','FOL'),('ASIR','GBD'),('ASIR','IAW'),('ASIR','ISO'),('ASIR','IT'),('ASIR','LMSGI'),('ASIR','PAR'),('ASIR','PROY'),('ASIR','SAD'),('ASIR','SRI'),('DAM','AD'),('DAM','BD'),('DAM','DI'),('DAM','ED'),('DAM','EIE'),('DAM','FCT'),('DAM','FOL'),('DAM','IT'),('DAM','LMSGI'),('DAM','P'),('DAM','PMDM'),('DAM','PROY'),('DAM','PSP'),('DAM','SGE'),('DAM','SIN'),('DAW','BD'),('DAW','DAW'),('DAW','DIW'),('DAW','DWEC'),('DAW','DWES'),('DAW','ED'),('DAW','EIE'),('DAW','FCT'),('DAW','FOL'),('DAW','IT'),('DAW','LMSGI'),('DAW','P'),('DAW','PROY'),('DAW','SIN'),('IC','CAI'),('IC','CAII'),('IC','CSI'),('IC','CSII'),('IC','EEE'),('IC','FCTCMES'),('IC','FCTMMER'),('IC','IMRTD'),('IC','MMSCI'),('IC','OACE'),('IC','PRL'),('IC','T1'),('IC','T2'),('IO','CAI'),('IO','CAII'),('IO','CSI'),('IO','CSII'),('IO','FCTCMES'),('IO','FCTSAG'),('IO','IMRTD'),('IO','MMSCI'),('IO','OACE'),('IO','OAD'),('IO','PRL'),('IO','T1'),('IO','T2'),('SMR','AO'),('SMR','AW'),('SMR','EIE'),('SMR','FCT'),('SMR','FOL'),('SMR','IT'),('SMR','MME'),('SMR','RL'),('SMR','SI'),('SMR','SOM'),('SMR','SOR'),('SMR','SR');
/*!40000 ALTER TABLE `pertenece` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-15  1:23:25
