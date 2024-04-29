package org.apache.jsp.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      entity.Product product = null;
      synchronized (session) {
        product = (entity.Product) _jspx_page_context.getAttribute("product", PageContext.SESSION_SCOPE);
        if (product == null){
          product = new entity.Product();
          _jspx_page_context.setAttribute("product", product, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Detail</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>User</h2>\n");
      out.write("        <table>\n");
      out.write("                <tr><td> User:</td><td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>  \n");
      out.write("       </table>\n");
      out.write("       <br>\n");
      out.write("            <table >\n");
      out.write("                <tr><td>Product ID</td><td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>\n");
      out.write("                <tr><td>Product Name</td><td><input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>\n");
      out.write("                <tr><td>Product Description</td><td><input type=\"text\" name=\"desc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>\n");
      out.write("                <tr><td>Product Price</td><td><input type=\"text\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>\n");
      out.write("                <tr><td>Produce Stock</td><td><input type=\"text\" name=\"stock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodStock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>\n");
      out.write("                <tr><td>Produce Sales</td><td><input type=\"text\" name=\"sales\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodSales}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/></td></tr>\n");
      out.write("                <tr><td>Produce Image:</td><td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodImg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"400\" height=\"600\" /></td></tr>\n");
      out.write("            </table>]\n");
      out.write("            \n");
      out.write("        <form action=\"/Fraction/Review\" method=\"POST\">\n");
      out.write("            <h1>Review and Rate for this product</h1>\n");
      out.write("            <table border=\"0\">   \n");
      out.write("                <tr><label for=\"title\">Title:</label><input type=\"text\" id=\"title\" name=\"title\" required><br><br></tr>\n");
      out.write("                <tr>User Name :<input type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/><br><br></tr>\n");
      out.write("                <tr>Product ID :<input type=\"text\" name=\"prodId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.prodId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"/><br><br></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <p><label for=\"review\">Review of This product(Maximum 300 words):</label></p>\n");
      out.write("                    <textarea id=\"review\" name=\"review\" rows=\"15\" cols=\"60\" required ></textarea>\n");
      out.write("                    <br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <label for=\"rating\">Rating:</label>\n");
      out.write("                        <select name=\"rating\" required>\n");
      out.write("                            <option value=\"5\">5 stars</option>\n");
      out.write("                            <option value=\"4\">4 stars</option>\n");
      out.write("                            <option value=\"3\">3 stars</option>\n");
      out.write("                            <option value=\"2\">2 stars</option>\n");
      out.write("                            <option value=\"1\">1 star</option>\n");
      out.write("                        </select><br><br><br>    \n");
      out.write("                </tr>\n");
      out.write("                 <p><input type=\"submit\" name=\"Submit\" value=\"Submit\" onclick=\"return confirm('Are you sure to rate and review this comment');\">\n");
      out.write("        </form>\n");
      out.write("      <p><button onclick=\"location.href='/Fraction/Customer/product_list.jsp?ID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\">Back to Product List</button></p>\n");
      out.write("    </body>\n");
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
