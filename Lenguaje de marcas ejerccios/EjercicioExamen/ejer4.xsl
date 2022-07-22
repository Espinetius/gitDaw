<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" />

    <xsl:template match="/">
        <html>
            <head>
                <title>newstylesheet.xsl</title>
                <link rel="stylesheet" href="css.css" />
            </head>
            <body>
                <div class="contenido">
                    <div class="portal">
                        <h1>
                            Portal:
                            <xsl:value-of select="viviendas/portal/@numero" />
                        </h1>
                    </div>
                  
                    <xsl:for-each select="viviendas/portal/vivienda">
                    <xsl:if test="@piso='1'">
                        <div class="personas">
                            <div class="piso">
                                <p>
                                    Piso:
                                    <xsl:value-of select="@piso" />
                                    Letra:
                                    <xsl:value-of select="@letra" />
                                </p>
                            </div>
                            <xsl:for-each select="persona">
                                <table>
                                    <tr>
                                        <td>
                                            <h3>
                                                <span class="nombre">
                                                    <xsl:value-of select="concat(nombre,' ', apellido[1],' ',apellido[2])" />
                                                </span>
                                            </h3>
                                            <h3>
                                                <span class="dni">
                                                    <xsl:value-of select="dni" />
                                                </span>
                                            </h3>
                                        </td>
                                        <td>
                                            <img>
                                                <xsl:attribute name="src">
                                                    <xsl:value-of select="foto" />
                                                </xsl:attribute>
                                            </img>
                                        </td>
                                    </tr>
                                </table>
                            </xsl:for-each>
                            <xsl:for-each select="menor">
                                <div class="menor">
                                    <p>
                                        <xsl:value-of select="concat(nombre,' ', apellido[1],' ',apellido[2],' Edad: ',edad)" />
                                    </p>
                                </div>
                            </xsl:for-each>
                        </div>
                    </xsl:if>
                    </xsl:for-each>
                    <footer>
                        <h1>NOMBRE Y APELLIDOS DAW 1</h1>
                    </footer>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>