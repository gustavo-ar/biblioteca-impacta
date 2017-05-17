package br.com.impacta.dao;

import java.sql.Connection;

import br.com.impacta.sql.ConnectionFactory;

public class AssuntoDAO {
	private Connection conn;

	public AssuntoDAO(Connection conn) {
		this.conn = new ConnectionFactory().getConnection();
	}
	
	
	
	
}
