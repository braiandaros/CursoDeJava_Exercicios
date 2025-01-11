package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produtos p = new Produtos("Ipad", 3235.89, 0.13);
		
		Function<Produtos, Double> precoFinal = precoD -> precoD.preco * (1 - precoD.desconto);
		
		UnaryOperator<Double> impostoM = precoD -> precoD >= 2500? precoD * 1.085 : precoD;
		
		UnaryOperator<Double> frete = precoF -> precoF >= 3000? precoF + 100: precoF + 50;
		
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = format -> ("R$" + format).replace(".", ",") ;
		
		String preco = precoFinal
				.andThen(impostoM)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar).apply(p);
		
		System.out.println("O preco final é " + preco);
	}
}