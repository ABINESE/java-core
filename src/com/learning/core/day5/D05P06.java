package com.learning.core.day5;
import java.util.TreeSet;
class Person implements Comparable<Person>
{
	
	int id;
	String name;
	int age;
	Double Salary;
	public Person(int id, String name, int age, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Salary = salary;
	}
	 public int getAge() {
	        return age;
	    }
	    public int getId()
	    {
	    	return id;
	    }
	    public String getName()
	    {
	    	return name;
	    }
	    public Double getSalary()
	    {
	    	return Salary;
	    }
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int res=name.hashCode();
		return res*31;
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person) obj;
		return  p.id==id && p.age==age && p.Salary==Salary && p.equals(name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id= "+id+",name="+name+",age="+ age+ ",Salary="+Salary;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
	
}
public class D05P06 {
	public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        
        
        persons.add(new Person(1, "Alice", 23, 3000.0));
        persons.add(new Person(2, "Bob", 26, 4000.0));
        persons.add(new Person(3, "Charlie", 22, 3500.0));
        persons.add(new Person(4, "Daisy", 28, 4500.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));
        
       for(Person p:persons)
       {
    	   if(p.getAge()>25)
    		   System.out.println(p);
       }
        
    }
}
