<%-- 
    Document   : add
    Created on : 1-Dec-2023, 8:04:51 PM
    Author     : DELL
--%>

<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <% 
        int id = (Integer) session.getAttribute("id");
            String msg = request.getParameter("msg");
            if(msg==""){
                response.sendRedirect("aaa.jsp?msg=errrreur msg vide !!!!");}
            else{
                
            String req = "INSERT INTO `note`(`idcl`, `idn`, `text`) VALUES ("+id+",null,'"+msg+"')" ;
                 try {
                Class.forName("com.mysql.jdbc.Driver");
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", "root", "");
                 Statement stmt = conn.createStatement();
                  stmt.executeUpdate(req);
                response.sendRedirect("aaa.jsp");
              } catch(Exception e) {
                   System.out.print(e.toString());
                }}
        %>
    </body>
</html>
