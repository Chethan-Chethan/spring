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

@WebServlet(urlPatterns = "/viewById")
public class ViewByIdServlet extends HttpServlet {

    ComplaintService service = new ComplaintServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fetching from servlet");

        UserInfoEntity fetched = service.validateAndFetchById(Integer.parseInt(req.getParameter("userId")));
        System.out.println(fetched);

        req.setAttribute("view", fetched);

        req.getRequestDispatcher("viewById.jsp").forward(req, resp);

    }
}
