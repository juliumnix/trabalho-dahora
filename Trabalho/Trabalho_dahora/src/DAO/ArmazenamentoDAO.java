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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, capacidade, velocidade, tipoString) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, arm.getMarca());
            stmt.setString(2, arm.getModelo());
            stmt.setFloat(3, arm.getValor());
            stmt.setString(4, arm.getDescricao());
            stmt.setString(5, arm.getCategoria());
            stmt.setString(6, arm.getImagem());
            stmt.setInt(7, arm.getCapacidade());
            stmt.setFloat(8, arm.getVelocidade());
            stmt.setString(9, arm.getTipo());
         

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
    public static List<Armazenamento> getTodosArmazenamentos(){
        List<Armazenamento> armazenamentos = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Armazenamento'";
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
                float velocidade = resultado.getFloat("velocidade");
                String tipo = resultado.getString("tipoString");
                
                Armazenamento armazenamento = new Armazenamento (modelo, valor, descricao, marca, categoria, imagem, capacidade, velocidade, tipo);
                armazenamentos.add(armazenamento);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return armazenamentos;
    }
    
}
