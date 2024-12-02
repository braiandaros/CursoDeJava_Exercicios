package getAndSet;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("joao", 10);
		System.out.println(p1.getIdade());
		
		p1.setIdade(30);
		
		System.out.println(p1.getIdade());
		
		System.out.println(p1.toString());
		}
}
