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
public class Fonte extends Produto{
    private int tensao;
    private String certificacao;

    public Fonte(String modelo, float valor, String descricao, String marca, String categoria,
                 int tensao, String certificacao) {
        super(modelo, valor, descricao, marca, categoria);
        this.tensao = tensao;
        this.certificacao = certificacao;
    }

    public int getTensao() {
        return tensao;
    }

    public boolean setTensao(int tensao) {
        if (tensao >= 0) {
            this.tensao = tensao;
            return true;
        }
        return false;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public boolean setCertificacao(String certificacao) {
        if (certificacao.isBlank()) {
            return false;
        }
        this.certificacao = certificacao;
        return true;
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

