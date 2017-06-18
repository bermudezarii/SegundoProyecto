/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.School;
import controller.UIAssistant;
import controller.UIBase;
import controller.UICoordinator;
import controller.UIViewRequest;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import model.EEmployeeRol;
import model.Employee;

/**
 *
 * @author Ximena
 */
public class FrViewRequest extends javax.swing.JFrame {
    private UIBase ui;
    private UIViewRequest uiRequest; 
    
  

    public JMenuItem getBtnNewResolution1() {
        return btnNewResolution1;
    }

    public void setBtnNewResolution1(JMenuItem btnNewResolution1) {
        this.btnNewResolution1 = btnNewResolution1;
    }

    public JScrollPane getSpmotivo() {
        return spmotivo;
    }


    public void setSpmotivo(JScrollPane spmotivo) {
        this.spmotivo = spmotivo;
    }
    /**
     * Creates new form FrViewRequest
     */
    public FrViewRequest(UIBase ui) {
        this.ui = ui; 
        this.setResizable(false);
        initComponents(); 
        ui.setMenu(this);
        lbdescription.setEditable(false);
        if(ui instanceof UICoordinator || ui instanceof UIAssistant){
            uiRequest = (UIViewRequest) ui; 
            uiRequest.setallRequest(this);
        }
    }

    
    public JComboBox<String> getCdRequest() {
        return cdRequest;
    }

    public void setCdRequest(JComboBox<String> cdRequest) {
        this.cdRequest = cdRequest;
    }

    public JLabel getLbCategory() {
        return lbCategory;
    }

    public void setLbCategory(JLabel lbCategory) {
        this.lbCategory = lbCategory;
    }

    public JLabel getLbcarne() {
        return lbcarne;
    }

    public void setLbcarne(JLabel lbcarne) {
        this.lbcarne = lbcarne;
    }

    public JLabel getLbcourse() {
        return lbcourse;
    }

    public JButton getBtncancel() {
        return btncancel;
    }

    public void setBtncancel(JButton btncancel) {
        this.btncancel = btncancel;
    }

    public JLabel getLbmotivo() {
        return lbmotivo;
    }

    public void setLbmotivo(JLabel lbmotivo) {
        this.lbmotivo = lbmotivo;
    }

    public JTextPane getTxtMotivo() {
        return txtMotivo;
    }

    public void setTxtMotivo(JTextPane txtMotivo) {
        this.txtMotivo = txtMotivo;
    }

 
    public JComboBox<String> getCbtyperequest() {
        return cbtyperequest;
    }

    public void setCbtyperequest(JComboBox<String> cbtyperequest) {
        this.cbtyperequest = cbtyperequest;
    }

    public void setLbcourse(JLabel lbcourse) {
        this.lbcourse = lbcourse;
    }

    public JLabel getLbcarner() {
        return lbcarner;
    }

    public void setLbcarner(JLabel lbcarner) {
        this.lbcarner = lbcarner;
    }

    public JLabel getLbnamer() {
        return lbnamer;
    }

    public void setLbnamer(JLabel lbnamer) {
        this.lbnamer = lbnamer;
    }

    public JTextPane getLbdescription() {
        return lbdescription;
    }

    public void setLbdescription(JTextPane lbdescription) {
        this.lbdescription = lbdescription;
    }


    public JLabel getLbemail() {
        return lbemail;
    }

    public void setLbemail(JLabel lbemail) {
        this.lbemail = lbemail;
    }

    public JLabel getLbgroup() {
        return lbgroup;
    }

    public void setLbgroup(JLabel lbgroup) {
        this.lbgroup = lbgroup;
    }

    public JLabel getLbname() {
        return lbname;
    }

    public void setLbname(JLabel lbname) {
        this.lbname = lbname;
    }

    public JLabel getLbperiod() {
        return lbperiod;
    }

    public void setLbperiod(JLabel lbperiod) {
        this.lbperiod = lbperiod;
    }

    public JLabel getLbphone() {
        return lbphone;
    }

    public void setLbphone(JLabel lbphone) {
        this.lbphone = lbphone;
    }

    public JMenuItem getBtnViewResolution() {
        return btnViewResolution;
    }

    public JMenuItem getBtnNewRequest() {
        return btnNewRequest;
    }

    public void setBtnNewRequest(JMenuItem btnNewRequest) {
        this.btnNewRequest = btnNewRequest;
    }

    public JMenuItem getBtnNewRequest1() {
        return btnNewRequest1;
    }

    public void setBtnNewRequest1(JMenuItem btnNewRequest1) {
        this.btnNewRequest1 = btnNewRequest1;
    }

    public JMenuItem getBtnNewResolution() {
        return btnNewResolution;
    }

    public void setBtnNewResolution(JMenuItem btnNewResolution) {
        this.btnNewResolution = btnNewResolution;
    }

    public JMenuItem getBtnViewRequest() {
        return btnViewRequest;
    }

    public void setBtnViewRequest(JMenuItem btnViewRequest) {
        this.btnViewRequest = btnViewRequest;
    }

    public JMenuItem getBtnViewRequest1() {
        return btnViewRequest1;
    }

    public void setBtnViewRequest1(JMenuItem btnViewRequest1) {
        this.btnViewRequest1 = btnViewRequest1;
    }

    public JMenuItem getBtnviewStadistics() {
        return btnviewStadistics;
    }

    public void setBtnviewStadistics(JMenuItem btnviewStadistics) {
        this.btnviewStadistics = btnviewStadistics;
    }

    public JMenu getjMenu5() {
        return jMenu5;
    }

    public void setjMenu5(JMenu jMenu5) {
        this.jMenu5 = jMenu5;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrViewRequest = new javax.swing.JFrame();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnCancelRequest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnNewRequest = new javax.swing.JMenuItem();
        btnNewResolution = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnViewRequest = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        lbcarne = new javax.swing.JLabel();
        lbperiod = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lbCategory = new javax.swing.JLabel();
        lbphone = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lbgroup = new javax.swing.JLabel();
        lbcourse = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        cdRequest = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        lbnamer = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lbcarner = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbmotivo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbtyperequest = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbdescription = new javax.swing.JTextPane();
        spmotivo = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        btnNewRequest1 = new javax.swing.JMenuItem();
        btnNewResolution1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        btnViewRequest1 = new javax.swing.JMenuItem();
        btnViewResolution = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Solicitud");

        jLabel13.setText("Periodo");

        jLabel14.setText("Carné");

        jLabel15.setText("Curso");

        jLabel16.setText("Grupo");

        jLabel17.setText("Nombre");

        jLabel18.setText("Descripción");

        jLabel19.setText("Categoría");

        jLabel20.setText("Correo");

        jLabel21.setText("Información Básica del Estudiante Afectado");

        jLabel22.setText("Teléfono");

        jLabel23.setText("Información del Problema");

        jLabel24.setText("#########################");

        jLabel25.setText("#########################");

        jLabel26.setText("#########################");

        jLabel27.setText("#########################");

        jLabel28.setText("#########################");

        jLabel29.setText("#########################");

        jLabel30.setText("#########################");

        jLabel31.setText("#########################");

        jLabel32.setText("#########################");

        btnCancelRequest.setText("Cancelar Solicitud ");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jMenu3.setText("Archivo");

        btnNewRequest.setText("Nueva Solicitud...");
        btnNewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRequestActionPerformed(evt);
            }
        });
        jMenu3.add(btnNewRequest);

        btnNewResolution.setText("Nueva Resolución...");
        btnNewResolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewResolutionActionPerformed(evt);
            }
        });
        jMenu3.add(btnNewResolution);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ver ");

        btnViewRequest.setText("Ver Solicitudes");
        jMenu4.add(btnViewRequest);

        jMenuBar2.add(jMenu4);

        FrViewRequest.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout FrViewRequestLayout = new javax.swing.GroupLayout(FrViewRequest.getContentPane());
        FrViewRequest.getContentPane().setLayout(FrViewRequestLayout);
        FrViewRequestLayout.setHorizontalGroup(
            FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrViewRequestLayout.createSequentialGroup()
                .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrViewRequestLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrViewRequestLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrViewRequestLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrViewRequestLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                                .addComponent(jLabel29))
                            .addGroup(FrViewRequestLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31))
                            .addGroup(FrViewRequestLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30))
                            .addGroup(FrViewRequestLayout.createSequentialGroup()
                                .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28))))
                    .addGroup(FrViewRequestLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(btnCancelRequest))))
                .addGap(89, 89, 89))
            .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FrViewRequestLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FrViewRequestLayout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                            .addComponent(jLabel23)
                            .addGap(115, 115, 115))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrViewRequestLayout.createSequentialGroup()
                            .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel14)
                                .addComponent(jLabel20)
                                .addComponent(jLabel22))
                            .addGap(369, 369, 369)
                            .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18))
                            .addGap(0, 0, Short.MAX_VALUE)))))
        );
        FrViewRequestLayout.setVerticalGroup(
            FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrViewRequestLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrViewRequestLayout.createSequentialGroup()
                        .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel24)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18))
                    .addGroup(FrViewRequestLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(27, 27, 27)))
                .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30))
                .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrViewRequestLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel27)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrViewRequestLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(33, 33, 33)))
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnCancelRequest)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FrViewRequestLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel21))
                    .addGroup(FrViewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FrViewRequestLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel14)
                            .addGap(24, 24, 24)
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel20)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel22))
                        .addGroup(FrViewRequestLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel16)
                            .addGap(25, 25, 25)
                            .addComponent(jLabel15)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel13)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel19)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(193, Short.MAX_VALUE)))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbcarne.setForeground(java.awt.Color.white);
        lbcarne.setText("#########################");
        getContentPane().add(lbcarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        lbperiod.setForeground(java.awt.Color.white);
        lbperiod.setText("#########################");
        getContentPane().add(lbperiod, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, -1, -1));

        jLabel35.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        jLabel35.setText("Información Básica del Solicitante");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 280, 30));

        lbname.setForeground(java.awt.Color.white);
        lbname.setText("#########################");
        getContentPane().add(lbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Solicitud #");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, 20));

        jLabel37.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel37.setForeground(java.awt.Color.white);
        jLabel37.setText("Teléfono");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel38.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel38.setForeground(java.awt.Color.white);
        jLabel38.setText("Grupo");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        jLabel39.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel39.setForeground(java.awt.Color.white);
        jLabel39.setText("Descripción");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, -1));

        jLabel40.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel40.setForeground(java.awt.Color.white);
        jLabel40.setText("Curso");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        jLabel42.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel42.setForeground(java.awt.Color.white);
        jLabel42.setText("Periodo");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        jLabel43.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel43.setForeground(java.awt.Color.white);
        jLabel43.setText("Información del Problema");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, 30));

        jLabel44.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel44.setForeground(java.awt.Color.white);
        jLabel44.setText("Correo");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel45.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel45.setForeground(java.awt.Color.white);
        jLabel45.setText("ID/Carné");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        lbCategory.setForeground(java.awt.Color.white);
        lbCategory.setText("ERROR_NOTA");
        getContentPane().add(lbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, -1, -1));

        lbphone.setForeground(java.awt.Color.white);
        lbphone.setText("#########################");
        getContentPane().add(lbphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel48.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel48.setForeground(java.awt.Color.white);
        jLabel48.setText("Categoría");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        lbgroup.setForeground(java.awt.Color.white);
        lbgroup.setText("#########################");
        getContentPane().add(lbgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));

        lbcourse.setForeground(java.awt.Color.white);
        lbcourse.setText("#########################");
        getContentPane().add(lbcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, -1, -1));

        jLabel51.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel51.setForeground(java.awt.Color.white);
        jLabel51.setText("Nombre");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        lbemail.setForeground(java.awt.Color.white);
        lbemail.setText("#########################");
        getContentPane().add(lbemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        btncancel.setBackground(new java.awt.Color(239, 63, 52));
        btncancel.setForeground(java.awt.Color.white);
        btncancel.setText("Cancelar Solicitud ");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, -1, -1));

        cdRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRequestActionPerformed(evt);
            }
        });
        getContentPane().add(cdRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 70, 20));

        jLabel52.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel52.setForeground(java.awt.Color.white);
        jLabel52.setText("Nombre");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        lbnamer.setForeground(java.awt.Color.white);
        lbnamer.setText("#########################");
        getContentPane().add(lbnamer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jLabel46.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel46.setForeground(java.awt.Color.white);
        jLabel46.setText("Carné");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        lbcarner.setForeground(java.awt.Color.white);
        lbcarner.setText("#########################");
        getContentPane().add(lbcarner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jLabel36.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel36.setForeground(java.awt.Color.white);
        jLabel36.setText("Información Básica del Estudiante Afectado");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 30));

        lbmotivo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lbmotivo.setForeground(java.awt.Color.white);
        lbmotivo.setText("Motivo:");
        getContentPane().add(lbmotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Filtrar por:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 20));

        cbtyperequest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendientes", "Procesadas", "Canceladas" }));
        cbtyperequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtyperequestActionPerformed(evt);
            }
        });
        getContentPane().add(cbtyperequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jScrollPane3.setForeground(java.awt.Color.white);
        jScrollPane3.setViewportView(lbdescription);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 320, 110));

        spmotivo.setForeground(java.awt.Color.white);
        spmotivo.setViewportView(txtMotivo);

        getContentPane().add(spmotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 850, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/1200-700cowork.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 640));

        jMenu5.setText("Archivo");

        btnNewRequest1.setText("Nueva Solicitud...");
        btnNewRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRequest1ActionPerformed(evt);
            }
        });
        jMenu5.add(btnNewRequest1);

        btnNewResolution1.setText("Nueva Resolución...");
        btnNewResolution1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewResolution1ActionPerformed(evt);
            }
        });
        jMenu5.add(btnNewResolution1);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Ver ");

        btnViewRequest1.setText("Ver Solicitudes");
        jMenu6.add(btnViewRequest1);

        btnViewResolution.setText("Ver Resolución");
        btnViewResolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewResolutionActionPerformed(evt);
            }
        });
        jMenu6.add(btnViewResolution);

        btnviewStadistics.setText("Ver Estadísticas");
        btnviewStadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewStadisticsActionPerformed(evt);
            }
        });
        jMenu6.add(btnviewStadistics);

        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRequestActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnNewRequestActionPerformed

    private void btnNewResolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewResolutionActionPerformed
        // TODO add your handling code here:
        FrRequest fr=new FrRequest(ui);
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewResolutionActionPerformed

    private void btnNewRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRequest1ActionPerformed
        // TODO add your handling code here:
        FrRequest fr=new FrRequest(ui);
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        fr.setVisible(true);
        this.setVisible(false);
    

    }//GEN-LAST:event_btnNewRequest1ActionPerformed

    private void btnNewResolution1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewResolution1ActionPerformed
        // TODO add your handling code here:
        int i=JOptionPane.showConfirmDialog(this, "¿Quiere usar una plantilla personalizada?","",JOptionPane.YES_NO_OPTION);
       
        if(i==JOptionPane.YES_OPTION){
            if(cdRequest.getSelectedItem()!=null){ 
               FrTemplate fr=new FrTemplate(); 
               fr.setVisible(true); 
               this.setVisible(false); 
           }
        }else{
            if(cdRequest.getSelectedItem()!=null){ 
               FrResolution fr=new FrResolution(ui); 
               fr.setVisible(true); 
               this.setVisible(false); 
           }else{ 
               JOptionPane.showMessageDialog(this, "No se puede realizar una resolución, sin una solicitud seleccionada."); 
           } 
        }
    }//GEN-LAST:event_btnNewResolution1ActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
        FrStadistics frstadistics= new FrStadistics(ui);
        frstadistics.setVisible(true);
        this.setVisible(false);
 


    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    private void cdRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRequestActionPerformed
        // TODO add your handling code here:
        uiRequest.setRequest(this);
    }//GEN-LAST:event_cdRequestActionPerformed

    private void cbtyperequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtyperequestActionPerformed
        // TODO add your handling code here:
        uiRequest.setallRequest(this);
    }//GEN-LAST:event_cbtyperequestActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        if(ui instanceof UICoordinator){
          if(cdRequest.getSelectedItem()!=null){ 
            UICoordinator uiC = (UICoordinator) ui;
            uiC.CancelRequest(this);
          } 
          else{ 
            JOptionPane.showMessageDialog(this, "Tiene que seleccionar una solicitud, para poder cancelar."); 
          } 
        }
 
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnViewResolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewResolutionActionPerformed
        // TODO add your handling code here:
        if(cdRequest.getSelectedItem()!=null){ 
            FrResolution fr=new FrResolution(ui); 
 
            fr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            fr.setVisible(true); 
            this.setVisible(false); 
        }else{ 
            JOptionPane.showMessageDialog(this, "No se puede ver una resolución, sin una solicitud seleccionada."); 
        } 
    }//GEN-LAST:event_btnViewResolutionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrViewRequest;
    private javax.swing.JButton btnCancelRequest;
    private javax.swing.JMenuItem btnNewRequest;
    private javax.swing.JMenuItem btnNewRequest1;
    private javax.swing.JMenuItem btnNewResolution;
    private javax.swing.JMenuItem btnNewResolution1;
    private javax.swing.JMenuItem btnViewRequest;
    private javax.swing.JMenuItem btnViewRequest1;
    private javax.swing.JMenuItem btnViewResolution;
    private javax.swing.JButton btncancel;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JComboBox<String> cbtyperequest;
    private javax.swing.JComboBox<String> cdRequest;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lbcarne;
    private javax.swing.JLabel lbcarner;
    private javax.swing.JLabel lbcourse;
    private javax.swing.JTextPane lbdescription;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbgroup;
    private javax.swing.JLabel lbmotivo;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbnamer;
    private javax.swing.JLabel lbperiod;
    private javax.swing.JLabel lbphone;
    private javax.swing.JScrollPane spmotivo;
    private javax.swing.JTextPane txtMotivo;
    // End of variables declaration//GEN-END:variables
}
