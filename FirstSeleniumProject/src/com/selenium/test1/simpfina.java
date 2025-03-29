package com.selenium.test1;
import java.util.AbstractCollection;
	
abstract class Shape {
	 abstract void draw();
		
	 void show(){
	 	System.out.println("can also have non abstract methods in abstract class");
	 }	 	
	 }
	 class Circle extends Shape{
	 	void draw(){
	 		System.out.println("circle");
	 	}
	 }
	 class rectangle extends Shape{
	 	void draw(){
	 		System.out.println("rectangle");
	 	} 	
	 } 
public class simpfina{
		 	public static void main(String[] args) {
		 				
		 		Shape s2=new rectangle();
		 		Shape s1= new Circle();
		 		s1.draw();
		 		s2.draw();
		 		s1.show();
		 	}
		 }

