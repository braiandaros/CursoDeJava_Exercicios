package Polimorfismo;

public class Comida {
	private double peso;

	public Comida(double peso) {
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
}
