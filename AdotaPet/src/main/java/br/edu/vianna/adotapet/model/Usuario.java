/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.model;

import br.edu.vianna.adotapet.model.enm.ETipoUsuario;

/**
 * Quem vai logar no sistema
 * @author otavi
 */
public class Usuario extends Pessoa {
    private String login, senha;
    private ETipoUsuario tipo;
}
