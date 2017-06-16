/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ERequestState;
import model.Request;

/**
 *
 * @author Ximena
 */
public class ServletConsultUI extends HttpServlet {

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
        response.setStatus(200);
        
        try (PrintWriter out = response.getWriter()) {
            String reqid = request.getParameter("request");
            out.print("<h3>");
         
            if(!reqid.isEmpty()) { 
                Request res = School.getInstance().selectRequest(reqid); 

                if(res == null) 
                    out.print("La solicitud con dicho ID no existe."); 
                else 
                    out.print(stateAsString(res.getRequestState())); 
            } else { 
                out.print("Ingrese un ID para buscar."); 
            }
            
            out.print("</h3>");
            out.close();
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
    
    private String stateAsString(ERequestState state) {
        switch(state) {
            case CANCELED:
                return "<font color=\"red\">Cancelada.</font>";
            
            case PENDING:
                return "<font color=\"yellow\">Pendiente.</font>";
                
            case PROCESSED:
                return "<font color=\"green\">Tramitada.</font>";
        }
        
        return "";
    }
}
