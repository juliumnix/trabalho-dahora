/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Excecoes.LoginException;

/**
 *
 * @author juliu
 */
public abstract class Produto implements Comparable<Produto> {
    protected String auxiliar;
    protected String modelo;
    protected float valor;
    protected String descricao;
    protected String marca;
    protected String categoria;
    protected String imagem;

    public Produto(String modelo, float valor, String descricao, String marca, String categoria, String imagem) {
        this.modelo = modelo;
        this.valor = valor;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.auxiliar = "";
        
        
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

    public String getImagem() {
        return imagem;
    }

    public void setModelo(String modelo) 
    {
        if (!modelo.isBlank())
        {
            this.modelo = modelo;
        }
    }

    public void setValor(float valor) 
    {
        if(valor > 0)
        {
            this.valor = valor;
        }
    }

    public void setDescricao(String descricao) 
    {
        if(!descricao.isBlank())
        {
            this.descricao = descricao;
        }
    }

    public void setMarca(String marca) 
    {
        if(!marca.isBlank())
        {
            this.marca = marca;
        }
    }

    public void setCategoria(String categoria) 
    {
        if(!categoria.isBlank())
        {
            this.categoria = categoria;
        }
    }

    public void setImagem(String imagem) {
        if(!imagem.isBlank())
        {
            this.imagem = imagem;
        }
    }

    public String getAuxiliar() {
        return auxiliar;
    }
    
    public void setAuxiliar (String auxiliar)
    {
        this.auxiliar = auxiliar;
    }
    

    @Override
    public String toString() 
    {
        return modelo;
    }
    
    public String imprimirDados (String cat)
    {
        return cat+":\n Modelo: " + modelo + "\n Valor: " + valor + "\n Descrição: " + descricao + "\n Marca: " + marca + "\n Categoria: " + categoria;
    }
    
    public String conteudoPesquisa ()
    {
        return modelo+" "+valor+" "+descricao+" "+marca+" "+categoria;
    }
    
    @Override
    public int compareTo(Produto other) {
        int compareInt = this.auxiliar.compareTo(other.auxiliar);
        if (compareInt < 0) return -1; //this.modelo é maior
        if (compareInt > 0) return 1; // other.modelo é maior
        return 0; //eles são iguais
        
    }
}

