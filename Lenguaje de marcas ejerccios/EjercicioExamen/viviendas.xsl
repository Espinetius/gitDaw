<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : viviendas.xsl
    Created on : 25 de mayo de 2022, 11:11
    Author     : Admin
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" href="viviendas.css"/>
                <title>viviendas.xsl</title>
            </head>
            <body>
                <header>
                    <h1>EJERCICIO EXAMEN LEGUAJE DE MARCAS</h1>
                </header>
                <div>
                    <xsl:for-each select="viviendas/portal">
                        <h2>Portal: 
                            <span>
                                <xsl:value-of select="@numero"/>
                            </span>
                        </h2>
                        <xsl:for-each select="vivienda">
                            <div class="targeta_piso">
                                <div>
                                    <xsl:for-each select="persona">
                                        <div class="targeta_izq">
                                            <div class="nombre_apellido">
                                                <xsl:value-of select="nombre"/>
                                                <xsl:value-of select="apellido[1]"/>
                                                <xsl:value-of select="apellido[2]"/>
                                            </div>
                                            <p class="cni">DNI:
                                                <span>
                                                    <xsl:value-of select="dni"/>
                                                </span>
                                            </p>
                                        </div>
                                    </xsl:for-each>
                                </div>
                                <div class="targeta_dcha">
                                    <p>Piso: 
                                        <span>
                                            <xsl:value-of select="@piso"/>
                                        </span>
                                        <span>
                                            <xsl:value-of select="@letra"/>
                                        </span>
                                    </p>
                                    <img>
                                        <xsl:attribute name="src">
                                            <xsl:value-of select="persona/foto"/>
                                        </xsl:attribute>
                                    </img>
                                </div>
                            </div>
                        </xsl:for-each>
                    </xsl:for-each>
                </div>
                <footer>
                    <h2>DAVID ESPINOSA 1 DAW</h2>
                </footer>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
