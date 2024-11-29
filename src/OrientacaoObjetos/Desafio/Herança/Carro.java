package OrientacaoObjetos.Desafio.Herança;

public class Carro {
	int velocidadeAtual;
	final int VELOCIDADEMAXIMA;
	int delta = 5;
	
	Carro(int velocidademaxima){
		VELOCIDADEMAXIMA = velocidademaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		}else{
			velocidadeAtual += delta;
		}
		
	};
	
	void frear() {
		if (velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		}
		else {
			velocidadeAtual = 0;
		}
		
	}
	public String toString() {
		return "velocidade atual é " + velocidadeAtual;
	}
}
