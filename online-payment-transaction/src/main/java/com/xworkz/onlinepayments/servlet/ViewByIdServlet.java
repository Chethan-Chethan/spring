package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.entity.PaymentEntity;
import com.xworkz.onlinepayments.service.PaymentService;
import com.xworkz.onlinepayments.service.PaymentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/viewById")
public class ViewByIdServlet extends HttpServlet {

    PaymentService service = new PaymentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("View from Servlet");

        PaymentEntity view = service.validateAndFetchById(Integer.parseInt(req.getParameter("id")));
        System.out.println(view);

        req.setAttribute("view", view);

        req.getRequestDispatcher("viewById.jsp").forward(req, resp);
    }
}
