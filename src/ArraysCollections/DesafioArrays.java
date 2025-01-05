package ArraysCollections;

import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("quantas notas quer digitar: ");
		
		int quantidade = entrada.nextInt();
		
		double notas[] = new double [quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite uma nota: ");
			float notaest = entrada.nextFloat();
			notas[i] = notaest;
		}
		
		double total = 0;
		for(double nota: notas) {
			 total += nota;
		}
		
		float media = (float) (total / quantidade);
		System.out.println(media);
		entrada.close();
		

	}
}