/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iproyectodiseño;

import controller.School;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 *
 * @author Ximena
 */
public class IProyectoDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        School.getInstance();
      
  
        
        
      
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                School.getInstance().saveRequest();
            }
        });
    }
}
     

