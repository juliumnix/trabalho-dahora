/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Gabinete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juliu
 */
public class GabineteDAO {
    
     public static void salvarArmazenamento(Gabinete gab){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, tamanhoString, peso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, gab.getMarca());
            stmt.setString(2, gab.getModelo());
            stmt.setFloat(3, gab.getValor());
            stmt.setString(4, gab.getDescricao());
            stmt.setString(5, gab.getCategoria());
            stmt.setString(6, gab.getImagem());
            stmt.setString(7, gab.getTamanho());
            stmt.setFloat(8, gab.getPeso());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
      public static List<Gabinete> getTodosGabinete(){
        List<Gabinete> gabinetes = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Gabinete'";
        Statement stmt;

        try {
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);

            while (resultado.next()) {
                String modelo = resultado.getString("modelo");
                float valor = resultado.getFloat("valor");
                String descricao = resultado.getString("descricao");
                String marca = resultado.getString("marca");
                String categoria = resultado.getString("categoria");
                String imagem = resultado.getString("imagem");
                String tamanho = resultado.getString("tamanhoString");
                float peso = resultado.getFloat("peso");
                
                
                Gabinete gabinete = new Gabinete (modelo, valor, descricao, marca, categoria, imagem, peso, tamanho);
                gabinetes.add(gabinete);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return gabinetes;
    }
    
}