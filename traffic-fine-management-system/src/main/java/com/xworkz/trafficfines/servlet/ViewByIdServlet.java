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

@WebServlet(urlPatterns = "/viewById")
public class ViewByIdServlet extends HttpServlet {

    TrafficFineService service = new TrafficFineServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Fetching from servlet");

        TrafficFineEntity fetched = service.validateAndFetchById(Integer.parseInt(req.getParameter("id")));
        System.out.println(fetched);

        req.setAttribute("view", fetched);

        req.getRequestDispatcher("viewById.jsp").forward(req, resp);
    }
}
