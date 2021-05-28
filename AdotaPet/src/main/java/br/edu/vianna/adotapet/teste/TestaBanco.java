/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.teste;

import br.edu.vianna.adotapet.banco.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author otavi
 */
public class TestaBanco {
    public static void main(String[] args) {
        try {
        Connection c = ConnectionFactory.getConnection();
        Connection c1 = ConnectionFactory.getConnection();
        Connection c2 = ConnectionFactory.getConnection();
        Connection c3 = ConnectionFactory.getConnection();
        Connection c4 = ConnectionFactory.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        Thread.sleep(5000);
        System.out.println("Acabou");
    }
}
