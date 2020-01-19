package com.rati;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map8Example {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("peter","sam","Gerg","Ryan");
		//names.stream().map(Map8Example::isNotSam).forEach(System.out::println);
		names.stream().filter(Map8Example::isNotSam)
		.map(User::new).forEach(System.out::println);
		
		List<User> list = names.stream().filter(Map8Example::isNotSam)
				.map(User::new).collect(Collectors.toList());
		System.out.println("*****List*******"+list);
		
		//names.stream().mapToInt(User::getAge).sum();
	}
	
	private static boolean isNotSam(String name){
		return !name.equals("sam");
	}
	
	static class User{
		private String name;
		private Integer age = 30;
		User(String name){
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "name: "+name + " 	age : "+ age ;
		}
	}
}
