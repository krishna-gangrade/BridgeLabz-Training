package com.constructors.level1;

public class Person {
	
	 // Attributes
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display method
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Krishna", 22);
        Person p2 = new Person(p1);   // cloning p1

        p1.display();
        p2.display();

	}

}
