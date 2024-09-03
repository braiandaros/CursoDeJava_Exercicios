package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota, total = 0;
		int cont = 0;
		do {
			System.out.print("Digite a nota: ");
			
			nota = entrada.nextFloat();
			
			
			if(nota <= 10 && nota >= 0) {
				total = total + nota;
				cont++;
			}
			else if(nota == -1) {
				System.out.println("Codigo encerrado.");
			}
			else {
				System.out.println("Digite uma nota valida.");
			}	
		}while(nota != -1);
		entrada.close();
		System.out.println("O total das notas foram de " + total + " e o numero de notas validas digitadas foram de " + cont);
	}
	
}
