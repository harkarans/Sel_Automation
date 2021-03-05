package Package;

public class Assignment2 //((((10+2)+2)-2)*2)/2) and ((((10-2)*2)-2)+2)/2)
{
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
	public void divide(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("The final result is "+c);
	}
	
	public static void main(String[] args)
	{
		Assignment2 resultis = new Assignment2();
		int sum_result=resultis.sum(10, 2);
		int sum_result2=resultis.sum(sum_result,2);
		int sub_result=resultis.sub(sum_result2, 2);
		int multiply_result=resultis.multiply(sub_result, 2);
		resultis.divide(multiply_result, 2);
		
		int sub_resultq2=resultis.sub(10,2);
		int mul_resultq2=resultis.multiply(sub_resultq2, 2);
		int sub_result2q2=resultis.sub(mul_resultq2, 2);
		int sum_resultq2=resultis.sum(sub_result2q2, 2);
		resultis.divide(sum_resultq2, 2);
		
	}

}
