package vinTestngStart;
/*class Base{
public void fun(){
	System.out.println("base fun");
                 }
          }
class Derived extends Base{

public void fun(){
	System.out.println("Derived fun");              
}
}*/
public class viNtestNeworg {
	public static void main(String[] args){
		//Base obj = new Derived();
		//obj.fun();
		//String[] S1 =new String ["Hello world"];
		String s1=new String ("Hello world");
		String s2=new String ("Hello world");
		
		if (s1==s2){
			System.out.println("both strings are referencng same object");
		}
		else {
			System.out.println("both referencing different different  object when == operator is used");
		}
		
		if (s1.equals(s2)){
			System.out.println("both strings are referencng same object");
		}
		else {
			System.out.println("both referencing different  object");
		}
		}
}