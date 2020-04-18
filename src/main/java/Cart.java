
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/cart")
public class Cart extends HttpServlet {
    public void init() throws ServletException {
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.trim().isEmpty())
            return false;
        return true;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }


}
