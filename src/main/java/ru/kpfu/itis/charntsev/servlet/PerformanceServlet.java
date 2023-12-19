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
        for(Performance performance : performances) {
            System.out.println(performance.getName());
        }
        req.setAttribute("performances", performances);
        req.getRequestDispatcher("performances.jsp").forward(req, resp);

}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
