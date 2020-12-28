package controller;

import exception.*;
import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;

        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        try {
            customerService.update(new Customer(id, type, name, birthday, gender, idCard, phone, email, address));
            request.setAttribute("message","Updated customer !");
            listCustomer(request,response);
//            response.sendRedirect("/customers");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
//        String messageId = null;
//        String messageBirthday = null;
//        String messageIdCard = null;
//        String messagePhone = null;
//        String messageEmail = null;
//        boolean check = true;

        String id = null;
//        try {
            id = request.getParameter("id");
//            Validate.regexCustomerId(id);
////        } catch (IdException e) {
//            messageId = e.getMessage();
//            check = false;
//        }
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String birthday = null;
//        try {
            birthday = request.getParameter("birthday");
//            Validate.regexDate(birthday);
//        } catch (DateException e) {
//            messageBirthday = e.getMessage();
//            check = false;
//        }
        String gender = request.getParameter("gender");
        String idCard = null;
//        try {
            idCard = request.getParameter("idCard");
//            Validate.regexIdCard(idCard);
//        } catch (IdCardException e) {
//            messageIdCard = e.getMessage();
//            check = false;
//        }
        String phone = null;
//        try {
            phone = request.getParameter("phone");
//            Validate.regexPhone(phone);
//        } catch (NumberPhoneException e) {
//            messagePhone = e.getMessage();
//            check = false;
//        }
        String email = null;
//        try {
            email = request.getParameter("email");
//            Validate.regexEmail(email);
//        } catch (EmailException e) {
//            messageEmail = e.getMessage();
//            check = false;
//        }
        String address = request.getParameter("address");
//        if (!check) {
//            request.setAttribute("messageId", messageId);
//            request.setAttribute("messageBirthday", messageBirthday);
//            request.setAttribute("messageIdCard", messageIdCard);
//            request.setAttribute("messagePhone", messagePhone);
//            request.setAttribute("messageEmail", messageEmail);
//        } else {
            try {
                customerService.insert(new Customer(id, type, name, birthday, gender, idCard, phone, email, address));
                request.setAttribute("message","Added customer !");
                listCustomer(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
            case "edit":
                showEditCustomer(request, response);
                break;
            case "search":
                listSearch(request, response);
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }

    }

    private void listSearch(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Customer> listCustomer = customerService.findByName(name);
        request.setAttribute("listCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id_customer");
        try {
            customerService.delete(id);
            request.setAttribute("message","Deleted customer !");
            listCustomer(request,response);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
//            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void showDeleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/delete.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> listCustomer = customerService.findAll();
        request.setAttribute("listCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
