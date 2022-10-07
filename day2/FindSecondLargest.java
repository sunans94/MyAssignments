package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args)
	{
		int[] array = new int[]{2,8,9,4,3,6};
		
		Arrays.sort(array);
		System.out.println("elements sorted in ascending");
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		
		}
	}
}

