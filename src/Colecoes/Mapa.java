package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "roberto");
		usuarios.put(20,"ricardo");
		usuarios.put(3,"rafaela");
		usuarios.put(4,"rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("rebeca"));
		
		for(int key :usuarios.keySet()) {
			System.out.println(key);
		}
		for(String usuario: usuarios.values()) {
			System.out.println(usuario);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println("|Value = "+registro.getValue() + "|Key = "+ registro.getKey());
		}
		}
}
