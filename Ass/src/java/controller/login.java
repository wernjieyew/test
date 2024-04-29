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

/**
 *
 * @author Yew
 */
@WebServlet(name = "login", urlPatterns = {"/login"})

public class login extends HttpServlet {
    
@PersistenceContext EntityManager em;
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
                
        String name = request.getParameter("username");
        String password = request.getParameter("custPass");
        
        if ((name == null) || (name.equals(""))) {      
                request.setAttribute("usernameError", "Username required");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            }else if ((password == null) || (password.equals(""))) { 
                request.setAttribute("username", name);
                request.setAttribute("passError", "password required");
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.include(request, response);
            }else{
        
                try{
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ArtDb","nbuser","nbuser");

                    String query = "SELECT * FROM CUSTOMER WHERE USERNAME =?";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, name);
                    ResultSet rs = stmt.executeQuery();

                    if(rs.next()){
                        String dbName = rs.getString("USERNAME");
                        String dbPassword = rs.getString("CUST_PASS");

                        if(password.equals(dbPassword)){
                            Customer cust = em.find(Customer.class,name);

                            HttpSession session = request.getSession();
                            session.setAttribute("username", name);

                            session.setAttribute("Customer", cust);

                            RequestDispatcher rd = request.getRequestDispatcher("Customer/customer_homepage.jsp");
                            rd.forward(request, response); 
                        }else{
                            request.setAttribute("username", name);
                            request.setAttribute("errorMessage", "Invalid password.");
                            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                            rd.forward(request, response);
                        }     
                    }else{
                         request.setAttribute("errorMessage", "Invalid username or password");
                         RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                         rd.include(request, response);
                    }     
                }catch(SQLException ex) {
                    ex.printStackTrace();
                request.setAttribute("errorMessage", "Database error occurred.");
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.include(request, response);
                }
            }
           out.close();
    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
