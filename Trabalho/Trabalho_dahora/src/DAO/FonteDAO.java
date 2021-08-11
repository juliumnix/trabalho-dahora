/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Fonte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class FonteDAO {
     public static void salvarArmazenamento(Fonte font){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, tensao, certificacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, font.getModelo());
            stmt.setFloat(2, font.getValor());
            stmt.setString(3, font.getDescricao());
            stmt.setString(4, font.getCategoria());
            stmt.setString(5, font.getImagem());
            stmt.setInt(6, font.getTensao());
            stmt.setString(7, font.getCertificacao());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
}
