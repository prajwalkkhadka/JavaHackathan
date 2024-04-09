package java_hackathan;

import java.util.HashMap;
import java.util.Scanner;
//import java.util.jar.Attributes.Name;

public class Q19Occurance {

	public static void main(String[] args) {
		// Q19.Using scanner function write java program to display number of occurrence of all character
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String");
			String str = sc.nextLine();
			getcharcount(str);
		}
		
		
	}

	private static void getcharcount(String name) {
		// 
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for(char c:strArray) {
			if(!String.valueOf(c).isBlank())
				if(hs.containsKey(c)) {
					hs.put(c,  hs.get(c) +1);
				}else {
					hs.put(c,  1);
				}}
		
		System.out.println(name+":"+hs);
				}
				
		
		
	

}
