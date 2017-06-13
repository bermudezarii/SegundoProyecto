/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Manager implements IReadDataFile {
    protected ArrayList<Object> elements;
    
    public abstract void insert(Object parameter);
    public abstract void edit(Object parameter);
    public abstract void delete (String id);
    public abstract Object select(String id);
    public abstract ArrayList<Object> selectAll();
}
