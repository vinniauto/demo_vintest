package vinTestngStart;

import org.testng.annotations.Test;

public class TestvinExam2 {
	@Test (priority=2 ,groups={"MyTest"})
	public void test7(){
		System.out.println("required this is test7");
	}
 @Test (priority=4)
	public void test8(){
		System.out.println("this is test8");
	 }
 @Test (priority=1,groups={"MyTest"})
	public void test9(){
		System.out.println("required this is test9");
	}
 @Test (priority=3)
	public void test10(){
		System.out.println("this is test10");
	}
}
