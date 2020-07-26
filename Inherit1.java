interface Printable
{
	void print();
}
interface Showable extends Printable
{
	void show();
}
class Inherit1 implements Showable
{
	public void print()
	{
		System.out.println("Print...");
	}
	public void show()
	{
		System.out.println("Show...");
	}
	public static void main(String args[])
	{
		Showable s=new Inherit1();
		s.print();
		s.show();
	}
}
