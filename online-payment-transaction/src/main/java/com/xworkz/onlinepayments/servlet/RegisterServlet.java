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

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    PaymentService service = new PaymentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoked doPost method in RegisterServlet");

        long phoneNumber= Long.parseLong(req.getParameter("phoneNumber"));
        long transactionId= Long.parseLong(req.getParameter("transactionId"));
        String amountSenderName= req.getParameter("amountSenderName");
        double amount= Double.parseDouble(req.getParameter("amount"));
        String amountReceiverName= req.getParameter("amountReceiverName");
        String date= req.getParameter("date");



        PaymentEntity entity = new PaymentEntity();
        entity.setPhoneNumber(phoneNumber);
        entity.setTransactionId(transactionId);
        entity.setAmountSenderName(amountSenderName);
        entity.setAmount(amount);
        entity.setAmountReceiverName(amountReceiverName);
        entity.setDate(date);

        PaymentEntity saved = service.validateAndSavePaymentInfo(entity);

//        List<PaymentEntity> fetching =  service.validateAndFetchAllDetails();
//        System.out.println(fetching);

//        if (saved!=null) {
//            resp.getWriter().print("Registration successful");
//            return;
//        } else {
//            resp.getWriter().print("Registration failed");
//            return;
//        }

        req.setAttribute("phoneNumber", phoneNumber);
        req.setAttribute("transactionId", transactionId);
        req.setAttribute("amountSenderName", amountSenderName);
        req.setAttribute("amount", amount);
        req.setAttribute("amountReceiverName", amountReceiverName);
        req.setAttribute("date", date);

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);

        resp.getWriter().print("Registration Successful");


    }
}
