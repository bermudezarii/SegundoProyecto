/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FacadeCoordinator;
import controller.FileTypeFilter;
import controller.School;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import model.EEmployeeRol;
import model.Employee;

/**
 *
 * @author Ximena
 */
public class FrMain extends javax.swing.JFrame {
    private Employee employee; 
    /**
     * Creates new form FrMain
     */
    public FrMain() {
       
        initComponents();
        this.setResizable(false);
    }

    public void setMenu(){
        if(employee.getRol() == EEmployeeRol.ASSINTANT){
            btnExel.setVisible(false);
            btnNewRequest.setVisible(false);
            btnViewRequest.setVisible(true);
            btnviewStadistics.setVisible(false);
        }
        else if (employee.getRol() == EEmployeeRol.CORDINATOR){
            System.out.println("llega aqui 2");
            btnExel.setVisible(true);
            btnNewRequest.setVisible(true);
            btnViewRequest.setVisible(true);
            btnviewStadistics.setVisible(true);
        }
        else if(employee.getRol() == EEmployeeRol.HEADMASTER){
            btnExel.setVisible(false);
            btnNewRequest.setVisible(false);
            btnViewRequest.setVisible(false);
            btnviewStadistics.setVisible(true);
        }


    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnexel = new javax.swing.JMenu();
        btnNewRequest = new javax.swing.JMenuItem();
        btnExel = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnViewRequest = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Bienvenido al manejador de resoluciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("_____________________________________________________________");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("_____________________________________________________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/1200-700chicasdecompu.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jMenuBar1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        btnexel.setText("Archivo");

        btnNewRequest.setText("Nueva Solicitud...");
        btnNewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRequestActionPerformed(evt);
            }
        });
        btnexel.add(btnNewRequest);

        btnExel.setText("Cargar Excel...");
        btnExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExelActionPerformed(evt);
            }
        });
        btnexel.add(btnExel);

        jMenuBar1.add(btnexel);

        jMenu2.setText("Ver ");

        btnViewRequest.setText("Ver Solicitudes");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });
        jMenu2.add(btnViewRequest);

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

    private void btnNewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRequestActionPerformed
        // TODO add your handling code here:
        FrRequest fr= new FrRequest();
        fr.setEmployee(employee);
        fr.setMenu();
        fr.setVisible(true);
        this.setVisible(false);
   

    }//GEN-LAST:event_btnNewRequestActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        FrViewRequest fvr=new FrViewRequest();
        fvr.setEmployee(employee);
        fvr.setMenu();
        this.setVisible(false);
        fvr.setVisible(true);
     
        
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
        FrStadistics frstadistics= new FrStadistics();
        frstadistics.setEmployee(employee);
        frstadistics.setMenu();
        frstadistics.setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    private void btnExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExelActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc= new JFileChooser();
        jfc.setFileFilter(new FileTypeFilter(".xls","Excel"));
        jfc.setFileFilter(new FileTypeFilter(".xlsx","Excel"));
        jfc.setAcceptAllFileFilterUsed(false);
        File f=jfc.getSelectedFile();
        int result=jfc.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
           jfc.getSelectedFile().getPath();
           
           FacadeCoordinator facade= new FacadeCoordinator();
           facade.loadRequests( jfc.getSelectedFile().getPath());
        }
        
    }//GEN-LAST:event_btnExelActionPerformed

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
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMain().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExel;
    private javax.swing.JMenuItem btnNewRequest;
    private javax.swing.JMenuItem btnViewRequest;
    private javax.swing.JMenu btnexel;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
