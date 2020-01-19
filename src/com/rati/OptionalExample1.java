package com.rati;

import java.util.Optional;

public class OptionalExample1 {

	public static void main(String[] args) {
		String str[] = new String[8];
		str[4] = "JAVA OPTIONAL CLASS EXAMPLE";
		Optional<String> empty = Optional.empty();  
		System.out.println(empty);
		Optional<String> value = Optional.of(str[4]);
//		System.out.println(value);
		System.out.println(value.filter(s->s.equals("Java")));
		System.out.println(value.filter(s->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		System.out.println(value.get());
		System.out.println(value.hashCode());
		System.out.println(value.isPresent());
		 System.out.println("orElse: "+value.orElse("Value is not present"));  
		 System.out.println("orElse: "+empty.orElse("Value is not present"));  
	}
}
