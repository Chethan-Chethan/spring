package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.service.PaymentService;
import com.xworkz.onlinepayments.service.PaymentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteOnlinePayment")
public class DeleteOnlinePaymentServlet extends HttpServlet {

    PaymentService service = new PaymentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doGet for delete from servlet");

        boolean isDeleted = service.validateAndDeletePaymentEntityUsingId(Integer.parseInt(req.getParameter("id")));

        resp.sendRedirect(req.getContextPath() + "/readAllOnlinePayments");

    }
}
