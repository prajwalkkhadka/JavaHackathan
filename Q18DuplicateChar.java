package java_hackathan;

import java.util.*;

public class Q18DuplicateChar {

	public static void main(String[] args) {
		// Q18. WJP to display duplicate character in string
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = scan.nextLine();
		int count;
		
		char str[]= str1.toCharArray();
		System.out.println("Duplicate characters in the given string: ");
		for(int i=0; i<str.length; i++)
		{
			count = 1;
			for(int j = i+1; j<str.length; j++)
			{
				if(str[i] == str[j] && str[i] !=' ')
				{
					count++;
					str[j]='0';
				}
			}
			if(count > 1 && str[i] !='0')
			//if(count> 1);
				System.out.println(str[i]);
			
			scan.close();
		
	}
	}
}
