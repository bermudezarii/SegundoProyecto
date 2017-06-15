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
public final class EmployeesManager extends Manager {
    private DAOData data; 
    private Employee currentEmployee; 

    public EmployeesManager(DAOData data) {
        this.data = data;
        this.elements = new ArrayList<>();
        readData();
        
    }
    
    public ArrayList<Employee> createTop3Professors(){
        ArrayList<Employee> employees = new ArrayList<Employee>(); 
        return employees;
    }

    @Override
    public void insert(Object parameter) {
        DTOEmployee  dto = (DTOEmployee) parameter;
        currentEmployee = new Employee(dto.getRol(), dto.getId(), dto.getName(), dto.getEmail(), dto.getPhone(), dto.getPassword());
        elements.add(currentEmployee);
    }

    @Override
    public void edit(Object parameter) {
        DTOEmployee  dto = (DTOEmployee) parameter;
        
        
        for(Object r : elements) {
            Employee temp = (Employee) r; 
            if(dto.getId().equals(temp.getId()) || dto.getEmail().equals(temp.getEmail())){
                System.out.println("antes: " + r.toString());
                temp.setId(dto.getId());
                temp.setName(dto.getName());
                temp.setPhone(dto.getPhone());
                temp.setEmail(dto.getEmail());
                temp.setPassword(dto.getPassword());
                temp.setRol(dto.getRol());
                Object s = (Object) temp; 
                r = s; 
                System.out.println("despues: " + r.toString());
                return;
            }
        }
        
    }

    @Override
    public void delete(String id) {    
       ArrayList<Object> objects = new ArrayList(); 
        for(Object r : elements) {
            Employee temp = (Employee) r; 
            if(temp.getId() != id){
                objects.add(r); 
            }
        }
        elements = objects; 
    }

    @Override
    public Object select(String id) {        
        for(Object r : elements) {
            Employee temp = (Employee) r; 
            if(id == temp.getId()){
               return r; 
            }
        }
        return null; 
    }

    @Override
    public ArrayList<Object> selectAll() {
        return elements;
    }

    @Override
    public void readData() {
        ArrayList<Employee> employees = data.readProfessors(); 
        for (Employee employee : employees) {
            elements.add(employee);
        }
    }
    
    public Employee findEmployee(String id){
        int len = elements.size();
        for (int i = 0; i < len; i++) {
            Employee employee = (Employee) elements.get(i); 
            if (employee.getId().equals(id)){
                return employee; 
            }
        }
        return null; 
    }
    

  
}
