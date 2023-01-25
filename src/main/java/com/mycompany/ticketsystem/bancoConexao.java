package com.mycompany.ticketsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;
//@author Iago

public class bancoConexao {
    
    private Connection con;
    boolean tryLogin;
    boolean novoCadastrado;
    int num_chamado;
    public int user_id;
    String login_f;
    String pass_f;
    int assunto;
    int prioridade;
    String data;
    String hora;
    String desc;
    
    public void conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketsystem", "root", "password");
        } catch(SQLException | ClassNotFoundException e) {
            System.out.println("Erro catch conexao");
            e.printStackTrace();
        }
    }
    public void login(String login_f, String pass_f, int user_id){
        try {
            conn();
            String sql = "SELECT * FROM users WHERE users_login = '" + login_f + "' && users_pass = '" + pass_f + "'"; // Cria query para verificar login
            Statement stmt = con.createStatement(); // Cria Statement para executar as querys
            ResultSet rs = stmt.executeQuery(sql); // Executa a query do login e guarda em rs1
            if (rs.next()){
                if(login_f.equals(rs.getString("users_login")) && pass_f.equals(rs.getString("users_pass"))){
                    tryLogin = true;
                    user_id = rs.getInt("users_id");
                    System.out.println(user_id);
                } else {
                    tryLogin = false;
                }
            }else{
                tryLogin = false;
            }
            rs.close();
            con.close();
        } catch (SQLException e){
            System.out.println("Erro catch login");
            e.printStackTrace();
        }
    }
    
    public void novo(int assunto, int prioridade, String data, String hora, String desc, int user_id){
        try {
            conn();
            String sql = "INSERT INTO chamados (chamados_categoria, chamados_prioridade, chamados_desc, chamados_data, chamados_hora, chamados_users_id) VALUES (" + assunto + ", " + prioridade + ", '" + desc + "', '" + data + "', '" + hora + "', " + user_id + ")"; // Cria query para inserir dados
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // Cria Statement para executar as querys
            stmt.executeUpdate();
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                int num_chamado = keys.getInt(1);
                System.out.println("Chave gerada: " + num_chamado);
            }
            System.out.println(user_id);
            novoCadastrado = true;
            con.close();
        } catch (SQLException e){
            System.out.println(user_id);
            System.out.println("Erro catch novo");
            e.printStackTrace();
        }
    }
}