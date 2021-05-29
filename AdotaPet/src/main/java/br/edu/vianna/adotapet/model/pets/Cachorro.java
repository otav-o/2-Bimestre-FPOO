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
public class Cachorro extends Animal {
    private String raca;
    private boolean vacinado, castrado;
    private int temperamento;

    public Cachorro() {
    }

    public Cachorro(String raca, boolean vacinado, boolean castrado, int temperamento, int id, String nome, LocalDate dataNascimento, ESexo sexo) {
        super(id, nome, dataNascimento, sexo);
        this.raca = raca;
        this.vacinado = vacinado;
        this.castrado = castrado;
        this.temperamento = temperamento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public int getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(int temperamento) {
        this.temperamento = temperamento;
    }
}
