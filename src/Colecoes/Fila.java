package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("ana"); //retorna erro caso haja
		fila.offer("bia"); //se tiver erro retorna falso
		fila.add("calor");
		fila.offer("daniel");
		fila.add("rafaela");
		fila.offer("gui");

		System.out.println(fila.peek());//se tiver vazia retorna null
		System.out.println(fila.element());//retorna erro se vazia
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
