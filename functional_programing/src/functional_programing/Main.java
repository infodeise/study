package functional_programing;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		final List<String> pack = Arrays.asList("alan", "abraham", "brain", "jack", "shot");
//		pack.forEach(name -> System.out.println(name));
		pack.forEach(System.out::println);
		
		//Object :: Method
		pack.stream().map(String::toUpperCase).forEach(System.out::println);

		//Reusing the filtering
		//final Predicate<String> filtering = name->name.startsWith("a");
		
		//using a function to get the parameter
		final List<String> tpack = pack.stream().filter(criteria("a")).collect(Collectors.toList());
		
//		final List<String> tpack = pack.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());
		System.out.println(tpack);
	}

	public static Predicate<String> criteria(final String letter) {
		return name->name.startsWith(letter);
	}
}
