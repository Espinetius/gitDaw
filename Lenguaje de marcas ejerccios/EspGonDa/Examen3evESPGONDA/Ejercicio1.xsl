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

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Ejercicio1.xsl</title>
            </head>
            <body>
                <div>
                    <h1>
                        <xsl:value-of select="viviendas/portal/@numero"/>
                    </h1>
                </div>
                <div>
                    <xsl:for-each select="viviendas/portal/vivienda">
                        <xsl:value-of select="concat(@piso,' ', @letra)"/>
                        <div>
                                <div>
                                    <xsl:for-each select="persona">
                                    <p>
                                       <xsl:value-of select="concat(nombre,' ', apellido[1],' ',apellido[2])"/>
                                    </p>
                                    <p>DNI: 
                                        <xsl:value-of select="dni"/>
                                    </p>
                                    <img>
                                        <xsl:attribute name="src">
                                            <xsl:value-of select="foto"/>
                                        </xsl:attribute>
                                    </img>
                                </xsl:for-each>
                                <xsl:for-each select="menor">
                                    <p>
                                        <xsl:value-of select="concat(nombre,' ',apellido[1],' ',apellido[2],' ', edad,'años')"/>
                                    </p>
                                </xsl:for-each>
                            </div>
                        </div>
                    </xsl:for-each>
                </div>
                <footer>
                    <h2>
                        David Espinosa González. 1DAW
                    </h2>
                </footer>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
