package Lambdas;

@FunctionalInterface  //so aceita um metodo em cada interface
public interface Calculo {
	double executar(double a, double b);

	default String teste() {
		return "ola";
	}
	
	static String teste2() {
		return "ola2";
	}
}
