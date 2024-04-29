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
import javax.servlet.http.HttpSession;
import java.sql.*;
import entity.*;
import javax.persistence.*;
import javax.servlet.RequestDispatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Yew
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
            String username = request.getParameter("username");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String confirmPass = request.getParameter("confirmPass");
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
            
            if ((confirmPass == null) || (confirmPass.equals(""))) { 
                request.setAttribute("confirmpassError", "Confirm password required");
               
            }else if(!confirmPass.equals(pass)){
                request.setAttribute("confirmpassError", "Confirm password and password not match");
               
            }else{
                request.setAttribute("confirmPass", confirmPass);
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
            
            if ((address == null) || (address.equals(""))) {     
                request.setAttribute("addressError", "Address required");
              
            }else{
                request.setAttribute("address", address);
            }
            
        if (request.getAttribute("usernameError") == null && request.getAttribute("emailError") == null && request.getAttribute("passError")==null && 
            request.getAttribute("confirmpassError") == null && request.getAttribute("phoneError") == null && request.getAttribute("addressError") == null){   
            try{
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtDb","nbuser","nbuser"); 
                String queryUsername = "SELECT * FROM CUSTOMER WHERE username=?";
                PreparedStatement pstmtUsername = conn.prepareStatement(queryUsername);
                pstmtUsername.setString(1, username);
                ResultSet rsUsername = pstmtUsername.executeQuery();
                if (rsUsername.next()) {
                    request.setAttribute("usernameError", "Username already exists");
                    RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
                    rd.include(request, response);
                    return; 
                }

                String queryStr = "INSERT INTO CUSTOMER VALUES(?, ?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(queryStr);
                pstmt.setString(1, username);
                pstmt.setString(2, pass);
                pstmt.setString(3, email);                    
                pstmt.setString(4, phone);
                pstmt.setString(5, address);
                pstmt.executeUpdate();
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response);


            }catch(SQLException ex) {
            ex.printStackTrace();
            request.setAttribute("errorMessage", "Database error occurred.");
            RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
            rd.include(request, response);
            }
         out.close();
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
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
