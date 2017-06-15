/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.EEmployeeRol;
import model.Employee;
import view.FrLogin;
import view.FrSuperUser;

/**
 *
 * @author Ximena
 */
public class UILogin extends AbstractBridge implements  UIBase {
    private DTOEmployee dto;
    private FacadeLogin facadelogin; 
    public void login(){}

    public UILogin() {
        this.facadelogin = new FacadeLogin(); 
    }

    
    @Override
    public void setFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void matchEmployee(FrLogin aThis) {
        dto = new DTOEmployee(); 
        dto.setId(aThis.getTextFieldUser().getText());
        dto.setPassword(aThis.getTextFieldPassword().getText());
        System.out.println("aqui 1 ");
        System.out.println("id: " + dto.getId() + ", password: " + dto.getPassword());
        System.out.println("lo que tira el facade: " + facadelogin.matchEmployee(dto));
        if(facadelogin.matchEmployee(dto) == true){
            System.out.println("aqui 2 ");
            Employee employee = facadelogin.findEmployee(dto.getId()); 
            System.out.println("empleado encontrado: "+ employee.toString());
            if(employee.getRol() == EEmployeeRol.ASSINTANT){
                System.out.println("aqui va el frame de asistente");
             
            }
            else if (employee.getRol() == EEmployeeRol.CORDINATOR){
                System.out.println("aqui va el frame de coordinador");
            }
            else if(employee.getRol() == EEmployeeRol.HEADMASTER){
                System.out.println("aqui va el frame de asistente");
            }
            else if(employee.getRol() == EEmployeeRol.PROFESSOR){
                System.out.println("aqui va el frame de asistente");
            }
            else if(employee.getRol() == EEmployeeRol.SUPERUSER){
                FrSuperUser fr=new FrSuperUser();
                fr.setVisible(true);
                aThis.setVisible(false);
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(aThis, "Se ha ingresado un usuario o contraseña incorrecta.");
        }
      
    }
    
    
   
}
