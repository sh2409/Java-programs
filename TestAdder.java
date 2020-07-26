class Adder
{
	static int add(int a,int b)
	{
		System.out.println(a+b);
		return 0;
	}
	static int add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		return 0;
	}
}
class TestAdder
{
	public static void main(String args[])
	{
		Adder.add(11,24);
		Adder.add(11,24,5);
	}
}