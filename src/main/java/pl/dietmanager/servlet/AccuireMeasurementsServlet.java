package pl.dietmanager.servlet;

import pl.dietmanager.model.Measurements;
import pl.dietmanager.model.MeasurementsBuilder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/measurements")
public class AccuireMeasurementsServlet extends HttpServlet {


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Measurements measurements = new MeasurementsBuilder()
                .withPerson(request.getParameter("name"))
                .withDate(LocalDate.parse(request.getParameter("date")))
                .withWeight(new BigDecimal(request.getParameter("weight")))
                .withHeight(new BigDecimal(request.getParameter("height")))
                .withBust(new BigDecimal(request.getParameter("bust")))
                .withUnderTheBust(new BigDecimal(request.getParameter("underBust")))
                .withWaistLowest(new BigDecimal(request.getParameter("waistLowest")))
                .withWaistLargest(new BigDecimal(request.getParameter("waistLargest")))
                .withWaistAboveHips(new BigDecimal(request.getParameter("waistAboveHips")))
                .withHip(new BigDecimal(request.getParameter("hip")))
                .withThighLargest(new BigDecimal(request.getParameter("thighLargest")))
                .withThigh(new BigDecimal(request.getParameter("thigh")))
                .withThighLowest(new BigDecimal(request.getParameter("thighLowest")))
                .withCalfBelowKnee(new BigDecimal(request.getParameter("calfBelowKnee")))
                .withCalf(new BigDecimal(request.getParameter("calf")))
                .withAnkle(new BigDecimal(request.getParameter("ankle")))
                .withArmByShoulder(new BigDecimal(request.getParameter("armByShoulder")))
                .withArm(new BigDecimal(request.getParameter("arm")))
                .withWrist(new BigDecimal(request.getParameter("wrist")))
                .build();

        System.out.println("measurements.toString() = " + measurements.toString());
        RequestDispatcher dispatcher = request.getRequestDispatcher("Measurements.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        RequestDispatcher dispatcher = request.getRequestDispatcher("Measurements.jsp");
        dispatcher.forward(request, response);
    }

}
