package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class img2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Fetching Data From a Database</TITLE>\n");
      out.write("    </HEAD>\n");
      out.write("    <BODY>\n");
      out.write("        <H1>Fetching Data From a Database</H1>\n");
      out.write("        \n");

    Connection con = null;
 int s1=Integer.parseInt(request.getParameter("id"));
                   ResultSet rs = null;
                String sql=null;
                PreparedStatement pst=null;
        
        OutputStream ot;
      
            try {
             Class.forName("com.mysql.jdbc.Driver");
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
  Statement st = con.createStatement();
    rs = st.executeQuery("select image from merg");
               while(rs.next()) {
             byte barray[] = rs.getBytes(1);
             response.setContentType("image/png");
             ot=response.getOutputStream();
             
      out.write("\n");
      out.write("             <table><tr>\n");
      out.write("              <td class=\"col2\"> <img src=\"");
 ot.write(barray); 
      out.write("\" height=\"80\" width=\"80\" /> </td>\n");
      out.write("             </tr> </table>\n");
      out.write("           ");
  ot.flush();
             ot.close();
    
                 }
           } catch (Exception e) {
             out.println(e);
           }finally {
                     try{
                         if(con!=null)
                        con.close();
                                 }catch(Exception ex){
                                  ex.printStackTrace();
                              }
 
                         } 

      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>\n");
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
