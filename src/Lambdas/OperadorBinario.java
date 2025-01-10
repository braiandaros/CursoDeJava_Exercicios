package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (Double n1,Double n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
//		BiFunction<Double, Double, String> mediaM = (Double n1, Double n2) -> 
//		(n1 + n2) /2 >=7 ?"Aprovado" : "reprovado";
		
		BiFunction<Double, Double, String> mediaM = (Double n1, Double n2) -> {
			double notaFinal = (n1 + n2) /2;
			return notaFinal >=7 ?"Aprovado" : "reprovado";
		};
		
		System.out.println(mediaM.apply(9.7, 4.1));
		
		Function<Double, String> conceito = m -> m >= 7 ? "aprovado" : "reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
	}
}