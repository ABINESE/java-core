package com.learning.core.Day6;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
class Car implements Comparable<Car>
{
	

	String name;
	double price;
	
	
	public Car(String name, double price)
	{
		this.name=name;
		this.price=price;
		
	}
	 public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Double getPrice() {
	        return price;
	    }

	    public void setPrice(Double price) {
	        this.price = price;
	    }


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Car o=(Car) obj;
		return this.name.equals(o.name);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"  "+this.price;
	}
	@Override
	public int compareTo(Car o) {
		
		return Double.compare(this.price, o.price);
	}

}
public class D06P05 {
	public static void main(String[] args)
	{
	TreeMap<Car, Double> tm=new TreeMap<>();
	tm.put(new Car("Swift", 305000.0), 305000.0);
    tm.put(new Car("Audi", 600100.0), 600100.0);
    tm.put(new Car("Benz", 900000.0), 900000.0);
    tm.put(new Car("Bugatti", 80050.0), 80050.0);

    
    for(Map.Entry<Car, Double> e: tm.entrySet())
    {
    	System.out.println(e.getKey().toString());
    }
	}

}
