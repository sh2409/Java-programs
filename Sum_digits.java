import java.util.*;
class Sum_digits
{
	public static void main(String args[])
	{
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits of a no is:"+sum);
	}
}