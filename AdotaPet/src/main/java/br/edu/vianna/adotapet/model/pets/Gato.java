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
public class Gato extends Animal {
    private String cor;
    private boolean domesticado;

    public Gato() {
    }

    public Gato(String cor, boolean domesticado, int id, String nome, LocalDate dataNascimento, ESexo sexo) {
        super(id, nome, dataNascimento, sexo);
        this.cor = cor;
        this.domesticado = domesticado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isDomesticado() {
        return domesticado;
    }

    public void setDomesticado(boolean domesticado) {
        this.domesticado = domesticado;
    }
}
