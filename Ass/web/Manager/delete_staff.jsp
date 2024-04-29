<%-- 
    Document   : delete_staff
    Created on : Apr 18, 2024, 11:18:19 AM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="entity.Staff"%>
<%@page import="entity.Service_Staff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Delete staff</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        
        <%
            Staff staff = (Staff) session.getAttribute("staff");
            if (staff != null) {
        %>
        <div class="container">
        <form action="/Ass/delete_staff" method="post"onsubmit="return window.confirm('Are you sure you want to delete this staff?')">
             <h1>Delete Staff</h1>
            <p>
                 <label>Staff ID </label>
                <input type="text" name="staffId" value="<%=staff.getStaffId()%>"size="30" readonly>            
            </p>  
             <p>
                     <label>Name </label>
                    <input type="text" name="staffName" value="<%=staff.getStaffName()%>"size="30" readonly>
                  
             </p>
            <p>   
                     <label>Position </label>
                    <input type="text" name="position" value="<%=staff.getStaffPosition()%>"size="30" readonly>
                   
             </p>
             
             <p>
                 <label>Password</label>
                    <input type="password" name="staffPass" value="<%=staff.getStaffPass()%>"size="30" readonly>
                     
              </p>  
            
            <input type="submit" value="Delete Staff">
         
               <%} else {%>
       Staff ${staff.staffId} not found
        
        <%}%>
        </form> 
             <a href="/Ass/Manager/view_staff.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>