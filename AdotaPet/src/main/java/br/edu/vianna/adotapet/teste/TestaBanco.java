/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.teste;

import br.edu.vianna.adotapet.banco.util.ConnectionFactory;
import br.edu.vianna.adotapet.dao.imp.UsuarioDao;
import br.edu.vianna.adotapet.model.Usuario;
import br.edu.vianna.adotapet.model.enm.ETipoUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otavi
 */
public class TestaBanco {
    public static void main(String[] args) {;
    
        Usuario u = new Usuario("Zé", "123", ETipoUsuario.ADMIN,  
                "Zezin da Silva", "ze@ze", LocalDate.now().minusYears(15));
    
        try { // salvar no banco de dados
            new UsuarioDao().inserir(u);
        } catch (ClassNotFoundException ex | SQLException ex) {
            System.out.println("Erro ao gravar no banco: " + ex.getMessage());
        }
            
            /*
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
        */
    }
}
