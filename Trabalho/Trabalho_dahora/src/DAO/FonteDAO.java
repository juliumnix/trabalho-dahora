/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Fonte;
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
public class FonteDAO {
     public static void salvarArmazenamento(Fonte font){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, tensao, certificacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, font.getMarca());
            stmt.setString(2, font.getModelo());
            stmt.setFloat(3, font.getValor());
            stmt.setString(4, font.getDescricao());
            stmt.setString(5, font.getCategoria());
            stmt.setString(6, font.getImagem());
            stmt.setInt(7, font.getTensao());
            stmt.setString(8, font.getCertificacao());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
     public static List<Fonte> getTodosFontes(){
        List<Fonte> fontes = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Fonte'";
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
                int tensao = resultado.getInt("tensao");
                String certificacao = resultado.getString("certificacao");
                
                
                Fonte fonte = new Fonte(modelo, valor, descricao, marca, categoria, imagem, certificacao, tensao);
                fontes.add(fonte);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return fontes;
    }
    
}