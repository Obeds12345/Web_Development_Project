import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/workshop")
public class WorkShop extends HttpServlet {
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.getWriter().println("About works");
        request.getRequestDispatcher("workshop.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String date = request.getParameter("phone");
            String time = request.getParameter("password");
            String appointmentfor = request.getParameter("appointmentfor");
            if (request.getParameter("makeAppointment") != null) {
                System.out.println(name + " " + email + " " + date + " " + time + " " + appointmentfor);
                response.sendRedirect(request.getHeader("referer"));

            } else if (request.getParameter("signup") != null) {
                response.sendRedirect(request.getHeader("referer"));
            }
        } catch (Exception e) {

        }
    }

}
