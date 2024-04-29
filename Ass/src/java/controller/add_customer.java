/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import entity.Service_Customer;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.*;
import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.transaction.UserTransaction;
import javax.servlet.RequestDispatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Yew
 */
@WebServlet(name = "add_customer", urlPatterns = {"/add_customer"})
public class add_customer extends HttpServlet {
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
            String username = request.getParameter("username");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            
            if ((username == null) || (username.equals(""))) {      
                request.setAttribute("usernameError", "Username required");
            }else{
                 request.setAttribute("username", username);
            }
            
             Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
             Matcher emailMatcher = emailPattern.matcher(email);
        
            if ((email == null) || (email.equals(""))) {               
                request.setAttribute("emailError", "Email required");
            }else if(!emailMatcher.matches()){          
                request.setAttribute("emailError", "Invalid Email");
            }else{
                request.setAttribute("email", email);
            }
            
            if ((pass == null) || (pass.equals(""))) {               
                request.setAttribute("passError", "Password required");
            }else if(pass.length()<8){         
                request.setAttribute("passError", "Password must be at least 8 character");

            }else{
                 request.setAttribute("pass", pass);
            }           
            
            Pattern phonePattern = Pattern.compile("^\\d{10}$");
            Matcher phoneMatcher = phonePattern.matcher(phone);
            
            if ((phone == null) || (phone.equals(""))) {
                request.setAttribute("phoneError", "Contact.No required");
            }else if(!phoneMatcher.matches()){    
                request.setAttribute("phoneError", "Invalid Contact.No");
            }else{
                request.setAttribute("phone", phone);
            }
            
            if ((address == null) || (address.equals(""))||address.isEmpty()) {     
                request.setAttribute("addressError", "Address required");
            }else{
                request.setAttribute("address", address);
            }
            
        if (request.getAttribute("usernameError") == null && request.getAttribute("emailError") == null && request.getAttribute("passError")==null && 
            request.getAttribute("phoneError") == null && request.getAttribute("addressError") == null){   
            try{
                Customer customer = new Customer(username,pass,email,phone,address);
                Service_Customer customerService = new Service_Customer(em);
                utx.begin();
                boolean success = customerService.addCustomer(customer);
                utx.commit();
                HttpSession session = request.getSession();
                session.setAttribute("success", success);
                response.sendRedirect("/Ass/Manager/add_customer_result.jsp");
            } catch (Exception ex) {
                Logger.getLogger(add_staff.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else{
              RequestDispatcher rd = request.getRequestDispatcher("/Manager/add_customer.jsp");
              rd.include(request, response);
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
