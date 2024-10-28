package org.redbus;

import java.util.HashMap;

public class count {
	


	    public static void main(String[] args) {
	        String s1 = "automation";
	        countDuplicateCharacters(s1);
	    }

	    public static void countDuplicateCharacters(String str) {
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Count each character's frequency
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Print characters that appear more than once
	        System.out.println("Duplicate characters:");
	        for (char c : charCountMap.keySet()) {
	            if (charCountMap.get(c) > 1) {
	                System.out.println(c + ": " + charCountMap.get(c));
	            }
	        }
	    }
	}



