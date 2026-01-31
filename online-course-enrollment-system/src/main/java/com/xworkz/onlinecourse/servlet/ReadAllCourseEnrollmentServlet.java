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
import java.util.List;

@WebServlet(urlPatterns = "/readAllCourseEnrollment")
public class ReadAllCourseEnrollmentServlet extends HttpServlet {

    CourseEnrollmentService service = new CourseEnrollmentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("View all details from servlet");

        List<CourseEnrollmentEntity> fetching = service.validateAndFetchingAllDetails();
        System.out.println(fetching);

        req.setAttribute("fetching", fetching);

        req.getRequestDispatcher("readAllCourseDetails.jsp").forward(req, resp);

    }
}
