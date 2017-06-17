/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ximena
 */
public class Template {
    private int id;
    private EInconsistencie type;
    private String intro;
    private String result;
    private String resolve;
    private String consider;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EInconsistencie getType() {
        return type;
    }

    public void setType(EInconsistencie type) {
        this.type = type;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getConsider() {
        return consider;
    }

    public void setConsider(String consider) {
        this.consider = consider;
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


    
      
}
