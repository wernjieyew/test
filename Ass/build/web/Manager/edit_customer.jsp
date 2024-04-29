<%-- 
    Document   : edit_customer
    Created on : Apr 24, 2024, 6:38:21 PM
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
        <title>manage staff</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        <%
            Customer customer = (Customer) session.getAttribute("customer");
            if (customer != null) {
        %>
        <div class="container">
        <form action="/Ass/update_customer" method="post">
            <h1> Edit Customer</h1>    
            <p>
                    <label>Username</label>
                    <input type="text" name="username" placeholder="John" value="<%=customer.getUsername()%>"/>
                     <span> <% if (request.getAttribute("usernameError") != null) { %>
                        <%= request.getAttribute("usernameError") %>
                        <% } %> 
                     </span>
                </p>
                 <%
                        String email = (String) request.getAttribute("email");
                        if (email == null) {
                            email = "";
                        }
                 %>
                <p> 
                    <label>Email</label>
                    <input type="text" name="email" placeholder="abc@gmail.com" value="<%=customer.getCustEmail()%>"/>
                    <span>   <% if (request.getAttribute("emailError") != null) { %>
                        <%= request.getAttribute("emailError") %>
                        <% } %> 
                    </span>
                </p> 
                 <%
                        String pass = (String) request.getAttribute("pass");
                        if (pass == null) {
                            pass = "";
                        }
                 %>
                <p> 
                    <label>Password</label>
                    <input type="password" name="pass"  value="<%=customer.getCustPass()%>"/>
                    <span>   <% if (request.getAttribute("passError") != null) { %>
                        <%= request.getAttribute("passError") %>
                        <% } %> 
                    </span>
                </p>
                 <%
                        String phone = (String) request.getAttribute("phone");
                        if (phone == null) {
                            phone = "";
                        }
                 %>
                <p> 
      
                    <label>Contact.No</label>
                    <input type="text" name="phone" placeholder="0123456789" value="<%=customer.getCustPhone()%>" />
                    <span>   <% if (request.getAttribute("phoneError") != null) { %>
                        <%= request.getAttribute("phoneError") %>
                        <% } %> 
                    </span>
                </p>
                 <%
                        String address = (String) request.getAttribute("address");
                        if (address == null) {
                            address = "";
                        }
                 %>
                <p><label>Address</label>
                     <input type="text" name="address" value="<%=customer.getCustAddress()%>" />
                    <span>  <% if (request.getAttribute("addressError") != null) { %>
                        <%= request.getAttribute("addressError") %>
                        <% } %> 
                    </span>
                </p>
            <input type="submit" value="Update Customer">
         
               <%} else {%>
       Customer ${customer.username} not found
        
        <%}%>
        </form> 
             <a href="/Ass/Manager/view_customer.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>
