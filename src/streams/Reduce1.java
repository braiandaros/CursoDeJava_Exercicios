package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
		
		int total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		int total2 = nums.parallelStream().reduce(0, soma);
		System.out.println(total2);
		
		nums.stream().filter(n -> n >5).reduce(soma).ifPresent(System.out::println);
	}

}
