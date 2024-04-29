<%-- 
    Document   : update_profile_result
    Created on : Apr 26, 2024, 7:42:12 PM
    Author     : Yew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/staff_homepage.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
   <jsp:include page="/Staff/header.jsp" />
        <div class="long-container">  
            <h1>
            <%
              boolean success = (Boolean)session.getAttribute("success");
              if (success)
                  out.println("Profile updated successful.");
              else
                  out.println("Error: Unable to update Profile.");
            %>
            </h1>
            <p><button onclick="location.href='/Ass/Staff/staff_homepage.jsp'">&#129144;Back</button></p>
        </div>
      </body>
</html>
