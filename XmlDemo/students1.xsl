<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" />
	
	<xsl:template match="/">
		<xsl:apply-templates select="students/student" />
		<br/>
		<div>
			Average marks : <xsl:value-of select="format-number(sum(/students/student/marks) div count(/students/student/name), '#,##0.000')"/><br/>
			<!-- Max marks : <xsl:value-of select="max(/students/student/marks)"/> -->
		</div>
	</xsl:template>

	<xsl:template match="student">
		Node Position: <xsl:value-of select="position()"/>
		of  <xsl:value-of select="last()"/>
		<xsl:apply-templates select="name" />
	</xsl:template>

	<xsl:template match="name">
		<div style="float:left">
			<img>
				<xsl:attribute name="src">
				<xsl:value-of select="../photo/@src" />
				</xsl:attribute>
			</img>
		</div>
		<br />
		<span style="color:black; fontStyle:14pt ">
			<xsl:value-of
				select="translate(..,
			'abcdefghijklmnopqrstuvwxyz',
			'ABCDEFGHIJKLMNOPQRSTUVWXYZ')" />
			<br/>
			<xsl:value-of select="../name" />
			is taught by
			<ul>
				<xsl:for-each select="../teachers/teacher">
					<li>
						<xsl:value-of select="name" />
						<xsl:text> : </xsl:text>
						<xsl:value-of select="subject" />
					</li>
				</xsl:for-each>
			</ul>
		</span>
		<br />
		</xsl:template>
	
</xsl:stylesheet>