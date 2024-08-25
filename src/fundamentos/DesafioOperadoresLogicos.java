package fundamentos;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		if(trabalho1 == true && trabalho2 == true ) {
			System.out.println("tv 50 polegadas");
			System.out.println("sorvete");
		}
		
		if(trabalho1 == true ^ trabalho2 == true) {
			System.out.println("tv 32 polegadas");
			System.out.println("sorvete");
		}
		
		if(trabalho1 == false && trabalho2 == false) {
			System.out.println("sem tv");
			System.out.println("sem sorvete");
		}
	
		
	}
}
