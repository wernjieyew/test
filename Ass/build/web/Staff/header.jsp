<%-- 
    Document   : header.jsp
    Created on : Apr 18, 2024, 12:41:52 PM
    Author     : Yew
--%>
<%@page import="entity.Staff"%>
<%@page import="entity.Service_Staff"%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/staff_homepage.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
    </style>
</head>

<body>
    <header>
            <div class="wrapper">
                <div class="sidebar">
                    <div class="profile">

                    </div> 
                    <ul>
                        <li><a href="/Ass/Staff/staff_homepage.jsp">Home Page</a></li>                     
                        <li><a href="/Ass/Staff/manage_product.jsp">Manage Product</a></li>
                        <li><a href="/Ass/staff_view_customer">View Customer</a></li>
                        <li><a href="/Ass/staff_edit_profile?id=<%= id %>">Update Profile</a></li>
                        <li><a href="/Ass/logout">Logout</a></li>
                    </ul>
               </div>
               <div class="section">
                    <div class="top_navbar">
                        <div class="hamburger">
                            <a href="#">
                                <i class="fas fa-bars"></i>
                            </a>
                        </div>
                    </div>   
                </div>
        </header>
      <script>  
            var hamburger = document.querySelector(".hamburger");
            hamburger.addEventListener("click", function(){
                document.querySelector("body").classList.toggle("active");
            })
            </script>
    </body>
    </html>

