package Excecao.excecaoPersonalizadaA;

import Excecao.Aluno;

public class Validar {
	private Validar() {

	}
	
	public static void aluno(Aluno aluno) {
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno esta nulo");
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExeption("nome");			
		}
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloExcepition("nota");						
		}
	}
}