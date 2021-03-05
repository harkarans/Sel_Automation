package Package;

public class Maruti //Parent class
{
	public Maruti() 
	{
		this(13,24,3);
		System.out.println("Default Parent Constructor");
	}
	public Maruti(int a)
	{		
		this();
		System.out.println("One Parameterized Parent Constructor");
	}
	public Maruti(int a,int b)
	{
		this(3);
		System.out.println("Two Parameterized Parent Constructor");
	}
	public Maruti(int a,int b,int c)
	{
		
		System.out.println("Three Parameterized Parent Constructor");
	}
	
}
