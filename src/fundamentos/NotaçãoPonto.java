package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		String s = "batata AAA";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("AAA", "macaco");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		
	}
}
