package ca.nl.cna.java3.servlet.intro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * A servlet that demonstrates how to dump header information
 */
@WebServlet(name = "headerServlet", value = "/header-servlet")
public class HeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doGet(request, response);
        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();

        pwriter.println("HTTP header Information:<br>");

        Enumeration<String> en = request.getHeaderNames();
        while (en.hasMoreElements()) {
            String hName = en.nextElement();
            String hValue = request.getHeader(hName);
            pwriter.println("<b>"+hName+": </b>"
                    +hValue + "<br>");
        }


    }
}
