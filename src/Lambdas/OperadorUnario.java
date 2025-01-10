package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = valor -> valor + 2;
		UnaryOperator<Integer> vezesDois = valor -> valor * 2;
		UnaryOperator<Integer> quadrado = valor -> valor * valor;
		
		int resultado1 = maisDois.andThen(vezesDois).andThen(quadrado).apply(0);
		System.out.println(resultado1);
		
		int resultado2 = quadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);
	}
}
