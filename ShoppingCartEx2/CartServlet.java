//ShoppingCartEx2\src\main\java\com\ajt
package com.ajt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String[] products = request.getParameterValues("product");

        session.setAttribute("products", products);

        response.sendRedirect("cart.html");

    }

}
