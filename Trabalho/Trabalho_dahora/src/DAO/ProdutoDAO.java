/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Codigo.Produto;
import Excecoes.DeleteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliu
 */
public class ProdutoDAO {
    
     public static void excluirProduto(Produto prod) throws DeleteException {
        
            Connection conexao;
         try {
            conexao = Conexao.getConexao();
            String sql = "DELETE FROM produtos WHERE categoria = ? AND modelo = ?";
            PreparedStatement pstmt;

            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, prod.getCategoria());
            pstmt.setString(2, prod.getModelo());
            pstmt.execute();
            System.out.println("Produto apagado com sucesso!");
           
        
         } catch (SQLException ex) {
            throw new DeleteException(prod);
         }
        
    }
    
}
