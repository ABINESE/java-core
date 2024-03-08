package com.learning.core.day4;

public class WestCity {
	   String playerName;
	     float critic1;
	     float critic2;
	     float critic3;
	    static float avgRating;
	     String coins;

	    
	    public  WestCity(String playerName, float critic1, float critic2, float critic3) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        this.critic3 = critic3;
	        this.avgRating = 0.0f; 
	        this.coins = ""; 
	    }

	    
	   

	    public void calculateAverageRating(float critic1, float critic2, float critic3) {
	        this.avgRating = (critic1 + critic2 + critic3) / 3;
	    }

	    
	    public String calculateCoins() throws NotEligibleException {
	        if (avgRating >= 7) {
	            return "Gold Coin";
	        } else if (avgRating >= 5 && avgRating < 7) {
	            return "Silver Coin";
	        } else if (avgRating >= 2 && avgRating < 5) {
	            return "Copper Coin";
	        } else {
	            throw new NotEligibleException("Player is not eligible for any coins.");
	        }
	    }
	    

	   
	    
}

