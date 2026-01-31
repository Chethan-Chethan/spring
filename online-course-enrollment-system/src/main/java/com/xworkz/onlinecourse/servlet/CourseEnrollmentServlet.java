package com.xworkz.onlinecourse.servlet;

import com.xworkz.onlinecourse.entity.CourseEnrollmentEntity;
import com.xworkz.onlinecourse.service.CourseEnrollmentService;
import com.xworkz.onlinecourse.service.CourseEnrollmentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/register")
public class CourseEnrollmentServlet extends HttpServlet {

    CourseEnrollmentService service = new CourseEnrollmentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost method in servlet");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        long number = Long.parseLong(req.getParameter("number"));
        String course = req.getParameter("course");
        double fee = Double.parseDouble(req.getParameter("fee"));

        CourseEnrollmentEntity entity = new CourseEnrollmentEntity();
        entity.setStudentName(name);
        entity.setEmail(email);
        entity.setPhoneNumber(number);
        entity.setCourseName(course);
        entity.setCourseFee(fee);

        CourseEnrollmentEntity save = service.validateAndSaveStudentInfo(entity);

        List<CourseEnrollmentEntity> fetched = service.validateAndFetchingAllDetails();
        System.out.println(fetched);

        PrintWriter print = resp.getWriter();
        print.print("Registration Successful");
//        print.print("<html><body>Student Name: + name + </body></html>");

        req.setAttribute("email", email);
        req.setAttribute("number", number);
        req.setAttribute("course", course);

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);
    }
}
