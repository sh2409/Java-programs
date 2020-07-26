import java.util.*;
class Lcm
{
	public static void main(String args[])
	{
		int n1,n2,lcm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2)
		{
			lcm=n1;
		}
		else
		{
			lcm=n2;
		}
		while(true)
		{
			if(lcm%n1==0&&lcm%n2==0)
			{
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}
}