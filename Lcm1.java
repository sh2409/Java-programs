import java.util.*;
class Lcm1
{
	public static void main(String args[]){
	int n1,n2,lcm,gcd=1;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	for(int i=1;i<=n1&&i<=n2;i++)
	{
		if(n1%i==0&&n2%i==0)
		{
			gcd=i;
		}
	}
	lcm=(n1*n2)/gcd;
	System.out.println(lcm);
}
}