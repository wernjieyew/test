/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Resource;
import javax.persistence.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import javax.transaction.UserTransaction;

/**
 *
 * @author Yew
 */
@WebServlet(name = "update_customer", urlPatterns = {"/update_customer"})
public class update_customer extends HttpServlet {
  @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            Service_Customer customerService = new Service_Customer(em);
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String pass = request.getParameter("pass");     
            String address = request.getParameter("address");
                
             Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
             Matcher emailMatcher = emailPattern.matcher(email);
        
            if ((email == null) || (email.equals(""))) {               
                request.setAttribute("emailError", "Email required");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else if(!emailMatcher.matches()){          
                request.setAttribute("emailError", "Invalid Email");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else{
                request.setAttribute("email", email);
            }
            
            if ((pass == null) || (pass.equals(""))) {               
                request.setAttribute("passError", "Password required");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else if(pass.length()<8){         
                request.setAttribute("passError", "Password must be at least 8 character");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else{
                 request.setAttribute("pass", pass);
            }           
            
            Pattern phonePattern = Pattern.compile("^\\d{10}$");
            Matcher phoneMatcher = phonePattern.matcher(phone);
            
            if ((phone == null) || (phone.equals(""))) {
                request.setAttribute("phoneError", "Contact.No required");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else if(!phoneMatcher.matches()){    
                request.setAttribute("phoneError", "Invalid Contact.No");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else{
                request.setAttribute("phone", phone);
            }
            
            if ((address == null) || (address.equals(""))||address.isEmpty()) {     
                request.setAttribute("addressError", "Address required");
                RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_customer.jsp");
                rd.include(request, response);
            }else{
                request.setAttribute("address", address);
            }
        if (request.getAttribute("emailError") == null && request.getAttribute("passError")==null && 
            request.getAttribute("phoneError") == null && request.getAttribute("addressError") == null){   
        try {
            Customer customer = new Customer(username,pass,email,phone,address);

            utx.begin();
            boolean success = customerService.updateCustomer(customer);
            utx.commit();
            HttpSession session = request.getSession();
            session.setAttribute("success", success);
            response.sendRedirect("/Ass/Manager/update_customer_result.jsp");
        } catch (Exception ex) {
            Logger.getLogger(add_customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
