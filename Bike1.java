class Bike1
{
	final int speed=90;
	void run()
	{
		speed=80;
	}
	public static void main(String args[])
	{
		new Bike1().run();
	}
}