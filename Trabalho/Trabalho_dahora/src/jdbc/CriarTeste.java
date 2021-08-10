/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author juliu
 */
public class CriarTeste {
    public static void main(String[] args) throws SQLException{
        String sql = "INSERT INTO teste (auxiliar, valor, descricao, categoria, imagem) VALUES (?, ?, ?, ?, ?)";
        
        Connection conexao = FabricaConexao.getConexao();
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, "auxiliar");
        stmt.setFloat(2, (float) 900.00);
        stmt.setString(3, "descricao");
        stmt.setString(4, "categoria");
        stmt.setString(5, "imagem");
        
        stmt.execute();
        
        System.out.println("criou bixo");
        
        
        
        
    }
}
