package Polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);
		Comida ingrediente3 = new Arroz(0.3);
		//Comida ingrediente3 = new Comida(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.Comer(ingrediente1);
		convidado.Comer(ingrediente2);
		convidado.Comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa1 = new Sorvete(0.4);
		
		convidado.Comer(sobremesa1);
		System.out.println(convidado.getPeso());
	}
}
