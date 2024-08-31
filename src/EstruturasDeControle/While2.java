package EstruturasDeControle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		String t = "";
		Scanner entrada = new Scanner(System.in);
		
		while (!t.equalsIgnoreCase("sair")) {
			System.out.print("continuar ou nao? ");
			t = entrada.nextLine();
			
		}
		entrada.close();
	}
}
