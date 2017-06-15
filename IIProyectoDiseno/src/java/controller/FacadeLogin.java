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
 * @author Ximena
 */
public class FacadeLogin {
    private School school; 
    
    public FacadeLogin() {
        school= School.getInstance();
    }
    
    
    public  Employee findEmployee(String id){
        return school.findEmployee(id);
    }
    
    public boolean matchEmployee(DTOEmployee dto){
        System.out.println("ni entra?");
        String id = dto.getId(); 
        String password = dto.getPassword(); 
        System.out.println("id: " + dto.getId() + ", password: " + dto.getPassword());
        ArrayList<Object> elements = school.selectAllEmployee(); 
        System.out.println("empleados obtenidos: " + elements.toString());
        int len = elements.size();
        for (int i = 0; i < len; i++) {
            Employee employee = (Employee) elements.get(i); 
            if (employee.getId().equals(id)){
                System.out.println("empleado encontrado: " + employee.toString());
                if(employee.getPassword().equals(password)){
                    System.out.println("si es igual en la contraseña");
                    return true; 
                }
                System.out.println("no es igual en la contraseña");
                return false; 
            }
        }
        return false; 
    }
    
}
