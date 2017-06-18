/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author ximeb
 */
public class Invoker {
    private ArrayList<Command> commands; 

    public Invoker() {
        commands=new ArrayList();
    }
    public void placeCommand(Command c){
        commands.add(c);
        commands.get(0).execute();
        commands.remove(0);
    }
    
    
}
