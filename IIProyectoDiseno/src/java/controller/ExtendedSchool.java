/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    public void createTemplate(String type,String intro,String consider,String notify,String result,String resolve) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        template= (TemplateResolution) Class.forName(type).newInstance();
        template.templateMethod(intro, consider, notify, result, resolve);
    }
    public void getTemplate(int id, String type){
        
    }
    
}
