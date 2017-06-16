/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EInconsistencie;
import model.ERequestState;
import model.Parameter;

/**
 *
 * @author Ximena
 */
public class ServletFormUI extends HttpServlet {

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
        String requesterid = request.getParameter("requesterid"),
               requestername = request.getParameter("requestername"),
               studentid = request.getParameter("studentid"),
               studentname = request.getParameter("studentname"),
               email = request.getParameter("email"),
               phone = request.getParameter("phone"),
               period = request.getParameter("period"),
               course = request.getParameter("course").split(" ")[0],
               group = request.getParameter("group"),
               details = request.getParameter("details");
        
        DTORequest req = new DTORequest();
        req.setRequesterId(requesterid);
        req.setRequesterName(requestername);
        req.setIdStudent(studentid);
        req.setNameStudent(studentname);
        req.setEmail(email);
        req.setPhone(phone);
        req.setPeriod(period);
        req.setCodCourse(course);
        req.setNumGroup(Integer.parseInt(group));
        req.setDescription(details);
        req.setDate(Calendar.getInstance().getTime());
        req.setInconsistence(EInconsistencie.RecordModification);
        req.setState(ERequestState.PENDING);
        
        School.getInstance().insertRequest(req);
        String idrequest = Parameter.getInstance().getParameter("request_serial");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.print("Se ha creado la solicitud con exito, el ID de la misma es: "
                    + idrequest + ". Utilice este valor para consultar el estado "
                    + "de la misma más abajo.");
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

}
