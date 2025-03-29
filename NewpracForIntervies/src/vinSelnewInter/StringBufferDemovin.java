package vinSelnewInter;

import org.testng.annotations.Test;

public class StringBufferDemovin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
    	   
    	   StringBuffer sb = new StringBuffer();
           //sb.ensureCapacity(100);
           sb.append("Hello");
           //sb.trimToSize();
           System.out.println(sb.capacity());
           sb.append(" Hi Vinesh How are you");
           System.out.println(sb);      
           System.out.println(sb.capacity());
           StringBuffer sb1 = new StringBuffer("Deepak Java");
           StringBuffer sb2 = new StringBuffer("Deepak Java");
           
           
           if (sb1==sb2){
   			System.out.println("both strings are referencng same object");
   		}
   		else {
   			System.out.println("s1, s3both referencing different different  object when == operator is used");
   		}
             
//System.out.println(sb.equals(sb2));
    	          }
}
	 /* 
       public void credit(){
   		System.out.println("Bank -- Credit");
   	}*/

