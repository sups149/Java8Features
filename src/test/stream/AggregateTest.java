package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import test.models.Person;

public class AggregateTest {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Sana", 2));
		persons.add(new Person("Bhai", 29));
		persons.add(new Person("Sups", 27));
		
		long sum = persons.stream().mapToInt(p -> p.getAge()).sum();
		OptionalDouble avg = persons.stream().mapToInt(p -> p.getAge()).average();
		
		
		System.out.println("Total age: "+sum);
		if(avg.isPresent()) {
			System.out.println("Average : "+avg.getAsDouble());
		} else {
			System.out.println("Problem");
		}

	}

}
