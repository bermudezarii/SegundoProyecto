/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UIBase;
import controller.UICoordinator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import model.EEmployeeRol;
import model.Employee;

/**
 *
 * @author Ximena
 */
public class FrTemplate extends javax.swing.JFrame {
    private UICoordinator ui;
    
    public JTextArea getTxtconsider() {
        return txtconsider;
    }

    public void setTxtconsider(JTextArea txtconsider) {
        this.txtconsider = txtconsider;
    }

    public JTextArea getTxtintro() {
        return txtintro;
    }

    public void setTxtintro(JTextArea txtintro) {
        this.txtintro = txtintro;
    }

    public JTextArea getTxtresolve() {
        return txtresolve;
    }

    public void setTxtresolve(JTextArea txtresolve) {
        this.txtresolve = txtresolve;
    }

    public JTextArea getTxtresult() {
        return txtresult;
    }

    public void setTxtresult(JTextArea txtresult) {
        this.txtresult = txtresult;
    }
    
   
    
    /**
     * Creates new form FrTemplate
     */
    public FrTemplate() {
        ui=new UICoordinator();
        initComponents();
      
        txtintro.setEnabled(false);
        txtconsider.setEnabled(false);
        txtresolve.setEnabled(false);
        txtresult.setEnabled(false);

        txtintro.setLineWrap(true);
        txtconsider.setLineWrap(true);
        txtresolve.setLineWrap(true);
        txtresult.setLineWrap(true);
        this.setResizable(false);
        ui.selectTemplates(this);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtintro = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtresult = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtconsider = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtresolve = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cbtemplate = new javax.swing.JComboBox<>();
        cbnumtemplate = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnNewTemplate = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnViewRequest = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();
        btnViewResolution = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn.setBackground(new java.awt.Color(1, 55, 119));
        pn.setPreferredSize(new java.awt.Dimension(1070, 1100));
        pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Introducción ");
        pn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Resultado Único");
        pn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 307, -1, 20));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Considerandos");
        pn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Resuelvo");
        pn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, -1));

        txtintro.setColumns(20);
        txtintro.setRows(5);
        jScrollPane8.setViewportView(txtintro);

        pn.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 1020, 150));

        txtresult.setColumns(20);
        txtresult.setRows(5);
        jScrollPane9.setViewportView(txtresult);

        pn.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 1020, 138));

        txtconsider.setColumns(20);
        txtconsider.setRows(5);
        jScrollPane10.setViewportView(txtconsider);

        pn.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 1020, 138));

        txtresolve.setColumns(20);
        txtresolve.setRows(5);
        jScrollPane11.setViewportView(txtresolve);

        pn.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, 1020, 138));

        jButton1.setBackground(new java.awt.Color(239, 62, 53));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pn.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, -1, -1));

        cbtemplate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inclusión", "Exclusión", "Error de Nota" }));
        cbtemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtemplateActionPerformed(evt);
            }
        });
        pn.add(cbtemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 140, 30));

        pn.add(cbnumtemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 60, 30));

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Tipo de Plantilla");
        pn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 140, -1));

        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Número");
        pn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, -1, 20));

        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Seleccione su Plantilla");
        pn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jScrollPane1.setViewportView(pn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 700));

        jMenu3.setText("Archivo");

        btnNewTemplate.setText("Nueva Plantilla...");
        btnNewTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTemplateActionPerformed(evt);
            }
        });
        jMenu3.add(btnNewTemplate);

        jMenuItem1.setText("Seleccionar Plantilla Actual...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jMenu3.add(btnExit);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ver ");

        btnViewRequest.setText("Ver Solicitudes");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });
        jMenu4.add(btnViewRequest);

        btnviewStadistics.setText("Ver Estadísticas");
        btnviewStadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewStadisticsActionPerformed(evt);
            }
        });
        jMenu4.add(btnviewStadistics);

        btnViewResolution.setText("Ver Resoluciones");
        btnViewResolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewResolutionActionPerformed(evt);
            }
        });
        jMenu4.add(btnViewResolution);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox<String> getCbnumtemplate() {
        return cbnumtemplate;
    }

    public void setCbnumtemplate(JComboBox<String> cbnumtemplate) {
        this.cbnumtemplate = cbnumtemplate;
    }

    public JComboBox<String> getCbtemplate() {
        return cbtemplate;
    }

    public void setCbtemplate(JComboBox<String> cbtemplate) {
        this.cbtemplate = cbtemplate;
    }

    private void btnNewTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTemplateActionPerformed
        // TODO add your handling code here:
        NewTemplate fr=new NewTemplate(); 
        fr.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnNewTemplateActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        UIBase uiB = (UIBase) this.ui; 
        FrViewRequest fvr=new FrViewRequest(uiB);
        fvr.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
        UIBase uiB = (UIBase) this.ui; 
        FrStadistics frstadistics= new FrStadistics(uiB);
        frstadistics.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    private void btnViewResolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewResolutionActionPerformed
        // TODO add your handling code here:
        UIBase uiB = (UIBase) this.ui; 
        FrResolution frResolution= new FrResolution(uiB);
        frResolution.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewResolutionActionPerformed

    private void cbtemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtemplateActionPerformed
        // TODO add your handling code here:
        ui.selectTemplates(this);
    }//GEN-LAST:event_cbtemplateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ui.getTemplate(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        UIBase uiB = (UIBase) this.ui; 
        FrResolution frResolution= new FrResolution(uiB,true,Integer.parseInt(cbnumtemplate.getSelectedItem().toString()),cbtemplate.getSelectedIndex());
        frResolution.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        FrLogin fr=new FrLogin();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrTemplate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnNewTemplate;
    private javax.swing.JMenuItem btnViewRequest;
    private javax.swing.JMenuItem btnViewResolution;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JComboBox<String> cbnumtemplate;
    private javax.swing.JComboBox<String> cbtemplate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pn;
    private javax.swing.JTextArea txtconsider;
    private javax.swing.JTextArea txtintro;
    private javax.swing.JTextArea txtresolve;
    private javax.swing.JTextArea txtresult;
    // End of variables declaration//GEN-END:variables
}
