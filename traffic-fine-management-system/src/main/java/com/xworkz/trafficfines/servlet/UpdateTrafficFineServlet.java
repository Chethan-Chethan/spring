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

@WebServlet(urlPatterns = "/editById")
public class UpdateTrafficFineServlet extends HttpServlet {

    TrafficFineService service = new TrafficFineServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doGet update from servlet");

        TrafficFineEntity find = service.validateAndFetchById(Integer.parseInt(req.getParameter("id")));
        System.out.println(find);

        req.setAttribute("update", find);
        req.getRequestDispatcher("updateById.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost update from servlet");

        TrafficFineEntity entity = new TrafficFineEntity();
        entity.setId(Integer.parseInt(req.getParameter("id")));
        entity.setVehicleNumber(req.getParameter("vehicleNumber"));
        entity.setViolatedRule(req.getParameter("violatedRule"));
        entity.setFineAmount(Double.parseDouble(req.getParameter("fineAmount")));

        TrafficFineEntity updated = service.validateAndUpdateById(entity);
        System.out.println(updated);

        resp.sendRedirect("readAllTrafficFines");
    }
}
