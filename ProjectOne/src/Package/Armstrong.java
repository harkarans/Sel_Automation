package Package;

public class Armstrong 
{
  public static void main(String[] args)  
  {
	  int a=153;
	  int b=a;
	  int sum=0;
	  while(a>0)
	  {
		  int c=a%10;
		  sum=sum+c*c*c*c*c;
		  a=a/10;
	  }
	  if(b==sum)
	  {
		  System.out.println(b + "is armstrong number");
	  }
	  else
	  {
		System.out.println(b + "is not armstrong number");  
	  }
  }
}
