package EstruturasDeControle;

import javax.swing.JOptionPane;

public class If_Else {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o numero:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Esse numeor é par");
		}
		else{
			System.out.println("Este numero é impar");
		}
	}
}
