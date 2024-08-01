<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: linear-gradient(135deg, #6e8efb, #a777e3);
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            h1 {
                color: #333;
                text-align: center;
            }
            .message {
                background-color: #fff;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 300px;
                text-align: center;
                margin-top: 20px;
            }
            a {
                display: inline-block;
                margin-top: 10px;
                padding: 10px 20px;
                background-color: lightblue;
                color: white;
                text-decoration: none;
                border-radius: 5px;
            }
            a:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <%
            // Retrieve the session attribute
            String uname = (String) session.getAttribute("username");
            
            if (uname == null) {
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getName().equals("uname")) {
                            uname = cookie.getValue();
                            session.setAttribute("username", uname);
                            break;
                        }
                    }
                }
            }
            
            if (uname != null) {
        %>
        <div class="message">
            <h1>Welcome, <%= uname %> </h1>
            <a href="logout.jsp">Logout</a>
        </div>
        <% 
            } else {
        %>
        <div class="message">
            <h1>You are not logged in!</h1>
            <a href="login.html">Login</a>
        </div>
        <% 
            }
        %>
    </body>
</html>
