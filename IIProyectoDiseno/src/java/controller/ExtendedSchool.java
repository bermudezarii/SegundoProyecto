/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.EInconsistencie;
import model.Parameter;
import model.Template;

/**
 *
 * @author Ximena
 */
public class ExtendedSchool {
    private TemplateResolution template;
    private static ExtendedSchool INSTANCE;
    public static synchronized ExtendedSchool getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ExtendedSchool();
            INSTANCE.loadData();
        }
        
        return INSTANCE;
    }
    private void loadData() {

    }
    public void createTemplate(String type,String intro,String consider,String result,String resolve) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Package packagetr=TemplateResolution.class.getPackage();
        String trclass= packagetr.getName()+"."+type+"ResolutionTemplate";
        template= (TemplateResolution) Class.forName(trclass).newInstance();
        template.templateMethod(intro, consider, result, resolve);
    }
    public Template getTemplate(int id, String type){
     
        String num= Integer.toString(id);
        String intro=Parameter.getInstance().getParameter("intro"+type+num);
        String consider=Parameter.getInstance().getParameter("consider"+type+num);
        String result=Parameter.getInstance().getParameter("result"+type+num); 
        String resolve=Parameter.getInstance().getParameter("resolve"+type+num);
        Template template= new Template(id, EInconsistencie.values()[id], intro, result, resolve, consider);
        return template;
    }
    public int selectTemplates(int type){
        type=type+1;
        System.out.println("numTempl"+Integer.toString(type));
        String numtmpl= Parameter.getInstance().getParameter("numTempl"+Integer.toString(type));
        return Integer.parseInt(numtmpl);
        
    }
   
    
}
