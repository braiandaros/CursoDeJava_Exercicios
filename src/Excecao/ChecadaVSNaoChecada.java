package Excecao;

public class ChecadaVSNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());		
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());		}
		
		System.out.println("Fim");
		
	}
	
	//excecao nao verificada
	static void geraErro1(){
		throw new RuntimeException("Ocorreu um erro bem legal 01");
	}
	
	//excecao verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal 02");
	}
}