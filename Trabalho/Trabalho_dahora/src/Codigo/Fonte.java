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
public class Fonte extends Produto{
    private int tensao;
    private String certificacao;

    public Fonte(String modelo, float valor, String descricao, String marca, String categoria, String imagem,
        String certificacao, int tensao) {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.tensao = tensao;
        this.certificacao = certificacao;
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
        final Fonte other = (Fonte) obj;
        if (this.tensao != other.tensao) {
            return false;
        }
        if (!Objects.equals(this.certificacao, other.certificacao)) {
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
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Tensão: " + tensao + ", Certificação: " + certificacao;
    }
}

