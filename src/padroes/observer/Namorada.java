package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservado{

	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados.");
		System.out.println("Apagar as luzes.");
		System.out.println("Esperar um pouco.");
		System.out.println("em " + evento.getMomento());
		System.out.println("Surpresa!!!");
	}
	
}