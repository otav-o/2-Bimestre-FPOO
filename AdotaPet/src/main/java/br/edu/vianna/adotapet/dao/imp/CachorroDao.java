/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.dao.imp;

import br.edu.vianna.adotapet.banco.util.ConnectionFactory;
import br.edu.vianna.adotapet.dao.DaoGenerics;
import br.edu.vianna.adotapet.model.enm.ESexo;
import br.edu.vianna.adotapet.model.pets.Cachorro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author otavi
 */
public class CachorroDao implements DaoGenerics<Cachorro, Integer> {

    @Override
    public void inserir(Cachorro p) throws ClassNotFoundException, SQLException {
        // 1° Conectar
        Connection c = ConnectionFactory.getConnection();
        
        // 2° preparar SQL - insert
        String sql = "insert into animal "
                + "(tipo, nome, data_nascimento, raca, sexo, vacinado, castrado) "
                + "values (?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement pst = c.prepareStatement(sql);
        
        // 3° trocar valores
        pst.setString(1, "C");
        pst.setString(2, p.getNome());
        pst.setObject(3, p.getDataNascimento());
        pst.setString(4, p.getRaca());
        pst.setString(5, p.getSexo() == ESexo.MASCULINO ? "M" : "F");
        pst.setBoolean(6, p.isVacinado());
        pst.setBoolean(7, p.isCastrado());
        
        // 4° Executar
        pst.executeUpdate();
    }

    @Override
    public void alterar(Cachorro p) throws ClassNotFoundException, SQLException {
        // 1° Conectar
        Connection c = ConnectionFactory.getConnection();
        
        // 2° preparar SQL - update
        String sql = "update animal set "
                + "nome = ?, data_nascimento = ?, raca = ?, sexo = ?, vacinado = ?, castrado = ?"
                + "where tipo = 'C' and id = ?";
        PreparedStatement pst = c.prepareStatement(sql);
        
        // 3° trocar valores
        pst.setString(1, p.getNome());
        pst.setObject(2, p.getDataNascimento());
        pst.setString(3, p.getRaca());
        pst.setString(4, p.getSexo() == ESexo.MASCULINO ? "M" : "F");
        pst.setBoolean(5, p.isVacinado());
        pst.setBoolean(6, p.isCastrado());
        pst.setInt(7, p.getId()); // cuidado com a ordem dos parâmetros!
        
        // 4° Executar
        pst.executeUpdate();
    }

    @Override
    public void apagar(Integer key) throws ClassNotFoundException, SQLException {
        // 1° Conectar
        Connection c = ConnectionFactory.getConnection();
        
        // 2° preparar SQL - delete
        String sql = "delete from animal where tipo = 'C' and id = ?;";
        PreparedStatement pst = c.prepareStatement(sql);
        
        // 3° trocar valores
        pst.setInt(1, key);
        
        // 4° Executar
        pst.executeUpdate();
    }

    @Override
    public Cachorro buscar(Integer k) throws ClassNotFoundException, SQLException {
        // 1° Conectar
        Connection c = ConnectionFactory.getConnection();

        // 2° Preparar SQL - select
        String sql = "SELECT id, nome, data_nascimento, raca, sexo, vacinado, castrado "
                + "FROM animal "
                + "where tipo = 'C' "
                + "and id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        // 3° Adicionar valores
        pst.setInt(1, k);

        // 4° Executar
        ResultSet rs = pst.executeQuery();

        // 5° Preencher um objeto - dá um pouco de trabalho
        Cachorro g = null;
        if (rs.next()) {
            g = new Cachorro(rs.getString("cor"), rs.getBoolean("domesticado"), 
                    rs.getInt("id"), rs.getString("nome"), rs.getObject("data_nascimento", LocalDate.class), 
                    (rs.getString("sexo").equalsIgnoreCase("F") ? 
                            ESexo.FEMININO : ESexo.MASCULINO), 
                    rs.getString("raca"));
        }
        return g;
        
        // rs.getObject("data_nascimento", LocalDate.class)
        // LocalDate.parse(rs.getString("data_nascimento"), DateTimeFormatter
    }

    @Override
    public ArrayList<Cachorro> buscarTodos() throws ClassNotFoundException, SQLException {
        // 1° Conectar
        Connection c = ConnectionFactory.getConnection();

        // 2° Preparar SQL - select
        String sql = "SELECT id, nome, data_nascimento, raca, sexo, cor, domesticado "
                + "FROM animal "
                + "where tipo = 'G';";

        PreparedStatement pst = c.prepareStatement(sql);

        // 4° Executar
        ResultSet rs = pst.executeQuery();

        // 5° Preencher um objeto - dá um pouco de trabalho
        ArrayList<Cachorro> listaCachorros = new ArrayList<>();
        while (rs.next()) {
            Cachorro g = new Cachorro(rs.getString("cor"), rs.getBoolean("domesticado"), 
                    rs.getInt("id"), rs.getString("nome"), rs.getObject("data_nascimento", LocalDate.class), 
                    (rs.getString("sexo").equalsIgnoreCase("F") ? 
                            ESexo.FEMININO : ESexo.MASCULINO), 
                    rs.getString("raca"));
            
            listaCachorros.add(g);
        }
        return listaCachorros;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        // 1° Conectar
        Connection c = ConnectionFactory.getConnection();
        
        // 2° preparar SQL - select
        String sql = "select count(*) from animal where tipo = 'C';";
        PreparedStatement pst = c.prepareStatement(sql);
        
        // 4° Executar
        ResultSet rs = pst.executeQuery();
        
        // 5° Preencher um objeto
        rs.next();
        return rs.getLong(1);
        
    }
    
    // vantagem de um método mostrar somente a quantidade: 
    // consulta mais simples, não precisa preencher objetos, o próprio SQL dá a resposta

}
