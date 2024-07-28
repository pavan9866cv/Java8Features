package com.java8.functionalinterfaces;

public class Demo1 {
	public static void main(String ...args)
	{
		Human human= ()->"Human can walk";
		System.out.println(human.canWalk());
	}
}
@FunctionalInterface
interface Human{
	
	String canWalk();
}