package Classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		DesafioData d1 = new DesafioData();
		d1.dia = 26;
		d1.mes = 01;
		d1.ano = 2005;
		
		DesafioData d2 = new DesafioData();
		d2.dia = 20;
		d2.mes = 10;
		d2.ano = 2075;
		
		System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}
}
