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
@WebServlet(name = "update_staff", urlPatterns = {"/update_staff"})
public class update_staff extends HttpServlet {
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
        Service_Staff staffService = new Service_Staff(em);
        String staffId = request.getParameter("staffId");
        String position = request.getParameter("position");
        String staffName = request.getParameter("staffName");
        String staffPass = request.getParameter("staffPass");
                
            if ((position == null) || (position.equals(""))) {      
                request.setAttribute("positionError", "Position required");
               
            }else{
                 request.setAttribute("position", position);
            }
            
             Pattern namePattern = Pattern.compile("^[a-zA-Z'-]+( [a-zA-Z'-]+)*$");
             Matcher nameMatcher = namePattern.matcher(staffName);
             
            if ((staffName == null) || (staffName.equals(""))) {      
                request.setAttribute("staffNameError", "staff Name required");
                
            }else if(!nameMatcher.matches()){
                request.setAttribute("staffNameError", "Invalid Name");
               
            }else{
                 request.setAttribute("staffName", staffName);
            }
            
            if ((staffPass == null) || (staffPass.equals(""))) {               
                request.setAttribute("passError", "Password required");
                
            }else if(staffPass.length()<8){         
                request.setAttribute("passError", "Password must be at least 8 character");
                
            }else{
                 request.setAttribute("staffPass", staffPass);
            }
        if(request.getAttribute("staffIdError") == null && request.getAttribute("positionError") == null && request.getAttribute("passError")==null && 
            request.getAttribute("staffNameError") == null){   
        try{
            Staff staff = new Staff(staffId, staffName, position, staffPass);

            utx.begin();
            boolean success = staffService.updateStaff(staff);
            utx.commit();
            HttpSession session = request.getSession();
            session.setAttribute("success", success);
            response.sendRedirect("/Ass/Manager/update_staff_result.jsp");
        } catch (Exception ex) {
            Logger.getLogger(add_staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("/Manager/edit_staff.jsp");
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
