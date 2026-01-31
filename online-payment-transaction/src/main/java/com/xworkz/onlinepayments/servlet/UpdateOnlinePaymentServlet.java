package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.entity.PaymentEntity;
import com.xworkz.onlinepayments.service.PaymentService;
import com.xworkz.onlinepayments.service.PaymentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/editById")
public class UpdateOnlinePaymentServlet extends HttpServlet {

    PaymentService service = new PaymentServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("updating doGet method from servlet");

        int id = Integer.parseInt(req.getParameter("id"));

        PaymentEntity updating = service.validateAndFetchById(id);
        System.out.println(updating);

        req.setAttribute("edit", updating);

        req.getRequestDispatcher("updateById.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("updating doPost method from servlet");

        int id = Integer.parseInt(req.getParameter("id"));

        PaymentEntity update = new PaymentEntity();
        update.setId(id);
        update.setPhoneNumber(Long.parseLong(req.getParameter("phoneNumber")));
        update.setTransactionId(Long.parseLong(req.getParameter("transactionId")));
        update.setAmountSenderName(req.getParameter("amountSenderName"));
        update.setAmount(Double.parseDouble(req.getParameter("amount")));
        update.setAmountReceiverName(req.getParameter("amountReceiverName"));
        update.setDate(req.getParameter("date"));


        PaymentEntity updated = service.validateAndUpdateById(update);
        System.out.println(updated);

        resp.sendRedirect("readAllOnlinePayments");
    }
}

