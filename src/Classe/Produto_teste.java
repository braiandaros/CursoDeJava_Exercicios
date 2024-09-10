package Classe;

public class Produto_teste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "notbook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		double precofinal = p1.preco *(1 - p1.desconto);
		System.out.println(precofinal);
	}
}
