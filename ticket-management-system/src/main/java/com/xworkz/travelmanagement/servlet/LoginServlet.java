package com.xworkz.travelmanagement.servlet;

import com.xworkz.travelmanagement.entity.TicketEntity;
import com.xworkz.travelmanagement.service.TicketService;
import com.xworkz.travelmanagement.service.TicketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    TicketService service = new TicketServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doGet login from servlet");

        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking Login from servlet");

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        List<TicketEntity> entity = service.validateAndFindEmailAndPassword(email, password);

        if (entity!=null) {
            req.setAttribute("tickets", entity);
            req.getRequestDispatcher("loginSuccess.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "Invalid Password or Email");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
