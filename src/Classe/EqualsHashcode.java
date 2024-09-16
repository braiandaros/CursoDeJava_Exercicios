package Classe;

import java.util.Date;

public class EqualsHashcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "pedro";
		u1.email = "pedro123@gmail.com";
				
		Usuario u2 = new Usuario();
		u2.nome = "pedro";
		u2.email = "pedro123@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		System.out.println(u1.equals(new Date()));
	}
}
//hashcode ainda sera abordado mais tarde