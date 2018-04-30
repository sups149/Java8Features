package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import test.models.Person;

public class FilteringPredicateTest {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Sana", 2));
		persons.add(new Person("Bhai", 29));
		persons.add(new Person("Sups", 27));
		
		Predicate<Person> personPred = per -> per.getAge() < 20;
		
		/*for(Person person : persons) {
			if(personPred.test(person)) {
				System.out.println(person);
			}
		}*/
		
		persons.stream()
		.filter(personPred)
		.forEach(person -> {
			System.out.println(person);
		});
		
		
	}
	
	
}
