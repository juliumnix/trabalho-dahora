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
public class PlacaDeVideo extends Produto {
    private boolean alimentacao;
    private int memoria;

    public PlacaDeVideo(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
    int memoria, boolean alimentacao) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.alimentacao = alimentacao;
        this.memoria = memoria;
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

