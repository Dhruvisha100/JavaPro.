import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class p5_2 extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        HttpSession session = req.getSession();
        int k = (int)session.getAttribute("k");
        k=k*k;
        
        PrintWriter out=res.getWriter();
        out.println("Result is "+k);
        
    }
}
