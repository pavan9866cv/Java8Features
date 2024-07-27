package com.java8.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// using Lambda Expressions
		Supplier<String> getSupplierResult = () -> "Supplying name of author is Venkata Pavan";
		System.out.println(getSupplierResult.get());

		System.out.println("----------------------");
		Supplier<String> getPersonDetails = () -> {

			Person personDetails = new Person("Pavan Sai teja", 25);
			return personDetails.toString();
		};
		System.out.println(getPersonDetails.get());

		System.out.println("----------------------");

		// using anonymous class

		Supplier<String> getSupplierName = new Supplier<>() {

			@Override
			public String get() {
				return "The Supplier name is Venkata Pavan Sai";
			}

		};
		System.out.println(getSupplierName.get());
		System.out.println("----------------------");

		Supplier<Person> getSupplierPersonInfo = new Supplier<>() {

			@Override
			public Person get() {
				Person setPersonInfo = new Person("Chenna venkata pavan", 25);
				return setPersonInfo;
			}

		};
		System.out.println(getSupplierPersonInfo.get());
	}

}
