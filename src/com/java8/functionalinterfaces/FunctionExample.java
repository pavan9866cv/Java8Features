package com.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// Lambda Expressions
		Function<String, String> applyFunctionOperations = (name) -> {
			return name.toUpperCase();
		};
		System.out.println(applyFunctionOperations.apply("pavanChenna"));
		System.out.println("----------------------");

		Function<String, Person> applyPersonName = (personName) -> {
			Person person = new Person(personName, 25);
			return person;
		};
		System.out.println(applyPersonName.apply("PavanSai").toString());
		System.out.println("----------------------");

		// Anonymous class

		Function<Integer, Person> applyPersonAge = new Function<>() {

			@Override
			public Person apply(Integer age) {
				Person personDetails = new Person("Sai Dharan", age);
				return personDetails;
			}

		};
		System.out.println(applyPersonAge.apply(20).toString());
		System.out.println("----------------------");
	}

}
