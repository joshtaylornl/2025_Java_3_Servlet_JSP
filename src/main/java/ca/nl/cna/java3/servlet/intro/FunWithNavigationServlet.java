package ca.nl.cna.java3.servlet.intro;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * This class shows the use of RequestDispatcher to forward the request to another servlet
 */
@WebServlet(name = "funWithNavigationServlet", value = "/fun-with-navigation-servlet")
public class FunWithNavigationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//      This following code will dump all parameter information

        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
        String name = request.getParameter("user_name");
        String pass = request.getParameter("user_password");
        if(name.equals("Chaitanya") &&
                pass.equals("beginnersbook"))
        {
            RequestDispatcher dis=request.getRequestDispatcher("welcome-servlet");
            dis.forward(request, response);
        }
        else
        {
            pwriter.print("User name or password is incorrect!");
            RequestDispatcher dis=request.getRequestDispatcher("index.html");
            dis.include(request, response);
        }

//        PrintWriter pwriter=response.getWriter();
//        response.setContentType("text/html");
//        Enumeration<String> en = request.getParameterNames();
//
//        while(en.hasMoreElements())
//        {
//            Object obj=en.nextElement();
//            String param=(String)obj;
//            String pvalue=request.getParameter(param);
//            pwriter.print("request Name: "+param+
//                    " Parameter Value: "+pvalue);
//        }
//        pwriter.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
        String name=request.getParameter("user_name");
        String pass=request.getParameter("user_password");
        if(name.equals("Chaitanya") &&
                pass.equals("beginnersbook"))
        {
            RequestDispatcher dis = request.getRequestDispatcher("welcome-servlet");
            dis.forward(request, response);
        }
        else
        {
            pwriter.print("User name or password is incorrect!");
            //TODO navigate this so the error message is diplayed with the form
            RequestDispatcher dis = request.getRequestDispatcher("index.html");
            dis.include(request, response);
        }

    }
}
