package test.models;

public class Person {
	String name;
	int age;
	
	
	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ "("+age+")";
	}
}
