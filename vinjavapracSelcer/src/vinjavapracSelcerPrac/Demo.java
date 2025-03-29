package vinjavapracSelcerPrac;

class Employee{
	void display(char C){
		System.out.println("Employee name starts with: "+C+",");
		System.out.println("His experience is 11 years.");
	}
}
class Main extends Employee{
	void display(char C){
		super.display(C);
		System.out.println("Another Employee name also starts with: "+C+",");
		new Employee().display('D');
		display(7);
	}
	String display(int C){
		System.out.println("His experience is: "+C+"years.");
		return "Bye";
	}
}
public class Demo {
	public static void main(String a[]) {
		Employee emp=new Main();
		emp.display('S');
	}

}
