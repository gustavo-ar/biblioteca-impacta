package br.com.impacta.model;

import java.util.ArrayList;

public class Assunto {
	private int idassunto;
	private ArrayList<Obra> obras = new ArrayList<>();
	private String nome_assunto;

	public void addObra(Obra obra) {
		this.obras.add(obra);
	}

	public ArrayList<Obra> getObras() {
		return this.obras;
	}

	public int getIdassunto() {
		return idassunto;
	}

	public void setIdassunto(int idassunto) {
		this.idassunto = idassunto;
	}

	public String getNome_assunto() {
		return nome_assunto;
	}

	public void setNome_assunto(String nome_assunto) {
		this.nome_assunto = nome_assunto;
	}
}
