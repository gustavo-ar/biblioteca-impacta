package br.com.impacta.model;

import java.util.ArrayList;

public class Autor {
	private long idautor;
	private String nome_autor;
	private ArrayList<Obra> obras = new ArrayList<>();
	
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
}
