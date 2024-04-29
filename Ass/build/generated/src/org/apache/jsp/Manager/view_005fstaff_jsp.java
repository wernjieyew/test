package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.Staff;

public final class view_005fstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Ass/css/manager_homepage.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>manage staff</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Manager/header.jsp", out, false);
      out.write("\n");
      out.write("        ");

          List<Staff> staffList = (List)session.getAttribute("staffList");
        
      out.write("\n");
      out.write("        <br> <br> <br>\n");
      out.write("  <h1 style=\"color:black;padding-left: 70px;\">Staff Information </h1>\n");
      out.write("        <table class=\"qgg-table\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Staff ID</th>         \n");
      out.write("                <th>Staff Name</th>\n");
      out.write("                <th>Position</th>\n");
      out.write("                <th colspan=\"2\">Action</th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
 for (Staff staff: staffList){ 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( staff.getStaffId() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( staff.getStaffName() );
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print( staff.getStaffPosition() );
      out.write(" </td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <a href=\"/Ass/edit_staff?staffId=");
      out.print( staff.getStaffId() );
      out.write("\" class=\"edit-btn\" style=\"background-color:#0cdf33;font-size:1em;text-decoration:none;\"><span class=\"edit-value\">&#128393;Edit</span></a>\n");
      out.write("                            </td>\n");
      out.write("                            <td align=\"center\">\n");
      out.write("                            <a href = \"/Ass/delete_staff_info?staffId=");
      out.print( staff.getStaffId() );
      out.write("\"class=\"delete-btn\"style=\"background-color:#f50b0b;font-size:1em;text-decoration:none;\"><span class=\"delete-value\"><i class=\"fa fa-trash-o\"></i>Delete</span></a >\n");
      out.write("                            </td>\n");
      out.write("                </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } 
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
