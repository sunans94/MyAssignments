package week3.day2;

import java.util.Arrays;

public class SortingUsingCollection {
	

	public static void main(String[] args){
		String[] str = new String[] {"HCL", "Wipro", "Aspire systems","CTS"	};
	    int arrLength = str.length;
	    Arrays.sort(str);
	    
	    for(int i= arrLength-1; i>=0; i--)
	    {
	    	System.out.println(str[i]);
	    }
	}
}
