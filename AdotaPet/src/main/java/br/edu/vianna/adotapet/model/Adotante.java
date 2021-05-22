/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.model;

import br.edu.vianna.adotapet.model.pets.Animal;
import br.edu.vianna.adotapet.model.endereco.Endereco;

import java.util.ArrayList;

/**
 *
 * @author otavi
 */
public class Adotante extends Pessoa {
    private Endereco endereco;
    private ArrayList<String> telefones;
    private double salario;
    private ArrayList<Animal> adocoes;
}
