package pl.sda.twitter.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        String username = "admin";
        if (login.equals(username) && password.equals("password")) {
            HttpSession session = req.getSession();
            session.setAttribute("user", username);
            writer.write("Dane logowania są poprawne");
            resp.sendRedirect(req.getContextPath()+"/");
        } else {
            writer.write("Dane logowania są niepoprawne");
        }
    }
}
