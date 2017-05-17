package br.com.impacta.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.impacta.sql.Sql;

public class Autor implements Crud {
	private long idautor;
	private String nome_autor;
	private ArrayList<Obra> obras = new ArrayList<>();
	private Map<String, String> params = new HashMap<>();

	public void addObra(Obra obra) {
		this.obras.add(obra);
	}

	public ArrayList<Obra> getObras() {
		return this.obras;
	}

	public long getIdautor() {
		return idautor;
	}

	public void setIdautor(long idautor) {
		this.idautor = idautor;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		params.clear();
		params.put("NOME", this.getNome_autor());
		ResultSet rs = new Sql().select("CALL `sp_autor_insert`( :NOME )", this.params);

		this.setData(rs);
	}

	@Override
	public void delete() throws ClassNotFoundException, SQLException {
		params.clear();
		params.put("ID", Long.toString(this.getIdautor()));
		new Sql().query("DELETE FROM tb_autores where idautor = :ID", params);
		this.setIdautor(0);
		this.setNome_autor(null);
	}

	@Override
	public void loadById() throws ClassNotFoundException, SQLException {
		params.clear();
		params.put("ID", Long.toString(this.getIdautor()));
		ResultSet rs = new Sql().select("SELECT * FROM tb_autores where idautor = :ID", params);

		this.setData(rs);
	}

	@Override
	public void setData(ResultSet rs) throws SQLException {

		while (rs.next()) {
			this.setNome_autor(rs.getString("nome_autor"));
			this.setIdautor(rs.getLong("idautor"));
		}

	}

	public static ResultSet getList() throws ClassNotFoundException, SQLException {
		return new Sql().select("SELECT * FROM tb_autores ORDER BY nome_autor", null);
	}

	
}
