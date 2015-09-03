package br.aeso.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class ConexaoBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.2.3/juliana", "root", "root");
			String sql = "select * from cliente";
			java.sql.Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			while(resultSet.next()){
				System.out.println(resultSet.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

}
