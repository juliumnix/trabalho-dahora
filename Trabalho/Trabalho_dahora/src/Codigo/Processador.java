/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author juliu
 */
public class Processador extends Produto{
    private int geracao;
    private int nucleos;
    private float velocidadeNucleo;

    public Processador(String modelo, float valor, String descricao, String marca, String categoria,
                       int geracao, int nucleos, float velocidadeNucleo) {
        super(modelo, valor, descricao, marca, categoria);
        this.geracao = geracao;
        this.nucleos = nucleos;
        this.velocidadeNucleo = velocidadeNucleo;
    }

    public int getGeracao() {
        return geracao;
    }

    public boolean setGeracao(int geracao) {
        if (geracao >=0) {
            this.geracao = geracao;
            return true;
        }
        return false;
    }

    public int getNucleos() {
        return nucleos;
    }

    public boolean setNucleos(int nucleos) {
        if (nucleos >= 0) {
            this.nucleos = nucleos;
            return true;
        }
        return false;
    }

    public float getVelocidadeNucleo() {
        return velocidadeNucleo;
    }

    public boolean setVelocidadeNucleo(float velocidadeNucleo) {
        if (velocidadeNucleo >= 0) {
            this.velocidadeNucleo = velocidadeNucleo;
            return true;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        return "Processador{" + "geracao=" + geracao + ", nucleos=" + nucleos + ", velocidadeNucleo=" + velocidadeNucleo + '}';
    }
    
}

