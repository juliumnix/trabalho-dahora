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
    private String interfaceMemoria;
    private boolean alimentacao;
    private int memoria;

    public PlacaDeVideo(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
                        String interfaceMemoria, boolean alimentacao, int memoria) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.interfaceMemoria = interfaceMemoria;
        this.alimentacao = alimentacao;
        this.memoria = memoria;
    }

    public String getInterfaceMemoria() {
        return interfaceMemoria;
    }

    public boolean setInterfaceMemoria(String interfaceMemoria) {
        if (interfaceMemoria.isBlank()) {
            return false;
        }
        this.interfaceMemoria = interfaceMemoria;
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
    public String toString() {
        return "Placa de Video - " + super.toString()+ ", Interface Memoria: " + interfaceMemoria + ", Alimentação: " + alimentacao + ", Memória: " + memoria;
    }
    
}

