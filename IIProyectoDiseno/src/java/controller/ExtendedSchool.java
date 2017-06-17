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
    public void createTemplate(String type,String intro,String consider,String result,String resolve) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Package packagetr=TemplateResolution.class.getPackage();
        String trclass= packagetr.getName()+"."+type+"ResolutionTemplate";
        template= (TemplateResolution) Class.forName(trclass).newInstance();
        template.templateMethod(intro, consider, result, resolve);
    }
    public void getTemplate(int id, String type){
        
    }
    
}
