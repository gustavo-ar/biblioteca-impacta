package br.com.impacta.teste;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.impacta.model.Autor;

public class Testes {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		ResultSet rs = Autor.getList();
		
		while(rs.next()){
			System.out.println(rs.getString(2));
		}

	}
}
