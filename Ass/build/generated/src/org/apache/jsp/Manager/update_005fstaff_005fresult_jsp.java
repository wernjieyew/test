package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_005fstaff_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Ass/css/manager_homepage.css\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>manage staff</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <div class=\"profile\">\n");
      out.write("                     </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"dashboard.php\">Dashboard</a></li>\n");
      out.write("                        <li><a href=\"manage_staff.jsp\">Manage Staff</a></li> \n");
      out.write("                        <li><a href=\"manager_customer.jsp\">Manage Customer</a></li>\n");
      out.write("                        <li><a href=\"manage_product.jsp\">Manage Product</a></li>\n");
      out.write("                        <li><a href=\"sales_report.jsp\">Report</a></li>\n");
      out.write("                        <li><a href=\"staff_homepage.jsp\">Staff Page</a></li>\n");
      out.write("                        <li><a href=\"admin_login.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"section\">\n");
      out.write("                    <div class=\"top_navbar\">\n");
      out.write("                        <div class=\"hamburger\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fas fa-bars\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("    </header>\n");
      out.write("<div class=\"long-container\">  \n");
      out.write("<h3>\n");

  boolean success = (Boolean)session.getAttribute("success");
  if (success)
      out.println("Staff updated successfully.");
  else
      out.println("Error: Unable to update Staff.");

      out.write("\n");
      out.write("</h3>\n");
      out.write("<p><button onclick=\"location.href='ManageStaff.html'\">Continue Manage Staff</button></p>\n");
      out.write("</div>\n");
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
