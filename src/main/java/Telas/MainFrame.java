package Telas;

import Classes.ConexaoDB;
import Classes.ChamadosOpenTable;
import Classes.UserInfo;
import Classes.ChamadosInfo;
import Classes.HoraData;
import java.lang.*;
import java.util.Timer;
import java.util.*;
import java.text.*;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    
    public MainFrame() {
        initComponents();
        
        Thread thr = new Thread(new HoraData(MainFrame_Pane_Novo_Hora));
        thr.start();

        HoraData hora = new HoraData(MainFrame_Pane_Novo_Hora);
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                Calendar calendar = Calendar.getInstance();
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH) + 1;
                int ano = calendar.get(Calendar.YEAR);
                
                MainFrame_Pane_Novo_Data.setText(String.format("%02d/%02d/%02d", dia, mes, ano));
            }
        },0,1000);
    }
    
    ChamadosOpenTable chamadosmodel = new ChamadosOpenTable();
    UserInfo userinfo = new UserInfo();
    ChamadosInfo chamadosinfo = new ChamadosInfo();
    ConexaoDB conexao = new ConexaoDB();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MainFrame_Pane = new javax.swing.JTabbedPane();
        MainFrame_Pane_Novo = new javax.swing.JPanel();
        MainFrame_Pane_Novo_Dados = new javax.swing.JPanel();
        MainFrame_Pane_Novo_lbl_Assunto = new javax.swing.JLabel();
        MainFrame_Pane_Novo_lbl_Data = new javax.swing.JLabel();
        MainFrame_Pane_Novo_lbl_Prioridade = new javax.swing.JLabel();
        MainFrame_Pane_Novo_Prioridade = new javax.swing.JComboBox<>();
        MainFrame_Pane_Novo_Confirmar = new javax.swing.JButton();
        MainFrame_Pane_Novo_Assunto = new javax.swing.JComboBox<>();
        MainFrame_Pane_Novo_lbl_Hora = new javax.swing.JLabel();
        MainFrame_Pane_Novo_Hora = new javax.swing.JTextField();
        MainFrame_Pane_Novo_Data = new javax.swing.JTextField();
        MainFrame_Pane_Novo_Descricao = new javax.swing.JPanel();
        MainFrame_Pane_Novo_Pane_Scroll = new javax.swing.JScrollPane();
        MainFrame_Pane_Novo_Pane_Descricao = new javax.swing.JTextArea();
        MainFrame_Pane_Novo_lbl_Descricao = new javax.swing.JLabel();
        MainFrame_Pane_Chamado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MainFrame_Pane_Encerrado = new javax.swing.JPanel();
        MainFrame_Pane_Encerrado_Panel = new javax.swing.JScrollPane();
        MainFrame_Pane_Encerrado_Panel_Table = new javax.swing.JTable();

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.setRequestFocusEnabled(false);
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chamados");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        MainFrame_Pane_Novo_Dados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MainFrame_Pane_Novo_lbl_Assunto.setText("Onde deu a treta:");

        MainFrame_Pane_Novo_lbl_Data.setText("Data:");

        MainFrame_Pane_Novo_lbl_Prioridade.setText("Nivel de carencia:");

        MainFrame_Pane_Novo_Prioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma prioridade", "1. Até rola usar assim, mas tem que arrumar", "2. Precisa resolver pra agora esse troço", "3. Não dá pra viver, arruma isso aqui plmds", "4. TÁ PEGANDO FOGO, BICHO" }));

        MainFrame_Pane_Novo_Confirmar.setText("Abrir pedido de socorro (F2)");
        MainFrame_Pane_Novo_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFrame_Pane_Novo_ConfirmarActionPerformed(evt);
            }
        });
        MainFrame_Pane_Novo_Confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MainFrame_Pane_Novo_ConfirmarKeyPressed(evt);
            }
        });

        MainFrame_Pane_Novo_Assunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um assunto", "1. Parte física do computador", "2. Programas do computador", "3. Impressora", "4. Telefone", "5. Qualquer outra coisa" }));
        MainFrame_Pane_Novo_Assunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFrame_Pane_Novo_AssuntoActionPerformed(evt);
            }
        });

        MainFrame_Pane_Novo_lbl_Hora.setText("Hora:");

        MainFrame_Pane_Novo_Hora.setEditable(false);
        MainFrame_Pane_Novo_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFrame_Pane_Novo_HoraActionPerformed(evt);
            }
        });

        MainFrame_Pane_Novo_Data.setEditable(false);
        MainFrame_Pane_Novo_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFrame_Pane_Novo_DataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainFrame_Pane_Novo_DadosLayout = new javax.swing.GroupLayout(MainFrame_Pane_Novo_Dados);
        MainFrame_Pane_Novo_Dados.setLayout(MainFrame_Pane_Novo_DadosLayout);
        MainFrame_Pane_Novo_DadosLayout.setHorizontalGroup(
            MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainFrame_Pane_Novo_DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MainFrame_Pane_Novo_lbl_Prioridade)
                    .addComponent(MainFrame_Pane_Novo_lbl_Assunto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainFrame_Pane_Novo_Assunto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainFrame_Pane_Novo_Prioridade, 0, 381, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainFrame_Pane_Novo_DadosLayout.createSequentialGroup()
                        .addComponent(MainFrame_Pane_Novo_lbl_Data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainFrame_Pane_Novo_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MainFrame_Pane_Novo_lbl_Hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainFrame_Pane_Novo_Hora))
                    .addComponent(MainFrame_Pane_Novo_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        MainFrame_Pane_Novo_DadosLayout.setVerticalGroup(
            MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrame_Pane_Novo_DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainFrame_Pane_Novo_Confirmar)
                    .addComponent(MainFrame_Pane_Novo_lbl_Assunto)
                    .addComponent(MainFrame_Pane_Novo_Assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainFrame_Pane_Novo_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainFrame_Pane_Novo_lbl_Data)
                    .addComponent(MainFrame_Pane_Novo_lbl_Hora)
                    .addComponent(MainFrame_Pane_Novo_lbl_Prioridade)
                    .addComponent(MainFrame_Pane_Novo_Prioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainFrame_Pane_Novo_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainFrame_Pane_Novo_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainFrame_Pane_Novo_Descricao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MainFrame_Pane_Novo_Pane_Descricao.setColumns(20);
        MainFrame_Pane_Novo_Pane_Descricao.setRows(5);
        MainFrame_Pane_Novo_Pane_Scroll.setViewportView(MainFrame_Pane_Novo_Pane_Descricao);

        MainFrame_Pane_Novo_lbl_Descricao.setText("Descreva seu problema (Não vale problemas psicológicos):");

        javax.swing.GroupLayout MainFrame_Pane_Novo_DescricaoLayout = new javax.swing.GroupLayout(MainFrame_Pane_Novo_Descricao);
        MainFrame_Pane_Novo_Descricao.setLayout(MainFrame_Pane_Novo_DescricaoLayout);
        MainFrame_Pane_Novo_DescricaoLayout.setHorizontalGroup(
            MainFrame_Pane_Novo_DescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainFrame_Pane_Novo_DescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFrame_Pane_Novo_DescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainFrame_Pane_Novo_Pane_Scroll)
                    .addGroup(MainFrame_Pane_Novo_DescricaoLayout.createSequentialGroup()
                        .addComponent(MainFrame_Pane_Novo_lbl_Descricao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainFrame_Pane_Novo_DescricaoLayout.setVerticalGroup(
            MainFrame_Pane_Novo_DescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrame_Pane_Novo_DescricaoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(MainFrame_Pane_Novo_lbl_Descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame_Pane_Novo_Pane_Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainFrame_Pane_NovoLayout = new javax.swing.GroupLayout(MainFrame_Pane_Novo);
        MainFrame_Pane_Novo.setLayout(MainFrame_Pane_NovoLayout);
        MainFrame_Pane_NovoLayout.setHorizontalGroup(
            MainFrame_Pane_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFrame_Pane_Novo_Descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainFrame_Pane_Novo_Dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainFrame_Pane_NovoLayout.setVerticalGroup(
            MainFrame_Pane_NovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrame_Pane_NovoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainFrame_Pane_Novo_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame_Pane_Novo_Descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainFrame_Pane.addTab("Novo chamado", MainFrame_Pane_Novo);

        jTable1.setModel(chamadosmodel);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout MainFrame_Pane_ChamadoLayout = new javax.swing.GroupLayout(MainFrame_Pane_Chamado);
        MainFrame_Pane_Chamado.setLayout(MainFrame_Pane_ChamadoLayout);
        MainFrame_Pane_ChamadoLayout.setHorizontalGroup(
            MainFrame_Pane_ChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        MainFrame_Pane_ChamadoLayout.setVerticalGroup(
            MainFrame_Pane_ChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrame_Pane_ChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );

        MainFrame_Pane.addTab("Chamados abertos", MainFrame_Pane_Chamado);

        MainFrame_Pane_Encerrado_Panel.setForeground(new java.awt.Color(255, 255, 255));

        MainFrame_Pane_Encerrado_Panel_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MainFrame_Pane_Encerrado_Panel.setViewportView(MainFrame_Pane_Encerrado_Panel_Table);

        javax.swing.GroupLayout MainFrame_Pane_EncerradoLayout = new javax.swing.GroupLayout(MainFrame_Pane_Encerrado);
        MainFrame_Pane_Encerrado.setLayout(MainFrame_Pane_EncerradoLayout);
        MainFrame_Pane_EncerradoLayout.setHorizontalGroup(
            MainFrame_Pane_EncerradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrame_Pane_EncerradoLayout.createSequentialGroup()
                .addComponent(MainFrame_Pane_Encerrado_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainFrame_Pane_EncerradoLayout.setVerticalGroup(
            MainFrame_Pane_EncerradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrame_Pane_EncerradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainFrame_Pane_Encerrado_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );

        MainFrame_Pane.addTab("Chamados encerrados", MainFrame_Pane_Encerrado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainFrame_Pane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainFrame_Pane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainFrame_Pane_Novo_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFrame_Pane_Novo_ConfirmarActionPerformed
        // TODO add your handling code here:
        int assunto = MainFrame_Pane_Novo_Assunto.getSelectedIndex();
        int prioridade = MainFrame_Pane_Novo_Prioridade.getSelectedIndex();
        String data = MainFrame_Pane_Novo_Data.getText();
        String hora = MainFrame_Pane_Novo_Hora.getText();
        String desc = MainFrame_Pane_Novo_Pane_Descricao.getText();
        int user_id = userinfo.getUser_id();
        int num_chamado = chamadosinfo.getNum_chamado();
        boolean novoChamadoOk = false;
        
        if (assunto == 0 || prioridade == 0 || desc.equals("")) {
            novoChamadoOk = false;
            JOptionPane.showMessageDialog(null, "Assunto, prioridade ou descrição não foram preenchidos corretamente" , "Criação de chamado", JOptionPane.WARNING_MESSAGE);
        } else{
            try {
                conexao.conn();
                
                String sql = "INSERT INTO chamados (chamados_categoria, chamados_prioridade, chamados_desc, chamados_data, chamados_hora, chamados_users_id, chamados_encerrado) VALUES (" + assunto + ", " + prioridade + ", '" + desc + "', '" + data + "', '" + hora + "', " + user_id + ", 0)"; // Cria query para inserir dados
                PreparedStatement stmt = conexao.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // Cria Statement para executar as querys
                stmt.executeUpdate();
                ResultSet keys = stmt.getGeneratedKeys();
                if (keys.next()) {
                    num_chamado = keys.getInt(1);
                    System.out.println("Chave gerada: " + num_chamado);
                    novoChamadoOk = true;
                }
            } catch (SQLException e) {
                System.out.println("Erro catch novo");
                e.printStackTrace();
            }
            if (novoChamadoOk == true){
                JOptionPane.showMessageDialog(null, "Chamado criado com sucesso. Numero do chamado: " + num_chamado, "Chamado criado", JOptionPane.WARNING_MESSAGE);
                MainFrame_Pane_Novo_Assunto.setSelectedIndex(0);
                MainFrame_Pane_Novo_Prioridade.setSelectedIndex(0);
                MainFrame_Pane_Novo_Pane_Descricao.setText("");
            }
        }
    }//GEN-LAST:event_MainFrame_Pane_Novo_ConfirmarActionPerformed

    private void MainFrame_Pane_Novo_AssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFrame_Pane_Novo_AssuntoActionPerformed

    }//GEN-LAST:event_MainFrame_Pane_Novo_AssuntoActionPerformed

    private void MainFrame_Pane_Novo_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFrame_Pane_Novo_HoraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MainFrame_Pane_Novo_HoraActionPerformed

    private void MainFrame_Pane_Novo_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFrame_Pane_Novo_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainFrame_Pane_Novo_DataActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        // TODO add your handling code here:
        CriarUser criaruser = new CriarUser();
        criaruser.setLocationRelativeTo(null);
        criaruser.setVisible(true);
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void MainFrame_Pane_Novo_ConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainFrame_Pane_Novo_ConfirmarKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_MainFrame_Pane_Novo_ConfirmarKeyPressed
    
    
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MainFrame_Pane;
    private javax.swing.JPanel MainFrame_Pane_Chamado;
    private javax.swing.JPanel MainFrame_Pane_Encerrado;
    private javax.swing.JScrollPane MainFrame_Pane_Encerrado_Panel;
    private javax.swing.JTable MainFrame_Pane_Encerrado_Panel_Table;
    private javax.swing.JPanel MainFrame_Pane_Novo;
    private javax.swing.JComboBox<String> MainFrame_Pane_Novo_Assunto;
    private javax.swing.JButton MainFrame_Pane_Novo_Confirmar;
    private javax.swing.JPanel MainFrame_Pane_Novo_Dados;
    private javax.swing.JTextField MainFrame_Pane_Novo_Data;
    private javax.swing.JPanel MainFrame_Pane_Novo_Descricao;
    private javax.swing.JTextField MainFrame_Pane_Novo_Hora;
    private javax.swing.JTextArea MainFrame_Pane_Novo_Pane_Descricao;
    private javax.swing.JScrollPane MainFrame_Pane_Novo_Pane_Scroll;
    private javax.swing.JComboBox<String> MainFrame_Pane_Novo_Prioridade;
    private javax.swing.JLabel MainFrame_Pane_Novo_lbl_Assunto;
    private javax.swing.JLabel MainFrame_Pane_Novo_lbl_Data;
    private javax.swing.JLabel MainFrame_Pane_Novo_lbl_Descricao;
    private javax.swing.JLabel MainFrame_Pane_Novo_lbl_Hora;
    private javax.swing.JLabel MainFrame_Pane_Novo_lbl_Prioridade;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
