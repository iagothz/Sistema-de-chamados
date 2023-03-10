package com.mycompany.ticketsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

// author Iago

public class Frame_Login extends javax.swing.JFrame {
    
    // Criador da estrutura Frame_Login
    public Frame_Login() {
        initComponents();
    }
    UserInfo users = new UserInfo();
    ConexaoDB conexao = new ConexaoDB();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Form_Login_Pane = new javax.swing.JPanel();
        Form_Login_Pane_lbl_Login = new javax.swing.JLabel();
        Form_Login_Pane_Login = new javax.swing.JTextField();
        Form_Login_Pane_lbl_Password = new javax.swing.JLabel();
        Form_Login_Pane_Password = new javax.swing.JPasswordField();
        Form_Login_Pane_Ok = new javax.swing.JButton();
        Form_Login_Pane_lbl_Forgot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        Form_Login_Pane_lbl_Login.setText("Login:");

        Form_Login_Pane_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_Login_Pane_LoginActionPerformed(evt);
            }
        });

        Form_Login_Pane_lbl_Password.setText("Senha:");

        Form_Login_Pane_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_Login_Pane_PasswordActionPerformed(evt);
            }
        });

        Form_Login_Pane_Ok.setText("Login");
        Form_Login_Pane_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_Login_Pane_OkActionPerformed(evt);
            }
        });

        Form_Login_Pane_lbl_Forgot.setText("Esqueci a senha");
        Form_Login_Pane_lbl_Forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Form_Login_Pane_lbl_ForgotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Form_Login_PaneLayout = new javax.swing.GroupLayout(Form_Login_Pane);
        Form_Login_Pane.setLayout(Form_Login_PaneLayout);
        Form_Login_PaneLayout.setHorizontalGroup(
            Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Form_Login_PaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Form_Login_PaneLayout.createSequentialGroup()
                        .addComponent(Form_Login_Pane_lbl_Forgot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(Form_Login_Pane_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Form_Login_PaneLayout.createSequentialGroup()
                        .addGroup(Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Form_Login_Pane_lbl_Password)
                            .addComponent(Form_Login_Pane_lbl_Login))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Form_Login_Pane_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Form_Login_Pane_Login))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Form_Login_PaneLayout.setVerticalGroup(
            Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Form_Login_PaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Form_Login_Pane_lbl_Login)
                    .addComponent(Form_Login_Pane_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Form_Login_Pane_lbl_Password)
                    .addComponent(Form_Login_Pane_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Form_Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Form_Login_Pane_Ok)
                    .addComponent(Form_Login_Pane_lbl_Forgot))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Form_Login_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Form_Login_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Form_Login_Pane_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_Login_Pane_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Form_Login_Pane_PasswordActionPerformed

    private void Form_Login_Pane_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_Login_Pane_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Form_Login_Pane_LoginActionPerformed

    private void Form_Login_Pane_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_Login_Pane_OkActionPerformed
        /// TODO add your handling code here:
        boolean tryLogin = false;
        int user_id = 0;
        String login_f = Form_Login_Pane_Login.getText();
        String pass_f = Form_Login_Pane_Password.getText();
        
        if (login_f.isEmpty() || pass_f.isEmpty()){
            tryLogin = false;
            JOptionPane.showMessageDialog(null, "Login ou senha inv??lidos", "Login falhou", JOptionPane.WARNING_MESSAGE);
        } else {
            try{
                conexao.conn();
                String sql = "SELECT * FROM users WHERE users_login = '" + login_f + "' && users_pass = '" + pass_f + "'"; // Cria query para verificar login
                Statement stmt = conexao.con.createStatement(); // Cria o Statement da conex??o do banco
                ResultSet rs = stmt.executeQuery(sql); // Executa a query do login e guarda em rs1
                if (rs.next()) {
                    if (login_f.equals(rs.getString("users_login")) && pass_f.equals(rs.getString("users_pass"))) {
                        users.setTryLogin(true);
                        users.setUser_id(rs.getInt("users_id"));
                    } else {
                        users.setTryLogin(false);
                    }
                } else {
                    users.setTryLogin(false);
                }
                rs.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
            if(users.getTryLogin() == true){
                MainFrame MainFrame = new MainFrame();
                MainFrame.setLocationRelativeTo(null);
                MainFrame.setVisible(true);
                this.hide();
            } else if (users.getTryLogin() == false){
                JOptionPane.showMessageDialog(null, "Login ou senha inv??lidos", "Login falhou", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_Form_Login_Pane_OkActionPerformed

    private void Form_Login_Pane_lbl_ForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Form_Login_Pane_lbl_ForgotMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Request senha", "Esqueci minha senha", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Form_Login_Pane_lbl_ForgotMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Form_Login_Pane;
    private javax.swing.JTextField Form_Login_Pane_Login;
    private javax.swing.JButton Form_Login_Pane_Ok;
    private javax.swing.JPasswordField Form_Login_Pane_Password;
    private javax.swing.JLabel Form_Login_Pane_lbl_Forgot;
    private javax.swing.JLabel Form_Login_Pane_lbl_Login;
    private javax.swing.JLabel Form_Login_Pane_lbl_Password;
    // End of variables declaration//GEN-END:variables
}
