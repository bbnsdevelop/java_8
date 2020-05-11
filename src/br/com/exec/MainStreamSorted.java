package br.com.exec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.model.User;

public class MainStreamSorted {

	static List<User> users = Arrays.asList(new User("C", 30), new User("D", 25), new User("A", 10), new User("B", 20),
			new User("E", 50));

	public static void main(String[] args) {

		/*
		 * List<User> sortedList = users.stream() .sorted((o1, o2) -> o1.getAge() -
		 * o2.getAge()) .collect(Collectors.toList());
		 */

		List<User> sortedList = users.stream().sorted(Comparator.comparingInt(User::getAge))
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		List<User> sortedListName = users.stream().sorted(Comparator.comparing(User::getName))
				.collect(Collectors.toList());
		sortedListName.forEach(System.out::println);
	}
}
