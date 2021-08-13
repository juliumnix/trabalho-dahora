/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Mouse;
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
public class MouseDAO {
    public static void salvarArmazenamento(Mouse mou){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, botoesLaterais, semFio, bluetooth) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mou.getMarca());
            stmt.setString(2, mou.getModelo());
            stmt.setFloat(3, mou.getValor());
            stmt.setString(4, mou.getDescricao());
            stmt.setString(5, mou.getCategoria());
            stmt.setString(6, mou.getImagem());
            stmt.setBoolean(7, mou.getBotoesLaterais());
            stmt.setBoolean(8, mou.getSemFio());
            stmt.setBoolean(9, mou.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
    public static List<Mouse> getTodosMouse(){
        List<Mouse> mouses = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Mouse'";
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
                boolean botoesLaterais = resultado.getBoolean("botoesLaterais");
                boolean semFio = resultado.getBoolean("semFio");
                boolean bluetooth = resultado.getBoolean("bluetooth");
                
                
                Mouse mouse = new Mouse(modelo, valor, descricao, marca, categoria, imagem, bluetooth, botoesLaterais, semFio);
                mouses.add(mouse);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return mouses;
    }

}
