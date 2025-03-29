package com.selenium.test1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VinCollectionpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al = new ArrayList<String> ();
		List <Integer> al1 = new ArrayList<Integer> ();
		
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(8);
		al1.add(9);
		
		al.add("vinesh");
		al.add("Dinesh");
		al.add("Mukesh");
		
		Iterator<Integer> ite = al1.iterator();
		while(ite.hasNext()){
			System.out.println("this is the value for "+ite.next());
		}
			
		Iterator<String> ite1 = al.iterator();
		while(ite1.hasNext()){
			System.out.println("this is the value for String "+ite1.next());
		}
		
	}

}
