//Exp2\src\main\java\com\ajt
package com.ajt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/education")
public class EducationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        session.setAttribute("degree",
                request.getParameter("degree"));

        session.setAttribute("university",
                request.getParameter("university"));

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h2>Final User Information</h2>");
        out.println("<hr>");

        out.println("<p><b>Name :</b> " + session.getAttribute("name") + "</p>");
        out.println("<p><b>Age :</b> " + session.getAttribute("age") + "</p>");
        out.println("<p><b>Email :</b> " + session.getAttribute("email") + "</p>");
        out.println("<p><b>Phone :</b> " + session.getAttribute("phone") + "</p>");
        out.println("<p><b>Degree :</b> " + session.getAttribute("degree") + "</p>");
        out.println("<p><b>University :</b> " + session.getAttribute("university") + "</p>");

        out.println("<br>");
        out.println("<a href='personal.html'>Start Again</a>");

        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
