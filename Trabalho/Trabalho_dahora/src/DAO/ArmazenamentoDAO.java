/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Codigo.Armazenamento;
import DAO.CreateTableDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.FabricaConexao;
/**
 *private int capacidade;
    private float velocidade;
    private String tipo;
 * @author juliu
 */
public class ArmazenamentoDAO {
    
    public static void salvarArmazenamento(Armazenamento arm){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (modelo, valor, descricao, categoria, imagem, capacidade, velocidade, tipoString) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, arm.getModelo());
            stmt.setFloat(2, arm.getValor());
            stmt.setString(3, arm.getDescricao());
            stmt.setString(4, arm.getCategoria());
            stmt.setString(5, arm.getImagem());
            stmt.setInt(6, arm.getCapacidade());
            stmt.setFloat(7, arm.getVelocidade());
            stmt.setString(8, arm.getTipo());
         

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
}
