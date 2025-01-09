package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produtos> isCaro = prod -> prod.preco >= 750;
		
		Produtos produto = new Produtos("notbook", 3893.89, 0.15);
		
		System.out.println(isCaro.test(produto));
	}
}
