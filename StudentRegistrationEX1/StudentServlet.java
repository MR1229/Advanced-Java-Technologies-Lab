package com.ajt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Read data from form

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String course = request.getParameter("course");
        String address = request.getParameter("address");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Details</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h2>Student Registration Successful</h2>");

        out.println("<hr>");

        out.println("<p><b>First Name :</b> " + firstName + "</p>");
        out.println("<p><b>Last Name :</b> " + lastName + "</p>");
        out.println("<p><b>Date of Birth :</b> " + dob + "</p>");
        out.println("<p><b>Gender :</b> " + gender + "</p>");
        out.println("<p><b>Email :</b> " + email + "</p>");
        out.println("<p><b>Mobile :</b> " + mobile + "</p>");
        out.println("<p><b>Course :</b> " + course + "</p>");
        out.println("<p><b>Address :</b> " + address + "</p>");

        out.println("</body>");
        out.println("</html>");

        out.close();

    }

}
