/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aakrati
 */
@WebServlet(urlPatterns = {"/Demoimg"})
public class Demoimg extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     int imgid=Integer.parseInt(request.getParameter("id"));
        ResultSet rs= null;
        PreparedStatement pst=null;
        OutputStream ot;
        Connection con=null;
        try {
              Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
              pst=con.prepareStatement("select image from adddata where uid='"+imgid+"'");
                      pst.setInt(1, imgid);

               if(rs.next()) {
             byte barray[] = rs.getBytes(9);
             response.setContentType("image/png");
             ot=response.getOutputStream();
             ot.write(barray);
             ot.flush();
             ot.close();
    
                 }
           } catch (Exception e) {
             
           }finally {
                     try{
                         if(con!=null)
                        con.close();
                                 }catch(Exception ex){
                                   // ex.printStackTrace();
                              }
 
                         } 
    }
}


