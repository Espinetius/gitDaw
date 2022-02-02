CREATE TABLE COMUNIDADES
	(COD_COMUNIDAD  NUMBER(3) PRIMARY KEY,
	 NOMBRE 		VARCHAR2(27),
	 COD_CAPITAL    NUMBER(3));

CREATE TABLE PROVINCIAS
	(COD_PROVINCIA   NUMBER(3) PRIMARY KEY,
	 NOMBRE          VARCHAR2(22),
	 COD_CAPITAL     NUMBER(3),
	 SUPERFICIE      NUMBER(3),
	 COD_COMUNIDAD   NUMBER(3));

CREATE TABLE LOCALIDADES(COD_LOCALIDAD   NUMBER(3) PRIMARY KEY,
			 NOMBRE          VARCHAR2(40),
			 POBLACION       NUMBER(7),
			 COD_PROVINCIA   NUMBER(3));

INSERT INTO COMUNIDADES VALUES(001,'ANDALUCIA',128);
INSERT INTO COMUNIDADES VALUES(002,'ARAGON',139);
INSERT INTO COMUNIDADES VALUES(003,'ASTURIAS',144);
INSERT INTO COMUNIDADES VALUES(004,'CANARIAS',149);
INSERT INTO COMUNIDADES VALUES(005,'CANTABRIA',165);
INSERT INTO COMUNIDADES VALUES(006,'CASTILLA Y LEON',192);
INSERT INTO COMUNIDADES VALUES(007,'CASTILLA-LA MANCHA',222);
INSERT INTO COMUNIDADES VALUES(008,'CATALUNA',343);
INSERT INTO COMUNIDADES VALUES(009,'COMUNIDAD DE MADRID',226);
INSERT INTO COMUNIDADES VALUES(010,'COMUNIDAD VALENCIANA',264);
INSERT INTO COMUNIDADES VALUES(011,'EXTREMADURA',277);
INSERT INTO COMUNIDADES VALUES(012,'GALICIA',291);
INSERT INTO COMUNIDADES VALUES(013,'ILLES BALEARS',307);
INSERT INTO COMUNIDADES VALUES(014,'COMUNIDAD FLORAL DE NAVARRA',316);
INSERT INTO COMUNIDADES VALUES(015,'PAIS VASCO',321);
INSERT INTO COMUNIDADES VALUES(016,'LA RIOJA',332);
INSERT INTO COMUNIDADES VALUES(017,'REGION DE MURCIA',338);
INSERT INTO COMUNIDADES VALUES(018,'CIUDAD AUTONOMA DE CEUTA',341);
INSERT INTO COMUNIDADES VALUES(019,'CIUDAD AUTONOMA DE MELILLA',342);


INSERT INTO PROVINCIAS VALUES(200,'ALMERIA',100,100,001);
INSERT INTO PROVINCIAS VALUES(201,'CADIZ',103,120,001);
INSERT INTO PROVINCIAS VALUES(202,'CORDOBA',109,180,001);
INSERT INTO PROVINCIAS VALUES(203,'GRANADA',112,90,001);
INSERT INTO PROVINCIAS VALUES(204,'HUELVA',116,30,001);
INSERT INTO PROVINCIAS VALUES(205,'JAEN',119,20,001);
INSERT INTO PROVINCIAS VALUES(206,'MALAGA',123,110,001);
INSERT INTO PROVINCIAS VALUES(207,'SEVILLA',128,98,001);
INSERT INTO PROVINCIAS VALUES(208,'HUESCA',132,120,002);
INSERT INTO PROVINCIAS VALUES(209,'TERUEL',135,70,002);
INSERT INTO PROVINCIAS VALUES(210,'ZARAGOZA',139,60,002);
INSERT INTO PROVINCIAS VALUES(211,'ASTURIAS',144,40,003);
INSERT INTO PROVINCIAS VALUES(212,'LAS PALMAS',149,80,004);
INSERT INTO PROVINCIAS VALUES(213,'SANTA CRUZ DE TENERIFE',155,60,004);
INSERT INTO PROVINCIAS VALUES(214,'CANTABRIA',165,100,005);
INSERT INTO PROVINCIAS VALUES(215,'AVILA',168,100,006);
INSERT INTO PROVINCIAS VALUES(216,'BURGOS',170,100,006);
INSERT INTO PROVINCIAS VALUES(217,'LEON',173,100,006);
INSERT INTO PROVINCIAS VALUES(218,'PALENCIA',177,100,006);
INSERT INTO PROVINCIAS VALUES(219,'SALAMANCA',181,100,006);
INSERT INTO PROVINCIAS VALUES(220,'SEGOVIA',184,100,006);
INSERT INTO PROVINCIAS VALUES(221,'SORIA',188,100,006);
INSERT INTO PROVINCIAS VALUES(222,'VALLADOLID',192,100,006);
INSERT INTO PROVINCIAS VALUES(223,'ZAMORA',196,100,006);
INSERT INTO PROVINCIAS VALUES(224,'ALBACETE',199,100,007);
INSERT INTO PROVINCIAS VALUES(225,'CIUDAD REAL',204,100,007);
INSERT INTO PROVINCIAS VALUES(226,'CUENCA',208,100,007);
INSERT INTO PROVINCIAS VALUES(227,'GUADALAJARA',215,100,007);
INSERT INTO PROVINCIAS VALUES(228,'TOLEDO',222,100,007);
INSERT INTO PROVINCIAS VALUES(248,'BARCELONA',343,100,008);
INSERT INTO PROVINCIAS VALUES(249,'TARRAGONA',367,100,008);
INSERT INTO PROVINCIAS VALUES(250,'LERIDA',377,100,008);
INSERT INTO PROVINCIAS VALUES(251,'GERONA',382,100,008);
INSERT INTO PROVINCIAS VALUES(229,'MADRID',226,100,009);
INSERT INTO PROVINCIAS VALUES(230,'ALICANTE',251,100,010);
INSERT INTO PROVINCIAS VALUES(231,'CASTELLON',256,100,010);
INSERT INTO PROVINCIAS VALUES(232,'VALENCIA',264,100,010);
INSERT INTO PROVINCIAS VALUES(233,'BADAJOZ',277,100,011);
INSERT INTO PROVINCIAS VALUES(234,'CACERES',282,100,011);
INSERT INTO PROVINCIAS VALUES(235,'A CORUNA',286,100,012);
INSERT INTO PROVINCIAS VALUES(236,'LUGO',295,100,012);
INSERT INTO PROVINCIAS VALUES(237,'OURENSE',299,100,012);
INSERT INTO PROVINCIAS VALUES(238,'PONTEVEDRA',303,100,012);
INSERT INTO PROVINCIAS VALUES(239,'ILLES BALEARS',307,100,013);
INSERT INTO PROVINCIAS VALUES(240,'NAVARRA',316,100,014);
INSERT INTO PROVINCIAS VALUES(241,'ALAVA',321,100,015);
INSERT INTO PROVINCIAS VALUES(242,'GUIPUZCOA',323,100,015);
INSERT INTO PROVINCIAS VALUES(243,'VIZCAYA',326,100,015);
INSERT INTO PROVINCIAS VALUES(244,'LA RIOJA',332,100,016);
INSERT INTO PROVINCIAS VALUES(245,'MURCIA',338,100,017);
INSERT INTO PROVINCIAS VALUES(246,'CEUTA',341,100,018);
INSERT INTO PROVINCIAS VALUES(247,'MELILLA',342,100,019);


INSERT INTO LOCALIDADES VALUES(100,'ALMERIA',166328,200);
INSERT INTO LOCALIDADES VALUES(101,'EL EJIDO',57877,200);
INSERT INTO LOCALIDADES VALUES(102,'ROQUETAS DE MAR',50096,200);

INSERT INTO LOCALIDADES VALUES(103,'CADIZ',134989,201);
INSERT INTO LOCALIDADES VALUES(104,'ALGECIRAS',108779,201);
INSERT INTO LOCALIDADES VALUES(105,'ARCOS DE LA FRONTERA',28000,201);
INSERT INTO LOCALIDADES VALUES(106,'BARBATE',22000,201);
INSERT INTO LOCALIDADES VALUES(107,'CHICLIANA DE LA FRONTERA',65000,201);
INSERT INTO LOCALIDADES VALUES(108,'EL PUERTO DE SANTA MARIA',79889,201);

INSERT INTO LOCALIDADES VALUES(109,'CORDOBA',314805,202);
INSERT INTO LOCALIDADES VALUES(110,'LUCENA',37669,202);
INSERT INTO LOCALIDADES VALUES(111,'MONTILLA',23235,202);

INSERT INTO LOCALIDADES VALUES(112,'GRANADA',270000,203);
INSERT INTO LOCALIDADES VALUES(113,'BAZA',21000,203);
INSERT INTO LOCALIDADES VALUES(114,'GUADIX',20000,203);
INSERT INTO LOCALIDADES VALUES(115,'MOTRIL',55078,203);

INSERT INTO LOCALIDADES VALUES(116,'HUELVA',144831,204);
INSERT INTO LOCALIDADES VALUES(117,'LEPE',20173,204);
INSERT INTO LOCALIDADES VALUES(118,'ISLA CRISTINA',18770,204);

INSERT INTO LOCALIDADES VALUES(119,'JAEN',112921,205);
INSERT INTO LOCALIDADES VALUES(120,'ANDUJAR',37920,205);
INSERT INTO LOCALIDADES VALUES(121,'LINARES',57800,205);
INSERT INTO LOCALIDADES VALUES(122,'UBEDA',32971,205);

INSERT INTO LOCALIDADES VALUES(123,'MALAGA',547105,206);
INSERT INTO LOCALIDADES VALUES(124,'ESTEPONA',40000,206);
INSERT INTO LOCALIDADES VALUES(125,'FUENGIROLA',60000,206);
INSERT INTO LOCALIDADES VALUES(126,'RONDA',34470,206);
INSERT INTO LOCALIDADES VALUES(127,'MARBELLA',116234,206);

INSERT INTO LOCALIDADES VALUES(128,'SEVILLA',709975,207);
INSERT INTO LOCALIDADES VALUES(129,'CARMONA', 25932,207);
INSERT INTO LOCALIDADES VALUES(130,'DOS HERMANAS',103282,207);
INSERT INTO LOCALIDADES VALUES(131,'UTRERA',49953,207);

INSERT INTO LOCALIDADES VALUES(132,'HUESCA',47923,208);
INSERT INTO LOCALIDADES VALUES(133,'SABINANIGO',8855,208);
INSERT INTO LOCALIDADES VALUES(134,'MONZON',15457,208);

INSERT INTO LOCALIDADES VALUES(135,'TERUEL',32304,209);
INSERT INTO LOCALIDADES VALUES(136,'ALCANIZ',13708,209);
INSERT INTO LOCALIDADES VALUES(137,'PE�ARROYA DE TASTAVINS',545,209);
INSERT INTO LOCALIDADES VALUES(138,'CALAMOCHA',4155,209);

INSERT INTO LOCALIDADES VALUES(139,'ZARAGOZA',641581,210);
INSERT INTO LOCALIDADES VALUES(140,'CALATAYUD',18531,210);
INSERT INTO LOCALIDADES VALUES(141,'EJEA DE LOS CABALLEROS',16183,210);
INSERT INTO LOCALIDADES VALUES(142,'TARAZONA',10667,210);
INSERT INTO LOCALIDADES VALUES(143,'UTEBO',12100,210);

INSERT INTO LOCALIDADES VALUES(144,'OVIEDO',213600,211);
INSERT INTO LOCALIDADES VALUES(145,'GIJON',271039,211);
INSERT INTO LOCALIDADES VALUES(146,'CANGAS DE ONIS',6358,211);
INSERT INTO LOCALIDADES VALUES(147,'RIBADESELLA',6171,211);
INSERT INTO LOCALIDADES VALUES(148,'AVILES',84182,211);

INSERT INTO LOCALIDADES VALUES(149,'LAS PALMAS DE GRAN CANARIA',364777,212);
INSERT INTO LOCALIDADES VALUES(150,'ARUCAS',32542,212);
INSERT INTO LOCALIDADES VALUES(151,'SAN BARTOLOME DE TIRAJANA',40825,212);
INSERT INTO LOCALIDADES VALUES(152,'TELDE',89493,212);
INSERT INTO LOCALIDADES VALUES(153,'ARRECIFE',45549,212);
INSERT INTO LOCALIDADES VALUES(154,'INGENIO',25237,212);

INSERT INTO LOCALIDADES VALUES(155,'SANTA CRUZ DE TENERIFE',220022,213);
INSERT INTO LOCALIDADES VALUES(156,'ADEJE',21862,213);
INSERT INTO LOCALIDADES VALUES(157,'ARONA',43259,213);
INSERT INTO LOCALIDADES VALUES(158,'ICOD DE LOS VINOS',22031,213);
INSERT INTO LOCALIDADES VALUES(159,'LA OROTAVA',38670,213);
INSERT INTO LOCALIDADES VALUES(160,'PUERTO DE LA CRUZ',29854,213);
INSERT INTO LOCALIDADES VALUES(161,'LOS REALEJOS',35031,213);
INSERT INTO LOCALIDADES VALUES(162,'SAN CRISTOBAL DE LA LAGUNA',133340,213);
INSERT INTO LOCALIDADES VALUES(163,'LOS LLANOS DE ARIDADE',19536,213);
INSERT INTO LOCALIDADES VALUES(164,'SANTA CRUZ DE LA PALMA',18206,213);

INSERT INTO LOCALIDADES VALUES(165,'SANTANDER',183800,214);
INSERT INTO LOCALIDADES VALUES(166,'TORRELAVEGA',56180,214);
INSERT INTO LOCALIDADES VALUES(167,'CAMARGO',23914,214);

INSERT INTO LOCALIDADES VALUES(168,'AVILA',176910,215);
INSERT INTO LOCALIDADES VALUES(169,'AREVALO',8000,215);

INSERT INTO LOCALIDADES VALUES(170,'BURGOS',169317,216);
INSERT INTO LOCALIDADES VALUES(171,'ARANDA DE DUERO',30309,216);
INSERT INTO LOCALIDADES VALUES(172,'MIRANDA DE EBRO',36240,216);

INSERT INTO LOCALIDADES VALUES(173,'LEON',138006,217);
INSERT INTO LOCALIDADES VALUES(174,'ASTORGA',12329,217);
INSERT INTO LOCALIDADES VALUES(175,'PONFERRADA',64010,217);
INSERT INTO LOCALIDADES VALUES(176,'SAN ANDRES DEL RABANEDO',25288,217);

INSERT INTO LOCALIDADES VALUES(177,'PALENCIA',80856,218);
INSERT INTO LOCALIDADES VALUES(178,'GUARDO',8337,218);
INSERT INTO LOCALIDADES VALUES(179,'AGUILAR DEL CAMPOO',7565,218);
INSERT INTO LOCALIDADES VALUES(180,'VILLAMURRIEL DE CERRATO',5070,218);

INSERT INTO LOCALIDADES VALUES(181,'SALAMANCA',157906,219);
INSERT INTO LOCALIDADES VALUES(182,'BEJAR',15228,219);
INSERT INTO LOCALIDADES VALUES(183,'CIUDAD RODRIGO',14250,219);

INSERT INTO LOCALIDADES VALUES(184,'SEGOVIA',55640,220);
INSERT INTO LOCALIDADES VALUES(185,'CUELLAR',9288,220);
INSERT INTO LOCALIDADES VALUES(186,'EL ESPINAR',6543,220);
INSERT INTO LOCALIDADES VALUES(187,'SAN ILDEFONSO',5178,220);

INSERT INTO LOCALIDADES VALUES(188,'SORIA',35178,221);
INSERT INTO LOCALIDADES VALUES(189,'AGREDA',3219,221);
INSERT INTO LOCALIDADES VALUES(190,'ALMAZAN',5750,221);
INSERT INTO LOCALIDADES VALUES(191,'BURGO DE OSMA',5086,221);

INSERT INTO LOCALIDADES VALUES(192,'VALLADOLID',318576,222);
INSERT INTO LOCALIDADES VALUES(193,'LAGUNA DE DUERO',19258,222);
INSERT INTO LOCALIDADES VALUES(194,'MEDINA DEL CAMPO',20102,222);
INSERT INTO LOCALIDADES VALUES(195,'TORDESILLAS',8067,222);

INSERT INTO LOCALIDADES VALUES(196,'ZAMORA',65000,223);
INSERT INTO LOCALIDADES VALUES(197,'COOMONTE',364,223);
INSERT INTO LOCALIDADES VALUES(198,'FUENTESAUCO',20000,223);

INSERT INTO LOCALIDADES VALUES(199,'ALBACETE',152155,224);
INSERT INTO LOCALIDADES VALUES(200,'ALMANSA',24210,224);
INSERT INTO LOCALIDADES VALUES(201,'HELLIN',28123,224);
INSERT INTO LOCALIDADES VALUES(202,'LA RODA',14107,224);
INSERT INTO LOCALIDADES VALUES(203,'VILLARROBLEDO',23416,224);

INSERT INTO LOCALIDADES VALUES(204,'CIUDAD REAL',63251,225);
INSERT INTO LOCALIDADES VALUES(205,'ALCAZAR DE SAN JUAN',26652,225);
INSERT INTO LOCALIDADES VALUES(206,'SOCUEYAMOS',12000,225);
INSERT INTO LOCALIDADES VALUES(207,'PUERTOLLANO',50528,225);

INSERT INTO LOCALIDADES VALUES(208,'CUENCA',46859,226);
INSERT INTO LOCALIDADES VALUES(209,'BELMONTE',2327,226);
INSERT INTO LOCALIDADES VALUES(210,'INIESTA',4207,226);
INSERT INTO LOCALIDADES VALUES(211,'MOTA DEL CUERVO',5693,226);
INSERT INTO LOCALIDADES VALUES(212,'MOTILLA DEL PALANCAR',5244,226);
INSERT INTO LOCALIDADES VALUES(213,'LAS PEDRO�ERAS',6860,226);
INSERT INTO LOCALIDADES VALUES(214,'TARANCON',11930,226);

INSERT INTO LOCALIDADES VALUES(215,'GUADALAJARA',69098,227);
INSERT INTO LOCALIDADES VALUES(216,'AZUQUECA DE HENARES',21185,227);
INSERT INTO LOCALIDADES VALUES(217,'MARCHAMALO',4337,227);
INSERT INTO LOCALIDADES VALUES(218,'MOLINA DE ARAGON',3280,227);
INSERT INTO LOCALIDADES VALUES(219,'SIG�ENZA',4725,227);
INSERT INTO LOCALIDADES VALUES(220,'ATIENZA',441,227);
INSERT INTO LOCALIDADES VALUES(221,'ROMANILLOS DE ATIENZA',50,227);

INSERT INTO LOCALIDADES VALUES(222,'TOLEDO',73485,228);
INSERT INTO LOCALIDADES VALUES(223,'TALAVERA DE LA REINA',79916,228);
INSERT INTO LOCALIDADES VALUES(224,'TORRIJOS',10500,228);
INSERT INTO LOCALIDADES VALUES(225,'VILLACA�AS',9961,228);

INSERT INTO LOCALIDADES VALUES(226,'MADRID',3016788,229);
INSERT INTO LOCALIDADES VALUES(227,'ALCALA DE HENARES',205000,229);
INSERT INTO LOCALIDADES VALUES(228,'ALCOBENDAS',104026,229);
INSERT INTO LOCALIDADES VALUES(229,'ALCORCON',149594,229);
INSERT INTO LOCALIDADES VALUES(230,'ARANJUEZ',40928,229);
INSERT INTO LOCALIDADES VALUES(231,'ARGANDA DEL REY',33945,229);
INSERT INTO LOCALIDADES VALUES(232,'BOADILLA DEL MONTE',27145,229);
INSERT INTO LOCALIDADES VALUES(233,'COLLADO VILLALVA',48885,229);
INSERT INTO LOCALIDADES VALUES(234,'COSLADA',79862,229);
INSERT INTO LOCALIDADES VALUES(235,'FUENLABRADA',179735,229);
INSERT INTO LOCALIDADES VALUES(236,'GETAFE',153868,229);
INSERT INTO LOCALIDADES VALUES(237,'LEGANES',174436,229);
INSERT INTO LOCALIDADES VALUES(238,'MAJADAHONDA',52864,229);
INSERT INTO LOCALIDADES VALUES(239,'MOSTOLES',198819,229);
INSERT INTO LOCALIDADES VALUES(240,'PARLA',80545,229);
INSERT INTO LOCALIDADES VALUES(241,'PINTO',35199,229);
INSERT INTO LOCALIDADES VALUES(242,'POZUELO DE ALARCON',71246,229);
INSERT INTO LOCALIDADES VALUES(243,'RIVAS-VACIAMADRID',35660,229);
INSERT INTO LOCALIDADES VALUES(244,'LAS ROZAS',62527,229);
INSERT INTO LOCALIDADES VALUES(245,'SAN FERNANDO DE HENARES',36658,229);
INSERT INTO LOCALIDADES VALUES(246,'SAN SEBASTIAN DE LOS REYES',60323,229);
INSERT INTO LOCALIDADES VALUES(247,'TORREJON DE ARDOZ',101056,229);
INSERT INTO LOCALIDADES VALUES(248,'TRES CANTOS',37688,229);
INSERT INTO LOCALIDADES VALUES(249,'VALDEMORO',34163,229);
INSERT INTO LOCALIDADES VALUES(250,'VILLAVICIOSA DE ODON',21461,229);

INSERT INTO LOCALIDADES VALUES(251,'ALICANTE',316178,230);
INSERT INTO LOCALIDADES VALUES(252,'ELCHE',207163,230);
INSERT INTO LOCALIDADES VALUES(253,'TORREVIEJA',81080,230);
INSERT INTO LOCALIDADES VALUES(254,'ORIHUELA',67731,230);
INSERT INTO LOCALIDADES VALUES(255,'BENIDORM',64267,230);

INSERT INTO LOCALIDADES VALUES(256,'CASTELLON DE LA PLANA',153225,231);
INSERT INTO LOCALIDADES VALUES(257,'BENICARLO',21488,231);
INSERT INTO LOCALIDADES VALUES(258,'BURRIANA',27794,231);
INSERT INTO LOCALIDADES VALUES(259,'ONDA',20326,231);
INSERT INTO LOCALIDADES VALUES(260,'PE�ISCOLA',5245,231);
INSERT INTO LOCALIDADES VALUES(261,'VILLARREAL',43595,231);
INSERT INTO LOCALIDADES VALUES(262,'VINAROZ',23807,231);
INSERT INTO LOCALIDADES VALUES(263,'VAL DE UXO',29871,231);

INSERT INTO LOCALIDADES VALUES(264,'VALENCIA',785732,232);
INSERT INTO LOCALIDADES VALUES(265,'ALZIRA',41920,232);
INSERT INTO LOCALIDADES VALUES(266,'BURJASSOT',37330,232);
INSERT INTO LOCALIDADES VALUES(267,'CATARROJA',22904,232);
INSERT INTO LOCALIDADES VALUES(268,'CULLERA',22544,232);
INSERT INTO LOCALIDADES VALUES(269,'GANDIA',62344,232);
INSERT INTO LOCALIDADES VALUES(270,'MANISES',28040,232);
INSERT INTO LOCALIDADES VALUES(271,'MISLATA',42689,232);
INSERT INTO LOCALIDADES VALUES(272,'ONTINYENT',35155,232);
INSERT INTO LOCALIDADES VALUES(273,'PATERNA',51162,232);
INSERT INTO LOCALIDADES VALUES(274,'SAGUNTO',60488,232);
INSERT INTO LOCALIDADES VALUES(275,'TORRENT',71314,232);
INSERT INTO LOCALIDADES VALUES(276,'XATIVA',27679,232);

INSERT INTO LOCALIDADES VALUES(277,'MERIDA',52200,233);
INSERT INTO LOCALIDADES VALUES(278,'BADAJOZ',139135,233);
INSERT INTO LOCALIDADES VALUES(279,'VILLAFRANCA DE LOS BARROS',12568,233);
INSERT INTO LOCALIDADES VALUES(280,'VILLANUEVA DE LA SERENA',24191,233);
INSERT INTO LOCALIDADES VALUES(281,'DON BENITO',32023,233);

INSERT INTO LOCALIDADES VALUES(282,'CACERES',84439,234);
INSERT INTO LOCALIDADES VALUES(283,'CORIA',12781,234);
INSERT INTO LOCALIDADES VALUES(284,'NAVALMORAL DE LA MATA',15233,234);
INSERT INTO LOCALIDADES VALUES(285,'PLASENCIA',38495,234);

INSERT INTO LOCALIDADES VALUES(286,'A CORU�A',246500,235);
INSERT INTO LOCALIDADES VALUES(287,'ARTEIXO',23560,235);
INSERT INTO LOCALIDADES VALUES(288,'CARBALLO',28527,235);
INSERT INTO LOCALIDADES VALUES(289,'FERROL',79520,235);
INSERT INTO LOCALIDADES VALUES(290,'OLEIROS',27453,235);
INSERT INTO LOCALIDADES VALUES(291,'SANTIAGO DE COMPOSTELA',93273,235);
INSERT INTO LOCALIDADES VALUES(292,'RIBEIRA',26343,235);
INSERT INTO LOCALIDADES VALUES(294,'NARON',29263,235);

INSERT INTO LOCALIDADES VALUES(295,'LUGO',89509,236);
INSERT INTO LOCALIDADES VALUES(296,'MONFORTE DE LEMOS',19817,236);
INSERT INTO LOCALIDADES VALUES(297,'SARRIA',13053,236);
INSERT INTO LOCALIDADES VALUES(298,'VILALBA',15520,236);

INSERT INTO LOCALIDADES VALUES(299,'OURENSE',109011,237);
INSERT INTO LOCALIDADES VALUES(300,'O BARCO DE VALDEORRAS',13295,237);
INSERT INTO LOCALIDADES VALUES(301,'CARBALLINO',12733,237);
INSERT INTO LOCALIDADES VALUES(302,'VERIN',13475,237);

INSERT INTO LOCALIDADES VALUES(303,'PONTEVEDRA',76798,238);
INSERT INTO LOCALIDADES VALUES(304,'VIGO',292059 ,238);
INSERT INTO LOCALIDADES VALUES(305,'REDONDELA',29045,238);
INSERT INTO LOCALIDADES VALUES(306,'VILAGARCIA DE AROUSA',33907,238);

INSERT INTO LOCALIDADES VALUES(307,'PALMA DE MALLORCA',358462,239);
INSERT INTO LOCALIDADES VALUES(308,'CALVIA',40979,239);
INSERT INTO LOCALIDADES VALUES(309,'CIUTADELLA DE MENORCA',24741,239);
INSERT INTO LOCALIDADES VALUES(310,'IBIZA',37408,239);
INSERT INTO LOCALIDADES VALUES(311,'FORMENTERA',7461,239);
INSERT INTO LOCALIDADES VALUES(312,'MAHON',25187,239);
INSERT INTO LOCALIDADES VALUES(313,'MANACOR',33326,239);
INSERT INTO LOCALIDADES VALUES(314,'SANTA EULALIA DEL RIO',25080,239);
INSERT INTO LOCALIDADES VALUES(315,'EL MERCADAL',3532,239);

INSERT INTO LOCALIDADES VALUES(316,'PAMPLONA',189364,240);
INSERT INTO LOCALIDADES VALUES(317,'ESTELLA',13150,240);
INSERT INTO LOCALIDADES VALUES(318,'BURLADA',17647,240);
INSERT INTO LOCALIDADES VALUES(319,'BARA�AIN',22017,240);
INSERT INTO LOCALIDADES VALUES(320,'TUDELA',30355,240);

INSERT INTO LOCALIDADES VALUES(321,'VITORIA',222329,241);
INSERT INTO LOCALIDADES VALUES(322,'CAMPEZO',999,241);

INSERT INTO LOCALIDADES VALUES(323,'SAN SEBASTIAN',181700,242);
INSERT INTO LOCALIDADES VALUES(324,'RENTERIA',39558 ,242);
INSERT INTO LOCALIDADES VALUES(325,'BERGARA',17000,242);

INSERT INTO LOCALIDADES VALUES(326,'BILBAO',353567,243);
INSERT INTO LOCALIDADES VALUES(327,'GUERNICA',15571,243);
INSERT INTO LOCALIDADES VALUES(328,'BARACALDO',96000,243);
INSERT INTO LOCALIDADES VALUES(329,'BASAURI',47376,243);
INSERT INTO LOCALIDADES VALUES(330,'EA',796,243);
INSERT INTO LOCALIDADES VALUES(331,'PORTUGALETE',51066,243);

INSERT INTO LOCALIDADES VALUES(332,'LOGRO�O',136841,244);
INSERT INTO LOCALIDADES VALUES(333,'CALAHORRA',20598,244);
INSERT INTO LOCALIDADES VALUES(334,'SANTO DOMINGO DE LA CALZADA',5772,244);
INSERT INTO LOCALIDADES VALUES(335,'HARO',9558,244);
INSERT INTO LOCALIDADES VALUES(336,'ARNEDO',13460,244);
INSERT INTO LOCALIDADES VALUES(337,'ALFARO',9330,244);

INSERT INTO LOCALIDADES VALUES(338,'MURCIA',391146,245);
INSERT INTO LOCALIDADES VALUES(339,'CARTAGENA',199434,245);
INSERT INTO LOCALIDADES VALUES(340,'LORCA',51000,245);

INSERT INTO LOCALIDADES VALUES(341,'CEUTA',74093,246);

INSERT INTO LOCALIDADES VALUES(342,'MELILLA',68789,247);

INSERT INTO LOCALIDADES VALUES(343,'BARCELONA',1527190,248);
INSERT INTO LOCALIDADES VALUES(344,'BADALONA',210370,248);
INSERT INTO LOCALIDADES VALUES(345,'CASTELLDEFELS',48982,248);
INSERT INTO LOCALIDADES VALUES(346,'CERDA�OLA DEL VALLES',54404,248);
INSERT INTO LOCALIDADES VALUES(347,'CORNELLA DE LLOBREGAT',81881,248);
INSERT INTO LOCALIDADES VALUES(348,'ESPLUGAS DE LLOBREGAT',45988,248);
INSERT INTO LOCALIDADES VALUES(349,'GAVA',41162,248);
INSERT INTO LOCALIDADES VALUES(350,'GRANOLLERS',54634,248);
INSERT INTO LOCALIDADES VALUES(351,'HOSPITALET DE LLOBREGAT',244323,248);
INSERT INTO LOCALIDADES VALUES(352,'IGUALADA',33382,248);
INSERT INTO LOCALIDADES VALUES(353,'MANRESA',65440,248);
INSERT INTO LOCALIDADES VALUES(354,'MATARO',109298,248);
INSERT INTO LOCALIDADES VALUES(355,'MOLLET DEL VALLES',48727,248);
INSERT INTO LOCALIDADES VALUES(356,'EL PRAT DE LLOBREGAT',63421,248);
INSERT INTO LOCALIDADES VALUES(357,'SABADELL',187201,248);
INSERT INTO LOCALIDADES VALUES(358,'SANT BOI DE LLOBREGAT',80041,248);
INSERT INTO LOCALIDADES VALUES(359,'SANT CUGAT DEL VALLES',59837,248);
INSERT INTO LOCALIDADES VALUES(360,'SANT FELIU DE LLOBREGAT',40695,248);
INSERT INTO LOCALIDADES VALUES(361,'SANTA COLOMA DE GRAMENET',115568,248);
INSERT INTO LOCALIDADES VALUES(362,'TARRASA',179300,248);
INSERT INTO LOCALIDADES VALUES(363,'VILADECANS',58213,248);
INSERT INTO LOCALIDADES VALUES(364,'VILAFRANCA DEL PENEDES',31939,248);
INSERT INTO LOCALIDADES VALUES(365,'VILANOVA I LA GELTRU',55063,248);
INSERT INTO LOCALIDADES VALUES(366,'RUBI',62638,248);

INSERT INTO LOCALIDADES VALUES(367,'TARRAGONA',117184,249);
INSERT INTO LOCALIDADES VALUES(368,'AMPOSTA',17372,249);
INSERT INTO LOCALIDADES VALUES(369,'CAMBRILLS',22215,249);
INSERT INTO LOCALIDADES VALUES(370,'DELTEBRE',10541,249);
INSERT INTO LOCALIDADES VALUES(371,'MONTBLANC',6243,249);
INSERT INTO LOCALIDADES VALUES(372,'REUS',91616,249);
INSERT INTO LOCALIDADES VALUES(373,'SALOU',15360,249);
INSERT INTO LOCALIDADES VALUES(374,'TORTOSA',30431,249);
INSERT INTO LOCALIDADES VALUES(375,'EL VENDRELL',24997,249);
INSERT INTO LOCALIDADES VALUES(376,'VALLS',21048,249);

INSERT INTO LOCALIDADES VALUES(377,'LERIDA',115000,250);
INSERT INTO LOCALIDADES VALUES(378,'BALAGUER',13718,250);
INSERT INTO LOCALIDADES VALUES(379,'CERVERA',8123,250);
INSERT INTO LOCALIDADES VALUES(380,'MOLLERUSSA',10184,250);
INSERT INTO LOCALIDADES VALUES(381,'TARREGA',13210,250);

INSERT INTO LOCALIDADES VALUES(382,'GERONA',77475,251);
INSERT INTO LOCALIDADES VALUES(383,'FIGUERAS',35174,251);
INSERT INTO LOCALIDADES VALUES(384,'LLORET DE MAR',23424,251);
INSERT INTO LOCALIDADES VALUES(385,'OLOT',28890,251);
INSERT INTO LOCALIDADES VALUES(386,'SALT',23214,251);
INSERT INTO LOCALIDADES VALUES(387,'BLANES',32926,251);

alter table comunidades add constraint fk_cap foreign key(cod_capital) references localidades(cod_localidad);
alter table provincias add constraint fk_com foreign key(cod_comunidad) references comunidades(cod_comunidad);
alter table provincias add constraint fk_cap_pro foreign key(cod_capital) references localidades(cod_localidad);
alter table localidades add constraint fk_pro foreign key(cod_provincia) references provincias(cod_provincia);

1.
SELECT PROVINCIAS.NOMBRE, MAX(POBLACION) FROM LOCALIDADES, PROVINCIAS WHERE PROVINCIAS.COD_PROVINCIA=LOCALIDADES.COD_PROVINCIA AND PROVINCIAS.NOMBRE='PALENCIA' GROUP BY PROVINCIAS.NOMBRE;
2.
SELECT LOCALIDADES.NOMBRE, LOCALIDADES.POBLACION FROM LOCALIDADES WHERE POBLACION=(SELECT MAX(POBLACION) FROM LOCALIDADES, PROVINCIAS, COMUNIDADES WHERE LOCALIDADES.COD_PROVINCIA=PROVINCIAS.COD_PROVINCIA AND PROVINCIAS.COD_COMUNIDAD=COMUNIDADES.COD_COMUNIDAD AND COMUNIDADES.NOMBRE LIKE 'ANDALUCIA');
3.
SELECT LOCALIDADES.NOMBRE FROM LOCALIDADES WHERE  LOCALIDADES.POBLACION>(SELECT MAX(POBLACION) FROM LOCALIDADES, PROVINCIAS WHERE LOCALIDADES.COD_PROVINCIA=PROVINCIAS.COD_PROVINCIA AND PROVINCIAS.NOMBRE='SORIA') ORDER BY LOCALIDADES.NOMBRE;
4.
SELECT LOCALIDADES.NOMBRE, POBLACION FROM LOCALIDADES WHERE POBLACION>(SELECT SUM(POBLACION) FROM LOCALIDADES, PROVINCIAS WHERE LOCALIDADES.COD_PROVINCIA=PROVINCIAS.COD_PROVINCIA AND PROVINCIAS.NOMBRE='SORIA') ORDER BY NOMBRE; 
5.
SELECT PROVINCIAS.NOMBRE, SUM(POBLACION) AS "TOTAL HABITANTES" FROM PROVINCIAS, LOCALIDADES WHERE PROVINCIAS.COD_PROVINCIA=LOCALIDADES.COD_PROVINCIA GROUP BY PROVINCIAS.NOMBRE ORDER BY PROVINCIAS.NOMBRE;
6.
SELECT PROVINCIAS.NOMBRE, SUM(POBLACION) AS "TOTAL HABITANTES" FROM PROVINCIAS, LOCALIDADES WHERE PROVINCIAS.COD_PROVINCIA=LOCALIDADES.COD_PROVINCIA GROUP BY PROVINCIAS.NOMBRE ORDER BY SUM(POBLACION);
7.
SELECT COMUNIDADES.NOMBRE, SUM(POBLACION) AS "TOTAL HABITANTES" FROM COMUNIDADES, LOCALIDADES, PROVINCIAS WHERE COMUNIDADES.COD_COMUNIDAD=PROVINCIAS.COD_COMUNIDAD AND PROVINCIAS.COD_PROVINCIA=LOCALIDADES.COD_PROVINCIA GROUP BY COMUNIDADES.NOMBRE ORDER BY COMUNIDADES.NOMBRE;
8.
SELECT COMUNIDADES.NOMBRE, POBLACION FROM COMUNIDADES, LOCALIDADES, PROVINCIAS WHERE COMUNIDADES.COD_COMUNIDAD=PROVINCIAS.COD_COMUNIDAD AND PROVINCIAS.COD_PROVINCIA=LOCALIDADES.COD_PROVINCIA AND POBLACION=(SELECT MAX(POBLACION) FROM LOCALIDADES);
9.
SELECT SUM(POBLACION) AS "HAB NO SEVILLA" FROM LOCALIDADES WHERE COD_PROVINCIA IN (SELECT COD_PROVINCIA FROM PROVINCIAS WHERE NOMBRE NOT LIKE 'SEVILLA'); 
10.
