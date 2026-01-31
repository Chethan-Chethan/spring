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
import java.util.List;

@WebServlet(urlPatterns = "/readAllOnlinePayments")
public class ReadeAllOnlinePaymentServlet extends HttpServlet {

    PaymentService service = new PaymentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<PaymentEntity> list = service.validateAndFetchAllDetails();
        System.out.println(list);

        req.setAttribute("list", list);
        req.getRequestDispatcher("readAllOnlinePayments.jsp").forward(req, resp);
    }
}
