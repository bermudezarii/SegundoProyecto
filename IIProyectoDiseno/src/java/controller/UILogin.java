/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import model.EEmployeeRol;
import model.Employee;
import org.jfree.data.category.DefaultCategoryDataset;
import view.FrLogin;
import view.FrMain;
import view.FrRequest;
import view.FrResolution;
import view.FrStadistics;
import view.FrSuperUser;
import view.FrTemplate;
import view.FrViewRequest;
import view.NewTemplate;

/**
 *
 * @author Ximena
 */
public class UILogin implements  UIBase, ObserverUI {
    private DTOEmployee dto;
    private FacadeLogin facadelogin; 

    public UILogin() {
        this.facadelogin = new FacadeLogin(); 
    }

    public void login(FrLogin aThis) {
        dto = new DTOEmployee(); 
        dto.setId(aThis.getTextFieldUser().getText());
        dto.setPassword(aThis.getTextFieldPassword().getText());
        if(facadelogin.login(dto) == true){
            Employee employee = facadelogin.findEmployee(dto.getId()); 
            System.out.println("empleado encontrado: "+ employee.toString());
            if(employee.getRol() == EEmployeeRol.ASSINTANT || employee.getRol() == EEmployeeRol.CORDINATOR || employee.getRol() == EEmployeeRol.HEADMASTER){
                System.out.println("lalala 1");
                FrMain fr=new FrMain();
                System.out.println("lalala 2");
                fr.setEmployee(employee);
                System.out.println("lalala 3");
                fr.setMenu(); 
                fr.setVisible(true);
                aThis.setVisible(false);
            }
            else if(employee.getRol() == EEmployeeRol.SUPERUSER){
                FrSuperUser fr=new FrSuperUser();
                fr.setVisible(true);
                aThis.setVisible(false);
            }
            else if( employee.getRol() == EEmployeeRol.PROFESSOR){
                JOptionPane.showMessageDialog(aThis, "Si es profesor, por favor utilizar la pagina habilitada, gracias");
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(aThis, "Se ha ingresado un usuario o contraseña incorrecta.");
        }
      
    }

    @Override
    public Object getFacade() {
        return facadelogin; 
    }

    @Override
    public void setFacade(Object facade) {
        FacadeLogin o = (FacadeLogin) facade; 
        this.facadelogin = o; 
    }

    @Override
    public DTORequest getDtoRequest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDtoRequest(DTORequest dtoRequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createRequest(FrRequest frrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setallGroups(FrRequest frrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setallCourses(FrRequest frrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setallPeriods(FrRequest frrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setallRequest(FrViewRequest frviewrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRequest(FrViewRequest frviewrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CancelRequest(FrViewRequest frviewrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createResolution(FrResolution frResolution) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createResolutionDoc(EDocType type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getResolution(FrResolution frResolution) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void processedRequestsInDateRange(FrStadistics frstadistics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getRequest(FrStadistics frstadistics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setallPeriods(FrStadistics frstadistics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultCategoryDataset top5CoursesResolutionsByPeriod(FrStadistics frstadistics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultCategoryDataset top3ProfessorsResolutions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createTemplate(NewTemplate frtemplate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertParam(JTextArea txt, int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void selectTemplates(FrTemplate template) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getTemplate(FrTemplate template) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
