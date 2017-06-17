/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UICoordinator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.EEmployeeRol;
import model.Employee;
import view.FrRequest;
import view.FrStadistics;
import view.FrViewRequest;

/**
 *
 * @author Ximena
 */
public class NewTemplate extends javax.swing.JFrame {
    private UICoordinator ui;
      private Employee employee; 
    
        public void setMenu(){
   
        
        if(employee.getRol() == EEmployeeRol.ASSINTANT){
            btnNewTemplate.setEnabled(false);
            btnViewRequest.setEnabled(true);
            btnViewResolution.setEnabled(true);
            btnsavetemplate.setEnabled(false);
            btnviewStadistics.setEnabled(false);
        }
        else if (employee.getRol() == EEmployeeRol.CORDINATOR){
            btnNewTemplate.setEnabled(true);
            btnViewRequest.setEnabled(true);
            btnViewResolution.setEnabled(true);
            btnsavetemplate.setEnabled(true);
            btnviewStadistics.setEnabled(true);
        }
        else if(employee.getRol() == EEmployeeRol.HEADMASTER){
            btnNewTemplate.setEnabled(false);
            btnViewRequest.setEnabled(false);
            btnViewResolution.setEnabled(false);
            btnsavetemplate.setEnabled(false);
            btnviewStadistics.setEnabled(true);
        }
        else if(employee.getRol() == EEmployeeRol.PROFESSOR){
            btnNewTemplate.setEnabled(false);
            btnViewRequest.setEnabled(false);
            btnViewResolution.setEnabled(false);
            btnsavetemplate.setEnabled(false);
            btnviewStadistics.setEnabled(false);
        }

    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    /**
     * Creates new form NewTemplate
     */
    public NewTemplate() {
        
        initComponents();

        ui=new UICoordinator();
    }

   

    public JTextArea getTxtresolve() {
        return txtresolve;
    }

    public void setTxtresolve(JTextArea txtresolve) {
        this.txtresolve = txtresolve;
    }

    public JComboBox<String> getCbtype() {
        return cbtype;
    }

    public void setCbtype(JComboBox<String> cbtype) {
        this.cbtype = cbtype;
    }

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

    public JTextArea getTxtresult() {
        return txtresult;
    }

    public void setTxtresult(JTextArea txtresult) {
        this.txtresult = txtresult;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbparamintro = new javax.swing.JComboBox<>();
        btninsertintro = new javax.swing.JButton();
        btninsertresult = new javax.swing.JButton();
        cbparamresult = new javax.swing.JComboBox<>();
        btninsertconsider = new javax.swing.JButton();
        cbparamconsider = new javax.swing.JComboBox<>();
        cbparamresolve = new javax.swing.JComboBox<>();
        btninsertresolve = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtintro = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtresult = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtconsider = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtresolve = new javax.swing.JTextArea();
        cbtype = new javax.swing.JComboBox<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnNewTemplate = new javax.swing.JMenuItem();
        btnsavetemplate = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnViewRequest = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();
        btnViewResolution = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1201, 700));

        pn.setBackground(new java.awt.Color(1, 55, 119));
        pn.setForeground(new java.awt.Color(254, 254, 254));
        pn.setName(""); // NOI18N
        pn.setPreferredSize(new java.awt.Dimension(1199, 1000));
        pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 250, 250));
        jLabel1.setText("Introducción ");
        pn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 250, 250));
        jLabel2.setText("Resultado Único");
        pn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 250, 250));
        jLabel3.setText("Considerandos");
        pn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 250, 250));
        jLabel4.setText("Resuelvo");
        pn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        cbparamintro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Nombre Director", "Nombre del Estudiante", "Carné del Estudiante", "Código del Curso", "Nombre del Curso", "Número de Grupo", "Profesor", "Periodo", "Año", "Semestre" }));
        cbparamintro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbparamintroActionPerformed(evt);
            }
        });
        pn.add(cbparamintro, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 140, -1));

        btninsertintro.setBackground(new java.awt.Color(239, 62, 53));
        btninsertintro.setForeground(new java.awt.Color(254, 254, 254));
        btninsertintro.setText("Insertar");
        btninsertintro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertintroActionPerformed(evt);
            }
        });
        pn.add(btninsertintro, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        btninsertresult.setBackground(new java.awt.Color(239, 62, 53));
        btninsertresult.setForeground(new java.awt.Color(254, 254, 254));
        btninsertresult.setText("Insertar");
        btninsertresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertresultActionPerformed(evt);
            }
        });
        pn.add(btninsertresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));

        cbparamresult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Nombre Director", "Nombre del Estudiante", "Carné del Estudiante", "Código del Curso", "Nombre del Curso", "Número de Grupo", "Profesor", "Periodo", "Año", "Semestre" }));
        pn.add(cbparamresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 30));

        btninsertconsider.setBackground(new java.awt.Color(239, 62, 53));
        btninsertconsider.setForeground(new java.awt.Color(254, 254, 254));
        btninsertconsider.setText("Insertar");
        btninsertconsider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertconsiderActionPerformed(evt);
            }
        });
        pn.add(btninsertconsider, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, -1, -1));

        cbparamconsider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Nombre Director", "Nombre del Estudiante", "Carné del Estudiante", "Código del Curso", "Nombre del Curso", "Número de Grupo", "Profesor", "Periodo", "Año", "Semestre" }));
        pn.add(cbparamconsider, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 140, 30));

        cbparamresolve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Nombre Director", "Nombre del Estudiante", "Carné del Estudiante", "Código del Curso", "Nombre del Curso", "Número de Grupo", "Profesor", "Periodo", "Año", "Semestre" }));
        pn.add(cbparamresolve, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 140, 30));

        btninsertresolve.setBackground(new java.awt.Color(239, 62, 53));
        btninsertresolve.setForeground(new java.awt.Color(254, 254, 254));
        btninsertresolve.setText("Insertar");
        btninsertresolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertresolveActionPerformed(evt);
            }
        });
        pn.add(btninsertresolve, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, -1, -1));

        txtintro.setColumns(20);
        txtintro.setRows(5);
        jScrollPane8.setViewportView(txtintro);

        pn.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1000, 150));

        txtresult.setColumns(20);
        txtresult.setRows(5);
        jScrollPane9.setViewportView(txtresult);

        pn.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 1000, 138));

        txtconsider.setColumns(20);
        txtconsider.setRows(5);
        jScrollPane10.setViewportView(txtconsider);

        pn.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 1010, 138));

        txtresolve.setColumns(20);
        txtresolve.setRows(5);
        jScrollPane11.setViewportView(txtresolve);

        pn.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 1010, 138));

        cbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inclusión", "Exclusión", "Error de Nota" }));
        pn.add(cbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jScrollPane1.setViewportView(pn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        jMenu3.setText("Archivo");

        btnNewTemplate.setText("Nueva Plantilla...");
        btnNewTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTemplateActionPerformed(evt);
            }
        });
        jMenu3.add(btnNewTemplate);

        btnsavetemplate.setText("Guardar ");
        btnsavetemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavetemplateActionPerformed(evt);
            }
        });
        jMenu3.add(btnsavetemplate);

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

    private void btnNewTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTemplateActionPerformed
        // TODO add your handling code here:
        FrRequest fr=new FrRequest();
        fr.setEmployee(employee);
        fr.setMenu();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewTemplateActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        FrViewRequest fvr=new FrViewRequest();
        fvr.setEmployee(employee);
        fvr.setMenu();
        fvr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
        FrStadistics frstadistics= new FrStadistics();
        frstadistics.setEmployee(employee);
        frstadistics.setMenu();
        frstadistics.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    private void btnViewResolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewResolutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewResolutionActionPerformed

    private void cbparamintroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbparamintroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbparamintroActionPerformed

    private void btnsavetemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavetemplateActionPerformed
                int i=JOptionPane.showConfirmDialog(this, "¿Seguro que desea Guardar la Plantilla?","",JOptionPane.YES_NO_OPTION);
       
        if(i==JOptionPane.YES_OPTION){
            try {
                // TODO add your handling code here:
                ui.createTemplate(this);
                FrTemplate frtemplate=new FrTemplate();
                frtemplate.setVisible(true);
                this.setVisible(false);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewTemplate.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(NewTemplate.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(NewTemplate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnsavetemplateActionPerformed

    private void btninsertintroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertintroActionPerformed
        // TODO add your handling code here:
        ui.insertParam(txtintro,cbparamintro.getSelectedIndex());
    }//GEN-LAST:event_btninsertintroActionPerformed

    private void btninsertresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertresultActionPerformed
        // TODO add your handling code here:
        ui.insertParam(txtresult,cbparamresult.getSelectedIndex());
    }//GEN-LAST:event_btninsertresultActionPerformed

    private void btninsertconsiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertconsiderActionPerformed
        // TODO add your handling code here:
        ui.insertParam(txtconsider,cbparamconsider.getSelectedIndex());
    }//GEN-LAST:event_btninsertconsiderActionPerformed

    private void btninsertresolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertresolveActionPerformed
        // TODO add your handling code here:
        ui.insertParam(txtresolve,cbparamresolve.getSelectedIndex());
    }//GEN-LAST:event_btninsertresolveActionPerformed

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
            java.util.logging.Logger.getLogger(NewTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTemplate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnNewTemplate;
    private javax.swing.JMenuItem btnViewRequest;
    private javax.swing.JMenuItem btnViewResolution;
    private javax.swing.JButton btninsertconsider;
    private javax.swing.JButton btninsertintro;
    private javax.swing.JButton btninsertresolve;
    private javax.swing.JButton btninsertresult;
    private javax.swing.JMenuItem btnsavetemplate;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JComboBox<String> cbparamconsider;
    private javax.swing.JComboBox<String> cbparamintro;
    private javax.swing.JComboBox<String> cbparamresolve;
    private javax.swing.JComboBox<String> cbparamresult;
    private javax.swing.JComboBox<String> cbtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JOptionPane jOptionPane1;
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
