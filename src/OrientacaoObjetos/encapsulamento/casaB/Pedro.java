package OrientacaoObjetos.encapsulamento.casaB;

import OrientacaoObjetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	Ana mae = new Ana();
	
	void testeAcessos() {
		/*segredo
		facodentrodecasa
		formadefalar
		todosabem*/
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.facodentrodecasa);
		System.out.println(formadefalar);
		System.out.println(todosabem);
	}
}
