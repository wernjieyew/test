<%-- 
    Document   : login
    Created on : Apr 9, 2024, 8:38:54 PM
    Author     : Yew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="css/login.css">
        <link href="img/fevicon.png" rel="shortcut icon"/>
    </head>
    
    <body>
         <div class="loginbox">
            <h1>Login</h1>
            <form method="post" action="login">
                    <%
                        String username = (String) request.getAttribute("username");
                        if (username == null) {
                            username = "";
                        }
                    %>
                <p>
                    <label>Username</label>
                    <input type="text" name="username" placeholder="Enter username" value="<%=username%>"/>
                    <span>   <% if (request.getAttribute("usernameError") != null) { %>
                        <%= request.getAttribute("usernameError") %>
                        <% } %> 
                    </span>
                </p>

                <p> <label>Password</label>
                    <input type="password" name="custPass" placeholder="Enter password"/><br>
                    <span>   <% if (request.getAttribute("passError") != null) { %>
                        <%= request.getAttribute("passError") %>
                        <% } %> 
                    </span>
               
                    <span>   <% if (request.getAttribute("errorMessage") != null) { %>
                        <%= request.getAttribute("errorMessage") %>
                        <% } %> 
                    </span>
                </p>
               
                
                <p><input type="submit" value="Login" /></p>
            </form>

       
                <h3><a href="register.jsp">Don't have account yet?</a></h3>
                <h3><a href="GuestHomepage.jsp">Return to Home</h3>
                <h3><a href="admin_login.jsp">Admin Login</h3>
        </div>
    </body>
</html>
