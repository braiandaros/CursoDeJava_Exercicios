package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add(1);
		conjunto.add("teste");
		conjunto.add('x');
		
		System.out.println("tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		//System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
	}
}
