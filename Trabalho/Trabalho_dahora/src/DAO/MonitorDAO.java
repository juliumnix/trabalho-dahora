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
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class MonitorDAO {
    public static void salvarArmazenamento(Monitor mon){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, resolucao, tamanhoFloat, aspecto, frameRate) VALUES (?, ?, ?, ?, ?,?,?,?,?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mon.getModelo());
            stmt.setFloat(2, mon.getValor());
            stmt.setString(3, mon.getDescricao());
            stmt.setString(4, mon.getCategoria());
            stmt.setString(5, mon.getImagem());
            stmt.setString(6, mon.getResolucao());
            stmt.setFloat(7, mon.getTamanho());
            stmt.setString(8, mon.getAspecto());
            stmt.setInt(9, mon.getFrameRate());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
}
