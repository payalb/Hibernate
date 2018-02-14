<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>Students</title>
			</head>
			<body>
				Version :
				<xsl:value-of select="system-property('xsl:version')" />
				<br />
				Vendor :
				<xsl:value-of select="system-property('xsl:vendor')" />
				<br />
				Vendor URL:
				<xsl:value-of select="system-property('xsl:vendor-url')" />
				<br />
				<xsl:for-each select="students/student">
					<a href="#{generate-id(name)}">
						<xsl:value-of select="name" />
					</a>
					<br />
				</xsl:for-each>

				<xsl:for-each select="students/student">
					<xsl:sort order="ascending" data-type="text" select="name" />
					<h3>
						<a name="#{generate-id(name)}">
							<xsl:value-of select="name" />
						</a>
					</h3>
					<img>
						<xsl:attribute name="src">
							<xsl:value-of select="photo/@src" />
						</xsl:attribute>
					</img>
					<br />

					<xsl:value-of select="current()" />
					<br />
					<p>
						Student :
						<xsl:value-of select="name" />
						, her age is
						<xsl:value-of select="age" />
						and is enrolled in
						<xsl:value-of select="course" />

					</p>
					<br />
				</xsl:for-each>

				<table border="2">
					<tr>
						<th>Name</th>
						<th>Course</th>
						<th>Age</th>
					</tr>
					<xsl:for-each select="students/student">
						<tr>
							<td>
								<xsl:value-of select="name" />
							</td>
							<td>
								<xsl:value-of select="course" />
							</td>
							<td>
								<xsl:value-of select="age" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
				<xsl:for-each select="students/student">
					<xsl:if test="marks &gt; 60">
						<p>
							<h1>Out of the above records, those who cleared
								the exam are:</h1>
							<h3>
								<xsl:value-of select="name" />
							</h3>
						</p>

					</xsl:if>
				</xsl:for-each>
				
				<h1>Individual Marks are as follows:</h1>
				<xsl:for-each select="students/student">
					<table>
						<xsl:choose>
							<xsl:when test="marks &gt; 60 ">
								<tr style="color:blue">
									<td>
										<xsl:value-of select="name">

										</xsl:value-of>
									</td>
									<td>
										<xsl:value-of select="marks" />
									</td>
								</tr>

							</xsl:when>
							<xsl:when test="marks = 60 ">
								<tr style="color:green">
									<td>
										<xsl:value-of select="name">

										</xsl:value-of>
									</td>
									<td>
										<xsl:value-of select="marks" />
									</td>
								</tr>

							</xsl:when>
							
							<xsl:otherwise>
								<tr style="color:red">
									<td>
										<xsl:value-of select="name">

										</xsl:value-of>
									</td>
									<td>
										<xsl:value-of select="marks" />
									</td>
								</tr>

							</xsl:otherwise>
						</xsl:choose>
					</table>
				</xsl:for-each>


			</body>
		</html>

	</xsl:template>
</xsl:stylesheet>