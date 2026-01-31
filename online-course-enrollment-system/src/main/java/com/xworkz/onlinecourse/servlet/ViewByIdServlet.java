package com.xworkz.onlinecourse.servlet;

import com.xworkz.onlinecourse.entity.CourseEnrollmentEntity;
import com.xworkz.onlinecourse.service.CourseEnrollmentService;
import com.xworkz.onlinecourse.service.CourseEnrollmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/viewById")
public class ViewByIdServlet extends HttpServlet {

    CourseEnrollmentService service = new CourseEnrollmentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fetch from servlet");

        CourseEnrollmentEntity fetched = service.validateAndFetchById(Integer.parseInt(req.getParameter("id")));
        System.out.println(fetched);

        req.setAttribute("view", fetched);
        req.getRequestDispatcher("viewById.jsp").forward(req, resp);
    }
}
