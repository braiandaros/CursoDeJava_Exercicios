package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produtos> imprimir = p -> System.out.println(p.nome);
		
		Produtos p1 = new Produtos("Caneta",12.34, 0.09);
		imprimir.accept(p1);
		
		Produtos p2 = new Produtos("Notebook",2987.99, 0.25);
		Produtos p3 = new Produtos("Caderno",19.90, 0.03);
		Produtos p4 = new Produtos("Borracha",7.80, 0.18);
		Produtos p5 = new Produtos("Lapis",4.39, 0.19);
		
		List<Produtos> produtosL = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtosL.forEach(imprimir);	
		produtosL.forEach(p -> System.out.println(p.preco));
		produtosL.forEach(System.out::println);
	}
}