package Lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrdicadoComposicao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		Float teste = entrada.nextFloat();
		
		Predicate<Float> isPar = numero1 -> numero1 % 2 == 0;
		Predicate<Float> isTresDigitos = numero2 -> numero2 >= 100 && numero2 <= 999;
		
		System.out.println(isPar.and(isTresDigitos).negate().test(teste));
		System.out.println(isPar.or(isTresDigitos).test(teste));
	}
}