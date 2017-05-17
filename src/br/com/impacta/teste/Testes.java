package br.com.impacta.teste;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.impacta.model.Assunto;

public class Testes {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Assunto Assunto = new Assunto();
		
		//Assunto.setNome_assunto("TEste");
		
		Assunto.setIdassunto(7);
		
		//Assunto.insert();
		
		Assunto.delete();

		ResultSet rs = br.com.impacta.model.Assunto.getList();
		
		while(rs.next()){
			System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
		}

	}
}
