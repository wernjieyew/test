/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import entity.Service_Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author Yew
 */
@WebServlet(name = "staff_update_product", urlPatterns = {"/staff_update_product"})
public class staff_update_product extends HttpServlet {
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
         try{
            String prodId = request.getParameter("prodId");
            String prodName = request.getParameter("prodName");
            String prodDesc = request.getParameter("prodDesc");
            String prodPriceStr = request.getParameter("prodPrice");
            String prodStockStr = request.getParameter("prodStock");
            String prodSalesStr = request.getParameter("prodSales");
            String prodImg = request.getParameter("prodImg");
            
             
             if ((prodName == null) || (prodName.equals(""))) {      
                request.setAttribute("prodNameError", "Product Name required");

             }else{
                 request.setAttribute("prodName", prodName);
            }
             
            if ((prodDesc == null) || (prodDesc.equals(""))) {      
                request.setAttribute("prodDescError", "Product Description required");
              
             }else{
                 request.setAttribute("prodDesc", prodDesc);
            }
           

            double prodPrice=0;
            try {
                prodPrice = Double.parseDouble(prodPriceStr);
                request.setAttribute("prodPrice", String.valueOf(prodPrice)); 
            } catch (NumberFormatException e) {
                request.setAttribute("prodPriceError", "Product Price must be a valid number");
               
            }
            
            
            int prodStock=0;
            try {
                prodStock = Integer.parseInt(prodStockStr);
                request.setAttribute("prodStock", String.valueOf(prodStock)); 
            } catch (NumberFormatException e) {
                request.setAttribute("prodStockError", "Product Stock must be a valid number");
               
            }
            
            int prodSales=0;
            
            try {
                prodSales = Integer.parseInt(prodSalesStr);
                request.setAttribute("prodSales", String.valueOf(prodSales)); 
            } catch (NumberFormatException e) {
                request.setAttribute("prodSalesError", "Product Sales must be a valid number");
           
            }
            
            if ((prodImg == null) || (prodImg.equals(""))) {      
                request.setAttribute("prodImgError", "Product Image required");
                     
            }else{
                 request.setAttribute("prodImg", prodImg);
            }
            if(request.getAttribute("prodIdError") == null && request.getAttribute("prodNameError") == null && request.getAttribute("prodDescError") == null && 
            request.getAttribute("prodPriceError") == null&& request.getAttribute("prodStockError") == null&& request.getAttribute("prodSalesError") == null&& request.getAttribute("prodImgError") == null){    
            Product product = new Product(prodId, prodName, prodDesc, prodPrice, prodStock, prodSales, prodImg);
            Service_Product productService = new Service_Product(em);
            utx.begin();
            boolean success = productService.updateProduct(product);
            utx.commit();
            HttpSession session = request.getSession();
            session.setAttribute("success", success);
            response.sendRedirect("/Ass/Staff/update_product_result.jsp");
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("/Staff/edit_product.jsp");
                rd.include(request, response);    
            }
        } catch (Exception ex) {
            Logger.getLogger(add_product.class.getName()).log(Level.SEVERE, null, ex);
             ex.printStackTrace();
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
