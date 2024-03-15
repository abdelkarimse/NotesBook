<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String name=request.getParameter("name");
                String req = "INSERT INTO users VALUES(null,'" + name + "', '" + email + "', '" + password + "')" ;
                 try {
                Class.forName("com.mysql.jdbc.Driver");
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", "root", "");
                 Statement stmt = conn.createStatement();
                  stmt.executeUpdate(req);
                response.sendRedirect("login.jsp");
              } catch(Exception e) {
                   System.out.print(e.toString());
                }
        %>
    </body>
</html>
