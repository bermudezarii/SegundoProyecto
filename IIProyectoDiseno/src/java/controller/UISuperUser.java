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
     
    public void selectAllEmployee(FrSuperUser frsu){
        if(frsu.getjComboBoxModUsuarios().getItemCount()!=0||frsu.getjComboBoxDelUsuario().getItemCount()!=0){
            frsu.getjComboBoxModUsuarios().removeAllItems();
            frsu.getjComboBoxDelUsuario().removeAllItems();
        }
        Employee e;
        for(Object o:facadeSuperuser.selectAllEmployees()){
           e=(Employee)o;
           frsu.getjComboBoxModUsuarios().addItem(e.getId());
           
           frsu.getjComboBoxDelUsuario().addItem(e.getId());
           
           
        }
    }
    public void selectEmployee(FrSuperUser frsu,String id){
        Employee e=facadeSuperuser.selectEmployee(id);
        frsu.getLbName().setText(e.getName());
        frsu.getLbName1().setText(e.getName());
        frsu.getjTextFieldModId().setText(e.getId());
        frsu.getjTextFieldModEmail().setText(e.getEmail());
        frsu.getjTextFieldModName().setText(e.getName());
        frsu.getjTextFieldModPhone().setText(e.getPhone());
        
    
    }
    public void editEmployee(FrSuperUser frsuper,String id){
        dto = new DTOEmployee(); 
        Employee employee = facadeSuperuser.selectEmployee(id);
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setPhone(employee.getPhone());
        dto.setRol(employee.getRol());
        dto.setPassword(employee.getPassword());
        
        if(!frsuper.getjTextFieldModId().getText().equals("")){
        
            dto.setId(frsuper.getjTextFieldModId().getText());
        }
        if(!frsuper.getjTextFieldModName().getText().equals("")){
           
            dto.setName(frsuper.getjTextFieldModName().getText());
        }
        if(!frsuper.getjTextFieldModPhone().getText().equals("")){

            dto.setPhone(frsuper.getjTextFieldModPhone().getText());
        }
        if(frsuper.getjCheckBoxModRol().isSelected() == true){
            dto.setRol(identifyEEmployeeRol(frsuper.getjComboBoxModRol().getItemAt(frsuper.getjComboBoxModRol().getSelectedIndex())));
        }
        if(!frsuper.getjPasswordFieldModPass1().getText().equals("")){
      
            dto.setPassword(frsuper.getjPasswordFieldModPass1().getText());
        }
        if(!frsuper.getjTextFieldModId().getText().equals("") && !frsuper.getjTextFieldModEmail().getText().equals("")){
      
            facadeSuperuser.editEmployee(dto);
  
            dto.setEmail(frsuper.getjTextFieldModEmail().getText());
           
        }
        if(frsuper.getjTextFieldModId().getText().equals("") && !frsuper.getjTextFieldModEmail().getText().equals("")){
         
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

    public void deleteEmployee(FrSuperUser frsuper,String id) {
        
        Employee employee = facadeSuperuser.selectEmployee(id); 
        
        facadeSuperuser.deleteEmployee(employee.getId()); 
        JOptionPane.showMessageDialog(frsuper, "Se ha Eliminado Una Empleado con Éxito.");
        FrSuperUser fr=new FrSuperUser();
        fr.setVisible(true);
        frsuper.setVisible(false);
    }
    
    public void saveEmployees(){
        facadeSuperuser.saveEmployees(); 
    }
    
}
