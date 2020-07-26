class Sub
{
	int sub(int a,int b)
	{
		return a-b;
	}
	double sub(double a,double b)
	{
		return a-b;
	}
}
class TestSub
{
	public static void main(String args[])
	{
		Sub s1=new Sub();
		Sub s2=new Sub();
		System.out.println(s1.sub(10,20));
		System.out.println(s2.sub(20.1-10.9));
	}
}