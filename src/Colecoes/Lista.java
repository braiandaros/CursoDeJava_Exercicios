package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario U1 = new Usuario("Ana");
		lista.add(U1);
		lista.add(new Usuario("godofredo"));
		lista.add(new Usuario("borges"));
		lista.add(new Usuario("jacinto"));
		lista.add(new Usuario("fernando"));
		
		
		System.out.println(lista.get(3));
		
		for(Usuario u: lista) {
			//System.out.println(u);
			System.out.println(u.nome);
		}
		
		lista.remove(1);
		lista.remove(new Usuario("jacinto"));
		
		for(Usuario u: lista) {
			//System.out.println(u);
			System.out.println(u.nome);
		}
		
		
	}
}
