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
    private String ddr;
    private float velocidade;
    
    public MemoriaRAM (String modelo, float valor, String descricao, String marca, String categoria, String imagem,
            int capacidade, float velocidade, String ddr)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.capacidade = capacidade;
        this.ddr = ddr;
        this.velocidade = velocidade;
    }
    
    public int getCapacidade ()
    {
        return this.capacidade;
    }
    
    public String getDdr ()
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

    public void setDdr(String ddr) 
    {
        if (!ddr.isEmpty())
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
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Capacidade: " + capacidade + ", DDR: " + ddr + ", Velocidade: " + velocidade;
    }
    
}
