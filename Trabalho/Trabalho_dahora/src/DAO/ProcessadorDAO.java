/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Processador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class ProcessadorDAO {
    public static void salvarArmazenamento(Processador pro){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, geracao, nucleos, velocidadeNucleo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, pro.getModelo());
            stmt.setFloat(2, pro.getValor());
            stmt.setString(3, pro.getDescricao());
            stmt.setString(4, pro.getCategoria());
            stmt.setString(5, pro.getImagem());
            stmt.setInt(6, pro.getGeracao());
            stmt.setInt(7, pro.getNucleos());
            stmt.setFloat(8, pro.getVelocidadeNucleo());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
}
