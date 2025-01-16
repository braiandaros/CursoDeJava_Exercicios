package Excecao.excecaoPersonalizadaA;

import Excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno= new Aluno("Ana",7);
			Validar.aluno(aluno);
		} catch (StringVaziaExeption e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloExcepition | IllegalArgumentException e) {
			System.out.println(e.getMessage());		
		}
		
		System.out.println("fim");
	}
}
