/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Parameter {
    private static Parameter INSTANCE = null; 
    private XProperties parameters ;
    
    private Parameter(){
        loadProperties(); 
    }

    public static synchronized Parameter getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Parameter();
        }
        
        return INSTANCE;
    }

    private boolean loadProperties() {
        try {
            String filePath = getClass().getResource("/files/Parameters.properties").getPath();
            parameters = new XProperties();
            parameters.load(new FileInputStream(filePath));
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex){
            return false;
        }        
    }
    
    public void setParameter(String tag, String value) {
        parameters.setProperty(tag, value);
    }

    public String getParameter(String tag){
        return parameters.getProperty(tag);
    }
    
    public boolean saveParameters() {
        try {
            parameters.store(new FileOutputStream("src//java//files//Parameters.properties"), "");
            return true;
        } catch(Exception ex) {
            Logger.getLogger(Parameter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
