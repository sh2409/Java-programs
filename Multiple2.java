interface Printable
{
	void print();
}
interface Showable
{
	void print();
}
class Multiple2 implements Printable,Showable
{
	public void print()
	{
		System.out.println("Print...");
	}
	
	public static void main(String args[])
	{
		Multiple2 m=new Multiple2();
		m.print();
	}
}
