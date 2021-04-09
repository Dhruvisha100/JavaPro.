
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class p4 extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        try {
            String ename = req.getParameter("ename");
            String x = emp_detail(ename);
            PrintWriter out = res.getWriter();
            out.println(x);

        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }

    public static String emp_detail(String e_name) throws Exception {
        String className = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/emp";
        String uname = "root";
        String pass = "";
        String query = "select * from employee where E_NAME='" + e_name + "'";
        Class.forName(className);
        Connection conn = DriverManager.getConnection(url, uname, pass);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        int id = 0, salary = 0;
        String name = "", dept = "";
        while (rs.next()) {

            id = rs.getInt("E_ID");
            name = rs.getString("E_NAME");
            dept = rs.getString("E_DEPT");
            salary = rs.getInt("E_SAL");
        }
        st.close();
        conn.close();
        String z = "Id:" + id + "\nName:" + name + "\nDept:" + dept + "\nSalary:" + salary;
        if (name == "") {
            z = "Invalid Username";
        }
        return (z);
    }
}
