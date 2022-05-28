<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : Ejercicio1.xsl
    Created on : 27 de mayo de 2022, 11:54
    Author     : Admin
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" href="Viviendas.css"/>
                <title>Ejercicio2.xsl</title>
            </head>
            <body>
                <div class="header">
                    <h1>Portal:
                        <xsl:value-of select="viviendas/portal/@numero"/>
                    </h1>
                </div>
                <div class="vivienda">
                    <xsl:for-each select="viviendas/portal/vivienda">
                        <div class="piso">
                            <xsl:value-of select="concat(@piso,' ', @letra)"/>
                        </div>
                        <div class="persona">
                            <xsl:for-each select="persona">
                                <div class="datos">
                                <p>
                                    <xsl:value-of select="concat(nombre,' ', apellido[1],' ',apellido[2])"/>
                                </p>
                                <p class="dni">DNI: 
                                    <span>
                                    <xsl:value-of select="dni"/>
                                    </span>
                                </p>
                                </div>
                                <img>
                                    <xsl:attribute name="src">
                                        <xsl:value-of select="foto"/>
                                    </xsl:attribute>
                                </img>
                            </xsl:for-each>
                            <div class="menores">
                            <xsl:for-each select="menor">
                                <p>
                                    <xsl:value-of select="concat(nombre,' ',apellido[1],' ',apellido[2],' ', edad,' años')"/>
                                </p>
                            </xsl:for-each>
                            </div>
                        </div>
                    </xsl:for-each>
                </div>
                <br></br>
                <footer class="footer">
                    <h2>
                        David Espinosa González. 1DAW
                    </h2>
                </footer>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
