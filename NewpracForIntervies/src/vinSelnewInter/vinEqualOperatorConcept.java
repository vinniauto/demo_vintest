package vinSelnewInter;

public class vinEqualOperatorConcept {
	public static void main(String[] args){
		//Base obj = new Derived();
		//obj.fun();
		//String[] S1 =new String ["Hello world"];
		String s1=new String ("Hello world");
		String s2=new String ("Hello world");
		String s3="Hello world";   //String s3 , s4 i have introduced to prove that SCP and heap area concept by Smartprogramming deepak classes)
		String s4 ="Hello world";
		//String s5="Hello world";
		/*if (s1==s2){
			System.out.println("both strings are referencng same object");
		}
		else {
			System.out.println("both referencing different different  object when == operator is used");
		}*/
		if (s3==s4){
			System.out.println("both strings are referencng same object");
		}
		else {
			System.out.println("s1, s3both referencing different different  object when == operator is used");
		}
		
		if (s1.equals(s2)){
			System.out.println("both strings are referencng same object");
		}
		else {
			System.out.println("both referencing different  object");
			
		
		}
	}

}
