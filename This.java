class Stud
{
	int roll;
	String name;
	Stud(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}
}
class This
{
	public static void main(String args[])
	{
		Stud s1=new Stud(11,"SYT");
		Stud s2=new Stud(24,"SLV");
		s1.display();
		s2.display();		
	}
}