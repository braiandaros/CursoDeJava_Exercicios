package Classe;

public class Produto_teste {
	public static void main(String[] args) {
		Produto p1 = new Produto("nootebok", 4356.89);
		//p1.nome = "notbook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "caneta preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto(0.1);
		
		System.out.println(precofinal1);
		System.out.println(precofinal2);

		double mediacarrinho = ((precofinal1 + precofinal2)/2);
		
		System.out.println(mediacarrinho);
		
	}
}
