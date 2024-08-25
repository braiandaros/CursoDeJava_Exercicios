package fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {
		
		double numA = (int) Math.pow(6 * ( 3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;

		double superiorA = numA/denA;
		double superiorB = (int) Math.pow(numB/denB, 2);
		
		double superior = (int) Math.pow(superiorA - superiorB, 3);
		double inferior = (int) Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
	}
}
