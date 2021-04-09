
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import java.lang.Math;

public class p2 extends HttpServlet {
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        
        double z=Math.pow(i, j);
        PrintWriter out=res.getWriter();
        out.println(i+"^"+j+"="+z);
        
    }
}
