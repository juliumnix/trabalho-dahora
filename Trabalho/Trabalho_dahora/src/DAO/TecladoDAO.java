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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juliu
 */
public class TecladoDAO {
    public static void salvarArmazenamento(Teclado tec){
//        CreateTableDAO.creatingTable();
         String sql = "INSERT INTO produtos (marca, modelo, valor, descricao, categoria, imagem, tipoString, numerico, semFio, bluetooth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, tec.getMarca());
            stmt.setString(2, tec.getModelo());
            stmt.setFloat(3, tec.getValor());
            stmt.setString(4, tec.getDescricao());
            stmt.setString(5, tec.getCategoria());
            stmt.setString(6, tec.getImagem());
            stmt.setString(7, tec.getTipo());
            stmt.setBoolean(8, tec.getNumerico());
            stmt.setBoolean(9, tec.getSemFio());
            stmt.setBoolean(10, tec.getBluetooth());
        

            stmt.execute();
            System.out.println("criou bixo");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
    } 
    
    public static List<Teclado> getTodosTeclados(){
        List<Teclado> teclados = new ArrayList<>();
        Connection connection = Conexao.getConexao();
        String sql = "SELECT * FROM produtos WHERE categoria = 'Teclado'";
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
                String tipo = resultado.getString("tipoString");
                boolean numerico = resultado.getBoolean("numerico");
                boolean semFio = resultado.getBoolean("semFio");
                boolean bluetooth = resultado.getBoolean("bluetooth");
                
                
                Teclado teclado = new Teclado (modelo, valor, descricao, marca, categoria, imagem, bluetooth, numerico, tipo, semFio);
                teclados.add(teclado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } 
        return teclados;
    }

    
}
