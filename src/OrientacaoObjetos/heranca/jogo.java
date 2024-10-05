package OrientacaoObjetos.heranca;

public class jogo {
	public static void main(String[] args) {
		
		Jogador J1 = new Jogador();
		J1.x = 10;
		J1.y = 10;
		
		J1.andar(Direcao.NORTE);
		J1.andar(Direcao.LESTE);
		J1.andar(Direcao.NORTE);
		J1.andar(Direcao.LESTE);
		
		System.out.println("y = " + J1.y + " x = " + J1.x);
	}
}