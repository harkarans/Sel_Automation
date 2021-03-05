package Package;

import java.util.Scanner;

public class Palidrome 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
	    int a=obj.nextInt();
	    int b=a;
	    int c=0,d;
	    while(b!=0) 
	    {
	    	d=b%10;// a=121, d=121%10 = 1
	    	c=c*10+d; // c=0*10 = 0 + d
	    	b=b/10; // 12.1
	    }
		if(a==c)
		{
			System.out.println("Its Palidrome");
		}
		else 
		{
			System.out.println("Its not Palidrome");
			
		}
	}

}
