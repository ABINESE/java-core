package com.learning.core.day5;

import java.util.TreeSet;

public class D05P08 {
	public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        
        
        persons.add(new Person(1, "Alice", 23, 3000.0));
        persons.add(new Person(2, "Bob", 26, 4000.0));
        persons.add(new Person(3, "Charlie", 22, 3500.0));
        persons.add(new Person(4, "Daisy", 28, 4500.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));
        
        for(Person p: persons)
        {
        	System.out.println(p.getName().toUpperCase());
        }
      
        
    }
}
