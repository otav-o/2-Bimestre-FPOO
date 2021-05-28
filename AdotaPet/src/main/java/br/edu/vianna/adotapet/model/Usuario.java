/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.model;

import br.edu.vianna.adotapet.model.enm.ETipoUsuario;
import java.time.LocalDate;

/**
 * Quem vai logar no sistema
 * @author otavi
 */
public class Usuario extends Pessoa {
    private String login, senha;
    private ETipoUsuario tipo;

    public Usuario(String login, String senha, ETipoUsuario tipo, String nome, String email, LocalDate dataNascimento) {
        super(nome, email, dataNascimento);
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ETipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(ETipoUsuario tipo) {
        this.tipo = tipo;
    }

    public Usuario() {
    }
}
