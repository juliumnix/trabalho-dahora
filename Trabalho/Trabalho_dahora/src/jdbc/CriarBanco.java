package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarBanco {
    
    public static void main(String[] args) throws SQLException {
        final String stringDeConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "1234";
       
       Connection conexao = DriverManager.
               getConnection(stringDeConexao, usuario, senha);
        
        System.out.println("Conexão efetuada com sucesso");
       
       conexao.close();
    }
}
