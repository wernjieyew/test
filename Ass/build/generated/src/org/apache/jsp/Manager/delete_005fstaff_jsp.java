package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Staff;
import entity.Service_Staff;

public final class delete_005fstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Ass/css/manager_homepage.css\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>manage staff</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <div class=\"profile\">\n");
      out.write("                     </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"dashboard.php\">Dashboard</a></li>\n");
      out.write("                        <li><a href=\"/Ass/Manager/manage_staff.jsp\">Manage Staff</a></li> \n");
      out.write("                        <li><a href=\"/Ass/Manager/manager_customer.jsp\">Manage Customer</a></li>\n");
      out.write("                        <li><a href=\"/Ass/Manager/manage_product.jsp\">Manage Product</a></li>\n");
      out.write("                        <li><a href=\"/Ass/Manager/sales_report.jsp\">Report</a></li>\n");
      out.write("                        <li><a href=\"/Ass/Manager/staff_homepage.jsp\">Staff Page</a></li>\n");
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
      out.write("        \n");
      out.write("        ");

            Staff staff = (Staff) session.getAttribute("staff");
            if (staff != null) {
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form action=\"/Ass/delete_staff\" method=\"post\"onsubmit=\"return window.confirm('Are you sure you want to delete this staff?')\">\n");
      out.write("             <h1>Delete Staff</h1>\n");
      out.write("            <p>\n");
      out.write("                 <label>Staff ID </label>\n");
      out.write("                <input type=\"text\" name=\"staffId\" value=\"");
      out.print(staff.getStaffId());
      out.write("\"size=\"30\" readonly>            \n");
      out.write("            </p>  \n");
      out.write("             <p>\n");
      out.write("                     <label>Name </label>\n");
      out.write("                    <input type=\"text\" name=\"staffName\" value=\"");
      out.print(staff.getStaffName());
      out.write("\"size=\"30\" readonly>\n");
      out.write("                  \n");
      out.write("             </p>\n");
      out.write("            <p>   \n");
      out.write("                     <label>Position </label>\n");
      out.write("                    <input type=\"text\" name=\"position\" value=\"");
      out.print(staff.getStaffPosition());
      out.write("\"size=\"30\" readonly>\n");
      out.write("                   \n");
      out.write("             </p>\n");
      out.write("             \n");
      out.write("             <p>\n");
      out.write("                 <label>Password</label>\n");
      out.write("                    <input type=\"password\" name=\"staffPass\" value=\"");
      out.print(staff.getStaffPass());
      out.write("\"size=\"30\" readonly>\n");
      out.write("                     \n");
      out.write("              </p>  \n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Delete Staff\">\n");
      out.write("         \n");
      out.write("               ");
} else {
      out.write("\n");
      out.write("       Staff ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${staff.staffId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" not found\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </form> \n");
      out.write("             <a href=\"/Ass/Manager/view_staff.jsp\">Return Back</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
