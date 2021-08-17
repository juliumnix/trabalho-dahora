/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

import Codigo.Produto;

/**
 *
 * @author juliu
 */
public class DeleteException extends Exception {
    
    public DeleteException(Produto prod){
        super("Ocorreu um problema ao apagar o produto " + prod.getModelo());
    }

   


}
