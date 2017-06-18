/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
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
public class UILogin  {
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
                if(employee.getRol() == EEmployeeRol.ASSINTANT){
                    FrMain fr=new FrMain(new UIAssistant());
                    fr.setVisible(true);
                }
                else if(employee.getRol() == EEmployeeRol.CORDINATOR){
                     FrMain fr=new FrMain(new UICoordinator());
                     fr.setVisible(true);
                }
                else if(employee.getRol() == EEmployeeRol.HEADMASTER){
                     FrMain fr=new FrMain(new UIHeadmaster());
                     fr.setVisible(true);
                }
                
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

   
}
