/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Employee extends Person{ 
    private EEmployeeRol rol; 
    private String password;  
 
    public Employee(EEmployeeRol rol, String id, String name, String email, String phone, String password) { 
        super(id, name, email, phone); 
        this.rol = rol; 
        this.password= password;  
    } 
     
     @Override 
    public String toString() { 
        return "Employee{"  + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", rol=" + rol + ", password=" + password + '}'; 
    } 

    public EEmployeeRol getRol() {
        return rol;
    }

    public void setRol(EEmployeeRol rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
