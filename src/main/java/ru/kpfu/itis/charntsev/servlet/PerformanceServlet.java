package ru.kpfu.itis.charntsev.servlet;

import ru.kpfu.itis.charntsev.dao.PerformanceDao;
import ru.kpfu.itis.charntsev.model.Performance;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "performanceServlet", urlPatterns = "/performance")
public class PerformanceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PerformanceDao performanceDao = new PerformanceDao();
        List<Performance> performances = performanceDao.getAll();
        req.setAttribute("performances", performances);
        req.getRequestDispatcher("performances.jsp").forward(req, resp);

}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println();

        int masterId = Integer.parseInt(req.getParameter("masterId"));
        int serviceId = Integer.parseInt(req.getParameter("serviceId"));
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String phone = req.getParameter("phone");
        String dateTime = date + " " + time + ":00";

        JSONObject obj = new JSONObject();

        Appointment appointment = new Appointment(
                masterId,
                serviceId,
                phone,
                Timestamp.valueOf(dateTime)
        );

        AppointmentDao appointmentDao = new AppointmentDao();
        try {
            if (appointmentDao.checkTime(appointment)) {
                appointmentDao.save(appointment);
                obj.put("success", 1);
            } else {
                obj.put("success", 0);
                obj.put("masterBusy", 1);
            }
        } catch (Exception e) {
            obj.put("success", 0);
            obj.put("unknownError", 1);
            Logger.getLogger(getClass().getName()).severe(e.toString());
        }

        resp.setContentType("application/json");
        resp.getWriter().write(obj.toString());*/
    }
}
