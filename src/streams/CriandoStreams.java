package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;	
		
		Stream<String> langs = Stream.of("java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "lisp ", "Perl ", "go\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 0, 1).forEach(print);
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		Stream.generate(() -> "a").forEach(print);
		
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
