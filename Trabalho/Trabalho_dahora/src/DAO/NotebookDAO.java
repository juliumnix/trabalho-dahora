/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Notebook;
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
public class NotebookDAO {
    
    public static void salvarArmazenamento(Notebook note){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem) VALUES (?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, note.getMarca());
            stmt.setString(2, note.getModelo());
            stmt.setFloat(3, note.getValor());
            stmt.setString(4, note.getDescricao());
            stmt.setString(5, note.getCategoria());
            stmt.setString(6, note.getImagem());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
    public static List<Notebook> getTodosNotebook(){
        List<Notebook> notebooks = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Notebook'";
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
                
                
                Notebook notebook = new Notebook (modelo, valor, descricao, marca, categoria, imagem);
                notebooks.add(notebook);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return notebooks;
    }

}