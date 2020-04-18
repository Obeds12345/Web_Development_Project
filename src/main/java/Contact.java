import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/contact")
public class Contact extends HttpServlet {
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.getWriter().println("Contact Works");
        request.getRequestDispatcher("contact.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String name = request.getParameter("message");
            String email = request.getParameter("email");
            String message = request.getParameter("message");
            String reason = request.getParameter("reason");

            if (request.getParameter("contact") != null) {
                request.getSession().setAttribute("contactMessage", "Thanks for contacting us our staff will get to you soon.");
                response.sendRedirect(request.getHeader("referer"));
            } else if (request.getParameter("signup") != null) {
                response.sendRedirect(request.getHeader("referer"));
            }
        } catch (Exception e) {

        }
    }

}
