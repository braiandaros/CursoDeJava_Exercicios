package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("ola pessoal".charAt(2));
		String s = "boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		
		var nome = "braian";
		var sobrenome = "daros";
		var idade = 19;
		var salario = 12345.6789;
		
		System.out.printf("nome %s %s tem %s anos e ganha %.2f.", nome, sobrenome, idade, salario);
	}
}