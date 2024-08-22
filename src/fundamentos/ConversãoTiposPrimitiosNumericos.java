package fundamentos;

public class ConversãoTiposPrimitiosNumericos {
	public static void main(String[] args) {
		double a =1; //comversao implicita
		System.out.println(a);
		
		float b = (float) 1.0; //comversao explicita (cast)
		System.out.println(b);
		
		int c = 300;
		byte d = (byte)c; //comversao explicita (cast)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //comversao explicita (cast)
		System.out.println(f);
		
		
	}
}
