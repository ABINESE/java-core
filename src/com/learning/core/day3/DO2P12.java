package com.learning.core.day3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DO2P12 {
	 public static void main(String[] args) {
	        List<String> inputStrings = Arrays.asList("abb", "abc", "xyz", "xyy", "foo");
	        List<String> matchingStrings = new ArrayList<>();

	       
	        String patternString = "(.)\\1";
	        Pattern pattern = Pattern.compile(patternString);

	        for (String s : inputStrings) {
	            Matcher matcher = pattern.matcher(s);
	            if (matcher.find()) {
	                matchingStrings.add(s);
	            }
	        }

	       
	        System.out.println(matchingStrings);
	    }
}
