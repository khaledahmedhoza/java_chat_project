/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JOptionPane;

/**
 *
 * @author bondok
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    
    Client c;
    public SignUp(Client c) {
        initComponents();
        this.c=c;
    }
    public SignUp() {
       //
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        userName = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        comfirmPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        genderMale = new javax.swing.JRadioButton();
        genderFemale = new javax.swing.JRadioButton();
        countery = new javax.swing.JComboBox();
        create = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creat new account");
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(userName);
        userName.setBounds(220, 110, 210, 20);
        jPanel1.add(name);
        name.setBounds(220, 50, 210, 20);
        jPanel1.add(email);
        email.setBounds(220, 80, 210, 20);
        jPanel1.add(password);
        password.setBounds(220, 170, 210, 20);
        jPanel1.add(comfirmPassword);
        comfirmPassword.setBounds(220, 140, 210, 20);

        jLabel9.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Country");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 230, 80, 24);

        jLabel8.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 200, 80, 25);

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Retpe password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 170, 160, 24);

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 140, 120, 30);

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 110, 110, 30);

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 80, 60, 24);

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 60, 24);

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign up");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 0, 130, 36);

        genderFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(genderFemale);
        genderFemale.setForeground(new java.awt.Color(102, 0, 102));
        genderFemale.setText("Female");
        jPanel1.add(genderFemale);
        genderFemale.setBounds(340, 200, 70, 23);

        genderMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(genderMale);
        genderMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genderMale.setForeground(new java.awt.Color(102, 0, 102));
        genderMale.setSelected(true);
        genderMale.setText("Male");
        genderMale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(genderMale);
        genderMale.setBounds(240, 200, 70, 25);

        countery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        countery.setForeground(new java.awt.Color(102, 0, 102));
        countery.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Egypt", "Spain ", "Indea", "Italy", "USA", "UKA" }));
        jPanel1.add(countery);
        countery.setBounds(220, 230, 210, 23);

        create.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create.setForeground(new java.awt.Color(102, 0, 102));
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(create);
        create.setBounds(380, 270, 80, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Reset");
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 270, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/images/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String gender;
        if(genderFemale.isSelected())gender="Femal";else gender="Male";
        if(name.getText().length() == 0 || email.getText().length()==0 || userName.getText().length()==0){
            showdialog();
        }else{
            
        }
        c.sigupData(name.getText(),email.getText(),userName.getText(),password.getText(),countery.getSelectedItem().toString(),gender);
    }//GEN-LAST:event_jButton1ActionPerformed

     //show dialog
    private void showdialog(){
          JOptionPane.showMessageDialog(new SignUp(),
        "fields are missing",
        "Sorry",
        JOptionPane.PLAIN_MESSAGE);
    }
     //show dialog
    private void showdialog(String ss){
          JOptionPane.showMessageDialog(new SignUp(),
        ss+" is not valid",
        "Sorry",
        JOptionPane.PLAIN_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton create;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox countery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField comfirmPassword;
    private javax.swing.JRadioButton genderMale;
    private javax.swing.JRadioButton genderFemale;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField name;
    private javax.swing.JTextField email;
    // End of variables declaration//GEN-END:variables
}
