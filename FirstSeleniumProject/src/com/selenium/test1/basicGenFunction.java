package com.selenium.test1;
class A {
	public void show()
	{
		System.out.println("in A");
	}
}

class B extends A{

	public void show()
	{
		System.out.println("in B");
	}
}

class C extends A{

	public void show()
	{
		System.out.println("in C");
	}
}
public class basicGenFunction {

	public static void main(String[] args) 
	{
          A obj0= new A();
            obj0.show();
            
            
          B obj1= new B();
            obj1.show();
            
          C obj2= new C();
            obj2.show();  
            
          A obj3=new B();
          obj3.show();        

          A obj4=new C();
          obj4.show();
          System.out.println("changing object will change calling that is why it is dynamic method dispatch");
          
	}

}
