package Classe;

public class ValorNulo {
	public static void main(String[] args) {
		String a = "";
		System.out.println(a.concat("!!!!"));
		
		String b = null;
		System.out.println(b.concat("!!!!"));
		
		DesafioData d1 = null;
		d1.mes = 3;
		System.out.println(d1.mes);
	}
}
