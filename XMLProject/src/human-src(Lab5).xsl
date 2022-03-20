<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : human-src(Lab5).xsl
    Created on : January 11, 2021, 11:39 AM
    Author     : asus
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="human-src">
        <html>
            <head>
                <title>human-src(Lab5).xsl</title>
            </head>
            <body>
                <h1>Showroom</h1>
                <table border = "1">
                    <tr>
                        <th>Emp.name</th>
                        <th>Birth Year</th>
                    </tr>
                    <xsl:for-each select="employee">
                        <tr>
                            <td style = "font-size:22px; color:red"><xsl:value-of select="employee:name"/></td>
                            <td style = "color:orange;"><xsl:value-of select="BirthYear"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
