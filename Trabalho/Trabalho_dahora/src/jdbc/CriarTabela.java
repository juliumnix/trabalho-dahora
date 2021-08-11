/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//    protected String auxiliar;
//    protected String modelo;
//    protected float valor;
//    protected String descricao;
//    protected String marca;
//    protected String categoria;
//    protected String imagem;
/**
 *
  + "valor FLOAT NOT NULL,"
                + "descricao VARCHAR(200) NOT NULL,"
                + "categoria VARCHAR(200) NOT NULL,"
                + "imagem VARCHAR(200) NOT NULL"
 */
public class CriarTabela {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        
        String sql = "CREATE TABLE teste ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "grupo VARCHAR(80) NOT NULL,"
                + "auxiliar VARCHAR(80) NOT NULL,"
                + "valor FLOAT NOT NULL,"
                + "descricao VARCHAR(200) NOT NULL,"
                + "categoria VARCHAR(200) NOT NULL,"
                + "imagem VARCHAR(200) NOT NULL,"
                + "capacidade INT,"
                + "velocidade FLOAT,"
                + "tipoString VARCHAR(80),"
                + "velocidadeVentoinha VARCHAR(80),"
                + "tensao INT,"
                + "certificacao VARCHAR(80),"
                + "tamanhoString VARCHAR(80),"
                + "peso VARCHAR (80),"
                + "semFio BOOLEAN,"
                + "microfone BOOLEAN,"
                + "bluetooth BOOLEAN,"
                + "ddr VARCHAR(80),"
                + "resolucao VARCHAR(80),"
                + "tamanhoFloat FLOAT,"
                + "aspecto VARCHAR(80),"
                + "frameRate INT,"
                + "botoesLaterais BOOLEAN,"
                + "alimentacao BOOLEAN,"
                + "memoria INT,"
                + "wifi BOOLEAN,"
                + "entradasRAM INT,"
                + "entradasUSB INT,"
                + "entradasPCIExpress INT,"
                + "geracao INT,"
                + "nucleos INT,"
                + "velocidadeNucleo FLOAT,"
                + "numerico BOOLEAN"
                + ")";
        
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        
        System.out.println("Tabela criada com sucesso");
        conexao.close();
    }
    
}
