/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Group;

/**
 *
 * @author ErickHdez
 */

public final class GroupsManager extends Manager {
    private DAOData data; 
  

    public GroupsManager(DAOData data) {
        this.data = data;
        this.elements = new  ArrayList<>();
        readData();
    }
    
    
    
    @Override
    public void insert(Object parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Object parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object select(String id) {
        String[] parameters = id.split("-");
        String period = parameters[0];
        int groupNumber = Integer.parseInt(parameters[1]);
        String codeCourse = parameters[2];
        Group g;
        
        for(Object o : elements) {
            g = (Group) o;
            
            if(g.getPeriod().equals(period)) {
                if(g.getNumber() == groupNumber) {
                    if (g.getCourse().getCode().equals(codeCourse))
                        return g;
                }
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
        elements = data.readGroups();
    }

  
}
