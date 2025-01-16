package Excecao.excecaoPersonalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExcepition extends RuntimeException {
	
	private String nomeAtributo;
	
	public NumeroForaIntervaloExcepition(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}	
	
	public String getMessage() {
		return String.format("O atributo %s esta fora do intervalo", nomeAtributo);
	}
}