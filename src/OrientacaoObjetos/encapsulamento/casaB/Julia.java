package OrientacaoObjetos.encapsulamento.casaB;

import OrientacaoObjetos.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {
		/*segredo
		facodentrodecasa
		formadefalar
		todosabem*/
		
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.facodentrodecasa);
		//System.out.println(sogra.formadefalar);
		System.out.println(sogra.todosabem);
	}
}