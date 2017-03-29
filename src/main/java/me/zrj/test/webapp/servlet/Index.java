package me.zrj.test.webapp.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 练手 web 工程的首页
 * Created by ZRJ on 2017/3/27.
 */
@WebServlet("/index")
public class Index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<p>" + "hello" + "</p>");
        printWriter.println("<p>" + Math.random() + "</p>");
        printWriter.println("<p>" + new Date() + "</p>");
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<p>" + "greeting" + "</p>");
        printWriter.println("<p>" + Math.random() + "</p>");
        printWriter.println("<p>" + new Date() + "</p>");
        printWriter.close();
    }
}
