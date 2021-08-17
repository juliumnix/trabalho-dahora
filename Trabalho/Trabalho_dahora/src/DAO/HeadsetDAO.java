/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Headset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliu
 */
public class HeadsetDAO {
    public static void salvarHeadset(Headset head){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, semFio, microfone, tipoString, bluetooth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? ,?)";
        
        Connection conexao;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, head.getMarca());
            stmt.setString(2, head.getModelo());
            stmt.setFloat(3, head.getValor());
            stmt.setString(4, head.getDescricao());
            stmt.setString(5, head.getCategoria());
            stmt.setString(6, head.getImagem());
            stmt.setBoolean(7, head.getSemFio());
            stmt.setBoolean(8, head.isMicrofone());
            stmt.setString(9, head.getTipo());
            stmt.setBoolean(10, head.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
       
    } 
    
     public static List<Headset> getTodosHeadset() throws SQLException{
        List<Headset> headsets = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Headset'";
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
                boolean bluetooth = resultado.getBoolean("bluetooth");
                boolean microfone = resultado.getBoolean("microfone");
                boolean semFio = resultado.getBoolean("semFio");
                String tipo = resultado.getString("tipoString");
                
                
                
                
                Headset headset = new Headset (modelo, valor, descricao, marca, categoria, imagem, bluetooth, microfone, semFio, tipo);
                headsets.add(headset);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return headsets;
    }
}