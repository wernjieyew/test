package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Ass/css/manager_homepage.css\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>manage staff</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Manager/header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <h1>Add Staff</h1>\n");
      out.write("        <form  method=\"post\" action=\"/Ass/add_staff\"> \n");
      out.write("                 ");

                        String staffId = (String) request.getAttribute("staffId");
                        if (staffId == null) {
                            staffId = "";
                        }
                 
      out.write("\n");
      out.write("                 <br>\n");
      out.write("             <p>\n");
      out.write("                 <label>Staff ID</label>\n");
      out.write("                 <input type=\"text\" name=\"staffId\" size=\"30\" value=\"");
      out.print(staffId);
      out.write("\">\n");
      out.write("                 <span> ");
 if (request.getAttribute("staffIdError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("staffIdError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                 </span>\n");
      out.write("             </p>\n");
      out.write("                 ");

                        String staffName = (String) request.getAttribute("staffName");
                        if (staffName == null) {
                            staffName = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Name</label>\n");
      out.write("                  <input type=\"text\" name=\"staffName\" size=\"30\" value=\"");
      out.print(staffName);
      out.write("\">\n");
      out.write("                  <span> ");
 if (request.getAttribute("staffNameError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("staffNameError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                  </span>\n");
      out.write("             </p>\n");
      out.write("                 ");

                        String position = (String) request.getAttribute("position");
                        if (position == null) {
                            position = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                 <label>Position</label><br><br>\n");
      out.write("                <input type=\"radio\" name=\"position\" value=\"Manager\" ");
 if (position.equals("Manager")) { 
      out.write(" checked ");
 } 
      out.write(">Manager\n");
      out.write("                <input type=\"radio\" name=\"position\" value=\"Staff\" ");
 if (position.equals("Staff")) { 
      out.write(" checked ");
 } 
      out.write(">Staff<br>\n");
      out.write("                  <span> ");
 if (request.getAttribute("positionError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("positionError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                  </span>\n");
      out.write("             </p>\n");
      out.write("                  ");

                        String staffPass = (String) request.getAttribute("staffPass");
                        if (staffPass == null) {
                            staffPass = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Password</label>\n");
      out.write("                  <input type=\"password\" name=\"staffPass\" size=\"30\" value=\"");
      out.print(staffPass);
      out.write("\">\n");
      out.write("                   <span> ");
 if (request.getAttribute("passError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("passError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                     </span>\n");
      out.write("             </p>\n");
      out.write("\n");
      out.write("            <div style=\"text-align: center;\">\n");
      out.write("                 <br> <br> \n");
      out.write("                <p><input type=\"submit\" name=\"Submit\" value=\"Submit\">\n");
      out.write("                   <input type=\"reset\" value=\"Reset\" style=\"margin-bottom: 10px;\">\n");
      out.write("                </p>\n");
      out.write("                     \n");
      out.write("           </div> \n");
      out.write("       </form>\n");
      out.write("             <a href=\"/Ass/Manager/manage_staff.jsp\">Return Back</a>\n");
      out.write("        </div>\n");
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
