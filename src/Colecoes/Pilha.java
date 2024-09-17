package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("o pequeno principe");
		livros.push("Don quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.size());
	}
}
