package Polimorfismo;

public class Pessoa {
	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	public void Comer(Comida comida) {
		this.peso += comida.getPeso();
	}
}