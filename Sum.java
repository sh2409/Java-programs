import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;

		}
		System.out.println(sum);
	}
}