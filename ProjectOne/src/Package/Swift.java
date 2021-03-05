package Package;

public class Swift extends Maruti // swift is child class
{
	public Swift() 
	{
		super(1,2);
		System.out.println("Default Child Constructor");
	}
	public Swift(int a)
	{
		this(1,2,3);
		System.out.println("One Parameterized Child Constructor");
	}
	public Swift(int a,int b)
	{
		this(1);
		System.out.println("Two Parameterized Child Constructor");
	}
	public Swift(int a,int b,int c)
	{
		this();
		System.out.println("Three Parameterized Child Constructor");
	}
	public static void main(String[] args)
	{
		Swift brand = new Swift(13,24);
				
	}
}
