/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.EEmployeeRol;
import org.apache.commons.validator.routines.EmailValidator;
import view.FrSuperUser;


/**
 *
 * @author Usuario
 */
public class UISuperUser {
    private FacadeSuperuser facadeSuperuser; 
    private DTOEmployee dto;
    private DAOData data; 
    
    public UISuperUser(){
        facadeSuperuser = new FacadeSuperuser(); 
    }

    public FacadeSuperuser getFacadeSuperuser() {
        return facadeSuperuser;
    }

    public void setFacadeSuperuser(FacadeSuperuser facadeSuperuser) {
        this.facadeSuperuser = facadeSuperuser;
    }

    public DTOEmployee getDto() {
        return dto;
    }

    public void setDto(DTOEmployee dto) {
        this.dto = dto;
    }
    
    public void createEmployee(FrSuperUser frsuper){
        System.out.println("aqui 1");
        dto =new DTOEmployee();
        String id = frsuper.getTextFieldAddUsername().getText(); 
        String name = frsuper.getTextFieldAddName().getText(); 
        String email = frsuper.getTextFieldAddEmail().getText(); 
        String phone = frsuper.getTextFieldAddPhone().getText(); 
        String password = frsuper.getPasswordFieldAddPassword().getText();
        String rol = frsuper.getComboBoxRol().getItemAt(frsuper.getComboBoxRol().getSelectedIndex());
               
        System.out.println(email);
        System.out.println(phone);
        if(EmailValidator.getInstance().isValid(email)&&phone.matches("\\d{4}[-\\.\\s]\\d{4}||\\d{8}")){
            dto.setId(id);
            dto.setName(name);
            dto.setPhone(phone);
            dto.setEmail(email);
            dto.setRol(data.identifyEEmployeeRol(rol));
            dto.setRol(EEmployeeRol.PROFESSOR);
            dto.setPassword(password);
        facadeSuperuser.insertEmployee(dto);
        JOptionPane.showMessageDialog(frsuper, "Se ha Creado Una Empleado con Éxito.");
        FrSuperUser fr=new FrSuperUser();
        fr.setVisible(true);
        frsuper.setVisible(false);
        }else{
         JOptionPane.showMessageDialog(frsuper, "Se ha Ingresado un Correo o Número de Teléfono Inválido.");
        }
    }
     
    
}
