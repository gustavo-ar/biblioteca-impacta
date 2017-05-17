package br.com.impacta.teste;

import java.sql.Connection;

import br.com.impacta.jdbc.ConnectionFactory;

public class Testes {

	public static void main(String[] args) {
		Connection con = new ConnectionFactory().getConnection();
		
		System.out.println("ok");

	}

}
