<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
    background-color: lightblue;
}
#header{
    background-color:#ffe6e6;
}

#content tbody tr:nth-child(even) {
    background-color:#CCCCCC;
}
#content tbody tr:nth-child(odd) {
    color:#CC1100;
    background-color:#FFFFFF
}
#content tbody td {
   border-left:solid #777 1px;
   padding:5px;
}
#content tbody td:first-child {
   border-left:0px;
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
   <div id="content">
         
       <table>
         <tr>
             <th>First Name</th>
          
             <th>Last Name</th>
             <th>Email</th>
             <th>Action</th>
         </tr>
          <c:forEach var="temCustomer" items="${customers}">
          
          <!-- Construct an "update" link with customer id -->
             <c:url var="updateLink" value="/customer/showFormForUpdate">
                   <c:param name="customerId" value="${temCustomer.id}"/>
              </c:url>  
                       <!-- Construct a "delete" link with customer id -->
             
               <c:url var="deleteLink" value="/customer/delete">
                   <c:param name="customerId" value="${temCustomer.id}"/>
              </c:url>     
                      
             <tr>
             <td> ${temCustomer.firstName}</td>
          
              <td> ${temCustomer.lastName}</td>
               <td> ${temCustomer.email}</td>
               <td>  <a href="${updateLink}"> Update</a>
                     | 
                     <a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this customer ?'))) return false"> Delete</a>
               </td>
     
               </tr>
          </c:forEach>
       </table>
       
   </div>

</div>
</body>
</html>