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
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class PlacaMaeDAO {
    public static void salvarArmazenamento(PlacaMae plac){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, wifi, entradasRAM, entradasUSB, entradasPCIExpress, tamanhoString, bluetooth ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, plac.getModelo());
            stmt.setFloat(2, plac.getValor());
            stmt.setString(3, plac.getDescricao());
            stmt.setString(4, plac.getCategoria());
            stmt.setString(5, plac.getImagem());
            stmt.setBoolean(6, plac.getWifi());
            stmt.setInt(7, plac.getEntradasRAM());
            stmt.setInt(8, plac.getEntradasUSB());
            stmt.setInt(9, plac.getEntradasPCIExpress());
            stmt.setString(10, plac.getTamanho());
            stmt.setBoolean(11, plac.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
}
