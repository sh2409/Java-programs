interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class Multiple1 implements Printable,Showable
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
		Multiple1 m=new Multiple1();
		m.print();
		m.show();
	}
}
