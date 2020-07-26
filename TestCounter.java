//without static var
class Counter
{
	int count=0;
	Counter()
	{
		count++;
		System.out.println(count);
	}
}
class TestCounter
{
	public static void main(String args[])
	{
		Counter c1=new Counter();
		Counter c2=new Counter();
	}
}