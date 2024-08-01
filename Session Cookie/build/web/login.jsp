<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: linear-gradient(135deg, #6e8efb, #a777e3);
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .container {
                background-color: white;
                padding: 40px;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                width: 100%;
                max-width: 500px;
                text-align: center;
            }
            h2 {
                color: #333;
                margin-bottom: 20px;
            }
            h3 {
                color: red;
                text-align: center;
            }
            .message {
                background-color: #fff;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 100%;
                max-width: 500px;
                text-align: center;
                margin-top: 30px;
            }
            a {
                display: inline-block;
                margin-top: 20px;
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
        <div class="container">
            <h2>Hello World!</h2>
            
            <% 
                String uname = request.getParameter("username");
                String pwd = request.getParameter("password");
                
                // authenticate
                if("soorya".equals(uname) && "1234".equals(pwd)){
                    // create a session and set the username attribute
                    session.setAttribute("username", uname);
                   
                    // create a cookie to store the username
                    Cookie userCookie = new Cookie("username", uname);
                    userCookie.setMaxAge(60 * 60 * 24); // 1 day
                    response.addCookie(userCookie);
                   
                    response.sendRedirect("home.jsp");
                } else { %>
                <div class="message">
                    <h3>Login Failed/Invalid Data</h3>
                    <a href="login.html">Try Again</a>
                </div>
               <% } %>
        </div>
    </body>
</html>
