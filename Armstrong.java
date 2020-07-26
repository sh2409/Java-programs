import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		int n,r,sum=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
