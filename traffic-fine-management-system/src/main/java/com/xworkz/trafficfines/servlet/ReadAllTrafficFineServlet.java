package com.xworkz.trafficfines.servlet;

import com.xworkz.trafficfines.entity.TrafficFineEntity;
import com.xworkz.trafficfines.service.TrafficFineService;
import com.xworkz.trafficfines.service.TrafficFineServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readAllTrafficFines")
public class ReadAllTrafficFineServlet extends HttpServlet {

    TrafficFineService service = new TrafficFineServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getting all details from servlet");

        List<TrafficFineEntity> fetch = service.validateAndFetchAllDetails();
        System.out.println(fetch);

        req.setAttribute("fetch", fetch);
        req.getRequestDispatcher("readAllTrafficFine.jsp").forward(req, resp);

    }
}
