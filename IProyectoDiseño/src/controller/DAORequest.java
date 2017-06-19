/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EInconsistencie;
import model.ERequestState;
import model.Group;
import model.Request;
import model.Student;
import model.Person; 
import model.Resolution; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Usuario
 */
public class DAORequest {
    InputStream FIS;
    XSSFWorkbook workbook; 

    public DAORequest(InputStream FIS) throws IOException {
        this.FIS = FIS;
        this.workbook = new XSSFWorkbook(FIS); 
        
    }

    public ArrayList<Object> readRequests(){
        ArrayList<Object> requests = new ArrayList(); 
        ArrayList<Resolution> resolutions = readResolutions(); 
        XSSFSheet sheet = workbook.getSheetAt(0); 
        
        for(Row row : sheet){
            
            Date date= null; 
            Student affected; String carnet = null; String name = null; String email = null; String celStu = null; 
            Group group; String period = null; String course = null; int numberGroup = 0; 
            EInconsistencie einconsistencie; String inconsistencie = null; 
            String description = null; 
            Person requester; String idReq= null; String nameReq= null; 
            ERequestState reqState; String sreqState = null;
            int numRes = 0; 
            for(Cell cell : row){
                if(row.getRowNum() != 0){
              
                    switch(cell.getColumnIndex()){
                        case 0:
                            date = row.getCell(0).getDateCellValue(); 
                            break; 
                        case 1: 
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                carnet = Integer.toString((int) cell.getNumericCellValue());
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                carnet = cell.getStringCellValue(); 
                            break;
                        case 2: //es el nombre del estudiante
                            name = cell.getStringCellValue(); 
                            break; 
                        case 3: 
                            email = cell.getStringCellValue();
                            break; 
                        case 4:  
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                celStu = Integer.toString((int) cell.getNumericCellValue());
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                celStu = cell.getStringCellValue(); 
                            break; 
                        case 5: 
                            period = cell.getStringCellValue(); 
                            break; 
                        case 6: 
                            course = cell.getStringCellValue(); 
                            break; 
                        case 7: 
                            numberGroup = (int) cell.getNumericCellValue(); 
                            break; 
                        case 8: 
                            inconsistencie = cell.getStringCellValue();
                            break; 
                        case 9: 
                            description = cell.getStringCellValue(); 
                             break; 
                        case 10: 
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                idReq = Integer.toString((int) cell.getNumericCellValue());
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                idReq = cell.getStringCellValue(); 
                            break;        
                        case 11:
                            nameReq = cell.getStringCellValue(); 
                            break;
                        case 12: 
                            sreqState = cell.getStringCellValue();
                            break; 
                        case 13: 
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                numRes = (int)cell.getNumericCellValue(); 
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                numRes = Integer.parseInt(cell.getStringCellValue()); 
                             break; 
                    }
                }
                
            }
            
            if(carnet != null){
                affected = new Student(carnet, name, email, celStu); 
                requester = new Person(idReq, nameReq, null, null); 
                group = School.getInstance().selectGroup(period, numberGroup,course); 
                einconsistencie = identifyEInconsistencie(inconsistencie); 
                if(sreqState == null){
                    sreqState = "PENDIENTE"; 
                }
                reqState = identifyEReqState(sreqState); 
                
                Request request = new Request(date, description, einconsistencie, reqState, affected, requester, group); 
                request.setRequestState(reqState);
                requests.add(request);      
                if(numRes != 0){
                    for (Resolution r: resolutions) {
                        if(r.getId() == numRes)
                            request.setResolution(r);
                            
                    }
                }
            }
            
            
        }
    
      
        return requests;
    }

    private EInconsistencie identifyEInconsistencie(String inconsistencie) {
        switch (inconsistencie) {
            case "ERROR_NOTA":
                return EInconsistencie.GradeError;
            case "EXCLUSION_ACTA":
                return EInconsistencie.RecordExclusion;
            case "INCLUSION_ACTA":
                return EInconsistencie.RecordInclusion;
            case "MODIFICACIÓN_ACTA":
                return EInconsistencie.RecordModification;
            default: 
                break;
        }
        return null; 
    }
    
       
    private String transformInconsistencieToSpanish(EInconsistencie inc){
        if(null != inc)
            switch (inc) {
            case GradeError:
                return "ERROR_NOTA";
            case RecordExclusion:
                return "EXCLUSION_ACTA";
            case RecordInclusion:
                return "INCLUSION_ACTA";
            case RecordModification:
                return "MODIFICACIÓN_ACTA";
            default:
                break;
        }
        return null; 
    }

        private String transformReqStatetoSpanish(ERequestState stt){
        if(null != stt)
            switch (stt) {
            case CANCELED:
                return "CANCELADO";
            case PENDING:
                return "PENDIENTE";
            case PROCESSED:
                return "PROCESADA";
            default:
                break;
        }
        return null; 
    }
        
    public void saveRequest() {
        System.out.println("problema esq ni entra");
        XSSFSheet sheet = workbook.getSheetAt(0); 
        sheet.getRow(0).createCell(10).setCellValue("Id solicitante"); 
        sheet.getRow(0).createCell(11).setCellValue("Nombre solicitante");
        sheet.getRow(0).createCell(12).setCellValue("Estado de solicitud");
        sheet.getRow(0).createCell(13).setCellValue("Num de Resolucion");
        int rowI = 1; 
        System.out.println("requests en daoRequests:" + School.getInstance().selectAllRequests().toString());
        for(Object o: School.getInstance().selectAllRequests()){
        
          
            Request r = (Request) o; 
            Row row = sheet.createRow(rowI); 
            //
            Cell cellDate = row.createCell(0); 
            cellDate.setCellValue(r.getDate());
            CellStyle styleCreationDate = workbook.createCellStyle(); 
            XSSFDataFormat dfCreationDate = workbook.createDataFormat();
            styleCreationDate.setDataFormat(dfCreationDate.getFormat("d/m/yy"));
            cellDate.setCellStyle(styleCreationDate);
            //
            Cell cellCarnet = row.createCell(1); 
            cellCarnet.setCellValue(r.getAffected().getId());
            CellStyle styleCreationInt = workbook.createCellStyle(); 
            XSSFDataFormat dfCreationInt = workbook.createDataFormat(); 
            
            Cell cellName = row.createCell(2); 
            cellName.setCellValue(r.getAffected().getName());
            Cell cellEmail = row.createCell(3); 
            cellEmail.setCellValue(r.getAffected().getEmail());
            Cell cellPhone = row.createCell(4); 
            cellPhone.setCellValue(r.getAffected().getPhone());
            Cell cellPeriod = row.createCell(5); 
            cellPeriod.setCellValue(r.getGroup().getPeriod());
            Cell cellCourse = row.createCell(6); 
            cellCourse.setCellValue(r.getGroup().getCourse().getCode());
            Cell cellNumGroup = row.createCell(7); 
            cellNumGroup.setCellType(Cell.CELL_TYPE_NUMERIC);
            cellNumGroup.setCellValue(r.getGroup().getNumber());
            Cell cellInc = row.createCell(8); 
            cellInc.setCellValue(transformInconsistencieToSpanish(r.getInconsistencie()));
            Cell cellDescription = row.createCell(9); 
            cellDescription.setCellValue(r.getDescription());
            Cell cellIdReq = row.createCell(10); 
            cellIdReq.setCellValue(r.getRequester().getId());
            Cell cellNameReq = row.createCell(11); 
            cellNameReq.setCellValue(r.getRequester().getName());
            Cell cellReqState = row.createCell(12); 
            cellReqState.setCellValue(transformReqStatetoSpanish(r.getRequestState()));
            if(r.getRequestState() == ERequestState.PROCESSED){
                Cell cellNumReso = row.createCell(13); 
                cellNumReso.setCellValue(Integer.toString(r.getResolution().getId()));
            }
            
            
            rowI++; 
            System.out.println("pasa el ++");
           
        }
       
        // Save to excel file 
        try{
            System.out.println("pinguinito1");
            System.out.println("FIS ANTES:" + FIS.toString());
            String filePath = getClass().getResource("/files/DatosFormulario.xlsx").getPath();
            System.out.println("filepath:" + filePath.toString());
            System.out.println("pinguinito2");
            FileOutputStream out = new FileOutputStream(new File(filePath));
            System.out.println("out:" + out.toString());
            System.out.println("pinguinito3");
            System.out.println("workbook2:" + workbook.toString());
            workbook.write(out);
            System.out.println("workbook3:" + workbook.toString());
            System.out.println("pinguinito4");
            workbook.close();
             
            System.out.println("pinguinito5");
            out.close();
            System.out.println("pinguinito6");
            System.out.println("workbook4:" + workbook.toString());
            InputStream fis2 = getClass().getResourceAsStream("/files/DatosFormulario.xlsx");
            this.workbook = new XSSFWorkbook(fis2); 
            saveResolution();
            
            
            System.out.println("pinguinito7");
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void saveResolution() {
        XSSFWorkbook reqWB = new XSSFWorkbook(); 
        XSSFSheet sheet = reqWB.createSheet(); 
        Row rowZ = sheet.createRow(0);  
        sheet.getRow(0).createCell(0).setCellValue("Id"); 
        sheet.getRow(0).createCell(1).setCellValue("Attention");
        sheet.getRow(0).createCell(2).setCellValue("Title");
        sheet.getRow(0).createCell(3).setCellValue("Intro"); 
        sheet.getRow(0).createCell(4).setCellValue("Result");
        sheet.getRow(0).createCell(5).setCellValue("Resolve");
        sheet.getRow(0).createCell(6).setCellValue("Notify");
        sheet.getRow(0).createCell(7).setCellValue("Considerations");
        ArrayList<Resolution> resolutions = new ArrayList<>();
        for(Object o: School.getInstance().selectAllRequests()){
            Request r = (Request) o; 
            if(r.getResolution() != null){
                resolutions.add(r.getResolution()); 
                
            }
        }
        
        
        int rowI = 1; 
        for (Resolution r : resolutions) {       
            Row row = sheet.createRow(rowI); 
            //
            Cell cellId = row.createCell(0); 
            cellId.setCellValue(r.getId());
            Cell cellAttention = row.createCell(1); 
            cellAttention.setCellValue(r.getAttention());
            Cell cellTitle = row.createCell(2); 
            cellTitle.setCellValue(r.getTitle());
            Cell cellIntro = row.createCell(3); 
            cellIntro.setCellValue(r.getIntro());
            Cell cellResult = row.createCell(4); 
            cellResult.setCellValue(r.getResult());
            Cell cellResolve = row.createCell(5); 
            cellResolve.setCellValue(r.getResolve());
            Cell cellNotify = row.createCell(6); 
            cellNotify.setCellValue(r.getNotify());
            Cell cellCons = row.createCell(7); 
            cellCons.setCellValue(r.getConsider());
            rowI++; 
           
        }
       
        // Save to excel file 
        try{
            String filePath = getClass().getResource("/files/DatosResolucion.xlsx").getPath();
            FileOutputStream out = new FileOutputStream(new File(filePath));
       
            reqWB.write(out);
         
            reqWB.close();
            out.close();
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }





    private ERequestState identifyEReqState(String sreqState) {
        if(null != sreqState)
            switch (sreqState) {
            case "PENDIENTE":
                return ERequestState.PENDING;
            case "CANCELADO":
                return ERequestState.CANCELED;
            case "PROCESADA":
                return ERequestState.PROCESSED;
            default:
                break;
        }
        return null;        
    }

    private ArrayList<Resolution> readResolutions() {
        ArrayList<Resolution> resolutions = new ArrayList(); 
        try{
            InputStream fis = getClass().getResourceAsStream("/files/DatosResolucion.xlsx"); 
            XSSFWorkbook wb = new XSSFWorkbook(fis); 
            XSSFSheet sheet = wb.getSheetAt(0); 
        for(Row row : sheet){
            int id = 0; String attention = null; String title= null; 
            String intro = null; String result = null; String resolve = null; 
            String notify = null; String considerations = null; 
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0:
                            id = (int)cell.getNumericCellValue(); 
                            break; 
                        case 1: 
                            attention = cell.getStringCellValue(); 
                            break;
                        case 2: 
                            title = cell.getStringCellValue(); 
                            break; 
                        case 3: 
                            intro = cell.getStringCellValue();
                            break; 
                        case 4:  
                            result = cell.getStringCellValue(); 
                            break; 
                        case 5: 
                            resolve = cell.getStringCellValue(); 
                            break; 
                        case 6: 
                            notify = cell.getStringCellValue(); 
                            break; 
                        case 7: 
                            considerations = cell.getStringCellValue(); 
                            break; 
                        }
                    }
                }
                if(id != 0){
                    
                    resolutions.add(new Resolution(id, attention, title, intro, result, resolve, notify, considerations));
                }
            }
        
        }
            
        
        catch(FileNotFoundException e){
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException ex) {
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return resolutions; 
        
    }

    
    
}