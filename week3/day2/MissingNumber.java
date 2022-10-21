package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,5,6,8,10};
		Set<Integer> resultSet = new LinkedHashSet();
		
		for(int i: arr)
		{
			resultSet.add(i);
		}
		
		Iterator<Integer> it = resultSet.iterator();
		int prevVal = 0 ;
		while(it.hasNext()){
			int currVal = it.next();   // currVal = 8 ; prevVal = 6
			if(prevVal + 1 != currVal){     // 6 + 1 != 8
				System.out.println(prevVal+1);   // 6 + 1
			}
			prevVal = currVal;     // prevVal = 2
		}
	}

}
