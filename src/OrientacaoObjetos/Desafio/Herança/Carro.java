package OrientacaoObjetos.Desafio.Herança;

public class Carro {
	int velocidadeAtual;
	final int VELOCIDADEMAXIMA;
	private int delta = 5;
	
	protected Carro(int velocidademaxima){
		VELOCIDADEMAXIMA = velocidademaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		}else{
			velocidadeAtual += getDelta();
		}
		
	};
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
		else {
			velocidadeAtual = 0;
		}
		
	}
	public String toString() {
		return "velocidade atual é " + velocidadeAtual;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
