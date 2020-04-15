import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/index")
public class Index extends HttpServlet {
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.getWriter().println("Contact Works");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
