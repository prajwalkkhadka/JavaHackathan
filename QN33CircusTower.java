package java_hackathan;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class QN33CircusTower {

	 static class Person implements Comparable<Person> {
		
		int height;
		int weight;
		
		public Person(int height, int weight) {
			this.height = height;
			this.weight = weight;
		}
			@Override
			public int compareTo(Person other) {
				if(this.height == other.height) {
					return Integer.compare(this.weight, other.weight);
				}else { 
					return Integer.compare (this.height, other.height);
				}
			}
			@Override
			
			public String toString() {
				return"("+height+ "," +weight +")";
			}
	 }
			public static int LongestTower(List<Person> people) {
				if(people == null || people.isEmpty()) return 0;
				Collections.sort(people);
				
				int[] dp = new int[people.size()];
				int maxLen = 0;
				for (int i = 0; i<people.size(); i++) {
					dp[i] = 1; 
				
				for (int j = 0; j < i; j++) {
					if(people.get(i).weight > people.get(j).weight) {
						dp[i] = Math.max(dp[i], dp[j] + 1);
					}
				}
				
			
				maxLen = Math.max(maxLen, dp[i]);
			}
			
			return maxLen;
			
			}
    		public static void main (String[] args) {
    			List<Person> people = new ArrayList<>();
    			people.add(new Person(65, 100));
    			people.add(new Person(70, 150));
    			people.add(new Person(56, 90));
    			people.add(new Person(75, 190));
    			people.add(new Person(60, 95));
    			people.add(new Person(68, 110));
    			
    			int maxLength = LongestTower(people);
    			System.out.println("Length of the longest tower:" + maxLength);
    			for (Person person : people) {
    				System.out.println(person);
    			}
    			    		}
}