package OrientacaoObjetosDesafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compras: compras) {
			total += compras.obterValorTotal();
		}
		
		return total;
	}
}