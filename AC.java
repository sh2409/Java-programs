final class B
{
	int a=10;	
}
class  AC extends B
{
	AC()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		new AC();
	}
}