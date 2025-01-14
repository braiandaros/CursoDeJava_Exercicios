package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis", 1.99, 0.12 ,30);
		Produto p2 = new Produto("Caneta", 2.50, 1.0 ,0);
		Produto p3 = new Produto("Caderno", 15.00, 0 ,30);
		Produto p4 = new Produto("Mochila", 250.00, 10.00 ,0);
		Produto p5 = new Produto("Bolsinha", 45.00, 2.00 ,30);
		Produto p6 = new Produto("Borraca", 2.00, 0 ,30);
		Produto p7 = new Produto("cola", 9.99, 10.00 ,0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> GDesconto = p -> p.desconto >= 5;
		Predicate<Produto> FGratis = p -> p.frete == 0;
		Function<Produto, String> chamada = p -> "Aproveite a promocao de " + p.nome;
		
		produtos.stream().filter(GDesconto).filter(FGratis).map(chamada).forEach(System.out::println);;
	}
}