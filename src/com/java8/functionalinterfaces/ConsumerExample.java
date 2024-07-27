package com.java8.functionalinterfaces;

import java.util.function.Consumer;

/*
 *  @Author VenkataPavanSaiTeja Chenna
 */

public class ConsumerExample {

	public static void main(String[] args) {

// using Lambda expression
		Consumer<Integer> acceptConsumerUsingLambda1 = (value) -> System.out.println("The given Value is " + value);
		acceptConsumerUsingLambda1.accept(10);

		System.out.println("-------------------");

		Consumer<Integer> acceptConsumerUsingLambda2 = (value) -> {

			if (value > 10) {
				System.out.println("The age is valid with value: " + value);
			} else {
				throw new RuntimeException("Not a valid age to accept");
			}
		};
		acceptConsumerUsingLambda2.accept(11);

		System.out.println("-------------------");

		Person person = new Person("Pavan", 25);

		Consumer<Person> setPersonDetails = (Person personInfo) -> {

			Person person1 = new Person(personInfo.getName(), personInfo.getValue());
			System.out.println("Person details are: " + person1.toString());
		};
		setPersonDetails.accept(person);

// using anonyumous class
		Consumer<Integer> acceptConsumerWithAnonymous1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("The Value from anonymous class is " + t);

			}

		};
		acceptConsumerWithAnonymous1.accept(10);
		System.out.println("-------------------");
		Consumer<String> acceptConsumerWithAnonymous2 = new Consumer<String>() {

			public void accept(String name) {
				System.out.println("The name of Person is: " + name);
			}

		};
		acceptConsumerWithAnonymous2.accept("Venkata Pavan Sai Teja Chenna");
		System.out.println("-------------------");

	}

}

class Person {

	private String name;
	private int value;

	public Person(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", value=" + value + "]";
	}

}
