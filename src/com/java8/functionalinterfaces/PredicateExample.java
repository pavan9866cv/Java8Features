package com.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		// Lambda Expressions
		Predicate<String> testName = (name) -> name.equalsIgnoreCase("PavanSai");
		System.out.println("Is Name Matches: " + testName.test("PavanSai"));
		System.out.println("----------------------");

		Predicate<Person> testPersonDetails = (person) -> {

			if (person.getValue() > 18)
				return true;
			return false;
		};

		Person personinfo = new Person("Venkata pavan", 25);
		System.out.println("Is Person eligible to vote: " + testPersonDetails.test(personinfo));
		System.out.println("----------------------");

		// Anonymous class

		Predicate<Person> validatePersonName = new Predicate<>() {

			@Override
			public boolean test(Person person) {

				if (person.getName()!=null && person.getName().contains("Venkata"))
					return true;

				return false;
			}

		};
		System.out.println("Is Person has valid name: " + validatePersonName.test(personinfo));
	}

}
