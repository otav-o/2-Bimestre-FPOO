/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.adotapet.model.pets;

import br.edu.vianna.adotapet.model.enm.ESexo;
import java.time.LocalDate;

/**
 *
 * @author otavi
 */
public class Animal {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private ESexo sexo;

    public Animal() {
    }

    public Animal(int id, String nome, LocalDate dataNascimento, ESexo sexo) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ESexo getSexo() {
        return sexo;
    }

    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }
    
    
}
