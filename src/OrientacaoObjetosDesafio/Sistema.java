package OrientacaoObjetosDesafio;

public class Sistema {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 9.67, 100);
		compra1.adicionarItem("Nootbook", 1987.88, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 10, 10);
		compra2.adicionarItem("empressora", 998.90, 1);
		
		Cliente cliente1= new Cliente("Braian");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}
}