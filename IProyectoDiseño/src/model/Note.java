/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Note {
    private String description; 

    Note(String message) {
        this.description = message;
    }

    public String getDescription() {
        return description;
    }
}
