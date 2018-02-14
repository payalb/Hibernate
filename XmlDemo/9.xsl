<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/"> <!-- match the root -->
	
	<html>
	<head><title>XSLT Example</title></head>
	<body>
	<xsl:for-each select="/items/item">
	
	<xsl:sort select="@available" order="descending"/>
	<h1><xsl:value-of select="name"/></h1>
	<br/>
	
	
	<xsl:if test="@available = 'no'">
	
	<img style="color:red">
	<xsl:attribute name="alt">
	<xsl:value-of select="name"/>
	</xsl:attribute>
	</img>
	
	</xsl:if>
	<xsl:if test="@available = 'yes'">
	
	<img style="color:green">
	<xsl:attribute name="alt">
	<xsl:value-of select="name"/>
	</xsl:attribute>
	</img>
	
	</xsl:if>
	</xsl:for-each>
	
	</body>
	</html>
	</xsl:template>
	
</xsl:stylesheet>