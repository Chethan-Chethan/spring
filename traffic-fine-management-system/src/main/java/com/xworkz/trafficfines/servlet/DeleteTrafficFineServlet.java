package com.xworkz.trafficfines.servlet;

import com.xworkz.trafficfines.service.TrafficFineService;
import com.xworkz.trafficfines.service.TrafficFineServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteTrafficFineById")
public class DeleteTrafficFineServlet extends HttpServlet {

    TrafficFineService service = new TrafficFineServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking delete from servlet");

        boolean delete = service.validateAndDeleteById(Integer.parseInt(req.getParameter("id")));
        if (delete) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }
        resp.sendRedirect(req.getContextPath() + "/readAllTrafficFines");

    }
}
