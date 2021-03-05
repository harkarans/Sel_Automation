package Package;

import java.util.Scanner;

public class ScannerClass {
	int x1,x2,x3,x4,x5,x6;
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("The sum result is " +c);
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("The sub result is "+c);
		return c;		
	}
	public int multiply(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("The multiplication result is "+c);
		return c;
	}
	public float divide(int a,int b)
	{
		float c=a/b;
		System.out.println("The final result is "+c);
		return c;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the value for x1 ");
		Scanner s= new Scanner(System.in); // Has a Relationship 
		int x1 = s.nextInt();
		System.out.println("Enter the value for x2 ");
		int x2=s.nextInt();
		System.out.println("Enter the value for x3");
		int x3=s.nextInt();
		System.out.println("Enter the value for x4 ");
		int x4=s.nextInt();
		System.out.println("Enter the value for x5");
		int x5=s.nextInt();
		System.out.println("Enter the value for x6");
		int x6=s.nextInt();
		
		ScannerClass result = new ScannerClass();
		int sum= result.sum(x1,x2);
		int subt= result.sub(sum,x3);
		int sum2=result.sum(subt,x4);
		int mult=result.multiply(sum2, x5);
		float div=result.divide(mult, x6);
		System.out.println("The result of ((((x1+x2)-x3)+x4)*x5)/x6) is " + div);
		
		int multi= result.multiply(x1,x2);
		int sum3=result.sum(multi, x3);
		int sum4=result.sum(sum3, x4);
		int sub=result.sub(sum4,x5);
		float div2=result.divide(sub, x6);
		System.out.println("The result of ((((x1*x2)+x3)+x4)-x5)/x6) is " + div2);
			
	}

}
