package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
          
		String str = new String("Chennai city is the best best city in the the world");
		
		String[] strArr = str.split(" ");
		
		Set<String> resultSet = new HashSet();
		
		
		for(String s: strArr)
		{
			resultSet.add(s);
			
		}
		System.out.println("The result set is"+ resultSet);

	}

}
