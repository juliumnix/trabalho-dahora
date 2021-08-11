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
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class HeadsetDAO {
    public static void salvarArmazenamento(Headset head){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, semFio, microfone, tipoString, bluetooth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, head.getModelo());
            stmt.setFloat(2, head.getValor());
            stmt.setString(3, head.getDescricao());
            stmt.setString(4, head.getCategoria());
            stmt.setString(5, head.getImagem());
            stmt.setBoolean(6, head.getSemFio());
            stmt.setBoolean(7, head.isMicrofone());
            stmt.setString(8, head.getTipo());
            stmt.setBoolean(9, head.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
}
