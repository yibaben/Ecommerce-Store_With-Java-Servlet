package com.example.AdminServlets;

import Config.Db_Config;
import DAO.CustomerDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "WishlistServlet", value = "/WishlistServlet")
public class WishlistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int UserId = Integer.parseInt(request.getParameter("user_id"));
        int productId = Integer.parseInt(request.getParameter("product_id"));

        CustomerDAO customerDAO = new CustomerDAO(Db_Config.connection());
        customerDAO.addWishlist(UserId , productId);
//        if (isAdded){
//            response.sendRedirect("user/dashboard.jsp");
//        }
    }
}
