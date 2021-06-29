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
    private String tipo;
    
    public Cooler (String modelo, float valor, String descricao, String marca, String categoria, String imagem, float velocidadeVentoinha, String tipo)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.velocidadeVentoinha = velocidadeVentoinha;
        this.tipo = tipo;
    }
    
    public float getVelocidadeVentoinha ()
    {
        return this.velocidadeVentoinha;
    }
    
    public String getTipo ()
    {
        return this.tipo;
    }

    public void setVelocidadeVentoinha(float velocidadeVentoinha) 
    {
        if (velocidadeVentoinha > 0)
        {
            this.velocidadeVentoinha = velocidadeVentoinha;
        }
    }

    public void setTipo(String tipo) 
    {
        if (!tipo.isEmpty())
        {
            this.tipo = tipo;
        }
    }

    @Override
    public String imprimirDados(String imprimir) 
    {
        return super.imprimirDados(imprimir) + ", Velocidade da ventoinha: " + velocidadeVentoinha + ", Tamanho: " + tipo;
    }
    
}
