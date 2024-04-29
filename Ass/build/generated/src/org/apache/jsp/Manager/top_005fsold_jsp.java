package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Comparator;
import java.util.List;
import entity.Product;
import java.util.Collections;

public final class top_005fsold_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Ass/css/manager_homepage.css\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Top Sold</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Manager/header.jsp", out, false);
      out.write("\n");
      out.write("        ");

List<Product> productList = (List)session.getAttribute("productList");

// sort the productList based on the number of product sales in descending order
Collections.sort(productList, new Comparator<Product>() {
public int compare(Product p1, Product p2) {
return Integer.compare(p2.getProdSales(), p1.getProdSales());
}
});


productList = productList.subList(0, Math.min(productList.size(), 10));

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3>.</h3>\n");
      out.write("<h1 style=\"color:black;padding-left: 70px;\">Top 10 Sold Product</h1>\n");
      out.write("<br>\n");
      out.write(" <table class=\"product-table\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Product ID</th>\n");
      out.write("        <th>Product name</th>\n");
      out.write("        <th>Product Description</th>\n");
      out.write("        <th>Product Price</th>\n");
      out.write("        <th>Product Stock</th>\n");
      out.write("        <th>Product Sales</th>\n");
      out.write("        <th>Product Image</th>\n");
      out.write("    </tr>\n");
      out.write("    ");
 for (Product product: productList){ 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( product.getProdId() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( product.getProdName() );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print( product.getProdDesc() );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print( product.getProdPrice() );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print( product.getProdStock() );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print( product.getProdSales() );
      out.write(" </td>\n");
      out.write("            <td><img src=\"");
      out.print( product.getProdImg() );
      out.write("\" width=\"200\" height=\"200\" /> </td>\n");
      out.write("        </tr>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("    <p><button onclick=\"location.href='/Ass/Manager/manager_homepage'\" style=\"margin-left:700px;\">Back</button></p><br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
