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
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class MouseDAO {
    public static void salvarArmazenamento(Mouse mou){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, botoesLaterais, semFio, bluetooth) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, mou.getModelo());
            stmt.setFloat(2, mou.getValor());
            stmt.setString(3, mou.getDescricao());
            stmt.setString(4, mou.getCategoria());
            stmt.setString(5, mou.getImagem());
            stmt.setBoolean(6, mou.getBotoesLaterais());
            stmt.setBoolean(7, mou.getSemFio());
            stmt.setBoolean(8, mou.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
}
