/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ClearValuesRequest;
import com.google.api.services.sheets.v4.model.ValueRange;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.Course;
import model.EInconsistencie;
import model.ERequestState;
import static model.ERequestState.PENDING;
import model.Group;
import model.Person;
import model.Request;
import model.Student;

/**
 *
 * @author ErickHdez
 */
public class DAOSpreadSheet {
    /** Application name. */
    private static final String APPLICATION_NAME =
        "Resoluciones";

    /** Directory to store user credentials for this application. */
    private static final java.io.File DATA_STORE_DIR = new java.io.File(
        "sheets.googleapis.com-java-resolutions.");

    /** Global instance of the {@link FileDataStoreFactory}. */
    private static FileDataStoreFactory DATA_STORE_FACTORY;

    /** Global instance of the JSON factory. */
    private static final JsonFactory JSON_FACTORY =
        JacksonFactory.getDefaultInstance();

    /** Global instance of the HTTP transport. */
    private static HttpTransport HTTP_TRANSPORT;

    /** Global instance of the scopes required by this quickstart.
     *
     * If modifying these scopes, delete your previously saved credentials
     * at ~/.credentials/sheets.googleapis.com-java-quickstart
     */
    private static final List<String> SCOPES =
        Arrays.asList(SheetsScopes.SPREADSHEETS);

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            System.exit(1);
        }
    }

    /**
     * Creates an authorized Credential object.
     * @return an authorized Credential object.
     * @throws IOException
     */
    private static Credential authorize() throws IOException {
        // Load client secrets.
        InputStream in = new FileInputStream("src//files//secret_key.json");
        GoogleClientSecrets clientSecrets =
            GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow =
                new GoogleAuthorizationCodeFlow.Builder(
                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(DATA_STORE_FACTORY)
                .setAccessType("offline")
                .build();
        Credential credential = new AuthorizationCodeInstalledApp(
            flow, new LocalServerReceiver()).authorize("user");
        
        return credential;
    }

    /**
     * Build and return an authorized Sheets API client service.
     * @return an authorized Sheets API client service
     * @throws IOException
     */
    private static Sheets getSheetsService() throws IOException {
        Credential credential = authorize();
        return new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }
    
    public ArrayList<Object> getSpreedSheetInfo() {
        ArrayList<Object> requests = new ArrayList();
        
        try {
            // Build a new authorized API client service.
            Sheets service = getSheetsService();

            // Prints the names and majors of students in a sample spreadsheet:
            // https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
            String spreadsheetId = "1YEtiZh8XNBWUDjRK-gXOBgpPDA8wFtl0hsk1AoeIZUA";
            String range = "Requests Data";
            ValueRange response = service.spreadsheets().values()
                    .get(spreadsheetId, range)
                    .execute();
            List<List<Object>> values = response.getValues();
            if (values == null || values.isEmpty()) {
                System.out.println("No data found.");
            } else {
                Date date= null; 
                Student affected; String carnet = null; String name = null; String email = null; String celStu = null; 
                Group group; String period = null; String course = null; int numberGroup = 0; 
                EInconsistencie einconsistencie; String inconsistencie = null; 
                String description = null; 
                Person requester; String idReq= null; String nameReq= null; 
                ERequestState reqState;
                int rowIndex = 0;
            
                for(List row : values) {
                    if(row.size() > 0 && rowIndex != 0) {
                        date = new Date(row.get(0).toString());
                        idReq = row.get(1).toString();
                        nameReq = row.get(2).toString();

                        carnet = row.get(3).toString();
                        name = row.get(4).toString();
                        email = row.get(5).toString();
                        celStu = row.get(6).toString();

                        inconsistencie = row.get(7).toString();
                        numberGroup = Integer.parseInt(row.get(8).toString());
                        course = row.get(9).toString();
                        period = row.get(10).toString();
                        description = row.get(11).toString();

                        if(carnet != null) {
                            requester = new Person(idReq, nameReq);
                            affected = new Student(carnet, name, email, celStu);
                            group = School.getInstance().selectGroup(period, numberGroup, course); 
                            einconsistencie = identifyEInconsistencie(inconsistencie);
                            reqState = PENDING;

                            if(group != null) {
                                Request request = new Request(date, description, einconsistencie, reqState, affected, requester, group);
                                requests.add(request);
                            }
                        }
                    }
                    
                    rowIndex++;
                }
            }
            
            service.spreadsheets().values().clear(spreadsheetId, range, 
                    new ClearValuesRequest())
                .execute();
            
            return requests;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    private EInconsistencie identifyEInconsistencie(String inconsistencie) {
        switch (inconsistencie) {
            case "ERROR_NOTA":
                return EInconsistencie.GradeError;
            case "EXCLUSION_ACTA":
                return EInconsistencie.RecordExclusion;
            case "INCLUSION_ACTA":
                return EInconsistencie.RecordInclusion;
            default: 
                break;
        }
        return null; 
    }
}
