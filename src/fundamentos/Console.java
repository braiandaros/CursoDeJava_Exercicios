package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("bom");
		System.out.print("dia!\n");
		
		System.out.println("bom");
		System.out.println("dia!");
		
		System.out.printf("megasena: %s %s %s %s %s %s \n" ,1,2,3,4,5,6);
		System.out.printf("salario: %.1f \n" , 12312.23324);
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("seu nome é %s %s e tem %s anos \n" , nome, sobrenome, idade);
		
		entrada.close();
	}
}
