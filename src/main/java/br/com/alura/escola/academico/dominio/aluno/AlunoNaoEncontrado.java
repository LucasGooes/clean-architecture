package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.domain.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno n�o encontrado com CPF: "+cpf.getNumero());
	}

}
