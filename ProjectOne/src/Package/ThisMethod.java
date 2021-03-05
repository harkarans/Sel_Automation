package Package;

public class ThisMethod {
	public void method1()
	{
		this.method3();
		this.method4();
		this.method2();
		System.out.println("This is first method");
	}
	public void method2() 
	{
		System.out.println("This is second method");
	}
	public void method3()
	{
		System.out.println("This is third method");
	}
	public void method4() 
	{
		System.out.println("This is fourth method");
	}
	
	public static void main(String[] args) {
		ThisMethod a = new ThisMethod();
		a.method1();
	}
	

}
