/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.PlacaMae;
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
public class PlacaMaeDAO {
    public static void salvarArmazenamento(PlacaMae plac){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, wifi, entradasRAM, entradasUSB, entradasPCIExpress, tamanhoString, bluetooth ) "
                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, plac.getMarca());
            stmt.setString(2, plac.getModelo());
            stmt.setFloat(3, plac.getValor());
            stmt.setString(4, plac.getDescricao());
            stmt.setString(5, plac.getCategoria());
            stmt.setString(6, plac.getImagem());
            stmt.setBoolean(7, plac.getWifi());
            stmt.setInt(8, plac.getEntradasRAM());
            stmt.setInt(9, plac.getEntradasUSB());
            stmt.setInt(10, plac.getEntradasPCIExpress());
            stmt.setString(11, plac.getTamanho());
            stmt.setBoolean(12, plac.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
    public static List<PlacaMae> getTodosPlacaMae(){
        List<PlacaMae> placasMae = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Placa MÃ£e'";
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
                boolean wifi = resultado.getBoolean("wifi");
                int entradasRAM = resultado.getInt("entradasRAM");
                int entradasUSB = resultado.getInt("entradasUSB");
                int entradasPCIExpress = resultado.getInt("entradasPCIExpress");
                String tamanho = resultado.getString("tamanhoString");
                boolean bluetooth = resultado.getBoolean("bluetooth");
                
                PlacaMae placa = new PlacaMae (modelo, valor, descricao, marca, categoria, imagem, entradasPCIExpress, entradasRAM, entradasUSB, bluetooth, tamanho, wifi);
                placasMae.add(placa);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return placasMae;
    }

}