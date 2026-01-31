package com.xworkz.trafficfines.servlet;

import com.xworkz.trafficfines.entity.TrafficFineEntity;
import com.xworkz.trafficfines.service.TrafficFineService;
import com.xworkz.trafficfines.service.TrafficFineServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/traffic")
public class TrafficFineRegisterServlet extends HttpServlet {

    TrafficFineService service = new TrafficFineServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking registration from servlet");

        String vehicleNumber = req.getParameter("vehicleNo");
        String ruleViolated = req.getParameter("ruleViolated");
        String fineAmount = req.getParameter("amount");

        TrafficFineEntity fine = new TrafficFineEntity();
        fine.setVehicleNumber(vehicleNumber);
        fine.setViolatedRule(ruleViolated);
        fine.setFineAmount(Double.parseDouble(fineAmount));

        TrafficFineEntity save = service.validateAndSaveFIneInfo(fine);

        List<TrafficFineEntity> fetching = service.validateAndFetchAllDetails();
        System.out.println(fetching);

        req.setAttribute("vehicleNumber", vehicleNumber);
        req.setAttribute("ruleViolated", ruleViolated);
        req.setAttribute("fineAmount", fineAmount);

//        resp.getWriter().print("Registration Successful");
        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);
    }
}
