package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<>();
		//SortedSet<String> lista = new TreeSet<>();
		lista.add("batata");
		lista.add("banana");
		lista.add("uva");
		lista.add("maca");
		
		for(String candidatos: lista) {
			System.out.println(candidatos);
		}
	}}
