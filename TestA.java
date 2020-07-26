//Default in parameterized
class A
{
	A()
	{
		System.out.println("Hello");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
}
class TestA
{
	public static void main(String args[])
	{
		A a=new A(10);

	}
}