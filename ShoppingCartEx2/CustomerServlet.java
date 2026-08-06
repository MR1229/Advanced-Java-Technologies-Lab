////ShoppingCartEx2\src\main\java\com\ajt
package com.ajt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        session.setAttribute("name",
                request.getParameter("name"));

        session.setAttribute("mobile",
                request.getParameter("mobile"));

        session.setAttribute("address",
                request.getParameter("address"));

        response.sendRedirect("shopping.html");

    }

}
