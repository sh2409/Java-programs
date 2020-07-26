interface Printable
{
	void print();	
}
class A implements Printable
{
	public void print()
	{
		System.out.println("Printing....");
	}
}
class Interface1
{
	public static void main(String args[])
	{
		Printable p=new A();
		p.print();
	}
}
