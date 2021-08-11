/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Gabinete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class GabineteDAO {
    
     public static void salvarArmazenamento(Gabinete gab){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, tamanhoString, peso) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, gab.getModelo());
            stmt.setFloat(2, gab.getValor());
            stmt.setString(3, gab.getDescricao());
            stmt.setString(4, gab.getCategoria());
            stmt.setString(5, gab.getImagem());
            stmt.setString(6, gab.getTamanho());
            stmt.setFloat(7, gab.getPeso());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
}
