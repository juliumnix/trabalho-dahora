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
public class Gabinete extends Produto {
    private int tamanho;
    private float peso;
    
    public Gabinete (String modelo, float valor, String descricao, String marca, String categoria, String imagem, int tamanho, float peso)
    {
        super(modelo, valor, descricao, marca, categoria, imagem);
        this.tamanho = tamanho;
        this.peso = peso;
    }
    
    public int getTamanho ()
    {
        return this.tamanho;
    }
    
    public float getPeso ()
    {
        return this.peso;
    }

    public void setTamanho(int tamanho) 
    {
        if (tamanho > 0)
        {
            this.tamanho = tamanho;
        }
    }

    public void setPeso(float peso) 
    {
        if (peso > 0)
        {
            this.peso = peso;
        }
    }

    @Override
    public String toString() 
    {
        return "Gabinete - " + super.toString() + ", Tamanho: " + tamanho + ", Peso: " + peso;
    }
    
}
