class prime
{
	public static void main(String[] args)
	{
		int n=42,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=1;
			}
		}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	}
}