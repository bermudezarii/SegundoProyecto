/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.School;
import controller.UICoordinator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import model.EEmployeeRol;
import model.Employee;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;




/**
 *
 * @author Usuario
 */



public class FrStadistics extends javax.swing.JFrame {
    private UICoordinator uiStadistics; 
    private Employee employee; 
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public void setMenu(){
   
        
        if(employee.getRol() == EEmployeeRol.ASSINTANT){
            
            btnExel.setVisible(false);
            btnnewRequest.setVisible(false);
            
            btnviewRequest.setVisible(true);
            btnviewStadistics.setVisible(false);
        }
        else if (employee.getRol() == EEmployeeRol.CORDINATOR){
            System.out.println("llega aqui 2");
            btnExel.setVisible(true);
            btnnewRequest.setVisible(true);
            btnviewRequest.setVisible(true);
            btnviewStadistics.setVisible(true);
        }
        else if(employee.getRol() == EEmployeeRol.HEADMASTER){
            btnExel.setVisible(false);
            btnnewRequest.setVisible(false);
            btnviewRequest.setVisible(false);
            btnviewStadistics.setVisible(true);
        }
        else if(employee.getRol() == EEmployeeRol.PROFESSOR){
            btnExel.setVisible(false);
            btnnewRequest.setVisible(true);
            btnviewRequest.setVisible(false);
            btnviewStadistics.setVisible(false);
        }

    }
    
    public JComboBox<String> getCbResolutions() {
        return cbResolutions;
    }

    public void setCbResolutions(JComboBox<String> cbResolutions) {
        this.cbResolutions = cbResolutions;
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

    public void setLbcourse(JLabel lbcourse) {
        this.lbcourse = lbcourse;
    }

    public JLabel getLbgroup() {
        return lbgroup;
    }

    public JComboBox<String> getCbperiod() {
        return cbperiod;
    }

    public void setCbperiod(JComboBox<String> cbperiod) {
        this.cbperiod = cbperiod;
    }

    public void setLbgroup(JLabel lbgroup) {
        this.lbgroup = lbgroup;
    }

    public JLabel getLbinconsistence() {
        return lbinconsistence;
    }

    public void setLbinconsistence(JLabel lbinconsistence) {
        this.lbinconsistence = lbinconsistence;
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

    public JLabel getLbresolution() {
        return lbresolution;
    }

    public void setLbresolution(JLabel lbresolution) {
        this.lbresolution = lbresolution;
    }

    public JSpinner getSpFinalD() {
        return spFinalD;
    }

    public void setSpFinalD(JSpinner spFinalD) {
        this.spFinalD = spFinalD;
    }

    public JSpinner getSpInitialD() {
        return spInitialD;
    }

    public void setSpInitialD(JSpinner spInitialD) {
        this.spInitialD = spInitialD;
    }

    public FrStadistics() {
        uiStadistics=new UICoordinator();
        initComponents();
        this.setResizable(false);
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset=uiStadistics.top3ProfessorsResolutions();
        JFreeChart chart= ChartFactory.createBarChart("Profesores", "", "", dataset, PlotOrientation.HORIZONTAL, false, true, false);
        CategoryPlot catPlot=chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        pnProf.setLayout(new java.awt.BorderLayout());
        pnProf.add(chartPanel, BorderLayout.CENTER);
        pnProf.validate();
        uiStadistics.processedRequestsInDateRange(this);
        uiStadistics.setallPeriods(this);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnRP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbperiod = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnProf = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        spInitialD = new javax.swing.JSpinner();
        spFinalD = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbResolutions = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbcarne = new javax.swing.JLabel();
        lbresolution = new javax.swing.JLabel();
        lbinconsistence = new javax.swing.JLabel();
        lbperiod = new javax.swing.JLabel();
        lbcourse = new javax.swing.JLabel();
        lbgroup = new javax.swing.JLabel();
        btnsearch = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnnewRequest = new javax.swing.JMenuItem();
        btnExel = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnviewRequest = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRP.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnRPLayout = new javax.swing.GroupLayout(pnRP);
        pnRP.setLayout(pnRPLayout);
        pnRPLayout.setHorizontalGroup(
            pnRPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        pnRPLayout.setVerticalGroup(
            pnRPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel2.add(pnRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 490, 330));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Periodo ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 100, 20));

        jPanel2.add(cbperiod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, -1));

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Top 5 de Cursos con Más Resoluciones en un Periodo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        btnok.setBackground(new java.awt.Color(239, 63, 52));
        btnok.setForeground(java.awt.Color.white);
        btnok.setText("Aceptar");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel2.add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/statidisticsimage.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        jTabbedPane1.addTab("Cursos con Más Resoluciones en ese Periodo", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnProfLayout = new javax.swing.GroupLayout(pnProf);
        pnProf.setLayout(pnProfLayout);
        pnProfLayout.setHorizontalGroup(
            pnProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        pnProfLayout.setVerticalGroup(
            pnProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel3.add(pnProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 530, 350));

        jLabel16.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Top 3 de los Profesores con más Modificaciones de Acta");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/statidisticsimage.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 640));

        jTabbedPane1.addTab("Profesores con Más Modificaciones de Acta ", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spInitialD.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        jPanel4.add(spInitialD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 190, 20));

        spFinalD.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        jPanel4.add(spFinalD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 180, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Fecha Final");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Fecha de Inicio");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 20));

        cbResolutions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbResolutionsActionPerformed(evt);
            }
        });
        jPanel4.add(cbResolutions, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 20));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Solicitud");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 20));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Periodo ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Curso");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Grupo");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Nombre del Estudiante");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Carné");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Resolución");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Situación ");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        lbname.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbname.setForeground(java.awt.Color.white);
        lbname.setText("#######################");
        jPanel4.add(lbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        lbcarne.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbcarne.setForeground(java.awt.Color.white);
        lbcarne.setText("#######################");
        jPanel4.add(lbcarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        lbresolution.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbresolution.setForeground(java.awt.Color.white);
        lbresolution.setText("#######################");
        jPanel4.add(lbresolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        lbinconsistence.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbinconsistence.setForeground(java.awt.Color.white);
        lbinconsistence.setText("#######################");
        jPanel4.add(lbinconsistence, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        lbperiod.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbperiod.setForeground(java.awt.Color.white);
        lbperiod.setText("#######################");
        jPanel4.add(lbperiod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        lbcourse.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbcourse.setForeground(java.awt.Color.white);
        lbcourse.setText("#######################");
        jPanel4.add(lbcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        lbgroup.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbgroup.setForeground(java.awt.Color.white);
        lbgroup.setText("#######################");
        jPanel4.add(lbgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        btnsearch.setBackground(new java.awt.Color(239, 63, 52));
        btnsearch.setForeground(java.awt.Color.white);
        btnsearch.setText("Buscar");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 90, -1));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Información de Solicitud");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/statidisticsimage.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        jTabbedPane1.addTab("Solicitudes Atendidas en un rango de Fechas", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        jMenu1.setText("Archivo");

        btnnewRequest.setText("Nueva Solicitud...");
        btnnewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewRequestActionPerformed(evt);
            }
        });
        jMenu1.add(btnnewRequest);

        btnExel.setText("Cargar Excel...");
        btnExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExelActionPerformed(evt);
            }
        });
        jMenu1.add(btnExel);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver ");

        btnviewRequest.setText("Ver Solicitudes");
        btnviewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewRequestActionPerformed(evt);
            }
        });
        jMenu2.add(btnviewRequest);

        btnviewStadistics.setText("Ver Estadísticas");
        btnviewStadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewStadisticsActionPerformed(evt);
            }
        });
        jMenu2.add(btnviewStadistics);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewRequestActionPerformed
        // TODO add your handling code here:
        FrRequest fr=new FrRequest();
        fr.setEmployee(employee);
        fr.setMenu();
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        fr.setVisible(true);
        this.setVisible(false);
   

    }//GEN-LAST:event_btnnewRequestActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:\
        if(cbperiod.getSelectedItem()!=null){
            DefaultCategoryDataset dataset;
            dataset= uiStadistics.top5CoursesResolutionsByPeriod(this);
            JFreeChart chart= ChartFactory.createBarChart("Cursos", "", "", dataset, PlotOrientation.HORIZONTAL, false, true, false);
            CategoryPlot catPlot=chart.getCategoryPlot();
            catPlot.setRangeGridlinePaint(Color.BLACK);

            ChartPanel chartPanel=new ChartPanel(chart);
            chartPanel.setMouseWheelEnabled(true);
            pnRP.setLayout(new java.awt.BorderLayout());
            pnRP.add(chartPanel, BorderLayout.CENTER);
            pnRP.validate();
        }else{
            JOptionPane.showMessageDialog(this, "Tiene que seleccionar un periodo.");
        }

    }//GEN-LAST:event_btnokActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
            FrStadistics frstadistics= new FrStadistics();
            frstadistics.setEmployee(employee);
            frstadistics.setMenu(); 
            frstadistics.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            frstadistics.setVisible(true);
            this.setVisible(false);

    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    private void btnviewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewRequestActionPerformed
        // TODO add your handling code here:
        FrViewRequest fvr=new FrViewRequest();
        fvr.setEmployee(employee); 
        fvr.setMenu(); 
        fvr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        fvr.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnviewRequestActionPerformed

    private void cbResolutionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbResolutionsActionPerformed
        // TODO add your handling code here:
        uiStadistics.getRequest(this);
    }//GEN-LAST:event_cbResolutionsActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        uiStadistics.processedRequestsInDateRange(this);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExelActionPerformed
        // TODO add your handling code here:
       uiStadistics.loadfile();
    }//GEN-LAST:event_btnExelActionPerformed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrStadistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExel;
    private javax.swing.JMenuItem btnnewRequest;
    private javax.swing.JButton btnok;
    private javax.swing.JToggleButton btnsearch;
    private javax.swing.JMenuItem btnviewRequest;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JComboBox<String> cbResolutions;
    private javax.swing.JComboBox<String> cbperiod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbcarne;
    private javax.swing.JLabel lbcourse;
    private javax.swing.JLabel lbgroup;
    private javax.swing.JLabel lbinconsistence;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbperiod;
    private javax.swing.JLabel lbresolution;
    private javax.swing.JPanel pnProf;
    private javax.swing.JPanel pnRP;
    private javax.swing.JSpinner spFinalD;
    private javax.swing.JSpinner spInitialD;
    // End of variables declaration//GEN-END:variables
}
