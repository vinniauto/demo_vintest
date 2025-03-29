package vinjuyi;

import java.util.Scanner;

public class Vinarraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a [] =new int [3];
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your elements :");
		//int n = s.nextInt();
		for ( i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		
		int flag=0;
	 System.out.println("enter the number:");
		int k=s.nextInt();
		System.out.println("element I have assigned"+k);
		
		for (i=0;i<=3;i++){
			if(k==a[i])
			{
				flag=1;
				break;
			}
			}
			if (flag==1)
			{
				System.out.println(("element is present at index position of array="+i));
			}
			else
			{
				System.out.println("not present");
			}
			s.close();

		
	}

}
