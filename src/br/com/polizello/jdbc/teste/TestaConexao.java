package br.com.polizello.jdbc.teste;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.polizello.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		//Abrindo a conexão AutoCloseable
		try (Connection conn = new ConnectionFactory().getConnection()){
			System.out.println("Conexão aberta!");
			
			//Criando um preparedStatement
			String sql = " INSERT INTO Contatos " +
					" (nome, email, endereco, dataNascimento) " +
					" values (?, ?, ? ,?)";
			
			PreparedStatement stm = conn.prepareStatement(sql);
			
			//Preenchendo os campos
			stm.setString(1, "Caelum");
			stm.setString(2, "contato@caelum.com.br");
			stm.setString(3, "R. Vergueiro 2185 cj57");
			Date date = new Date(Calendar.getInstance().getTimeInMillis());
			stm.setDate(4, date);
			
			//Executando o statement
			stm.execute();
			stm.close();

			System.out.println("Gravado!");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
