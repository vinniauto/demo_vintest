package vinTestngStart;
//yturS
import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestvinExam1 {
	@Test
	public void test1(){
		System.out.println("this is test1");
	}
 @Test (groups={"MyTest"})
	public void test2(){
	int  x=4;
	 if(x>3)
	 {
		 System.out.println("required this is test2 passed"); 
	 }
	 else{
		 System.out.println("this is failed case.");
	 }
		//int i=1/0;
	 }
 @Test (groups={"MyTest"})
	public void test3(){
		System.out.println("this is test3");
		Assert.assertTrue(0>1);
	}
 @Test
	public void test4(){
		System.out.println("this is test4");
	}
 @Test
	public void test5(){
		System.out.println("this is test5");
		
	}
 @Test (groups={"MyTest"})
	public void test6(){
		System.out.println("required this is test6");
	}
}
