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
    private AbstractBridge abstractBridge;
    
    public FacadeLogin() {
        abstractBridge = new AbstractBridge(); 
    }
    
    
    public  Employee findEmployee(String id){
        return abstractBridge.findEmployee(id); 
    }
    
    public boolean login(DTOEmployee dto){
        return abstractBridge.login(dto); 
    }
    
}
