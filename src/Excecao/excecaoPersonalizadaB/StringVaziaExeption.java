package Excecao.excecaoPersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaExeption extends Exception{
	
	private String nomeAtributo;
	
	public StringVaziaExeption(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}	
	
	public String getMessage() {
		return String.format("O atributo '%s' esta vazio", nomeAtributo);
	}
}