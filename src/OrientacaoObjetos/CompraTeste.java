package OrientacaoObjetos;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "braian";
		c1.adicionarItem(new Item("caneta", 20, 7.45));
		c1.adicionarItem(new Item("borracha", 12, 3.89));
		c1.adicionarItem(new Item("caderno", 2, 18.79));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
		}
}
