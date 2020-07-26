class A
{
	void m()
	{
		System.out.println("M");
	}
	void n()
	{
		this.m();         //similar to m();
		System.out.println("n");
	}
}
class ThisMethod
{
	public static void main(String args[])
	{
		A a=new A();
		a.n();
	}
}
	