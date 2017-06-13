
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Parameter;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public abstract class ResolutionBuilder {
    protected Resolution resolution; 
    
    public void createNewResolution(){
        resolution = new Resolution();
        
        int resNumber = Integer.parseInt(Parameter.getInstance().getParameter("resolution_serial"));
        resolution.setId(resNumber);
        resolution.setDefinitive(false);
        Parameter.getInstance().setParameter("resolution_serial", String.valueOf(resNumber + 1));
        Parameter.getInstance().saveParameters();
    }
    
    public Resolution getResolution(){
        return this.resolution; 
    }
    
    public abstract void buildTitle();
    public abstract void buildAttention();
    public abstract void buildIntro();
    public abstract void buildResult();
    public abstract void buildConsider();
    public abstract void buildResolve();
    public abstract void buildNotify();
}
