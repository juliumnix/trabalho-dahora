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
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class MemoriaRAMDAO {
    public static void salvarArmazenamento(MemoriaRAM mem){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, capacidade, ddr, velocidade) VALUES (?, ?, ?, ?, ?,?,?,?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mem.getModelo());
            stmt.setFloat(2, mem.getValor());
            stmt.setString(3, mem.getDescricao());
            stmt.setString(4, mem.getCategoria());
            stmt.setString(5, mem.getImagem());
            stmt.setInt(6, mem.getCapacidade());
            stmt.setString(7, mem.getDdr());
            stmt.setFloat(8, mem.getVelocidade());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
}
