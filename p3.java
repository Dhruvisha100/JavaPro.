import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class p3 extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        
        String uname=req.getParameter("id");
        int pass=Integer.parseInt(req.getParameter("pass"));
        req.setAttribute("uname",uname);
        if((uname.equals("admin")) && (pass==123))
        {
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, res);
            res.sendRedirect("welcome");
            //res.sendRedirect("welcome?"+uname);
        }
        else
        {
            PrintWriter out = res.getWriter();
            out.println("Invalid User name and Password");
        }
    }
}
