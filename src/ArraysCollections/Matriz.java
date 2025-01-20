package ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int Qalunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int Qnotas = entrada.nextInt();
		
		double NotasTurma[][] = new double[Qalunos] [Qnotas];
		double total = 0;	
		for (int i = 0; i < NotasTurma.length; i++) {
			for (int j = 0; j < NotasTurma[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d:" ,i + 1,j + 1);
				NotasTurma[i][j] = entrada.nextDouble();
				total += NotasTurma[i][j];
			}
		}
		
		double media = total / (Qalunos * Qnotas);
		System.out.println("A media é " + media);
		
		for(double [] notasdoaluno: NotasTurma) {
			System.out.println(Arrays.toString(notasdoaluno));
		}
		
		
		entrada.close();
		
	}
}