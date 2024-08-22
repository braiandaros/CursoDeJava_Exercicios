package fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {
		int denA = 3 * 2;
		int denB = 2;
		
		int numA = (int) Math.pow(6 * ( 3 + 2), 2);
		int numB = (int) Math.pow((1 - 5) * (2 - 7), 2);
		
		int superiorA = numA/denA;
		
		int superiorB = (int) Math.pow(numB/denB, 2);
		
		int superior = (int) Math.pow(superiorA - superiorB, 3);
		
		int inferior = (int) Math.pow(10, 3);
		
		int resultado = superior / inferior;
		
		System.out.println(resultado);
	}
}
