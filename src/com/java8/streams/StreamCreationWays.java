package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationWays {

	public static void main(String... args) {
		// Streams can be created in three ways
		// 1. From Collection

		List<Integer> listOfIntegers = Arrays.asList(12, 23, 10, 2, 67);
		Stream<Integer> streamFromCollection = listOfIntegers.stream();
		System.out.println("No of elements from list is: " + streamFromCollection.count());

		// 2. From Array
		Integer[] arrOfIntegers = { 10, 11, 32, 17 };
		Stream<Integer> streamOfArrays = Stream.of(arrOfIntegers);
		System.out.println("No of elements from integer stream: " + streamOfArrays.count());

		// 3. from static method

		Stream<Integer> streamFromStaticMethod = Stream.of(10, 23, 21, 34, 54);
		System.out.println("No of elements from static Stream: " + streamFromStaticMethod.count());
		
		// 4. Stream builder
		
		Stream.Builder<Integer> streamBuilder= Stream.builder();
		streamBuilder.add(10).add(30).add(4);
		
		Stream<Integer> stremFromStreamBuilder= streamBuilder.build();
		System.out.println("No of elements from stream builder: "+stremFromStreamBuilder.count());
		
		// 5. Stream Iterator
		
		Stream<Integer> streamIterator= Stream.iterate(100, (n)->n+100).limit(5);
		System.out.println("No of elements from Stream iterator: "+streamIterator.count());
		
		// IntStream
		
		int[] primitiveInt= {10,2,12,34};
		
		IntStream intStream= Arrays.stream(primitiveInt);
		System.out.println("No of elements from intStream: "+intStream.count());

	}

}
