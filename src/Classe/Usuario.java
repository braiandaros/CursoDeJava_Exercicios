package Classe;

public class Usuario {
	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {
		
		
		
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeI = outro.nome.equals(this.nome);
			boolean emailI = outro.email.equals(this.email);
			
			return nomeI && emailI;
		}
		else {
			return false;
		}
		
	}
	//hashcode ainda sera abordado mais tarde
		public int hashCode(){
			return 0;
		}
}
