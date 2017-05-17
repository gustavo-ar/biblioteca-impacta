package br.com.impacta.model;

import java.util.Calendar;

public class Devolucao {
	private long iddevolucao;
	private long idemprestimo;
	private Calendar data_devolucao;

	public long getIddevolucao() {
		return iddevolucao;
	}

	public void setIddevolucao(long iddevolucao) {
		this.iddevolucao = iddevolucao;
	}

	public long getIdemprestimo() {
		return idemprestimo;
	}

	public void setIdemprestimo(long idemprestimo) {
		this.idemprestimo = idemprestimo;
	}

	public Calendar getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(Calendar data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
}
