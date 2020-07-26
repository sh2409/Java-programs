class Stud
{
	int id;
	String name;
	Stud(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}
class Parameters
{
	public static void main(String args[])
	{
		Stud s1=new Stud(24,"Swap");
		Stud s2=new Stud(11,"Shru");
		
		s1.display();
		s2.display();
	}
}