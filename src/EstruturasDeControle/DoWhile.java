package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.print("quantas vezes quer repetir? ");
		Scanner entrada = new Scanner(System.in);
		int c = entrada.nextInt();
		int x = 1;
		
		do {
			System.out.printf("Ola esta é a " + x + " frase \n");
			x++;
		}
		while(x <= c);
		entrada.close();
	}
}
