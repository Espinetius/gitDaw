<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
   
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" href="tabacos.css"/>
                <title>Tabacos cachimbas</title>
            </head>
            <body>
                <div class="contenedor centrado">
                    <header class="header">
                        <h1>Tabacos Cachimbas</h1>
                    </header>
                    <nav class="navegacion">
                        <a href="">Home</a>
                        <a href="">Buscador</a>
                        <a href="">Quienes somos</a>
                    </nav>     
                    <div class="centroweb">
                        <div class="contenido">
                            <xsl:for-each select="tabacos/marca">
                                <div class="marca">
                                    <h3>
                                        <xsl:value-of select="@nombre" />
                                    </h3>
                                    <div class="sabores">
                                    <xsl:for-each select="sabor">
                                        <table>
                                            <tr>
                                                <td>
                                                    <p><xsl:value-of select="@nombre"/></p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <p> Estilo de hoja: <span><xsl:value-of select="@estilo"/></span></p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <img>
                                                        <xsl:attribute name="src">
                                                            <xsl:value-of select="foto"/>
                                                        </xsl:attribute>
                                                    </img>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <p>Descripción- <span><xsl:value-of select="descripcion"/></span></p>
                                                </td>
                                            </tr>
                                        </table>
                                    </xsl:for-each>
                                </div>
                                </div>
                            </xsl:for-each>
                        </div>
                        <asside class="asside">
                            <h2>Enlaces de interes</h2>
                            <div class="div_aside">
                                <div class="div_selects">
                                <h4>Marca</h4>
                                <select>
                                    <option>
                                        <p>Seleccione su marca</p>
                                    </option>
                                    <xsl:for-each select="tabacos/marca">
                                        <option>
                                            <xsl:value-of select="@nombre"/>
                                        </option>
                                    </xsl:for-each>
                                </select>
                                <h4>Estilo de hoja</h4>
                                <select>
                                    <option>
                                        <p>Seleccione el estilo de hoja</p>
                                    </option>
                                    <option>
                                        <p>Virginia</p>
                                    </option>
                                    <option>
                                        <p>Burley</p>
                                    </option>
                                </select>
                                </div>
                            </div>
                        </asside>    
                        
                    </div>                       
                    <footer class="footer">
                        <h3>1º DAW. Palomeras Vallecas 2021-2022</h3>
                    </footer>
                </div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
