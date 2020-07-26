class A
{
	A()
	{
		System.out.println("Parent class");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Child class");
	}
	B(int a)
	{
		System.out.println("Child class"+a);	
	}
	{
		System.out.println("Instance Initializer Block");
	}
}
class E
{
	public static void main(String args[])
	{
		new B();
		new B(10);
	}
}
