package br.com.impacta.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Obra {
	private long idobra;
	private long ideditora;
	private String titulo;
	private Calendar ano_publicacao;
	private String tipo_obra;
	private ArrayList<Exemplar> exemplares = new ArrayList<>();

	public void addObra(Exemplar exemplar) {
		this.exemplares.add(exemplar);
	}

	public ArrayList<Exemplar> getObras() {
		return this.exemplares;
	}

	public long getIdobra() {
		return idobra;
	}

	public void setIdobra(long idobra) {
		this.idobra = idobra;
	}

	public long getIdeditora() {
		return ideditora;
	}

	public void setIdeditora(long ideditora) {
		this.ideditora = ideditora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Calendar getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Calendar ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}

	public String getTipo_obra() {
		return tipo_obra;
	}

	public void setTipo_obra(String tipo_obra) {
		this.tipo_obra = tipo_obra;
	}
}
