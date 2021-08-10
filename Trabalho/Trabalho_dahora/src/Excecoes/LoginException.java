/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author juliu
 */
public class LoginException extends Exception {
    
    public LoginException(){
        super("Ocorreu um problema com o login");
    }   

    public LoginException(String msg){
        super(msg);
    }   


}
