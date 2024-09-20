package OrientacaoObjetos;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("batatinha");
		Aluno aluno2 = new Aluno("joao");
		Aluno aluno3 = new Aluno("critovom");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("web 2023");
		Curso curso3 = new Curso("react native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso de " + curso1.nome + " e meu nome é " + aluno.nome);
		}
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso de " + curso2.nome + " e meu nome é " + aluno.nome);
		}
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso de " + curso3.nome + " e meu nome é " + aluno.nome);
		}
		
		Curso cursoencontrado = aluno1.obterCursoProcurado("java Completo");
		if (cursoencontrado != null) {
			System.out.println(cursoencontrado.nome);
			System.out.println(cursoencontrado.alunos);
		}
	}
}
