/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.banco.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que centraliza a conexão com o banco
 * @author otavi
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver"); // Driver específico para o MySQL
             
            c = DriverManager.getConnection("jbdc:mysql://localhost:3306/adotapet", "root", "");
        }
        return c;
    }
    
    private static Connection c; // Singleton pattern
}
