import java.util.*;
class Fib
{
	public static void main(String[] args)
	{
		int n,n1=0,n2=1,n3,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;	
		}
	}
}