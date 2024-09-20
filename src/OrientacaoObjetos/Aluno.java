package OrientacaoObjetos;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	public String toStrin() {
		return nome;
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoProcurado(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
}