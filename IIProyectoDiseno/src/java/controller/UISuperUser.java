/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.EEmployeeRol;
import model.Employee;
import org.apache.commons.validator.routines.EmailValidator;
import view.FrSuperUser;


/**
 *
 * @author Usuario
 */
public class UISuperUser {
    private FacadeSuperuser facadeSuperuser; 
    private DTOEmployee dto;
    
    
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
            System.out.println("the rol is: "+ rol);
            dto.setRol(identifyEEmployeeRol(rol));
            
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
     
    public ArrayList<Object> selectAllEmployee(){
        return facadeSuperuser.selectAllEmployees(); 
    }
    
    public void editEmployee(FrSuperUser frsuper){
        dto = new DTOEmployee(); 
        Employee employee = (Employee) frsuper.getjComboBoxModUsuarios().getSelectedItem();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setPhone(employee.getPhone());
        dto.setRol(employee.getRol());
        dto.setPassword(employee.getPassword());
        
        if(!frsuper.getjTextFieldModId().getText().equals("")){
            System.out.println("1");
            dto.setId(frsuper.getjTextFieldModId().getText());
        }
        if(!frsuper.getjTextFieldModName().getText().equals("")){
            System.out.println("2");
            dto.setName(frsuper.getjTextFieldModName().getText());
        }
        if(!frsuper.getjTextFieldModPhone().getText().equals("")){
            System.out.println("3");
            dto.setPhone(frsuper.getjTextFieldModPhone().getText());
        }
        if(frsuper.getjCheckBoxModRol().isSelected() == true){
            dto.setRol(identifyEEmployeeRol(frsuper.getjComboBoxModRol().getItemAt(frsuper.getjComboBoxModRol().getSelectedIndex())));
        }
        if(!frsuper.getjPasswordFieldModPass1().getText().equals("")){
            System.out.println("4");
            dto.setPassword(frsuper.getjPasswordFieldModPass1().getText());
        }
        if(!frsuper.getjTextFieldModId().getText().equals("") && !frsuper.getjTextFieldModEmail().getText().equals("")){
            System.out.println("5");
            facadeSuperuser.editEmployee(dto);
            System.out.println(selectAllEmployee().toString());
            System.out.println("5.1");
            dto.setEmail(frsuper.getjTextFieldModEmail().getText());
            System.out.println("5.2");
        }
        if(frsuper.getjTextFieldModId().getText().equals("") && !frsuper.getjTextFieldModEmail().getText().equals("")){
            System.out.println("6");
            dto.setEmail(frsuper.getjTextFieldModEmail().getText());
        }
        facadeSuperuser.editEmployee(dto);
        JOptionPane.showMessageDialog(frsuper, "Se ha Modificado Una Empleado con Éxito.");
        FrSuperUser fr=new FrSuperUser();
        fr.setVisible(true);
        frsuper.setVisible(false);
        
    }
    
        public EEmployeeRol identifyEEmployeeRol(String rol) { 
        switch (rol) { 
            case "DIRECTOR": 
                return EEmployeeRol.HEADMASTER; 
            case "COORDINADOR": 
                return EEmployeeRol.CORDINATOR; 
            case "PROFESOR": 
                return EEmployeeRol.PROFESSOR; 
            case "ASISTENTE": 
                return EEmployeeRol.ASSINTANT; 
            case "SUPERUSUARIO": 
                return EEmployeeRol.SUPERUSER; 
            default:  
                break; 
        } 
        return null;  
    } 

    public void deleteEmployee(FrSuperUser frsuper) {
        System.out.println(frsuper.getjComboBoxModRol().getSelectedIndex());
        Employee employee = (Employee) frsuper.getjComboBoxDelUsuario().getSelectedItem(); 
        System.out.println("id: " + employee.getId());
        facadeSuperuser.deleteEmployee(employee.getId()); 
        JOptionPane.showMessageDialog(frsuper, "Se ha Eliminado Una Empleado con Éxito.");
        FrSuperUser fr=new FrSuperUser();
        fr.setVisible(true);
        frsuper.setVisible(false);
    }
}
