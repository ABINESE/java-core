package com.learning.core.Day6;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeMap;
public class D06P09 {
	public static void main(String[] args) {
        TreeMap<Car, String> cars = new TreeMap<>();
        
        // Add predefined cars to the TreeMap
        cars.put(new Car("Bugatti", 80050.0), "Bugatti Details");
        cars.put(new Car("Swift", 305000.0), "Swift Details");
        cars.put(new Car("Audi", 600100.0), "Audi Details");
        cars.put(new Car("Benz", 900000.0), "Benz Details");
        
        // Replacing the value associated with a specific key (in this case, based on price)
        Double priceToUpdate = 80050.0;
        Car carToUpdate = cars.keySet().stream().filter(car -> car.getPrice().equals(priceToUpdate)).findFirst().orElse(null);
        
        if (carToUpdate != null) {
            cars.put(new Car("Reva", priceToUpdate), cars.remove(carToUpdate)); // Replace with new name
        }

        // Printing updated TreeMap
        for (Car car : cars.keySet()) {
            System.out.println(car + " " + cars.get(car));
        }
    }
}
