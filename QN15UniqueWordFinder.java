package java_hackathan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class QN15UniqueWordFinder {

	public static void main(String[] args) {
		// Q15. Given a string print the unique words of the string.

			Scanner scanner = new Scanner(System.in);
			System.out.println("Type here");
			String str = scanner.nextLine();
			
			String[] words = str.split("\\W");
			List<String> a1 = new ArrayList<>(Arrays.asList(words));
			
			for(String x : a1) {
				if(Collections.frequency(a1,  x) == 1) {
					System.out.println(x);
				}
			}
			
				scanner.close();
	}

}
