class For1
{
	public static void main(String args[])
	{
		a1:																								
		for(int i=1;i<=3;i++)
		{
			a2:
			for(int j=1;j<=3;j++)
			{
				if(i==2 && j==2)
				{
					break a2;
				}
				System.out.println(i+" "+j);
			}			
		}		
	}
}