package EstruturasDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		for(boolean i = true; i;) {
			System.out.println(valor);
			for(boolean x = true; x;) {
				valor = "##";
				System.out.println(valor);
				for(boolean y = true; y;) {
					valor = "###";
					System.out.println(valor);
					for(boolean z = true; z;) {
						valor = "####";
						System.out.println(valor);
						z = false;
					}
				y = false;
				}
			x = false;
			}
		i = false;
		}
	}
}
