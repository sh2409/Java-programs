import java.util.*;
class Strong
{
	public static void main(String args[])
	{
		int n,num,fact,i,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			fact=1;
			i=1;
			r=n%10;
			while(i<=r)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			n=n/10;
		} 
		if(sum==num)
		{
			System.out.println("Strong no");
		}	
		else
		{
			System.out.println("Not Strong no");
		}
	}
}