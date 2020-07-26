import java.util.*;
class Friendly
{
	public static void main(String args[])
	{
		int n1,n2,sum1=0,sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s");
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				sum1=sum1+i;
			}
		}
		for(int i=1;i<n2;i++)
		{
			if(n2%i==0)
			{
				sum2=sum2+i;
			}
		}
		if(sum1==n1 && sum2==n2)
		{
			System.out.println("Friendly Pair");
		}
		else
		{
			System.out.println("Not Friendly Pair");
		}
	}
}