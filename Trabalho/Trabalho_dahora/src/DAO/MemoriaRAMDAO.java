/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.MemoriaRAM;
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
public class MemoriaRAMDAO {
    public static void salvarMemoriaRAM(MemoriaRAM mem){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, capacidade, ddr, velocidade) VALUES (?, ?, ?, ?, ?,?,?,?,?)";
        
        Connection conexao;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mem.getMarca());
            stmt.setString(2, mem.getModelo());
            stmt.setFloat(3, mem.getValor());
            stmt.setString(4, mem.getDescricao());
            stmt.setString(5, mem.getCategoria());
            stmt.setString(6, mem.getImagem());
            stmt.setInt(7, mem.getCapacidade());
            stmt.setString(8, mem.getDdr());
            stmt.setFloat(9, mem.getVelocidade());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
        
    } 
    
    
      public static List<MemoriaRAM> getTodosMemoriaRAM() throws SQLException{
        List<MemoriaRAM> memoriasRAM = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Memória RAM'";
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
                int capacidade = resultado.getInt("capacidade");
                String ddr = resultado.getString("ddr");
                float velocidade = resultado.getFloat("velocidade");
                
                
                
                MemoriaRAM memoria = new MemoriaRAM (modelo, valor, descricao, marca, categoria, imagem, capacidade, velocidade, ddr);
                memoriasRAM.add(memoria);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return memoriasRAM;
    }
    
}