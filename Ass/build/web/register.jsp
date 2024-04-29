<%-- 
    Document   : register
    Created on : Apr 10, 2024, 2:55:23 PM
    Author     : Yew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up Form</title>
        <link rel="stylesheet" type="text/css" href="css/register.css">
    </head>
    <body>
         <div class="loginbox">
            <h1>Sign up</h1>
            <form method="post" action="register">
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
                        String confirmPass = (String) request.getAttribute("confirmPass");
                        if (confirmPass == null) {
                            confirmPass = "";
                        }
                 %>
                <p>
                    <label>Confirm Password</label>
                    <input type="password" name="confirmPass" value="<%=confirmPass%>"/>
                     <span>   <% if (request.getAttribute("confirmpassError") != null) { %>
                        <%= request.getAttribute("confirmpassError") %>
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
                    <a href="login.jsp" style="padding-right: 200px;">Return Back</a>
                     <input type="reset" value="Reset"/>
                </p>         
            </form>
        </div>
    </body>
</html>
