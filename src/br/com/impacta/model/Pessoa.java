package br.com.impacta.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Pessoa implements Crud{
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private boolean inadmin;
	private String cpf;
	private long idpessoa;
	private int idtipo_pessoa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isInadmin() {
		return inadmin;
	}

	public void setInadmin(boolean inadmin) {
		this.inadmin = inadmin;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(long idpessoa) {
		this.idpessoa = idpessoa;
	}

	public int getIdtipo_pessoa() {
		return idtipo_pessoa;
	}

	public void setIdtipo_pessoa(int idtipo_pessoa) {
		this.idtipo_pessoa = idtipo_pessoa;
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
	public void setData(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
