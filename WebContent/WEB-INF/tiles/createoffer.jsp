<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">

<table class="formtable">
<tr><td class="label">Company Name: </td><td><sf:input class="control" path="company_name" name="company_name" type="text" /><br/><sf:errors path="company_name" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Website URL: </td><td><sf:input class="control"  path="website_url" name="website_url" type="text" /><br/><sf:errors path="website_url" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Campaign: </td><td><sf:input class="control"  path="campaign" name="campaign" type="text" /><br/><sf:errors path="campaign" cssClass="error"></sf:errors></td></tr>
<tr><td class="label"> </td><td><input class="control"  value="Create New Report" type="submit" /></td></tr>
</table>

</sf:form>
