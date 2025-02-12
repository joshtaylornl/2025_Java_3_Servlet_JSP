package ca.nl.cna.java3.servlet.intro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class demonstrates how to use the POST method to read form data
 * The data in this class came from FunWithNavigationServlet.java
 */
@WebServlet(name = "welcomeServlet", value = "/welcome-servlet")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();

        String name=request.getParameter("user_name");
        pwriter.print("Hello "+name+"!");
        pwriter.print(" Welcome to Beginnersbook.com");


    }
}
