import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
//        Discount Amount: Lượng chiết khấu
//        Discount Price: Giá sau khi đã được chiết khấu
        float disAmount = price * discount * 0.01f;
        float disPrice = price - disAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Description: " +description+ "</h2>");
        writer.println("<h2>List Price: " +price+ "</h2>");
        writer.println("<h2>Discount Percent: " +discount+ "</h2>");
        writer.println("<h2>Discount Amount: " +disAmount+ "</h2>");
        writer.println("<h2>Discount Price: " +disPrice+ "</h2>");
        writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
