/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Employee;

/**
 *
 * @author Usuario
 */
public class FacadeSuperuser {
    private School school; 

    public FacadeSuperuser() {
        school= School.getInstance();
    }
    
    public void insertEmployee(DTOEmployee dto) {
        school.insertEmployee(dto);
        System.out.println("agregado: " + school.selectAllEmployee().toString());
        
    }
    
    
    public ArrayList<Object> selectAllEmployees(){
        return school.selectAllEmployee(); 
    }
    
    public void editEmployee(DTOEmployee dto){
        school.editEmployee(dto);
        System.out.println("modificado: " + school.selectAllEmployee().toString());
    }

    public void deleteEmployee(String id) {
        school.deleteEmployee(id);
        System.out.println("borrado: " + school.selectAllEmployee().toString());
    }
    
     public void saveEmployees(){
         school.saveEmployees();
     }
     
     public Employee selectEmployee(String id){
         return school.selectEmployee(id);
     }
     
     public boolean ifEmployeehasGroup(String id){
         return school.ifEmployeehasGroup(id); 
     }
     
     public boolean sameUser(String id){
        return school.sameUser(id); 
     }
     
     public boolean sameEmail(String email){
        return school.sameEmail(email); 
     }
}
