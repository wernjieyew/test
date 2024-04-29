package org.apache.jsp.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.*;

public final class customer_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<");
      entity.Customer cust = null;
      synchronized (session) {
        cust = (entity.Customer) _jspx_page_context.getAttribute("cust", PageContext.SESSION_SCOPE);
        if (cust == null){
          cust = new entity.Customer();
          _jspx_page_context.setAttribute("cust", cust, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
 List<Product> productList = (List<Product>) session.getAttribute("productList");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table >\n");
      out.write("                <tr><td>User:</td><td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>  \n");
      out.write("       </table>\n");
      out.write("       <table border=\"0\" cellspacing=\"10\">\n");
      out.write("    <tr>\n");
      out.write("        <td>Search for Product ID</td>\n");
      out.write("        <td><select onChange=\"window.location.href=this.value\" name=\"prodID\">\n");
      out.write("                <option></option>\n");
      out.write("                ");
 for (Product product: productList){
      out.write("      \n");
      out.write("                <option value=\"/Fraction/ProductDetail?prod_ID=");
      out.print( product.getProdId());
      out.write("&username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    ");
      out.print(product.getProdId());
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr><p><button onclick=\"location.href='/Fraction/ViewComment'\">View Comment for Product</button></p></tr>\n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("    <form action=\"/Fraction/ProcessCart\" method=\"POST\">\n");
      out.write("    <table border=\"0\" cellspacing=\"10\">\n");
      out.write("    <a href=\"/Fraction/ViewCart\">Add To Cart</a>\n");
      out.write("    <h2>Product</h2><br />\n");
      out.write("            <table border=\"1\" cellspacing=\"1\" cellpadding=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Description</th>\n");
      out.write("                        <th>Price</th> \n");
      out.write("                        <th>Image</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
  int[] QtyArr = new int[productList.size()];
                        for (int i = 0; i < productList.size(); ++i) {
                            Product product = productList.get(i);
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <td align=\"center\"><a href='/Fraction/ProductDetail?prod_ID=");
      out.print( product.getProdId());
      out.write("&username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write('>');
      out.print( product.getProdId());
      out.write("</a></td>\n");
      out.write("                        <td align=\"center\">");
      out.print( product.getProdName());
      out.write("</td>\n");
      out.write("                        <td align=\"center\">");
      out.print( product.getProdDesc());
      out.write("</td>\n");
      out.write("                        <td align=\"center\">");
      out.print( product.getProdPrice());
      out.write("</td>\n");
      out.write("                        <td><img src=\"");
      out.print( product.getProdImg());
      out.write("\" width=\"200\" height=\"300\" /></td>\n");
      out.write("                        <td align=\"center\"><input type=\"text\" name=\"");
      out.print( "QtyArr[" + i + "]");
      out.write("\" value=\"0\" size=\"5\" align=\"right\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write(" \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                 <br /><br />\n");
      out.write("            <input type=\"submit\" value=\"Confirm Cart\" name=\"confirm\" />\n");
      out.write("            <input type=\"reset\" value=\"Reset\" /><br /><br />\n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("    <p ><a href=\"/Fraction/Customer/Customer_Homepage.jsp\">Back to home page</a></p>\n");
      out.write("</html>\n");
      out.write("\n");
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
