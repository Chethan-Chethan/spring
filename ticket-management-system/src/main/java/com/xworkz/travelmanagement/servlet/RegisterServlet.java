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
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    TicketService service = new TicketServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost to save from servlet");

        String name = req.getParameter("name");
        long phoneNumber = Long.parseLong(req.getParameter("phoneNumber"));
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String boardingPlace = req.getParameter("boardingPlace");
        String destination = req.getParameter("destination");

        TicketEntity entity = new TicketEntity();
        entity.setName(name);
        entity.setPhoneNumber(phoneNumber);
        entity.setEmail(email);
        entity.setPassword(password);
        entity.setBoardingPlace(boardingPlace);
        entity.setDestination(destination);
        entity.setCreatedAt(LocalDateTime.now());

        TicketEntity saved = service.validateAndSaveTicketInfo(entity);
        System.out.println(saved);

        req.setAttribute("name", name);
        req.setAttribute("phoneNumber", phoneNumber);
        req.setAttribute("email", email);
        req.setAttribute("password", password);
        req.setAttribute("boardingPlace", boardingPlace);
        req.setAttribute("destination", destination);
        req.setAttribute("ticket", entity);

//        resp.getWriter().print("Registration Successful");

        req.getRequestDispatcher("success.jsp").forward(req, resp);
    }
}
