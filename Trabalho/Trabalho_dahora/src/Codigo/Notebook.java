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
public class Notebook extends Produto {
    
    public Notebook(String modelo, float valor, String descricao, String marca, String categoria) 
    {
        super(modelo, valor, descricao, marca, categoria);
    }
    
    @Override
    public String toString() 
    {
        return "Notebook - " + super.toString();
    }
}