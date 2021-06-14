/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Mateus
 */
public class Armazenamento extends Produto{
    private int capacidade;
    private float velocidade;
    private String tipo;
    
    public Armazenamento (String modelo, float valor, String descricao, String marca, String categoria, int capacidade, float velocidade, String tipo)
    {
        super(modelo, valor, descricao, marca, categoria);
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.tipo = tipo;
    }
    
    public int getCapacidade ()
    {
        return this.capacidade;
    }
    
    public float getVelocidade ()
    {
        return this.velocidade;
    }
    
    public String getTipo ()
    {
        return this.tipo;
    }

    public void setCapacidade(int capacidade) 
    {
        this.capacidade = capacidade;
    }

    public void setVelocidade(float velocidade) 
    {
        this.velocidade = velocidade;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    @Override
    public String toString() 
    {
        return "Armazenamento{" + "capacidade=" + capacidade + ", velocidade=" + velocidade + ", tipo=" + tipo + '}';
    }
            
}
