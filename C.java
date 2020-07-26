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
	{
		System.out.println("Instance Initializer Block");
	}
}
class C
{
	public static void main(String args[])
	{
		new B();	
	}
}