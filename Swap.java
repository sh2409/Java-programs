import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no:");
		a=sc.nextInt();
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("No.s after swapping:"+a+" "+b);
	}
}