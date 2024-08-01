<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page import="jakarta.servlet.http.HttpServletResponse" %>
<%@ page import="jakarta.servlet.http.HttpServletRequest" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
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
                padding: 40px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 400px;
                text-align: center;
                margin-top: 20px;
            }
            a {
                display: inline-block;
                margin-top: 10px;
                padding: 10px 20px;
                background-color: #4CAF50;
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
            // Invalidate the session
            session.invalidate();
            
            // Remove the 'uname' cookie if it exists
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("uname")) {
                        cookie.setValue(null);
                        cookie.setMaxAge(0); // Expire the cookie
                        response.addCookie(cookie);
                        break;
                    }
                }
            }
        %>
        <div class="message">
            <h1>You have been logged out successfully.</h1>
            <a href="login.html">Login</a>
        </div>
    </body>
</html>
