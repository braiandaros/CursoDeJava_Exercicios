package Lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		Double teste = (double) entrada.nextDouble();
		
		Function<Double, String> parImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> resultado = valor -> "O resultado e " + valor;
		
		String resultadoFinal = parImpar.andThen(resultado).apply(teste);
		
		System.out.println(parImpar.apply(teste));
		
		System.out.println(resultadoFinal);
	}
}