package Excecao;

public class Causa {
	//Uma excecao pode causar outra
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getCause().getMessage());
		}
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno esta nulo");
		}
	
		System.out.println(aluno.nome);
	}
}
