package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
		//a.PI = 3.1415;
		//AreaCirc.PI = 3.1415;
		System.out.println(a.area());
		System.out.println(AreaCirc.area(10));
	}
}
