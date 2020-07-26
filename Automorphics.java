import java.util.*;
class Automorphics
{
	public static void main(String args[])
	{
		int n,sq,t,r,equal=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		num=n;
		sq=n*n;
		t=10;
		while(n>0)
		{
			r=sq%t;
			if(num==r)
			{
				equal=1;
				break;
			}
			n=n/10;
			t=t*10;
		}
		if(equal==1)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automorphic no");
		}
	}
}
