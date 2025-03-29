package com.selenium.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class VinIteratorArrayListex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		//ArrayList<String> al2=new ArrayList<String>();
		/*al2.add("espn");
		al2.add("sony");
		al2.add("cricinfo");*/
		
		al.add("abc");
		al.add("xyz");
		al.add("bcd");
		al.add("pqr"); //duplicate
		//al.add("bbb");
		//al.add("1234");
		for (String r:al)
		{
			if (r.startsWith("p"))
				System.out.println(r);
		}
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("printing"+al);
		while (itr.hasNext()){
			if(itr.next().equals("abc"));
			itr.remove();
		/*ListIterator<String> itr=al.listIterator();
		System.out.println("Forward Direction");
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}*/
		
					}
	}
	}



