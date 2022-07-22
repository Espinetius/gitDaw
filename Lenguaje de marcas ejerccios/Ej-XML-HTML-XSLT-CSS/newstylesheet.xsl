 <?xml version="1.0" encoding="UTF-8"?>



<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" />

        <xsl:template match="/">
            <html lang="es">
                <head>
                    <meta charset="UTF-8" />
                    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                    <link rel="stylesheet" href="css.css" />
                    <title>Viviendas</title>
                </head>
                <body>
                    <div class="main">
                        <xsl:for-each select="cartelera">
                            <div class="pelicula">
                                <h1>
                                    <xsl:value-of select="pelicula/@numero" />
                                </h1>
                            </div>
                        </xsl:for-each>
                        <xsl:for-each select="cartelera/pelicula">
                                <div class="pelicula111">
                                    <div class="pelicula222">
                                        <span>
                                            <img>
                                                <xsl:attribute name="src">
                                                    <xsl:value-of select="caratula" /><!-- MIRAR SI ESTA BIEN!!! -->
                                                </xsl:attribute>
                                            </img>
                                            
                                        </span>
                                    </div>
                                    <div class="infopelis">
                                        <p>
                                            <xsl:value-of select="concat(@anio,'-',@duracion)" />
                                            </p>
                                            <p>
                                                <xsl:text></xsl:text>
                                                <!-- MIRAR SI ESTA BIEN!!! <xsl:value-of select="genero" /> -->
                                                <xsl:value-of select="concat('Genero: ',genero)" />
                                            </p>
                                            <p>
                                                <xsl:value-of select="concat(reparto[1],' ',reparto[2])" />
                                            </p>

                                       
                                        
                                    </div>
                                </div>
                            </xsl:for-each>

                        </xsl:for-each>
                        <div class="pie">
                            <h1>Luis Bertin Barahona Cazco</h1>    
                        </div>
                    </div>
                </body>
            </html>
        </xsl:template>
    
</xsl:stylesheet>