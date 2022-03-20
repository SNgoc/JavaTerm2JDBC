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
    <xsl:template match="Employee/Designer">
        <html>
            <head>
                <title>Session6.xsl</title>
            </head>
            <body>
                <xsl:apply-templates /> <!--tự động chọn hết các trường element nếu không có select-->
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="Name">
        Name:
        <span style = "font-size:22px; color:red">
            <xsl:value-of select="."/>
        </span>
        <br/>
    </xsl:template>
    
    <xsl:template match="Doj">
        Date of John:
        <span style = "color:orange;">
            <xsl:value-of select="."/>
        </span>
        <br/>
    </xsl:template>

</xsl:stylesheet>
