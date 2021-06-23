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
public class Cooler extends Produto {
    private float velocidadeVentoinha;
    private int tamanho;
    
    public Cooler (String modelo, float valor, String descricao, String marca, String categoria, String imagem, float velocidadeVentoinha, int tamanho)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.velocidadeVentoinha = velocidadeVentoinha;
        this.tamanho = tamanho;
    }
    
    public float getVelocidadeVentoinha ()
    {
        return this.velocidadeVentoinha;
    }
    
    public int getTamanho ()
    {
        return this.tamanho;
    }

    public void setVelocidadeVentoinha(float velocidadeVentoinha) 
    {
        if (velocidadeVentoinha > 0)
        {
            this.velocidadeVentoinha = velocidadeVentoinha;
        }
    }

    public void setTamanho(int tamanho) 
    {
        if (tamanho > 0)
        {
            this.tamanho = tamanho;
        }
    }

    @Override
    public String toString() 
    {
        return "Cooler - " + super.toString() + ", Velocidade da ventoinha: " + velocidadeVentoinha + ", Tamanho: " + tamanho;
    }
    
}
