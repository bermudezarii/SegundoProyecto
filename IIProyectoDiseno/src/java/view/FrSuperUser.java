/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UISuperUser;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
        
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                uiSuperuser.saveEmployees();
            }
        });
        
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
                        
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        jPasswordFieldModPass1.setEnabled(false);
                        jPasswordFieldModPass1.setText("");
                        
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

        uiSuperuser.selectAllEmployee(this);
        
    }

    public JLabel getLbName() {
        return lbName;
    }

    public void setLbName(JLabel lbName) {
        this.lbName = lbName;
    }

    public JLabel getLbName1() {
        return lbName1;
    }

    public void setLbName1(JLabel lbName1) {
        this.lbName1 = lbName1;
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
        jPasswordFieldModPass1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jComboBoxModRol = new javax.swing.JComboBox<>();
        jCheckBoxModRol = new javax.swing.JCheckBox();
        jComboBoxModUsuarios = new javax.swing.JComboBox<>();
        lbName1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxDelUsuario = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jButtonDelUsuario = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
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
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 70, 125));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Modificar Usuarios");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 70));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("________________");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -30, 450, 60));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("________________");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Usuario");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jCheckBoxModId.setBackground(new java.awt.Color(0, 70, 125));
        jCheckBoxModId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBoxModId.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxModId.setText("Cambiar id (usuario)");
        jCheckBoxModId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModIdActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));
        jPanel2.add(jTextFieldModId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 253, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Marque las opciones que desea cambiar del empleado");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jCheckBoxModName.setBackground(new java.awt.Color(0, 70, 125));
        jCheckBoxModName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBoxModName.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxModName.setText("Cambiar nombre");
        jCheckBoxModName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModNameActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));
        jPanel2.add(jTextFieldModName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 253, -1));

        jCheckBoxModEmail.setBackground(new java.awt.Color(0, 70, 125));
        jCheckBoxModEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBoxModEmail.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxModEmail.setText("Cambiar correo electrónico");
        jPanel2.add(jCheckBoxModEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));
        jPanel2.add(jTextFieldModEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 253, -1));

        jCheckBoxModPhone.setBackground(new java.awt.Color(0, 70, 125));
        jCheckBoxModPhone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBoxModPhone.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxModPhone.setText("Cambiar teléfono");
        jPanel2.add(jCheckBoxModPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));
        jPanel2.add(jTextFieldModPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 253, -1));

        jCheckBoxModPassword.setBackground(new java.awt.Color(0, 70, 125));
        jCheckBoxModPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBoxModPassword.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxModPassword.setText("Cambiar contraseña");
        jCheckBoxModPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));
        jPanel2.add(jPasswordFieldModPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 253, -1));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, -1, -1));

        jComboBoxModRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIRECTOR", "COORDINADOR", "PROFESOR", "ASISTENTE", "SUPERUSUARIO" }));
        jPanel2.add(jComboBoxModRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 260, -1));

        jCheckBoxModRol.setBackground(new java.awt.Color(0, 70, 125));
        jCheckBoxModRol.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBoxModRol.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxModRol.setText("Cambiar Rol");
        jCheckBoxModRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModRolActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxModRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        jComboBoxModUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxModUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 180, -1));

        lbName1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel2.add(lbName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 280, 30));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/workspace1200-700.jpg"))); // NOI18N
        jLabel23.setText("jLabel1");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        jTabbedPane1.addTab("Modificar", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Eliminar Empleado");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("_______________");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("_______________");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jComboBoxDelUsuario.setBackground(new java.awt.Color(239, 62, 53));
        jComboBoxDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDelUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Seleccione un usuario para eliminarlo");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jButtonDelUsuario.setBackground(new java.awt.Color(239, 62, 53));
        jButtonDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelUsuario.setText("Eliminar");
        jButtonDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        lbName.setForeground(new java.awt.Color(254, 254, 254));
        jPanel3.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 230, 30));

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/workspace1200-700.jpg"))); // NOI18N
        jLabel22.setText("jLabel1");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_______________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("En esta sección usted puede agregar usuarios que posteriormente podrán hacer uso del programa ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 80));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        TextFieldAddUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAddUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldAddUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 280, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel1.add(TextFieldAddName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        TextFieldAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAddPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldAddPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 280, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        jPanel1.add(TextFieldAddEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 280, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        jPanel1.add(PasswordFieldAddPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 280, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rol");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        ComboBoxRol.setBackground(new java.awt.Color(239, 62, 53));
        ComboBoxRol.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ComboBoxRol.setForeground(new java.awt.Color(255, 255, 255));
        ComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIRECTOR", "COORDINADOR", "PROFESOR", "ASISTENTE", "SUPERUSUARIO" }));
        ComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRolActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 270, -1));

        ButtonAddUser.setBackground(new java.awt.Color(239, 62, 53));
        ButtonAddUser.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddUser.setText("Listo");
        ButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddUserActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, 30));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/workspace1200-700.jpg"))); // NOI18N
        jLabel17.setText("jLabel1");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        jTabbedPane1.addTab("Agregar", jPanel1);

        jMenu1.setText("Archivo");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jMenu1.add(btnExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            
            uiSuperuser.createEmployee(this);
          
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
            uiSuperuser.editEmployee(this,jComboBoxModUsuarios.getSelectedItem().toString()); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxModRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModRolActionPerformed

    private void jButtonDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelUsuarioActionPerformed
        // TODO add your handling code here:
        uiSuperuser.deleteEmployee(this,jComboBoxDelUsuario.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonDelUsuarioActionPerformed

    private void jComboBoxModUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModUsuariosActionPerformed
        // TODO add your handling code here:
        uiSuperuser.selectEmployee(this,jComboBoxModUsuarios.getSelectedItem().toString());
        
    }//GEN-LAST:event_jComboBoxModUsuariosActionPerformed

    private void jComboBoxDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDelUsuarioActionPerformed
        // TODO add your handling code here:
         uiSuperuser.selectEmployee(this,jComboBoxDelUsuario.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxDelUsuarioActionPerformed

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
    private javax.swing.JMenuItem btnExit;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldModPass1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldModEmail;
    private javax.swing.JTextField jTextFieldModId;
    private javax.swing.JTextField jTextFieldModName;
    private javax.swing.JTextField jTextFieldModPhone;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    // End of variables declaration//GEN-END:variables




}
