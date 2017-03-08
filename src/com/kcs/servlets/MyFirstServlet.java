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

@WebServlet(value = "/myTestServletPath")
public class MyFirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String name = "Petras";
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        req.setAttribute("name", name +" " + surname); //myTestServletPath?name=Petras&surname=Petraitis
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);
       // resp.sendRedirect("/welcome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
