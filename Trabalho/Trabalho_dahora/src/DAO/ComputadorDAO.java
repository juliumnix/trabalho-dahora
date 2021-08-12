/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Armazenamento;
import Codigo.Computador;
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
public class ComputadorDAO {
     public static void salvarArmazenamento(Computador comp){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem) VALUES (?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, comp.getMarca());
            stmt.setString(2, comp.getModelo());
            stmt.setFloat(3, comp.getValor());
            stmt.setString(4, comp.getDescricao());
            stmt.setString(5, comp.getCategoria());
            stmt.setString(6, comp.getImagem());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
       
        
       
    } 
      public static List<Computador> getTodosComputadores(){
        List<Computador> computadores = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Computador'";
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
                
                
                Computador computador = new Computador (modelo, valor, descricao, marca, categoria, imagem);
                computadores.add(computador);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return computadores;
    }

}
