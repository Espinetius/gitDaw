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
                <title>viviendas.xsl</title>
                <link reel="shylesheet" href="viviendas.css" />
            </head>
            <body>
                <header>
                    <h1>EJERCICIO EXAMEN LEGUAJE DE MARCAS</h1>
                </header>
                <div>
                    <xsl:for-each select="viviendas/portal">
                        <p>Portal: 
                            <span>
                                <xsl:value-of select="@numero"/>
                            </span>
                        </p>
                        <xsl:for-each select="vivienda">
                            <div>
                                <p>Piso: 
                                    <span>
                                        <xsl:value-of select="@piso"/>
                                    </span>
                                    <span>
                                        <xsl:value-of select="@letra"/>
                                    </span>
                                </p>
                                <div>
                                    <xsl:for-each select="persona">
                                        <div>
                                            <p>
                                                <xsl:value-of select="nombre"/>
                                            </p>
                                            <p>
                                                <xsl:value-of select="apellido"/>
                                            </p>
                                            <p>
                                                <xsl:value-of select="dni"/>
                                            </p>
                                            <img>
                                                <xsl:attribute name="src">
                                                    <xsl:value-of select="foto"/>
                                                </xsl:attribute>
                                            </img>
                                        </div>
                                    </xsl:for-each>
                                </div>
                            </div>
                        </xsl:for-each>
                    </xsl:for-each>
                </div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
