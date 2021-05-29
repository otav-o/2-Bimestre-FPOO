/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.dao;

import br.edu.vianna.adotapet.model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author otavi
 */
public interface DaoGenerics<C, K> {
    public void inserir(C c) throws ClassNotFoundException, SQLException;
    public void alterar(C c) throws ClassNotFoundException, SQLException;
    
    public void apagar(K key) throws ClassNotFoundException, SQLException;
    
    public C buscar(K key) throws ClassNotFoundException, SQLException;
    
    public ArrayList<C> buscarTodos() throws ClassNotFoundException, SQLException;
    
    public long quantidade() throws ClassNotFoundException, SQLException;


}
