package Classe;

public class DesafioData {
	int dia;
	int mes;
	int ano;

	DesafioData(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	DesafioData(int dia, int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String obterDataFormatada(){
		final String formato = "%d/%d/%d";
		return String.format(formato , this.dia, mes, ano);
	}
}