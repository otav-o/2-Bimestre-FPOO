/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.service;

/**
 *
 * @author otavi
 */
public class LoginService {
    
    public static boolean PodeLogar(String login, String senha) {
        return login.equals("admin") && senha.equals("123");
    }
}
