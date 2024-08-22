package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 767;
		int id = 56789;
		long pontosAcumulados = 2154637241L; //para definir o long tem q ter a letra l no fim
		
		//tipos numericos com ponto
		float salario = 11445.44F; //para definir o float tem q ter a letra f no fim
		double vendasAcumuladas = 2991797103.01;
		
		///tipo booleano
		boolean estaDeFerias = false; //true
				
		//tipo caractere
		char status = 'A'; //ativo
	
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por viagens
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha " + salario);
		System.out.println("ferias? " + estaDeFerias);
		
		System.out.println("status: " + status);
	}
}
