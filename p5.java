import java.io.IOException;
import javax.servlet.http.*;

public class p5 extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i + j;

        HttpSession session = req.getSession();
        session.setAttribute("k", k);

        res.sendRedirect("p5_2");

    }
}
