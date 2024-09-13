package Classe;

public class DesafioJantar {
	public static void main(String[] args) {
		
		DesafioComida c1 = new DesafioComida("arroz", 0.50);
		DesafioComida c2 = new DesafioComida("feijao", 1.20);
		DesafioComida c3 = new DesafioComida("carne", 4);
		
		DesafioPessoa p1 = new DesafioPessoa("carlos", 70);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c3);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
