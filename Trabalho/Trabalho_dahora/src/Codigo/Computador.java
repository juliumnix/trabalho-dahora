/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author juliu
 */
public class Computador extends Produto{

    public Computador(String modelo, float valor, String descricao, String marca, String categoria, String imagem) {
        super(modelo, valor, descricao, marca, categoria, imagem);
    }

    @Override
    public String toString() 
    {
        return "Computador - " + super.toString();
    }
    
    
}

