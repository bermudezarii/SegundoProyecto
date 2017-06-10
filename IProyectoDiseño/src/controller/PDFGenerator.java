/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.TabStop;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class PDFGenerator implements IDocumentGenerator{

    @Override
    public void GenerateDocument(Resolution doc) {
        String resId = "RES-IC-" + format(doc.getId()) + "-" +
                Calendar.getInstance().get(Calendar.YEAR);
        
        Document pdf = createDocument(resId + ".pdf");
        
        if(pdf == null)
            return;
        
        try {
            pdf.open();
            Font boldFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
            Font parFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
            
            Chunk chunk = new Chunk(doc.getTitle() + "\n\n", boldFont);
            Paragraph par = new Paragraph(chunk);
            par.setAlignment(Paragraph.ALIGN_CENTER);
            pdf.add(par);
            
            chunk = new Chunk(resId + "\n\n", boldFont);
            par = new Paragraph(chunk);
            par.setAlignment(Paragraph.ALIGN_CENTER);
            pdf.add(par);
            
            chunk = new Chunk("Atención:    ", boldFont);
            par = new Paragraph(chunk);
            chunk = new Chunk(doc.getAttention() + "\n\n", parFont);
            par.add(chunk);
            par.setAlignment(Paragraph.ALIGN_LEFT);
            par.setIndentationLeft((float) 3.0);
            pdf.add(par);
            
            chunk = new Chunk(doc.getIntro() + "\n\n", parFont);
            par = new Paragraph(chunk);
            par.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            pdf.add(par);
            
            chunk = new Chunk((doc.isOneresult() == true ? "RESULTANDO ÚNICO:\n" : "RESULTANDO:\n"), boldFont);
            par = new Paragraph(chunk);
            chunk = new Chunk(doc.getResult() + "\n\n", parFont);
            par.add(chunk);
            par.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            pdf.add(par);
            
            chunk = new Chunk((doc.isOneconsideration()== true ? "CONSIDERANDO ÚNICO:\n" : "CONSIDERANDOS:\n"), boldFont);
            par = new Paragraph(chunk);
            chunk = new Chunk(doc.getConsider() + "\n\n", parFont);
            par.add(chunk);
            par.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            pdf.add(par);
            
            chunk = new Chunk("RESUELVO:\n", boldFont);
            par = new Paragraph(chunk);
            chunk = new Chunk(doc.getResolve() + "\n\n", parFont);
            par.add(chunk);
            par.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            pdf.add(par);
            
            chunk = new Chunk("NOTIFIQUESE:\n", boldFont);
            par = new Paragraph(chunk);
            par.setAlignment(Paragraph.ALIGN_LEFT);
            pdf.add(par);
            
            chunk = new Chunk(doc.getNotify(), parFont);
            par = new Paragraph(chunk);
            par.setAlignment(Paragraph.ALIGN_LEFT);
            par.setIndentationLeft(250);
            pdf.add(par);
            
            pdf.close();
        } catch(Exception ex) {
            System.out.println("Error writirn pdf.");
        }
    }
    
    private Document createDocument(String path) {
        try {
            File file = new File(path);
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(file.getAbsolutePath()));
            
            return doc;
        } catch(Exception ex) {
            System.out.println("File not found.");
        }
        
        return null;
    }
    
    private String format(int id) {
        if(id < 10)
            return "00" + id;
        else if(id < 100)
            return "0" + id;
        
        return String.valueOf(id);
    }
}
