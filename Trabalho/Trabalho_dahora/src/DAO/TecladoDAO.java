/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Computador;
import Codigo.Teclado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juliu
 */
public class TecladoDAO {
    public static void salvarArmazenamento(Teclado tec){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, tipoString, numerico, semFio, bluetooth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, tec.getModelo());
            stmt.setFloat(2, tec.getValor());
            stmt.setString(3, tec.getDescricao());
            stmt.setString(4, tec.getCategoria());
            stmt.setString(5, tec.getImagem());
            stmt.setString(6, tec.getTipo());
            stmt.setBoolean(7, tec.getNumerico());
            stmt.setBoolean(8, tec.getSemFio());
            stmt.setBoolean(9, tec.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
}
