package br.com.impacta.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class Editora implements Crud{
	private long ideditora;
	private String nome_editora;

	public long getIdeditora() {
		return ideditora;
	}

	public void setIdeditora(long ideditora) {
		this.ideditora = ideditora;
	}

	public String getNome_editora() {
		return nome_editora;
	}

	public void setNome_editora(String nome_editora) {
		this.nome_editora = nome_editora;
	}

	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadById() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setData(Map<String, String> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setData(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	
}
