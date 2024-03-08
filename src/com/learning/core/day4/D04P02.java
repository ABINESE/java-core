package com.learning.core.day4;
import java.util.Scanner;
public class D04P02  
{
public static void main(String[] args) 
{
	WestCity player=new WestCity("Jhon",9,5,7);
	
        System.out.println("Player Name: " + player.playerName);
        
        player.calculateAverageRating(9, 5, 7);
        System.out.println("Average Rating: " + player.avgRating);
        try {
            System.out.println("Coins: " + player.calculateCoins());
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
        
    
}
}
