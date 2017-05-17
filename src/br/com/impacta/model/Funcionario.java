package br.com.impacta.model;

public class Funcionario extends Pessoa{
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
	
}
