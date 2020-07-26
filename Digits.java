import java.util.*;
class Digits
{
	public static void main(String args[])
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("No of digits in a number is:"+count);
	}
}