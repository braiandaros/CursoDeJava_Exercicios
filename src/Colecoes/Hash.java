package Colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("pedro"));
		usuarios.add(new Usuario("ana"));
		usuarios.add(new Usuario("guilherme"));
		
		System.out.println(usuarios.contains(new Usuario("guilherme")));
	}
}
