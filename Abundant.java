import java.util.*;
class Abundant
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{	
				sum=sum+i;
			}	
		}
		if(sum>n)
		{
			System.out.println("Abundant no");
		}
		else
		{
			System.out.println("Not Abundant no");
		}
	}
}