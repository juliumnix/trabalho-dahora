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

    public PlacaDeVideo(String modelo, float valor, String descricao, String marca, String categoria,
                        String interfaceMemoria, boolean alimentacao, int memoria) {
        super(modelo, valor, descricao, marca, categoria);
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
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public float getValor() {
        return super.getValor();
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getCategoria() {
        return super.getCategoria();
    }
}

