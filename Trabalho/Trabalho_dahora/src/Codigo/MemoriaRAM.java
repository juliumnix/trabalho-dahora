/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
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
        final MemoriaRAM other = (MemoriaRAM) obj;
        if (this.capacidade != other.capacidade) {
            return false;
        }
        if (Float.floatToIntBits(this.velocidade) != Float.floatToIntBits(other.velocidade)) {
            return false;
        }
        if (!Objects.equals(this.ddr, other.ddr)) {
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
