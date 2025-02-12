package ca.nl.cna.java3.servlet.intro;

import java.io.*;

import ca.nl.cna.java3.servlet.session.Foo;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        //Setup the foo for later Session example
        HttpSession session = request.getSession();
        session.setAttribute(Foo.NAME, new Foo(666, "Hello Servlet Foo"));
    }


    public void destroy() {
    }
}