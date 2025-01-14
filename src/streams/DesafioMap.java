package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		Consumer<Object> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> toBinario = Integer::toBinaryString;
		UnaryOperator<String> reverse = n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> tobinario2 = n -> Integer.parseInt(n, 2);
		
		nums.stream().map(toBinario).map(reverse).map(tobinario2).forEach(println);
	}
}
