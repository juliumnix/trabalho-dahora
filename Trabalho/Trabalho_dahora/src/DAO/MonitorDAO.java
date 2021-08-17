/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Monitor;
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
public class MonitorDAO {
    public static void salvarMonitor(Monitor mon){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca ,modelo, valor, descricao, categoria, imagem, resolucao, tamanhoFloat, aspecto, frameRate) VALUES (?, ?, ?, ?, ?,?,?,?,?,?)";
        
        Connection conexao;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mon.getMarca());
            stmt.setString(2, mon.getModelo());
            stmt.setFloat(3, mon.getValor());
            stmt.setString(4, mon.getDescricao());
            stmt.setString(5, mon.getCategoria());
            stmt.setString(6, mon.getImagem());
            stmt.setString(7, mon.getResolucao());
            stmt.setFloat(8, mon.getTamanho());
            stmt.setString(9, mon.getAspecto());
            stmt.setInt(10, mon.getFrameRate());

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    } 
    
    public static List<Monitor> getTodosMonitor() throws SQLException{
        List<Monitor> monitores = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Monitor'";
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
                String resolucao = resultado.getString("resolucao");
                float tamanho = resultado.getFloat("tamanhoFloat");
                String aspecto = resultado.getString("aspecto");
                int frameRate = resultado.getInt("frameRate");
                
                Monitor monitor = new Monitor (modelo, valor, descricao, marca, categoria, imagem, tamanho, aspecto, frameRate, resolucao);
                monitores.add(monitor);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return monitores;
    }

}