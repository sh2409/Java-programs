class B1
{
	final void run()
	{
		System.out.println("running...");
	}
}
class Honda extends B1
{
	void run()
	{
		System.out.println("running with 60kmph");
	}
	public static void main(String arg[])
	{
		new Honda().run();
	}
}