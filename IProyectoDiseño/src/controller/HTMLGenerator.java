/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import model.Parameter;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class HTMLGenerator implements IDocumentGenerator{
    private String buffer;
    
    @Override
    public void GenerateDocument(Resolution doc) {
        String resId = "RES-IC-" + format(doc.getId()) + "-" +
                Calendar.getInstance().get(Calendar.YEAR);
        
        String attention[] = doc.getAttention().split("\n");
        int i = 0;
        
        System.out.println(attention[0]);
        System.out.println(attention[1]);
        
        while(attention[1].charAt(i) == '\t' || attention[1].charAt(i) == ' ')
            i++;
        
        System.out.println(i);
        attention[1] = attention[1].substring(i);
        
        buffer = createHead(resId)
                + "	<body class=\"default-font\">\n" +
"		<b><center>" + doc.getTitle() + "</b><br><br>\n" +
"		<b>" + resId + "</center></b><br>\n" +
"		<div>\n" +
"			<div>\n" +
"				<pre class=\"default-font\"><b>Atención:	</b></pre>\n" +
"			</div>\n" +
"			<div><pre class=\"default-font\">" + attention[0] + "\n"
                            + attention [1] + "</pre>\n" +
"			</div>\n" +
"		</div>\n" +
"\n" +
"		<div>\n" +
"			<p>" + doc.getIntro() + "</p><br>\n" +
"			<b>" + (doc.isOneresult() == true ? "Resultando único:" : "Resultando:") + "</b><br>\n" +
"			<p>" + doc.getResult() + "<p><br>\n" +
"			<b>"+(doc.isOneconsideration()== true ? "Considerando único:" : "Considerandos:")+"</b><br>\n" +
"			<p>" + doc.getConsider() + "</p><br>\n" +
"			<b>Resuelvo:</b><br>\n" +
"			<p>" + doc.getResolve() + "</p><br>\n" +
"		</div>\n" +
"\n" +
"		<div>\n" +
"			<b>Notifiquese</b><br>\n" +
"			<pre class=\"indent-notify default-font\">"
                + Parameter.getInstance().getParameter("notify") + "</pre>\n" +
"		</div>\n" +
"	</body>\n" +
"</html>";
        
        try {
            FileOutputStream file = new FileOutputStream(resId + ".html");
            PrintStream ps = new PrintStream(file);
            ps.print(buffer);
        } catch(Exception ex) {}
    }
    
    private String format(int id) {
        if(id < 10)
            return "00" + id;
        else if(id < 100)
            return "0" + id;
        
        return String.valueOf(id);
    }
    
    private String createHead(String resId) {
        return "<html>\n" +
"	<head>\n" +
"		<meta charset=\"utf-8\">\n" +
"		<title>" + resId + "</title>\n" +
"		<style>\n" +
"			body {\n" +
"				margin: auto 28%;\n" +
"				text-align:justify;\n" +
"			}\n" +
"\n" +
"			.default-font {\n" +
"				font-family: sans-serif;\n" +
"				font-style: normal;\n" +
"			}\n" +
"			div {\n" +
"				overflow: hidden;\n" +
"			}\n" +
"\n" +
"			div div {\n" +
"				display: inline;\n" +
"				float: left;\n" +
"			}\n" +
"\n" +
"			.indent-attention {\n" +
"				margin-left: 5%;\n" +
"			}\n" +
"\n" +
"			.indent-notify {\n" +
"				text-align: left;\n" +
"				margin-left: 43%;\n" +
"			}\n" +
"		</style>\n" +
"	</head>";
    }
}
