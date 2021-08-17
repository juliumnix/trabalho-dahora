/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class Conexao {
    private static Connection conexao;
    
    public static Connection getConexao() throws SQLException{
        
        if(conexao == null || conexao.isClosed()){
        try {
        final String stringDeConexao = "jdbc:mysql://localhost/produtos?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "1234";

        conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
        
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
        return conexao;
   }
}
