package assignment_1;

public class assignment {

	int age;
	int roll_no;
	
	
	public void msg() {
		System.out.println("This is eclipse");
	}
	
	public void msg2() {
		System.out.println("Learning automation");
	}
	
	public static void main(String[] args) {
		
		assignment obj= new assignment();
		
		obj.age=25;
		obj.roll_no=745;
		
		obj.msg();
		obj.msg2();
		
		System.out.println("Age of the student is " + obj.age);
		
		System.out.println("Roll no of student is " + obj.roll_no);
		
	}
}
