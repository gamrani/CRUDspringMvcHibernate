<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Save Costumer</title>
<style>
body {
    background-color: lightblue;
}
#header{
    background-color:#ffe6e6;
}
#c,#container{
background-color:lightblue;
}
</style>
</head>
<body>
<div id="wrapper">
     <div id="header">
       <h2>--------------| CRM - Customer Reltionship Manager |------------ </h2>
       <input type="button" value="Add Customer" 
               onclick="window.location.href='showFormForAdd';return false;"
                class="add-button"/>
     </div>
  </div>

<div id="container">
  <h3> Save Customer</h3>
  <form:form id="c" action="saveCustomer" 
  modelAttribute="customer" method="POST">
  
  <form:hidden path="id"/>
  
    <table>
    <tbody>
       <tr>
         <td><label>First name:</label></td>
         <td><form:input path="firstName"/></td>
       </tr>
       <tr>
         <td><label>Last name:</label></td>
         <td><form:input path="lastName"/></td>
       </tr>
       <tr>
         <td><label>Email:</label></td>
         <td><form:input path="email"/></td>
       </tr>
       <tr>
          <td><input type="submit" value="Save"/></td> 
       </tr>
    </tbody>
    </table>
  
  </form:form>
  
  <p><a href="${pageContext.request.contextPath}/customer/list ">Back to list </a></p>

</div>

</body>
</html>