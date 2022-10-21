package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("France");
		names.add("elango");
		names.add("Chand");
		names.add("bala");
		names.add("Arun");
		names.add("Deepa");
		System.out.println(names);
        for (String eachName : names){
        	System.out.println(eachName);
        }
        //convert set -> list
        //List<String> list = new ArrayList<String>(names);
        List<String> list = new ArrayList<String>(names);
        list.addAll(names);
	}

}
