package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjetos caixaA = new CaixaObjetos();
		caixaA.aguardar(2.3);
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		
		CaixaObjetos caixaB = new CaixaObjetos();
		caixaB.aguardar("teste");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
