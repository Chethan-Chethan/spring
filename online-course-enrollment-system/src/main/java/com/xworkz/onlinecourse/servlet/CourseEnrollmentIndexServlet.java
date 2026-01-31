package com.xworkz.onlinecourse.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registration")
public class CourseEnrollmentIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("redirected from index page to index servlet");

        RequestDispatcher dispatcher = req.getRequestDispatcher("loginForm.jsp");
        dispatcher.forward(req, resp);

    }
}
