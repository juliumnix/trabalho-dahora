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
public abstract class Produto {
    protected String modelo;
    protected float valor;
    protected String descricao;
    protected String marca;
    protected String categoria;

    public Produto(String modelo, float valor, String descricao, String marca, String categoria) {
        this.modelo = modelo;
        this.valor = valor;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;
    };

    //gets
    public String getModelo() {
        return modelo;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }


}
