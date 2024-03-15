<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <style>
        .header {
    background-color: #f2f2f2;
}
.content{
max-width:750px ;
margin:auto;
justify-content: center;
align-items: center;
padding:15px;
}

.navbar{
background-color: #394356;
color:#ffffff;
font-family: segoe ui;
padding-left:50px;
}
.icon{height:35px;
width:35px;
margin-left:10px;
margin-right: 10px;;
}
.aaa{
     display: grid;
    grid-template-columns: repeat(2, 1fr);
    grid-gap: 30px;
}
.note-input{
    margin-top:30px;
    padding:20px;
    display:flex;
    flex-direction: row;

}
.input-text{
    height:100px;
    width: 500px;;
    padding:10px;  
    box-shadow: 5px 5px #394356;
    background-color: #ffffff;
    border-radius: 6px;

}

.btn{
    width: 100px;
    padding: 10px auto;
    border-radius: 10px;
    height: 50px;
    background-color: #394356;
    color:#ffffff;
    box-shadow: 5px 5px #d1d1e0;

}
.btn:focus{
    color:#ffffff;
}
.action{display: flex;
flex-direction: column;}
.theme{
    width:90px;
    height:35px;
    
}
.all_note{
     display: grid;
    grid-template-columns: repeat(4, 1fr);
    grid-gap: 10px;
}
.notes-list {
    max-width: 1000px;
    margin: auto;
    align-items: center; 
    justify-content: center; 
}

.note {
    padding: 15px;
    border-radius: 5px;
    width: 260px;
    box-shadow: 4px 4px #f2f2f2;
    margin: 10px;
    height: 160px;
    border-top: solid 5px #4d4d4d;
}


.note-view {
    height: 100px;
    overflow-y: scroll;
    scrollbar-width: 6px;
    scrollbar-color: #f2f2f2f2;
}


.bin-icon{
    
    height:18px;
    width:18px;
    float:right;
    margin-top:8px;

}

.illustration{height:250px;
width:400px;}
.no-notes{display: flex;
flex-direction: row;}
.msg{margin-top:100px;
text-align: center;
opacity: 70;
}
footer {
    height: 40px;
    text-align: center;
    background-color: #f2f2f2;;
    padding: 10px;
    font-size: 14px;
    margin-top:300px;
}


@media screen and (max-width:600px){
    .note-input{
        display: flex;
        flex-direction: column;
        margin-top: 20px;
    }
           .all_note{
     display: grid;
    grid-template-columns: repeat(1, 1fr);
    grid-gap: 10px;
}
    .navbar{padding-left:20px;}
    .action{
        display: flex;
        flex-direction: row;
        margin: auto;
        align-items: center;
        justify-content: center;
    }
    .notes{
        display: flex;
        flex-direction: column;
    }
    .no-notes{
        display: flex;
        flex-direction: column;
    }
    .msg{margin:20px;
        font-size: 20px;
    }
    .input-text{
        width:auto;
    }
}
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
 

        header {
            background-color: #333;
            color: white;
            padding: 10px;
            text-align: center;
        }

        section {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80vh;
        }

        .dashboard-content {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        footer {
            background-color: #333;
            color: white;
            padding: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
        <div class="dashboard-content">
    <nav class="navbar ">
        <h4 class="m-1"><img src="icons/logo.png" class="icon">Notes</h4>
    </nav>
    
    <div class="header">
       <div class="content">

            <div class="note-input">
                <form action="add.jsp" class="aaa">
                <textarea class="input-text m-1 get-note" rows="3" name="msg" placeholder="// Write a note here"></textarea>
                    <div class="action m-3">
                     
                        <input type="submit" value="add note" class="btn    "> 
                    </div>
                </form>
            </div>
       </div> 
    </div>
            <div class="all_note">
            <%@ page import="java.sql.*" %>
            
         <%
        int id = (Integer) session.getAttribute("id");

            String requete="select * from note where idcl="+id;
              try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", "root", "");
                 Statement st =conn.createStatement();
                 ResultSet rs =st.executeQuery(requete);
             while(rs.next()){

        %>
       
    <div class="notes-list mt-3">
            <div class="note" style="background-color:white">
            <div class="note-view">
                <% out.print(rs.getString(3)); %>
            </div>
                <a href="supp.jsp?idmsg=<%out.print(rs.getInt(2));%>" class="deleteBtn"><img src="icons/bin.png" class="bin-icon"></a>
             </div>
            </div>
                <%
       
              }}
             catch (Exception e) {
              System.out.println(e.toString());
                } 

        %>
            
        </div>
    </section>
    <footer>
        created  by ABELKARIM SELMI
    </footer>         
</body>
</html>