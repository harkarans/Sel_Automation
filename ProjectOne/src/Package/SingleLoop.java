package Package;

public class SingleLoop
{
	int b = 37;
	int h=0;
	public SingleLoop() 
	{
		for (int i=2;i<=b/2;i++)
		{
			if(b%i==0) 
			{
			System.out.println("No is not prime" + b);
			h=1;
			break;			
			} 			
		}
			
	if (h==0)
	{		
			System.out.println("No is prime" + b);
	}
	}
	public static void main(String[] args)
	{
		SingleLoop s = new SingleLoop();		
		
		
	}

}
