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
public class MemoriaRAM extends Produto{
    private int capacidade;
    private int ddr;
    private float velocidade;
    
    public MemoriaRAM (String modelo, float valor, String descricao, String marca, String categoria, int capacidade, int ddt, float velocidade)
    {
        super(modelo, valor, descricao, marca, categoria);
        this.capacidade = capacidade;
        this.ddr = ddr;
        this.velocidade = velocidade;
    }
    
    public int getCapacidade ()
    {
        return this.capacidade;
    }
    
    public int getDdr ()
    {
        return this.ddr;
    }
    
    public float getVelocidade ()
    {
        return this.velocidade;
    }

    public void setCapacidade(int capacidade) 
    {
        if (capacidade > 0)
        {
            this.capacidade = capacidade;
        }
    }

    public void setDdr(int ddr) 
    {
        if (ddr > 0)
        {
            this.ddr = ddr;
        }
    }

    public void setVelocidade(float velocidade) 
    {
        if (velocidade > 0)
        {
            this.velocidade = velocidade;
        }
    }

    @Override
    public String toString() 
    {
        return "Memória RAM - " + super.toString() + ", Capacidade: " + capacidade + ", DDR: " + ddr + ", Velocidade: " + velocidade;
    }
    
}
