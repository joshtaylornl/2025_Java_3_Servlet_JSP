package ca.nl.cna.java3.servlet.session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet (name = "funWithHttpSessions", value = "/fun-with-http-sessions")
public class FunWithHttpSessions extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Foo foo = (Foo) session.getAttribute(Foo.NAME);
        if(foo == null){
            foo = new Foo(0, "Hello Servlet Foo");
            session.setAttribute(Foo.NAME, foo);
        }

        //Retrieve the foo values from the from via the request
        String id = request.getParameter("foo_id");
        String value = request.getParameter("foo_value");

        if(!(id == null || value == null)){
            //Set the new values
            foo.setId(Integer.parseInt(id));
            foo.setValue(value);
        }

        //Forward back to the jsp
        RequestDispatcher dis=request.getRequestDispatcher("SessionVariableForm.jsp");
        dis.forward(request, response);

    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Foo foo = (Foo) session.getAttribute(Foo.NAME);
        if(foo == null){
            foo = new Foo(0, "Hello Servlet Foo");
        }

        String id = request.getParameter("foo_id");
        String value = request.getParameter("foo_value");

        foo.setId(Integer.parseInt(id));
        foo.setValue(value);

        session.setAttribute(Foo.NAME, foo);

        RequestDispatcher dis=request.getRequestDispatcher("SessionVariableForm.jsp");
        dis.forward(request, response);
    }
}
