package br.com.impacta.teste;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.impacta.model.Editora;

public class Testes {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Editora Editora = new Editora();
		
		//Editora.setNome_editora("TEste");
		
		Editora.setIdeditora(7);
		
		Editora.delete();

		ResultSet rs = br.com.impacta.model.Editora.getList();
		
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}

	}
}
