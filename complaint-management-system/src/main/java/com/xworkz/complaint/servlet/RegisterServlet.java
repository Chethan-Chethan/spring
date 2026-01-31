package com.xworkz.complaint.servlet;

import com.xworkz.complaint.entity.UserInfoEntity;
import com.xworkz.complaint.service.ComplaintService;
import com.xworkz.complaint.service.ComplaintServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    ComplaintService service = new ComplaintServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost method");

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        UserInfoEntity entity = new UserInfoEntity();
        entity.setEmail(email);
        entity.setPassword(password);
        entity.setRole(role);

        UserInfoEntity saved = service.validateAndSaveUserInfo(entity);

        List<UserInfoEntity> fetching = service.validateAndFetchAllDetails();
        System.out.println(fetching);

        req.setAttribute("email", email);
        req.setAttribute("password", password);
        req.setAttribute("role", role);

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);

//        resp.getWriter().print("Registration successful");
    }
}
