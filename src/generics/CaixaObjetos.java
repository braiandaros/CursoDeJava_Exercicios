package generics;

public class CaixaObjetos {
		
	private Object coisa;
	
	public void aguardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
