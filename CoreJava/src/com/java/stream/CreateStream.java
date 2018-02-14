package com.java.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {

		List<String> words= Arrays.asList("dsfd","fddsfds","dfdsfds","dfsfsds");
		Map<String, String> map= new HashMap<>();
		map.put("fsdf","dfsdfds");
		map.put("dfdsf","dfdsfds");
		map.put("dsffsd","ddfds");
		
		//Obtain stream from list:
		System.out.println(words.stream().filter(s-> s.isEmpty()).count());
		//Obtain stream from map:
		map.entrySet().stream().forEach(System.out::println);
		map.keySet().stream().forEach(System.out::println);
		map.values().stream().forEach(System.out::println);
		
		//Obtain stream from a string
		String str="xdfs dfhsdgf djkfhdskjfh dskjfhdsjhfsd";
		str.chars().forEach(System.out::println);
		//stream from array:
		Stream.of(str.split(" ")).forEach(System.out::println);
		
		//using generator:
		// 20 random numbers generated in a stream
		Stream.generate(Math::random).limit(20).forEach(System.out::println);
		
		//using Iterator. 125 is the initial value and f(val) .. f(f(val).. series is created
		Stream.iterate(125.0, Math::sqrt).limit(4).forEach(System.out::println);
		
		//using Builder
		Stream.builder().add("sdss").add("asdsad").add("sdsd").build().forEach(System.out::println);
		
		//from another stream
		words.stream().distinct().sorted().forEach(System.out::println);
	}

}
