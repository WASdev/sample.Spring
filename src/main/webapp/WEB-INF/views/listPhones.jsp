<!-- 
 COPYRIGHT LICENSE: This information contains sample code provided in source code form.
 You may copy, modify, and distribute these sample programs in any form without payment
 to IBM for the purposes of developing, using, marketing or distributing application
 programs conforming to the application programming interface for the operating platform
 for which the sample code is written.

 Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON 
 AN "AS IS" BASIS AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING,
 BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY,
 SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE, AND ANY WARRANTY OR
 CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF
 THE SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT,
 UPDATES, ENHANCEMENTS OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.

 (C) Copyright IBM Corp. 2001, 2013.
 All Rights Reserved. Licensed Materials - Property of IBM.
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Phone Book</title>
</head>
<body>
<h1>Phone Book</h1>
<table>
  <thead><th>Name</th><th>Mobile Phone</th></thead>
  <c:forEach items="${phones}" var="aPhoneEntry">
    <tr>
      <td><c:out value="${aPhoneEntry.name}" /></td>
      <td><c:out value="${aPhoneEntry.phonenumber}" /></td>
    </tr>
  </c:forEach>
</table>
</body>

</html>