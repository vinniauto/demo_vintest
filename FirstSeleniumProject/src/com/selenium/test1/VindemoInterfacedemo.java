package com.selenium.test1;

public class VindemoInterfacedemo implements Iskotestkarna {

 public static void main (String[] args)
			{
			System.out.println(System.getProperty("java.runtime.version"));
			//Iskotestkarna obj= new Iskotestkarna(); (object for interface and abstract class can not be instantiated.)
			/*VindemoInterfacedemo obj1= new VindemoInterfacedemo();
			obj1.show();
			obj1.bet();
			obj1.net();
			obj1.pet();*/
			
			}

@Override
public void show() {
	
	System.out.println("this one is also working fine");
		
}

@Override
public void bet() {
	// TODO Auto-generated method stub
	System.out.println("this is bet test");
	
}

@Override
public void net() {
	// TODO Auto-generated method stub
	System.out.println("this is Net test");
	
}

public void pet(){
	System.out.println("this is Pet test");
}
}