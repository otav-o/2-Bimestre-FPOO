/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.dao.imp;

import br.edu.vianna.adotapet.dao.DaoGenerics;
import br.edu.vianna.adotapet.model.Usuario;

/**
 *
 * @author otavi
 */
public class UsuarioDao implements DaoGenerics{

    @Override
    public void inserir(Usuario p) {
        // 1ª conectar ao banco
        // Não é bom abrir conexão toda hora (há um limite)
        // Usaremos um padrão de projeto na semana que vem
        
        // 2° preparar SQL - insert into
        
        // 3° Trocar valores
        
        // 4° Executar
    }   
}
