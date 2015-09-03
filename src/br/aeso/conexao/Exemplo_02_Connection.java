package br.aeso.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Exemplo_02_Connection {
	
	public static void main(String []agrs) throws SQLException{
		Connection conn = null;
		
			conn = DriverManager.getConnection("jdbc:mysql://192.168.2.3/juliana", "root", "root");
			
			String sql = "insert into cliente (nome, cpf, banco) values (?, ?, ?)";
			
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, "Mauricio_Manoel");
			preStatement.setString(2, "12345678910");
			preStatement.setString(3, "Santander");
			preStatement.execute();	
		
	}
}


