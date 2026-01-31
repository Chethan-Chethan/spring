package com.xworkz.complaint.servlet;

import com.xworkz.complaint.entity.UserInfoEntity;
import com.xworkz.complaint.service.ComplaintService;
import com.xworkz.complaint.service.ComplaintServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost of Index.jsp");

        RequestDispatcher indexDispatcher = req.getRequestDispatcher("register.jsp");
        indexDispatcher.forward(req, resp);
    }
}

