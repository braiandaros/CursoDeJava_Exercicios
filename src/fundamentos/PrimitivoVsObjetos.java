package fundamentos;

public class PrimitivoVsObjetos {
	public static void main(String[] args) {
		String s = "texto";
		s.toUpperCase();
		
		//wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
