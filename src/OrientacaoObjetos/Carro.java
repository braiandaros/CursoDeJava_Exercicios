package OrientacaoObjetos;

public class Carro {

	Motor motor;
		
	Carro(){
		this.motor = new Motor(this);
	}
	void acelerar() {
		if(motor.giros() < 12000) {
			motor.fatorInjecao += 0.4;
		}
		if(motor.giros() >= 12000) {
			System.out.println("Limite do carro");
			motor.fatorInjecao -= 0.4;
		}
		
	}
	void frear() {
		if(motor.fatorInjecao > 0.4) {
			motor.fatorInjecao -= 0.4;
		}
	}
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean estaligado() {
		return motor.ligado;
	}
}