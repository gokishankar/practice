package org.redbus;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;



public class MyClass {
  public static void main(String args[]) {
	  
	String s1="Automation";
	
    countDuplicateCharacters(s1);
    public static void countDuplicateCharacters(String str) {
	Map<Character,Integer> mp=new HashMap<>();
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		
			Integer count=mp.get(c);
			mp.put(c, count+1);
			}
	// Print characters that appear more than once
    System.out.println("Duplicate characters:");
    for (char c : mp.keySet()) {
        if (mp.get(c) > 1) {
            System.out.println(c + ": " + mp.get(c));
		
		}
			
		}
		
		
	
	System.out.println(mp);
	
	
	  }
	  

      }
    
  



