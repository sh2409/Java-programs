class A
{
	int A1()
	{
		return 1;
	}
}
class B extends A
{
	int A1()
	{
		return 4;
	}
	int B1()
	{
		return 2;
	}
}
class C extends B
{
	int B1()
	{
		return 3;
	}
		
}
class D
{
	public static void main(String args[])
	{
		C c=new C();
		System.out.println(c.B1());
		
		System.out.println(c.A1());
	}
}