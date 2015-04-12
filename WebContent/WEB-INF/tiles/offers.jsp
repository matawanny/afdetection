<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table class="offers">
<tr>
<td>Company Name</td>
<td>Website URL</td>
<td>Campaign</td>
<td>Total Click</td>
<td>Fraud Click</td>
<td>US Click</td>
</tr>

<c:forEach var="offer" items="${offers}">
<tr>

<td><c:out value="${offer.company_name}"></c:out></td>

<td><c:out value="${offer.website_url}"></c:out></td>

<td><c:out value="${offer.campaign}"></c:out></td>

<td><c:out value="${offer.total_click}"></c:out></td>

<td><c:out value="${offer.fraud_click}"></c:out></td>

<td><c:out value="${offer.us_click}"></c:out></td>
   
</tr>
</c:forEach>
</table>
