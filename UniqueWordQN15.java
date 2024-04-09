package java_hackathan;

import java.util.*;

public class UniqueWordQN15 {

	public static void main(String[] args) {
		// Q15. Given a string print the unique words of the string.
			
			Scanner input = new Scanner(System.in);
					System.out.println("Please Type Here");
					String sam = input.nextLine();
					input.close();
					
					
			         Set <String> uniqueWords = new HashSet<>();
			         String[] words = sam.split("\\s+");
			         
			         for(String word : words) {
			        	 uniqueWords.add(word);
			        	 
			         }
			         
			        System.out.println("Unique words: ");
			         for(String uniqueWord : uniqueWords) {
			        	 
			        	 System.out.println(uniqueWord);
			  
		
					}


	}


}