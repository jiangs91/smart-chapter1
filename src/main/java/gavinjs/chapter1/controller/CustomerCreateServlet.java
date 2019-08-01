package gavinjs.chapter1.controller;

import gavinjs.chapter1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//tomcat无法启动是因为少了一个/
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {
    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO

        req.getRequestDispatcher("/WEB-INF/view/customer_create.jsp").forward(req, resp);
    }
}
