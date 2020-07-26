import java.util.*;
class Rev
{
	public static void main(String args[])
	{
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Rev no is:"+sum);
	}
}