package pl.dietmanager.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/measurements")
public class AccuireMeasurementsServlet extends HttpServlet {


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String bust = request.getParameter("bust");
        System.out.println("bust = " + bust);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Measurements.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        RequestDispatcher dispatcher = request.getRequestDispatcher("Measurements.jsp");
        dispatcher.forward(request, response);
    }

}
