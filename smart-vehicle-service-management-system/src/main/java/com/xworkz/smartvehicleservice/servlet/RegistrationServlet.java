package com.xworkz.smartvehicleservice.servlet;

import com.xworkz.smartvehicleservice.entity.VehicleServiceRecordEntity;
import com.xworkz.smartvehicleservice.service.VehicleService;
import com.xworkz.smartvehicleservice.service.VehicleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {

    VehicleService service = new VehicleServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking save method from doGet servlet");


        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking sve from doPost Servlet");

        String customerName = req.getParameter("customerName");
        long phoneNumber = Long.parseLong(req.getParameter("phoneNumber"));
        String vehicleNumber = req.getParameter("vehicleNumber");
        String serviceType = req.getParameter("serviceType");
        double serviceCost = Double.parseDouble(req.getParameter("serviceCost"));


        VehicleServiceRecordEntity entity = new VehicleServiceRecordEntity();
        entity.setCustomerName(customerName);
        entity.setPhoneNumber(phoneNumber);
        entity.setVehicleNumber(vehicleNumber);
        entity.setServiceType(serviceType);
        entity.setServiceCost(serviceCost);

        VehicleServiceRecordEntity saved = service.validateAndSaveServiceInfo(entity);
        System.out.println(saved);

        req.setAttribute("customerName", customerName);
        req.setAttribute("phoneNumber", phoneNumber);
        req.setAttribute("vehicleNumber", vehicleNumber);
        req.setAttribute("serviceType", serviceType);
        req.setAttribute("serviceCost", serviceCost);

        resp.sendRedirect("Registration Successful");

    }
}
