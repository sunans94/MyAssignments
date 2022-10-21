package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> resultSet = new TreeSet();
		
		for(int i: data){
			resultSet.add(i);
		}
		List<Integer> resultList = new ArrayList<Integer>(resultSet);
		
		int length = resultList.size();
		System.out.println(resultList.get(length-2));
	}
}
