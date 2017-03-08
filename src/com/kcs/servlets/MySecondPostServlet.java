package com.kcs.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 2017-03-08.
 */
@WebServlet(value = "/submitForm")
public class MySecondPostServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String surname = req.getParameter("userSurname");

        req.setAttribute("name", name + "" + surname);

        req.getRequestDispatcher("welcome.jsp").forward(req,resp);
    }
}
