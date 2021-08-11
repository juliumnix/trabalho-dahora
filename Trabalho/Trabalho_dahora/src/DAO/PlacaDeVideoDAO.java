/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.PlacaDeVideo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class PlacaDeVideoDAO {
    public static void salvarArmazenamento(PlacaDeVideo plac){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, alimentacao, memoria) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, plac.getModelo());
            stmt.setFloat(2, plac.getValor());
            stmt.setString(3, plac.getDescricao());
            stmt.setString(4, plac.getCategoria());
            stmt.setString(5, plac.getImagem());
            stmt.setBoolean(6, plac.getAlimentacao());
            stmt.setInt(7, plac.getMemoria());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
}
