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
public class PlacaDeVideo extends Produto {
    private boolean alimentacao;
    private int memoria;

    public PlacaDeVideo(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    int memoria, boolean alimentacao) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.alimentacao = alimentacao;
        this.memoria = memoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final PlacaDeVideo other = (PlacaDeVideo) obj;
        if (this.alimentacao != other.alimentacao) {
            return false;
        }
        if (this.memoria != other.memoria) {
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
    
    public boolean getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(boolean alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getMemoria() {
        return memoria;
    }

    public boolean setMemoria(int memoria) {
        if (memoria >=0) {
            this.memoria = memoria;
            return true;
        }
        return false;
    }

    @Override
    public String imprimirDados(String imprimir) {
        return super.imprimirDados(imprimir)+ ", Alimentação: " + alimentacao + ", Memória: " + memoria;
    }
    
}

