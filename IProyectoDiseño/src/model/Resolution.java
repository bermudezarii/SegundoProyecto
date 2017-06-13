/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Resolution {
    private int id; 
    private String attention;
    private String title;
    private String intro; 
    private String result;
    private String resolve; 
    private String notify;
    private String considerations;
    private boolean definitive;
    private boolean oneresult;
    private boolean oneconsideration;

    public boolean isOneresult() {
        return oneresult;
    }

    public void setOneresult(boolean oneresult) {
        this.oneresult = oneresult;
    }

    public boolean isOneconsideration() {
        return oneconsideration;
    }

    public void setOneconsideration(boolean oneconsideration) {
        this.oneconsideration = oneconsideration;
    }
    
    public Resolution(){}

    public Resolution(int id, String attention, String title, String intro, String result, String resolve, String notify, String considerations) {
        this.id = id;
        this.attention = attention;
        this.title = title;
        this.intro = intro;
        this.result = result;
        this.resolve = resolve;
        this.notify = notify;
        this.considerations = considerations;
        this.definitive = true;
    }

    public boolean isDefinitive() {
        return definitive;
    }

    public void setDefinitive(boolean definitive) {
        this.definitive = definitive;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getConsider() {
        return considerations;
    }

    public void setConsider(String considerations) {
        this.considerations = considerations;
    }
}
