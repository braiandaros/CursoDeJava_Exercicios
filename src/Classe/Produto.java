package Classe;

public class Produto {
	String nome;
	double preco = 0.25;
	static double desconto;
	
	Produto(){
		
	}
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(String nomeInicial,double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}