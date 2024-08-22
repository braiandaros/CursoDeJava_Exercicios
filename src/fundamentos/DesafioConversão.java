package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.print("digite o primeiro salaro: ");
		String sa1 = salario.nextLine().replace(",", ".");
		
		System.out.print("digite o segundo salaro: ");
		String sa2 = salario.nextLine().replace(",", ".");
		
		System.out.print("digite o terceiro salaro: ");
		String sa3 = salario.nextLine().replace(",", ".");
		
		salario.close();
		
		double sal1 = Double.parseDouble(sa1);
		double sal2 = Double.parseDouble(sa2);
		double sal3 = Double.parseDouble(sa3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println(media);
	}
}