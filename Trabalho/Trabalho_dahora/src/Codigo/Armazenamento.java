/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Armazenamento extends Produto {
    private int capacidade;
    private float velocidade;
    private String tipo;
    
    public Armazenamento (String modelo, float valor, String descricao, String marca, String categoria, String imagem,
            int capacidade, float velocidade, String tipo)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Armazenamento other = (Armazenamento) obj;
        if (this.capacidade != other.capacidade) {
            
            return false;
        }
        if (Float.floatToIntBits(this.velocidade) != Float.floatToIntBits(other.velocidade)) {
            
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            
            return false;
        }
        return true;
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
        if (capacidade > 0)
        {
            this.capacidade = capacidade;
        }
    }

    public void setVelocidade(float velocidade) 
    {
        if (velocidade > 0)
        {
            this.velocidade = velocidade;
        }
    }

    public void setTipo(String tipo) 
    {
        if (!tipo.isBlank())
        {
            this.tipo = tipo;
        }
    }

    @Override
    public String toString() 
    {
        return "Armazenamento - " + super.toString() + ", Capacidade: " + capacidade + ", Velocidade: " + velocidade + ", Tipo: " + tipo;
    }
}
