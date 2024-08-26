package EstruturasDeControle;

import java.util.Scanner;

public class IfElseif {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite uma nota: ");
		double nota = entrada.nextDouble();
		if(nota > 10) {
			System.out.println("Nota invalida");
		}
		else if(nota >= 8.1) {
			System.out.println("Conceito A");
		}
		else if(nota >= 6.1) {
			System.out.println("Conceito B");
		}
		
		entrada.close();
	}
}
