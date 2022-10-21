package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> resultSet = new LinkedHashSet();
		
		for(int i : data)  // i = 4
		{
			if (resultSet.contains(i)){
				System.out.println(i);
			}
			resultSet.add(i); // [4 3 6 8 29 1 2 7]
		}
          
	}

}
