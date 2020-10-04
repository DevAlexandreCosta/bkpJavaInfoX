package br.com.infox.dal;



import java.sql.*;

public class ModuloConexao {

    // criando metodo responsavel por estabelecer a conexao com banco ;
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver que eu importei para a blibioteca
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informaçoes referentes ao banco 
     String url = "jdbc:mysql://localhost:3306/dbinfox?useSSL=false";
       
        String user = "root";
        String password = "1234567";
        //Estabelecendo a conexao com o banco de dados ;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
           // a linha abaixo serve de apoio para esclarecer o erro  
           // System.out.println(e);
            return null;
        }

    }

}
