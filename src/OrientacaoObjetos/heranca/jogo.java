package OrientacaoObjetos.heranca;

public class jogo {
	public static void main(String[] args) {
		
		Jogador J1 = new Jogador();
		J1.x = 10;
		J1.y = 10;
		
		Heroi J2 = new Heroi();
		J2.x = 10;
		J2.y = 11;
		
		System.out.println(J1.vida);
		System.out.println(J2.vida);
		
		J1.atacar(J2);
		
		System.out.println(J1.vida);
		System.out.println(J2.vida);
		
		J2.atacar(J1);
		
		System.out.println(J1.vida);
		System.out.println(J2.vida);
	}
}