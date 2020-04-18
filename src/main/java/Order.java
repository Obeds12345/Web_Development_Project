import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@WebServlet("/order")
public class Order extends HttpServlet {
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String card = request.getParameter("card");
            String date = request.getParameter("date");
            String cvCode = request.getParameter("cvCode");
            if (isNullOrEmpty(name) && isNullOrEmpty(email) && isNullOrEmpty(address) && isNullOrEmpty(card) && isNullOrEmpty(cvCode) && isNullOrEmpty(date)) {
                request.getSession().setAttribute("PayMessage", "Fields cant be Exmpty");
                response.sendRedirect(request.getHeader("referer"));
            }
            else {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date d = new Date();
                request.getSession().setAttribute("order_number", 10000 + new Random().nextInt(90000));
                request.getSession().setAttribute("date", dateFormat.format(d));
                request.getSession().setAttribute("name", name);
                request.getSession().setAttribute("address", address);
                request.getSession().setAttribute("card", card.substring(card.length() - 4));
                request.getSession().setAttribute("phone", phone);
                RequestDispatcher view = request.getRequestDispatcher("order.jsp");
                view.forward(request, response);
            }
        } catch (Exception e) {

        }
    }

}
