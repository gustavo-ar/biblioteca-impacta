package br.com.impacta.model;

import java.util.Calendar;

public class Exemplar {
	private long num_exemplar;
	private long idobra;
	private boolean emprestado;
	private Calendar data_aquisicao;

	public long getNum_exemplar() {
		return num_exemplar;
	}

	public void setNum_exemplar(long num_exemplar) {
		this.num_exemplar = num_exemplar;
	}

	public long getIdobra() {
		return idobra;
	}

	public void setIdobra(long idobra) {
		this.idobra = idobra;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Calendar getData_aquisicao() {
		return data_aquisicao;
	}

	public void setData_aquisicao(Calendar data_aquisicao) {
		this.data_aquisicao = data_aquisicao;
	}
}
