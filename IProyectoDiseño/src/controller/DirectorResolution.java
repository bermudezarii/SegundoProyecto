/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Resolution;

/**
 *
 * @author Usuario
 */
public class DirectorResolution {
    private ResolutionBuilder resolutionBuilder; 
    
    public void setResolutionBuilder(ResolutionBuilder rs){
        resolutionBuilder = rs; 
    }
    
    public Resolution getResolution(){
        return resolutionBuilder.getResolution(); 
    }
   
    public void buildResolution() {
        resolutionBuilder.createNewResolution();
        resolutionBuilder.buildTitle();
        resolutionBuilder.buildAttention();
        resolutionBuilder.buildIntro();
        resolutionBuilder.buildConsider();
        resolutionBuilder.buildNotify();
        resolutionBuilder.buildResolve();
        resolutionBuilder.buildResult();
    }   
}
