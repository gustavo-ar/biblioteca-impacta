package br.com.impacta.teste;

import br.com.impacta.model.Aluno;
import br.com.impacta.model.Pessoa;
import br.com.impacta.model.Professor;

public class Testes {

	public static void main(String[] args) {
		Pessoa aluno = new Aluno();
		
		Pessoa professor = new Professor();
		
		System.out.println(professor+"\n"+aluno);
		
		aluno.setCpf("30");
		System.out.println(aluno.getCpf());
	}

}
