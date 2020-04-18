import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.getSession().setAttribute("errorMessage", "");
            request.getSession().setAttribute("errorMessage2", "");
            request.getSession().setAttribute("SuccessMessage", "");
            if (request.getParameter("login") != null) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                System.out.println("username "+username);
                System.out.println("password "+password);
                RequestDispatcher view;
                if (password.equals("James")  && username.equals("James") ){
                    view = request.getRequestDispatcher("index.jsp");  view.forward(request, response);
                    request.getSession().setAttribute("login", true);
                } else {
//                    view = request.getRequestDispatcher("login.jsp");
                    request.getSession().setAttribute("errorMessage", "Invalid username or password");
                    response.sendRedirect(request.getHeader("referer"));
                }

            } else if (request.getParameter("signup") != null) {
                String username = request.getParameter("username");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String password = request.getParameter("password");
                String confirmed = request.getParameter("confirmed");
                if (password.equals(confirmed) ){
                    request.getSession().setAttribute("SuccessMessage", "Account Succefully Create");
                    response.sendRedirect(request.getHeader("referer"));
                } else {
                    request.getSession().setAttribute("errorMessage2", "Password Doesn't Match");
                    response.sendRedirect(request.getHeader("referer"));
                }
            }
        } catch (Exception e) {

        }
    }

}
