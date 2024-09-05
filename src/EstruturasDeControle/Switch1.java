package EstruturasDeControle;

public class Switch1 {

	public static void main(String[] args) {
		String faixa = "roxa";
		switch (faixa.toLowerCase()){
		case "preta":
			System.out.println("sabe tudo");
		case "marron":
			System.out.println("sabe tudo -1");
		case "roxa":
			System.out.println("sabe tudo -2");
		case "verde":
			System.out.println("sabe tudo -3");
		case "vermelha":
			System.out.println("sabe tudo -4");
		case "amarela":
			System.out.println("sabe tudo -5");
		}
	}

}
