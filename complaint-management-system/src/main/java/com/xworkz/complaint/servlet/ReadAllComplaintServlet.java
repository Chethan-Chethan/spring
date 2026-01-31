package com.xworkz.complaint.servlet;

import com.xworkz.complaint.entity.UserInfoEntity;
import com.xworkz.complaint.service.ComplaintService;
import com.xworkz.complaint.service.ComplaintServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readAllCourseEnrollment")
public class ReadAllComplaintServlet extends HttpServlet{
    ComplaintService service = new ComplaintServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get details from servlet");

        List<UserInfoEntity> read = service.validateAndFetchAllDetails();
        System.out.println(read);

        req.setAttribute("read", read);

        req.getRequestDispatcher("readAllComplaintDetails.jsp").forward(req, resp);
    }
}
