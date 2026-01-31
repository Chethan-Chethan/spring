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

@WebServlet(urlPatterns = "/editById")
public class UpdateByIdServlet extends HttpServlet {

    CourseEnrollmentService service = new CourseEnrollmentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doGet method of update from servlet");

        CourseEnrollmentEntity find = service.validateAndFetchById(Integer.parseInt(req.getParameter("id")));
        System.out.println(find);

        req.setAttribute("search", find);

        req.getRequestDispatcher("updateById.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost of update from servlet");

        CourseEnrollmentEntity updating = new CourseEnrollmentEntity();
        updating.setId(Integer.parseInt(req.getParameter("id")));
        updating.setStudentName(req.getParameter("studentName"));
        updating.setEmail(req.getParameter("email"));
        updating.setPhoneNumber(Long.parseLong(req.getParameter("phoneNumber")));
        updating.setCourseName(req.getParameter("courseName"));
        updating.setCourseFee(Double.parseDouble(req.getParameter("courseFee")));

        CourseEnrollmentEntity updated = service.validateAndUpdateById(updating);
        System.out.println(updated);

        resp.sendRedirect("readAllCourseEnrollment");
    }
}
