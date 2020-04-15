import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/about")
public class About extends HttpServlet {
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.getWriter().println("About works");
        request.getRequestDispatcher("about.jsp").forward(request, response);
    }

}
