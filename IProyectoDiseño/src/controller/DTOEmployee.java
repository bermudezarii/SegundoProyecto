/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.EEmployeeRol;

/**
 *
 * @author Usuario
 */
public class DTOEmployee {
        private EEmployeeRol rol;
        private String id; 
        private String name; 
        private String email; 
        private String phone; 
        private String password; 

    public EEmployeeRol getRol() {
        return rol;
    }

    public void setRol(EEmployeeRol rol) {
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
        
        
}
