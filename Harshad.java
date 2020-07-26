import java.util.*;
class Harshad
{
	public static void main(String args[])
	{
		int n,num,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(num%sum==0)
		{
			System.out.println("Harshad no");
		}
		else
		{
			System.out.println("Not Harshad no");
		}
	}
}