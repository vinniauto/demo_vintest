package vinSelnewInter;

public class vInRevWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="My name is vinesh";
		String a[] =str.split(" ");
		
		System.out.println("length of a array is "+a.length);
		/*for (int i=0;i<a.length;i++)
		    {
			System.out.print(a[i]+" ");
		                        }
		System.out.println("hhhhhhhhhhhhhhhhhhhhuuuuuuuuuuuuuuuuuuuu");	*/
		
		for (int i=a.length-1;i>=0; i--){
			System.out.print(a[i]+" ");
		}
	}

}
