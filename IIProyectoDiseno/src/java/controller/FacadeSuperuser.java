/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
        System.out.println("entro hasta el facade");
        school.insertEmployee(dto);
        System.out.println(school.selectAllEmployee().toString());
        
    }
    
}
