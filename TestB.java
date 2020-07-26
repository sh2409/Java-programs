//parameterized in default
class B
{
	B()
	{
		this(5);
		System.out.println("Hii");
	}
	B(int x)
	{
		System.out.println(x);
	}
}
class TestB
{
	public static void main(String args[])
	{
		B b=new B();
		
	}
} 