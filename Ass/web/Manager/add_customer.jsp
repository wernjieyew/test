<%-- 
    Document   : add_customer
    Created on : Apr 22, 2024, 10:45:58 AM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up Form</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
         <div class="loginbox">
            <h1>Add Customer</h1>
            <form method="post" action="/Ass/add_customer">
                 <%
                        String username = (String) request.getAttribute("username");
                        if (username == null) {
                            username = "";
                        }
                 %>
                <p>
                    <label>Username</label>
                    <input type="text" name="username" placeholder="John" value="<%=username%>"/>
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
                    <input type="text" name="email" placeholder="abc@gmail.com" value="<%=email%>"/>
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
                    <input type="password" name="pass"  value="<%=pass%>"/>
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
                    <input type="text" name="phone" placeholder="0123456789" value="<%=phone%>" />
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
                   <input type="text" name="address" value="<%=address%>" />
                    <span>  <% if (request.getAttribute("addressError") != null) { %>
                        <%= request.getAttribute("addressError") %>
                        <% } %> 
                    </span>
                </p>

                <p><input type="submit" value="Signup" />
                    <a href="/Ass/Manager/manage_customer.jsp" style="padding-right: 200px;">Return Back</a>
                     <input type="reset" value="Reset"/>
                </p>         
            </form>
        </div>
    </body>
</html>
<% } %>
