/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class FabricaConexao {
    
    public static Connection getConexao(){
        try {
        final String stringDeConexao = "jdbc:mysql://localhost/teste?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "1234";
        
        return DriverManager.getConnection(stringDeConexao, usuario, senha);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}
