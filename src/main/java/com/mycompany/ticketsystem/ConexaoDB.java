package com.mycompany.ticketsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;
///@author Iago

public class ConexaoDB {

    UserInfo users = new UserInfo();
    
    public Connection con;
    
    public void conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketsystem", "root", "password");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erro catch conexao");
            e.printStackTrace();
        }
    }
}
