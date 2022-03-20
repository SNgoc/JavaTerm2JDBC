<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : Session6.xsl
    Created on : January 11, 2021, 8:45 AM
    Author     : asus
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="Employee">
        <html>
            <head>
                <title>Session6_3.xsl</title>
            </head>
            <body>
                <h1>Employee Info</h1>
                <table border = "1">
                    <tr>
                        <th>Name</th>
                        <th>Doj</th>
                        <th>Address</th>
                        <th>Phone</th>
                    </tr>
                    <xsl:for-each select="Designer">
                        <tr>
                            <td style = "font-size:22px; color:red"><xsl:value-of select="Name"/></td>
                            <td style = "color:orange;"><xsl:value-of select="Doj"/></td>
                            <td style = "color:brown;"><xsl:value-of select="Address"/></td>
                            <td style = "color:blue;"><xsl:value-of select="Phone"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
