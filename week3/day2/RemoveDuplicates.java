package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = new String("Paypal India");
		char[] charArray = str.toCharArray();
		Set<Character> charSet = new HashSet();
		Set<Character> dupCharSet = new HashSet();
		
		for(char c :charArray){
			if(charSet.contains(c)){
				dupCharSet.add(c);
			}
			
			charSet.add(c);
			
			
			
		}
		dupCharSet.removeAll(charSet);
		
		for(char c : charSet){
			if(c != ' '){  
				System.out.println(c);
			}
		}
	}
	
	   

}
