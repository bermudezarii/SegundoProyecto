/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Request;
import model.Resolution;

/**
 *
 * @author Ximena
 */
public class FacadeAssistant {
    private School school; 

    public FacadeAssistant() {
        school = School.getInstance();
    }
    
    public ArrayList<Object> selectallRequest(){
        return school.selectAllRequests();
    }
    public Resolution getResolution() {
        return school.getResolution();
    }
    public ArrayList<Object> selectTypeRequest(int type){
        switch (type){
            case 0:
               return school.selectPendingRequests();
            case 1:
               return school.selectProcessedRequests();
            case 2:
               return school.selectCanceledRequests();
        
        }
                
        return null;
    }
    
     public Request selectRequest(String id){
        return school.selectRequest(id);
    }

   
    
}
