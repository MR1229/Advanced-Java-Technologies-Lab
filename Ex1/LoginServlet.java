package com.ajt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Get username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        // Check username and password
        if ("Mahesh Pawar".equals(username) && "MR1229".equals(password)) {

            out.println("<h1>Login Successful</h1>");
            out.println("<hr>");

            out.println("<h2>Username : " + username + "</h2>");
            out.println("<h2>Password : " + password + "</h2>");

        } else {

            out.println("<h1>Login Failed</h1>");
            out.println("<hr>");
            out.println("<h2>Invalid Username or Password</h2>");

        }

        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
