package com.learning.core.Day6;

import java.util.Map;
import java.util.TreeMap;

public class D06P06 {
	public static void main(String[] args)
	{
	TreeMap<Car, Double> tm=new TreeMap<>();
	tm.put(new Car("Swift", 305000.0), 305000.0);
    tm.put(new Car("Audi", 600100.0), 600100.0);
    tm.put(new Car("Benz", 900000.0), 900000.0);
    tm.put(new Car("Bugatti", 80050.0), 80050.0);

    
    for(Map.Entry<Car, Double> e:tm.descendingMap().entrySet())
    {
    	System.out.println(e.getKey().toString());
    }
	}

}
