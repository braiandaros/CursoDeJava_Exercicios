package Classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		DesafioData d1 = new DesafioData();
		d1.dia = 26;
		d1.mes = 01;
		d1.ano = 2005;
		
		DesafioData d2 = new DesafioData(20, 10, 2075);
		
		DesafioData d3 = new DesafioData();

		//System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
		//System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
		//System.out.println(d3.dia + "/" + d3.mes + "/" + d3.ano);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());

	}
}
