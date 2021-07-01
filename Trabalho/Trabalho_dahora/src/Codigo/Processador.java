/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Objects;

/**
 *
 * @author juliu
 */
public class Processador extends Produto{
    private int geracao;
    private int nucleos;
    private float velocidadeNucleo;

    public Processador(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    int geracao, int nucleos, float velocidadeNucleo) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.geracao = geracao;
        this.nucleos = nucleos;
        this.velocidadeNucleo = velocidadeNucleo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Processador other = (Processador) obj;
        if (this.geracao != other.geracao) {
            return false;
        }
        if (this.nucleos != other.nucleos) {
            return false;
        }
        if (Float.floatToIntBits(this.velocidadeNucleo) != Float.floatToIntBits(other.velocidadeNucleo)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo))
        {
            return false;
        }
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor))
        {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao))
        {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca))
        {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria))
        {
            return false;
        }
        return true;
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
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Geração: " + geracao + ", Núcleos: " + nucleos + ", Velocidade do Núcleo: " + velocidadeNucleo;
    }
    
}

