package Lambdas;


public class Produtos {

		final String nome;
		final double preco;
		final double desconto;
		
		public Produtos(String nome, double preco, double desconto) {
			this.nome = nome;
			this.preco = preco;
			this.desconto = desconto;
		}
		
		public String toString() {
			double precoFinal = preco * (1- desconto);
			precoFinal = Math.round(precoFinal * 100.0) / 100.0;
			return nome + " tem o valor de R$" + precoFinal;
		}
	}