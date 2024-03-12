package com.learning.core.Day6;
import java.util.TreeMap;

public class D06P07 {
public static void main(String[] args)
{
	TreeMap<Car,Double> tm=new TreeMap<Car,Double>();
	tm.put(new Car("Swift", 305000.0), 305000.0);
    tm.put(new Car("Audi", 600100.0), 600100.0);
    tm.put(new Car("Benz", 900000.0), 900000.0);
    tm.put(new Car("Bugatti", 80050.0), 80050.0);
 Car l=tm.firstKey();
 System.out.println("least is"+l);
 Car g=tm.lastKey();
 System.out.println("greatest is "+g);
 
}

}
