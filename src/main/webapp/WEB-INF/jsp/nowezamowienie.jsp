<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="zamowienia.page.dodaj"/></title>
</head>
<body>
<%@include file="/WEB-INF/incl/adminmenu.incl" %>
<p>
<sf:form id="zamowieniaForm" action="/addzam" modelAttribute="zamowienia"
		enctype="multipart/form-data" method="POST">
		
		<table width="500" border="0" cellpadding="4" cellspacing="1"
			align="center">
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.emailUser"/>
				</td>
				<td width="270" align="left">
		
					<sf:input path="emailUser" size="28" id="emailUser" readonly="true" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="emailUser" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.idZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="idZamowienia" size="28" id="idZamowienia" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="idZamowienia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.dataZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="dataZamowienia" size="28" id="dataZamowienia" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="dataZamowienia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.nazwaZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="nazwaZamowienia" size="28" id="nazwaZamowienia" type="text"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="nazwaZamowienia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.iloscZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="iloscZamowienia" size="28" id="iloscZamowienia" type="number"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="iloscZamowienia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.powodZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="powodZamowienia" size="28" id="powodZamowienia" type="text"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="powodZamowienia" cssClass="error"/></td>
			</tr>
			
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.dataPrzyjecia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="dataPrzyjecia" size="28" id="dataPrzyjecia" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="dataPrzyjecia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.status"/>
				</td>
				<td width="270" align="left">
					<sf:input path="status" size="28" id="status" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="status" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center" bgcolor="#fff">
					<input type="submit" value="<s:message code="button.save"/>" 
						class="formButton"/>&nbsp;&nbsp;
					<input type="button" value="<s:message code="button.cancel"/>" 
						class="formButton" 
						onclick="window.location.href='${pageContext.request.contextPath}/zamowienia'"/>
						
				</td>
			</tr>
			
			
		</table>
		
</sf:form>
</body>
</html>