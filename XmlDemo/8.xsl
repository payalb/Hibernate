<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/SimpleTag">
	
	<html>
	<head><title>XSLT Example</title></head>
	<body>
	<h1><xsl:value-of select="text()"/></h1>
	
	</body>
	</html>
	</xsl:template>
	
</xsl:stylesheet>