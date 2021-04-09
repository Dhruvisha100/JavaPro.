import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class p3_2 extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String uname = req.getAttribute("uname").toString();
        PrintWriter out = res.getWriter();
        out.println("Homepage\n");
        out.println("hello " + uname);
    }
}
