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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juliu
 */
public class PlacaDeVideoDAO {
    public static void salvarArmazenamento(PlacaDeVideo plac){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, alimentacao, memoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, plac.getMarca());
            stmt.setString(2, plac.getModelo());
            stmt.setFloat(3, plac.getValor());
            stmt.setString(4, plac.getDescricao());
            stmt.setString(5, plac.getCategoria());
            stmt.setString(6, plac.getImagem());
            stmt.setBoolean(7, plac.getAlimentacao());
            stmt.setInt(8, plac.getMemoria());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
    public static List<PlacaDeVideo> getTodosPlacaDeVideo(){
        List<PlacaDeVideo> placasDeVideo = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Placa de Ví­deo'";
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
                boolean alimentacao = resultado.getBoolean("alimentacao");
                int memoria = resultado.getInt("memoria");
                
                PlacaDeVideo placa = new PlacaDeVideo (modelo, valor, descricao, marca, categoria, imagem, memoria, alimentacao);
                placasDeVideo.add(placa);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return placasDeVideo;
    }

    
}