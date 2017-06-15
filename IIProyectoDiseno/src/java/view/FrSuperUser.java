/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UISuperUser;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author Usuario
 */
public class FrSuperUser extends javax.swing.JFrame {

    private UISuperUser uiSuperuser = new UISuperUser(); 
    
    public FrSuperUser() {
        initComponents();
       
        jCheckBoxModEmail.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        jTextFieldModEmail.setEnabled(true);
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jTextFieldModEmail.setEnabled(false);
                        jTextFieldModEmail.setText("");
                    }

                    validate();
                    repaint();
                }
        });
            
        jCheckBoxModName.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        jTextFieldModName.setEnabled(true);
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jTextFieldModName.setEnabled(false);
                        jTextFieldModName.setText("");
                    }

                    validate();
                    repaint();
                }
        });
        
                jCheckBoxModPhone.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        jTextFieldModPhone.setEnabled(true);
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jTextFieldModPhone.setEnabled(false);
                        jTextFieldModPhone.setText("");
                    }

                    validate();
                    repaint();
                }
        });
                
                jCheckBoxModId.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        jTextFieldModId.setEnabled(true);
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jTextFieldModId.setEnabled(false);
                        jTextFieldModId.setText("");
                    }

                    validate();
                    repaint();
                }
        });      
                
                                
            jCheckBoxModPassword.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        jPasswordFieldModPass1.setEnabled(true);
                        jPasswordFieldModPass2.setEnabled(true);
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jPasswordFieldModPass1.setEnabled(false);
                        jPasswordFieldModPass1.setText("");
                        jPasswordFieldModPass2.setEnabled(false);
                        jPasswordFieldModPass2.setText("");
                    }

                    validate();
                    repaint();
                }
        });   
            
        jCheckBoxModRol.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        jComboBoxModRol.setEnabled(true);
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jComboBoxModRol.setEnabled(false);
                    }

                    validate();
                    repaint();
                }
        });   
            
        jCheckBoxModEmail.setSelected(false);
        jCheckBoxModId.setSelected(false);
        jCheckBoxModName.setSelected(false);
        jCheckBoxModPassword.setSelected(false);
        jCheckBoxModPhone.setSelected(false);
        jTextFieldModEmail.setEnabled(false);
        jTextFieldModId.setEnabled(false);
        jTextFieldModName.setEnabled(false);
        jTextFieldModPhone.setEnabled(false);
        jPasswordFieldModPass1.setEnabled(false);
        jPasswordFieldModPass2.setEnabled(false);
        jComboBoxModUsuarios.setModel(new DefaultComboBoxModel(uiSuperuser.selectAllEmployee().toArray()));
        jComboBoxDelUsuario.setModel(new DefaultComboBoxModel(uiSuperuser.selectAllEmployee().toArray()));
        
    }
    
    
    
    public JButton getButtonAddUser() {
        return ButtonAddUser;
    }

    public void setButtonAddUser(JButton ButtonAddUser) {
        this.ButtonAddUser = ButtonAddUser;
    }

    public JComboBox<String> getComboBoxRol() {
        return ComboBoxRol;
    }

    public void setComboBoxRol(JComboBox<String> ComboBoxRol) {
        this.ComboBoxRol = ComboBoxRol;
    }

    public JPasswordField getPasswordFieldAddPassword() {
        return PasswordFieldAddPassword;
    }

    public void setPasswordFieldAddPassword(JPasswordField PasswordFieldAddPassword) {
        this.PasswordFieldAddPassword = PasswordFieldAddPassword;
    }

    public JTextField getTextFieldAddEmail() {
        return TextFieldAddEmail;
    }

    public void setTextFieldAddEmail(JTextField TextFieldAddEmail) {
        this.TextFieldAddEmail = TextFieldAddEmail;
    }

    public JTextField getTextFieldAddName() {
        return TextFieldAddName;
    }

    public void setTextFieldAddName(JTextField TextFieldAddName) {
        this.TextFieldAddName = TextFieldAddName;
    }

    public JTextField getTextFieldAddPhone() {
        return TextFieldAddPhone;
    }

    public void setTextFieldAddPhone(JTextField TextFieldAddPhone) {
        this.TextFieldAddPhone = TextFieldAddPhone;
    }

    public JTextField getTextFieldAddUsername() {
        return TextFieldAddUsername;
    }

    public void setTextFieldAddUsername(JTextField TextFieldAddUsername) {
        this.TextFieldAddUsername = TextFieldAddUsername;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JCheckBox getjCheckBoxModEmail() {
        return jCheckBoxModEmail;
    }

    public void setjCheckBoxModEmail(JCheckBox jCheckBoxModEmail) {
        this.jCheckBoxModEmail = jCheckBoxModEmail;
    }

    public JCheckBox getjCheckBoxModId() {
        return jCheckBoxModId;
    }

    public void setjCheckBoxModId(JCheckBox jCheckBoxModId) {
        this.jCheckBoxModId = jCheckBoxModId;
    }

    public JCheckBox getjCheckBoxModName() {
        return jCheckBoxModName;
    }

    public void setjCheckBoxModName(JCheckBox jCheckBoxModName) {
        this.jCheckBoxModName = jCheckBoxModName;
    }

    public JCheckBox getjCheckBoxModPassword() {
        return jCheckBoxModPassword;
    }

    public void setjCheckBoxModPassword(JCheckBox jCheckBoxModPassword) {
        this.jCheckBoxModPassword = jCheckBoxModPassword;
    }

    public JCheckBox getjCheckBoxModPhone() {
        return jCheckBoxModPhone;
    }

    public void setjCheckBoxModPhone(JCheckBox jCheckBoxModPhone) {
        this.jCheckBoxModPhone = jCheckBoxModPhone;
    }

    public JComboBox<String> getjComboBoxModUsuarios() {
        return jComboBoxModUsuarios;
    }

    public void setjComboBoxModUsuarios(JComboBox<String> jComboBoxModUsuarios) {
        this.jComboBoxModUsuarios = jComboBoxModUsuarios;
    }

    public JPasswordField getjPasswordFieldModPass1() {
        return jPasswordFieldModPass1;
    }

    public void setjPasswordFieldModPass1(JPasswordField jPasswordFieldModPass1) {
        this.jPasswordFieldModPass1 = jPasswordFieldModPass1;
    }

    public JPasswordField getjPasswordFieldModPass2() {
        return jPasswordFieldModPass2;
    }

    public void setjPasswordFieldModPass2(JPasswordField jPasswordFieldModPass2) {
        this.jPasswordFieldModPass2 = jPasswordFieldModPass2;
    }

    public JTextField getjTextFieldModEmail() {
        return jTextFieldModEmail;
    }

    public void setjTextFieldModEmail(JTextField jTextFieldModEmail) {
        this.jTextFieldModEmail = jTextFieldModEmail;
    }

    public JTextField getjTextFieldModId() {
        return jTextFieldModId;
    }

    public void setjTextFieldModId(JTextField jTextFieldModId) {
        this.jTextFieldModId = jTextFieldModId;
    }

    public JTextField getjTextFieldModName() {
        return jTextFieldModName;
    }

    public void setjTextFieldModName(JTextField jTextFieldModName) {
        this.jTextFieldModName = jTextFieldModName;
    }

    public JTextField getjTextFieldModPhone() {
        return jTextFieldModPhone;
    }

    public void setjTextFieldModPhone(JTextField jTextFieldModPhone) {
        this.jTextFieldModPhone = jTextFieldModPhone;
    }

    public JButton getjButtonDelUsuario() {
        return jButtonDelUsuario;
    }

    public void setjButtonDelUsuario(JButton jButtonDelUsuario) {
        this.jButtonDelUsuario = jButtonDelUsuario;
    }

    public JCheckBox getjCheckBoxModRol() {
        return jCheckBoxModRol;
    }

    public void setjCheckBoxModRol(JCheckBox jCheckBoxModRol) {
        this.jCheckBoxModRol = jCheckBoxModRol;
    }

    public JComboBox<String> getjComboBoxDelUsuario() {
        return jComboBoxDelUsuario;
    }

    public void setjComboBoxDelUsuario(JComboBox<String> jComboBoxDelUsuario) {
        this.jComboBoxDelUsuario = jComboBoxDelUsuario;
    }

    public JComboBox<String> getjComboBoxModRol() {
        return jComboBoxModRol;
    }

    public void setjComboBoxModRol(JComboBox<String> jComboBoxModRol) {
        this.jComboBoxModRol = jComboBoxModRol;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFieldAddUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextFieldAddName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextFieldAddPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextFieldAddEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PasswordFieldAddPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxRol = new javax.swing.JComboBox<>();
        ButtonAddUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCheckBoxModId = new javax.swing.JCheckBox();
        jTextFieldModId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jCheckBoxModName = new javax.swing.JCheckBox();
        jTextFieldModName = new javax.swing.JTextField();
        jCheckBoxModEmail = new javax.swing.JCheckBox();
        jTextFieldModEmail = new javax.swing.JTextField();
        jCheckBoxModPhone = new javax.swing.JCheckBox();
        jTextFieldModPhone = new javax.swing.JTextField();
        jCheckBoxModPassword = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPasswordFieldModPass1 = new javax.swing.JPasswordField();
        jPasswordFieldModPass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jComboBoxModRol = new javax.swing.JComboBox<>();
        jCheckBoxModRol = new javax.swing.JCheckBox();
        jComboBoxModUsuarios = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxDelUsuario = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jButtonDelUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("Agregar Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("_______________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setText("_______________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jLabel4.setText("En esta sección usted puede agregar usuarios que posteriormente podrán hacer uso del programa ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        TextFieldAddUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAddUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldAddUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 280, -1));

        jLabel6.setText("Nombre ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));
        jPanel1.add(TextFieldAddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 280, -1));

        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        TextFieldAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAddPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldAddPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 280, -1));

        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));
        jPanel1.add(TextFieldAddEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 280, -1));

        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, -1));
        jPanel1.add(PasswordFieldAddPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 280, -1));

        jLabel10.setText("Rol");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, -1, -1));

        ComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIRECTOR", "COORDINADOR", "PROFESOR", "ASISTENTE", "SUPERUSUARIO" }));
        ComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRolActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 270, -1));

        ButtonAddUser.setText("Listo");
        ButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddUserActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 700, -1, 30));

        jTabbedPane1.addTab("Agregar", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Modificar Usuarios");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel12.setText("_________________");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel13.setText("_________________");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel14.setText("Usuario");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 233, -1, -1));

        jCheckBoxModId.setText("Cambiar id (usuario)");
        jCheckBoxModId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModIdActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModId, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 353, -1, -1));
        jPanel2.add(jTextFieldModId, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 381, 253, -1));

        jLabel15.setText("Marque las opciones que desea cambiar del empleado");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 303, -1, -1));

        jCheckBoxModName.setText("Cambiar nombre");
        jCheckBoxModName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModNameActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModName, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 421, -1, -1));
        jPanel2.add(jTextFieldModName, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 455, 253, -1));

        jCheckBoxModEmail.setText("Cambiar correo electrónico");
        jPanel2.add(jCheckBoxModEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 495, -1, -1));
        jPanel2.add(jTextFieldModEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 523, 253, -1));

        jCheckBoxModPhone.setText("Cambiar teléfono");
        jPanel2.add(jCheckBoxModPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));
        jPanel2.add(jTextFieldModPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 253, -1));

        jCheckBoxModPassword.setText("Cambiar contraseña");
        jCheckBoxModPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, -1, -1));

        jLabel16.setText("Ingresar nueva contraseña");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 700, -1, -1));

        jLabel17.setText("Ingresar de nuevo la nueva contraseña");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 740, -1, -1));
        jPanel2.add(jPasswordFieldModPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 720, 253, -1));
        jPanel2.add(jPasswordFieldModPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, 253, -1));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 800, -1, -1));

        jComboBoxModRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIRECTOR", "COORDINADOR", "PROFESOR", "ASISTENTE", "SUPERUSUARIO" }));
        jPanel2.add(jComboBoxModRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, 260, -1));

        jCheckBoxModRol.setText("Cambiar Rol");
        jCheckBoxModRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModRolActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        jComboBoxModUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxModUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxModUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jTabbedPane1.addTab("Modificar", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Eliminar Empleado");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 124, -1, -1));

        jLabel19.setText("_______________");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 101, -1, -1));

        jLabel20.setText("_______________");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jComboBoxDelUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBoxDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel21.setText("Seleccione un usuario para eliminarlo");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jButtonDelUsuario.setText("Eliminar");
        jButtonDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jTabbedPane1.addTab("Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void TextFieldAddUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAddUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAddUsernameActionPerformed

    private void TextFieldAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAddPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAddPhoneActionPerformed

    private void ComboBoxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxRolActionPerformed

    private void ButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddUserActionPerformed
        // TODO add your handling code here:
        if(!TextFieldAddName.getText().equals("")&&!TextFieldAddEmail.getText().equals("")&&!TextFieldAddPhone.getText().equals("")&&!TextFieldAddUsername.getText().equals("") 
           &&!PasswordFieldAddPassword.getText().equals("") )  { 
            System.out.println("aqui 2");
            uiSuperuser.createEmployee(this);
            System.out.println("aqui 3");
    }
        else{ 
            JOptionPane.showMessageDialog(this,"Tiene que llenar todos los espacios establecidos."); 
    } 
    }//GEN-LAST:event_ButtonAddUserActionPerformed

    private void jCheckBoxModIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModIdActionPerformed

    private void jCheckBoxModNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModNameActionPerformed

    private void jCheckBoxModPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextFieldModEmail.getText().equals("") && jTextFieldModId.getText().equals("") && jTextFieldModName.getText().equals("") && jTextFieldModPhone.getText().equals("") && jCheckBoxModRol.isSelected() == false){
            JOptionPane.showMessageDialog(this,"Si desea hacer un cambio, debe escribir en alguno de los espacios disponibles.");
        }
        else if(!jTextFieldModEmail.getText().equals("") && !EmailValidator.getInstance().isValid(jTextFieldModEmail.getText())){
            JOptionPane.showMessageDialog(this,"Correo inválido, hasta que no ingrese un correo válido o desactive la opción no se modificará el empleado.");
        }
        else if(!jTextFieldModPhone.getText().equals("")&&!jTextFieldModPhone.getText().matches("\\d{4}[-\\.\\s]\\d{4}||\\d{8}")){
            JOptionPane.showMessageDialog(this,"Teléfono inválido, hasta que no ingrese un teléfono válido o desactive la opción no se modificará el empleado.");
        }
        else{
            uiSuperuser.editEmployee(this); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxModRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModRolActionPerformed

    private void jButtonDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelUsuarioActionPerformed
        // TODO add your handling code here:
        uiSuperuser.deleteEmployee(this);
    }//GEN-LAST:event_jButtonDelUsuarioActionPerformed

    private void jComboBoxModUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FrSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrSuperUser().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddUser;
    private javax.swing.JComboBox<String> ComboBoxRol;
    private javax.swing.JPasswordField PasswordFieldAddPassword;
    private javax.swing.JTextField TextFieldAddEmail;
    private javax.swing.JTextField TextFieldAddName;
    private javax.swing.JTextField TextFieldAddPhone;
    private javax.swing.JTextField TextFieldAddUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelUsuario;
    private javax.swing.JCheckBox jCheckBoxModEmail;
    private javax.swing.JCheckBox jCheckBoxModId;
    private javax.swing.JCheckBox jCheckBoxModName;
    private javax.swing.JCheckBox jCheckBoxModPassword;
    private javax.swing.JCheckBox jCheckBoxModPhone;
    private javax.swing.JCheckBox jCheckBoxModRol;
    private javax.swing.JComboBox<String> jComboBoxDelUsuario;
    private javax.swing.JComboBox<String> jComboBoxModRol;
    private javax.swing.JComboBox<String> jComboBoxModUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldModPass1;
    private javax.swing.JPasswordField jPasswordFieldModPass2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldModEmail;
    private javax.swing.JTextField jTextFieldModId;
    private javax.swing.JTextField jTextFieldModName;
    private javax.swing.JTextField jTextFieldModPhone;
    // End of variables declaration//GEN-END:variables




}
