package Classe;

public class ValorXReferencia {
	public static void main(String[] args) {
		double a = 1;
		double b = 1;
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		DesafioData d1 = new DesafioData(1, 6, 2022);
		DesafioData d2 = d1;
		
		d1.dia= 31;
		d1.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	
	static void voltarDataParaValorPadrao(DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
