package vinjavapracSelcerPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Group{
	
	public static void main(String[] args) {
		String[] customers= new String[]{"John","jacklin","jasmine"};
		List customerList=Arrays.asList(customers);
		
		for(Iterator itr=customerList.iterator();itr.hasNext();){
			System.out.println(itr.hasNext());
		}
				
	}
}
