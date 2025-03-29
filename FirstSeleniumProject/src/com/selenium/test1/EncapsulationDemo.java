package com.selenium.test1;

 class Student{
		private int rollno;
		private String Name;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
	
	
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollno(28068510);
		System.out.println(s1.getRollno());
			s1.setName("vinesh");
		System.out.println(s1.getName());

		
	}

}
