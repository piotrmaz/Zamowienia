<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="zamowienia.page.title" /></title>
</head>
<body>
	<%@include file="/WEB-INF/incl/menu.incl"%>
	  
	<table width="100%" border="0">
		<tr>			
			<td width="200" align="left" valign="middle" >
				<form action="${pageContext.request.contextPath}/searchZamowienia" method="POST">
	<fieldset>
    <legend>Wyszukiwanie</legend>
 <table>
 <tr>
 	 <td><label><input type="text" name="nazwaZamowienia" placeholder="Nazwa zamówienia"/></label></td>
    
      <td><label><input type="text" name="idZamowienia" placeholder="ID zamówienia" /></label></td>
    
      <td><label><input type="text" name="emailUser" placeholder="email"/></label></td>
       
      <td><label><input type="text" name="dataZamowienia" placeholder="Data zamówienia"/></label></td>
    
      <td><td><label><input type="text" name="status" placeholder="Status" /></label></td>
   
  <td><input type="submit" value="Szukaj" onclick="window.location.href='${pageContext.request.contextPath}/searchZamowienia'"/></td>
  
  </tr>
  </table>
  </fieldset>
 
  
   <fieldset>
    <legend>Sortowanie</legend>
    <table>
    <tr>
      <td><label><a href="${pageContext.request.contextPath}/sortujZamowienia/idZamowienia/desc">Sortuj malejąco</a></label></td>
     
      <td><td><td><label><a href="${pageContext.request.contextPath}/sortujZamowienia/idZamowienia/asc">Sortuj rosnąco</a></label></td>
    
      </tr>
      </table>
  </fieldset>
  </form>
						
			</td>
			<!--  <td align="right" valign="middle"><input type="button"
				class="formButton2" onclick="window.location.href='${pageContext.request.contextPath}/nowezamowienie'"
				value="<s:message code="zamowienia.page.dodaj"/>" /> -->
				
				
				
		</tr>
	</table>
	<br/>
   
	<table width="1300" border="0" cellpadding="6" cellspacing="0" class="tableZamowienia">
	
	<tr class="tdUsersHead ">
	
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.emailUser"/></td>
		<td width="20" align="center" valign="top"><s:message code="zamowienia.page.idZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.dataZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.nazwaZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.iloscZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.powodZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.dataPrzyjecia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.status"/></td>
		<td width="340" align="center" valign="top"><s:message code="admin.users.akcje"/></td>
		
	</tr>
	<c:forEach var="z" items="${zamowieniaList}">
		<tr>
			<td class="tdUsers"><c:out value="${z.emailUser }"/></td>
			<td class="tdUsers"><c:out value="${z.idZamowienia }"/></td>			
			<td class="tdUsers"><c:out value="${z.dataZamowienia }"/></td>
			<td class="tdUsers"><c:out value="${z.nazwaZamowienia }"/></td>
			<td class="tdUsers"><c:out value="${z.iloscZamowienia }"/></td>
			<td class="tdUsers"><c:out value="${z.powodZamowienia }"/></td>
			<td class="tdUsers"><c:out value="${z.dataPrzyjecia }"/></td>
			<td class="tdUsers"><c:out value="${z.status }"/></td>
			<td class="tdUsers"><input type="image" src="/resources/images/edit1.png" border="0"
						onclick="window.location.href='${pageContext.request.contextPath}/zamowienia/edit/${u.id}'" /></td>
		</tr>
	</c:forEach>
	
	</table>
	<p align="right">
		<c:if test="${currentPage > 0 }">
			<input type="button"
				class="formButton2" 
				onclick="window.location.href='${pageContext.request.contextPath}/zamowienia/${currentPage-1}'"
				value="<s:message code="link.poprzedni"/>" />&nbsp;&nbsp;
		</c:if>
		<c:if test="${currentPage < totalPages-1 }">
			<input type="button"
				class="formButton2" 
				onclick="window.location.href='${pageContext.request.contextPath}/zamowienia/${currentPage+1}'"
				value="<s:message code="link.nastepny"/>" />
		</c:if>
	</p>
</body>
</html>