<%-- 
    Document   : ajout
    Created on : 13-Nov-2023, 4:17:22 PM
    Author     : DELL
--%>


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 

String idmsg=request.getParameter("idmsg");
int id = (Integer) session.getAttribute("id");



            String req = "DELETE from note where idn ="+idmsg+" and idcl="+id;
            
 try {
                Class.forName("com.mysql.jdbc.Driver");
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", "root", "");
                 Statement stmt = conn.createStatement();
                  stmt.executeUpdate(req);
                response.sendRedirect("aaa.jsp");
              } catch(Exception e) {
                   System.out.print(e.toString());
                }
        %>
    </body>
</html>
