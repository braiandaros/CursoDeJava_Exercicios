package Excecao.excecaoPersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExeption extends RuntimeException{
	
	private String nomeAtributo;
	
	public StringVaziaExeption(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}	
	
	public String getMessage() {
		return String.format("O atributo '%s' esta vazio", nomeAtributo);
	}
}