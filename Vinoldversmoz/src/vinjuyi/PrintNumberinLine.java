package vinjuyi;

import java.util.Scanner;

public class PrintNumberinLine {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         int i ,j ,k;
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for ( i = 1,j=1; i <= rows; j++) 
	        {
	            for ( k =0 ; k<j; k++)
	            {
	                System.out.print(i++ +" ");
	            }
	            
	       /* for ( i = 1; i <= rows; i++) 
	        {
	            for (j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }*/
	             
	            System.out.println();
	        }
	         
	        //Close the resources
	         
	        sc.close();
}
	}

