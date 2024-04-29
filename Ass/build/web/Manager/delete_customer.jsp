<%-- 
    Document   : delete_customer
    Created on : Apr 24, 2024, 8:16:18 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="entity.Customer"%>
<%@page import="entity.Service_Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Delete Customer</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        
        <%
            Customer customer = (Customer) session.getAttribute("customer");
            if (customer != null) {
        %>
        <div class="container">
        <form action="/Ass/delete_customer" method="post"onsubmit="return window.confirm('Are you sure you want to delete this customer?')">
             <h1>Delete Customer</h1>
           <p>
                    <label>Username</label>
                    <input type="text" name="username" placeholder="John" value="<%=customer.getUsername()%>" readonly/>

                </p>

                <p> 
                    <label>Email</label>
                    <input type="text" name="email" placeholder="abc@gmail.com" value="<%=customer.getCustEmail()%>" readonly/>

                </p> 

                <p> 
                    <label>Password</label>
                    <input type="password" name="pass"  value="<%=customer.getCustPass()%>" readonly/>

                </p>

                <p>     
                    <label>Contact.No</label>
                    <input type="text" name="phone" placeholder="0123456789" value="<%=customer.getCustPhone()%>" readonly/>

                </p>

                <p>
                    <label>Address</label>
                     <input type="text" name="address" value="<%=customer.getCustAddress()%>" readonly/>
                </p>
            
            <input type="submit" value="Delete Customer">
         
               <%} else {%>
       Customer ${customer.username} not found
        
        <%}%>
        </form> 
             <a href="/Ass/Manager/view_customer.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>