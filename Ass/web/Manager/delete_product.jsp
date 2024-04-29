<%-- 
    Document   : delete_product
    Created on : Apr 20, 2024, 1:39:17 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="entity.Product"%>
<%@page import="entity.Service_Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Delete Product</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        
                 <%
            Product product = (Product) session.getAttribute("product");
            if (product != null) {
        %>
        <div class="product-container">
        <form action="/Ass/delete_product" method="post"onsubmit="return window.confirm('Are you sure you want to delete this product?')">
             <h1>Delete Product</h1>
            <p>
                 <label>Product ID</label>
                 <input type="text" name="prodId" size="30" value="<%=product.getProdId()%>" readonly>

             </p>
             <p>
                  <label>Product Name</label>
                  <input type="text" name="prodName" size="30" value="<%=product.getProdName()%>"readonly>
             </p>
             <p>
                  <label>Product Description</label>
                  <input type="text" name="prodDesc" size="30" value="<%=product.getProdDesc()%>"readonly>
             </p>

             <p>
                  <label>Product Price</label>
                  <input type="text" name="prodPrice" size="30" value="<%=product.getProdPrice()%>"readonly>

             </p>
             <p>
                  <label>Product Stock</label>
                  <input type="text" name="prodStock" size="30" value="<%=product.getProdStock()%>"readonly>
             </p>
             <p>
                  <label>Product Sales</label>
                  <input type="text" name="prodSales" size="30" value="<%=product.getProdSales()%>"readonly>
             </p>
             <p>
                  <label>Product Image Link</label>
                  <input type="text" name="prodImg" size="30" value="<%=product.getProdImg()%>"readonly>
             </p>
             <p>
                 <label>Product Image</label><br>
                  <img src="<%=product.getProdImg()%>" width="200" height="200">
             </p>

            <div style="text-align: center;">
                 <br> <br> 
                <p><input type="submit" name="Submit" value="Delete">
                </p>
                     
           </div> 
              <%} else {%>
       Product ${product.prodId} not found
        
        <%}%>
        </form> 
             <a href="/Ass/Manager/view_product.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>
