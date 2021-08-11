/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Cooler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class CoolerDAO {
     public static void salvarArmazenamento(Cooler comp){
//        CreateTableDAO.creatingTable();
//private float velocidadeVentoinha;
//    private String tipo;
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, velocidadeVentoinha, tipoString) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, comp.getModelo());
            stmt.setFloat(2, comp.getValor());
            stmt.setString(3, comp.getDescricao());
            stmt.setString(4, comp.getCategoria());
            stmt.setString(5, comp.getImagem());
            stmt.setFloat(6, comp.getVelocidadeVentoinha());
            stmt.setString(7, comp.getTipo());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
}
