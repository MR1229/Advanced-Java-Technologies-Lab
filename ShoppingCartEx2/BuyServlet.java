//ShoppingCartEx2\src\main\java\com\ajt
package com.ajt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/buy")
public class BuyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String name = (String) session.getAttribute("name");
        String mobile = (String) session.getAttribute("mobile");
        String address = (String) session.getAttribute("address");

        String[] products =
                (String[]) session.getAttribute("products");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h2>Order Successful</h2>");
        out.println("<hr>");

        out.println("<h3>Customer Details</h3>");

        out.println("Name : " + name + "<br>");
        out.println("Mobile : " + mobile + "<br>");
        out.println("Address : " + address + "<br><br>");

        out.println("<h3>Purchased Products</h3>");

        if(products!=null){

            for(String item : products){

                out.println(item+"<br>");

            }

        }

        out.println("<br>");

        out.println("<h2>Thank You For Shopping!</h2>");

        out.println("</body>");
        out.println("</html>");

        out.close();

    }

}
