package Package;

public class student // this is the call 
{
	
	int age; // this is the variable
	int roll_no;
	
	public void singh() // this is the method 
	{
		
		System.out.println("Welcome all");
		
	}
	public void sandhu() {
		System.out.println("Automation is easy");
	}
	
       public static void main(String[] args) // this is the main method
       {
    	   System.out.println("Assignment1");
    	   student test13 = new student(); // Created object test13 
    	   
    	   test13.singh(); // calling singh method by using object
    	   test13.sandhu();
    	   
    	   System.out.println("Student age");
    	   test13.age=24;
    	   System.out.println(test13.age);// printing variable 
    	   System.out.println("Student Roll Number");
    	   test13.roll_no=908104168;    	   
    	   System.out.println(test13.roll_no);   	   
	
}
}
