package EstruturasDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota do aluno: ");
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}
		
		entrada.close();
	}
}
