package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;

public final class add1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"add1.jsp\">\n");
      out.write("            <table>\n");
      out.write("                <td> name</td>\n");
      out.write("                <td><input type=\"text\" name=\"uname\" ></td>\n");
      out.write("                <td> password</td>\n");
      out.write("                <td><input type=\"text\" name=\"pass\" ></td>\n");
      out.write("                 <td> phone</td>\n");
      out.write("                <td><input type=\"text\" name=\"phone\"></td>\n");
      out.write("           \n");
      out.write("            </table>\n");
      out.write("            <input type=\"button\" name=\"btn1\"  value=\"add\" id=\"btn\">\n");
      out.write("            ");

             String s1=request.getParameter("uname");
              
                String s2=request.getParameter("pass");
                String s3=request.getParameter("phone");
               Connection con=null;
                int uquery=0;
                PreparedStatement pst =null;
               
                        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
                         if(s1!="null" && s2!="null" && s3!="null"){
                if( s1!=""&& s2!= ""&& s3!= ""){
                        pst=con.prepareStatement("insert into add values(?, ?, ?)");
                        pst.setString(1, s1);
                        pst.setString(2, s2);
                        pst.setString(3, s3);
                         uquery=pst.executeUpdate();
                         if(uquery!=0) { 
      out.write("\n");
      out.write("                          <br>\n");
      out.write("\t           <TABLE>\n");
      out.write("\t\t      <tr><th>Data is inserted successfully \n");
      out.write("                    in database.</th></tr>\n");
      out.write("\t\t   </table>\n");
      out.write("                   ");
 
                         }
                     }
                         }}
                      catch(Exception e){
                        System.out.println("=================="+e);
                     }
               finally{
                        con.close();
                        pst.close();
                        }
                 
                
                
    
      out.write("\n");
      out.write("        </form>\n");
      out.write("       </body>\n");
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
