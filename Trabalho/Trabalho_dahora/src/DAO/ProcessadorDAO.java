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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juliu
 */
public class ProcessadorDAO {
    public static void salvarArmazenamento(Processador pro){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, geracao, nucleos, velocidadeNucleo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, pro.getMarca());
            stmt.setString(2, pro.getModelo());
            stmt.setFloat(3, pro.getValor());
            stmt.setString(4, pro.getDescricao());
            stmt.setString(5, pro.getCategoria());
            stmt.setString(6, pro.getImagem());
            stmt.setInt(7, pro.getGeracao());
            stmt.setInt(8, pro.getNucleos());
            stmt.setFloat(9, pro.getVelocidadeNucleo());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
    public static List<Processador> getTodosProcessadores(){
        List<Processador> processadores = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Processador'";
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
                int geracao = resultado.getInt("geracao");
                int nucleos = resultado.getInt("nucleos");
                float velocidadeNucleo = resultado.getFloat("velocidadeNucleo");
                
                Processador processador = new Processador (modelo, valor, descricao, marca, categoria, imagem, geracao, nucleos, velocidadeNucleo);
                processadores.add(processador);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return processadores;
    }

}