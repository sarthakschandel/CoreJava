package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		Optional<String> empty = Optional.empty();
		System.out.println("is Present : " + empty.isPresent());// false

		Optional<String> dataOptional = Optional.of("Optional with value, and useful");
		System.out.println("is Present : " + dataOptional.isPresent());// true

		Optional<String> ofNullable = Optional.ofNullable(null);
		System.out.println("is Present : " + ofNullable.isPresent());// false

		System.out.println("Value of :" + dataOptional.get());// Optional with value, and useful

		if (empty.isPresent()) {
			System.out.println("Value of :" + empty.get());// if used without check throws NoSuchElementException
			System.out.println("Value of :" + ofNullable.get());// NoSuchElementException here also
		}

		System.out.println(dataOptional.filter(s -> s.equals("Optional with value, and useful")));
		// returns Optional[Optional with value, and useful]

		System.out.println(dataOptional.filter(s -> s.equals("ptional with value, and useful")));
		// returns Optional.empty

		System.out.println(dataOptional.orElse("Default Value Returned"));// Optional with value, and useful
		System.out.println(empty.orElse("Default Value Returned"));// Default Value Returned
		System.out.println(ofNullable.orElse("Default Value Returned"));// Default Value Returned

		dataOptional.ifPresent(System.out::println);// Optional with value, and useful
		empty.ifPresent(System.out::println);// no output
		ofNullable.ifPresent(System.out::println);// no output

	}

}
