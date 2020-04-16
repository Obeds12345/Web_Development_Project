import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet("/shop")
public class Shop extends HttpServlet {
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HashMap<String, List<String>> ItemsList = new HashMap<String, List<String>>();
        List<HashMap> ItemsList = new ArrayList<HashMap>();
        try {
            ItemsList = Items.getItems();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        request.setAttribute("items", ItemsList);
        RequestDispatcher view = request.getRequestDispatcher("shop.jsp");
        view.forward(request, response);
    }

}
