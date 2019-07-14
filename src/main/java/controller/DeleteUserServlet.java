package controller;

import factory.UserServiceFactory;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/deleteUser")
public class DeleteUserServlet extends HttpServlet {
    private UserService userService = UserServiceFactory.getInnstance();

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        userService.deleteUser(Integer.valueOf(id));
        request.getRequestDispatcher("/Page_to_save.jsp").forward(request, response);
    }
}
