package Package;

public class Constructor {
	
	public Constructor()
	{		
		System.out.println("This is default Constructor");
	}
	public Constructor(int a)
	{
		this ();
		System.out.println("This is one parameterize constructor");
	}
	public Constructor(int a,int b)
	{
		this (13,24,18);
		System.out.println("This is two parameterize constructor");		
	}
	public Constructor(int a,int b, int c) 
	{
		this (24);
		System.out.println("This is three parameterize constructor");
	}

	public static void main(String[] args) {
		Constructor s = new Constructor(1,2);
	}
}
