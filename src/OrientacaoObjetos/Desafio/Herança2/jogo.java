package OrientacaoObjetos.Desafio.Herança2;

import OrientacaoObjetos.heranca.Direcao;
import OrientacaoObjetos.heranca.Heroi;
import OrientacaoObjetos.heranca.Jogador;
import OrientacaoObjetos.heranca.Monstro;

public class jogo {
	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("monstro tem " + monstro.vida);
		System.out.println("heroi tem " +heroi.vida);
		
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		
		heroi.atacar(monstro);
		
		System.out.println("monstro tem " + monstro.vida);
		System.out.println("heroi tem " +heroi.vida);
	}
}