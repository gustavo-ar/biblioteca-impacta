package br.com.impacta.teste;

import java.sql.SQLException;

import br.com.impacta.model.Funcionario;
import br.com.impacta.model.Pessoa;

public class Testes {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Pessoa leo = new Funcionario();
		
		leo.setIdpessoa(1600559);
		
		leo.loadById();
		
		System.out.println(leo.getNome());

	}
}
