package com.xworkz.complaint.servlet;

import com.xworkz.complaint.service.ComplaintService;
import com.xworkz.complaint.service.ComplaintServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteComplaint")
public class DeleteComplaintServlet extends HttpServlet {

    ComplaintService service = new ComplaintServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doGet method for delete in servlet");

        boolean deleted = service.validateAndDeleteUserInfoById(Integer.parseInt(req.getParameter("userId")));
        System.out.println(deleted);

        resp.sendRedirect(req.getContextPath() + "/readAllCourseEnrollment");
    }
}
