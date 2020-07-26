class Stud
{
	int roll;
	String name;
	Stud()
	{
		roll=42;
		name="Shrutii";
	}
	Stud(int r,String n)
	{
		roll=r;
		name=n;
	}
	Stud(Stud s)
	{
		roll=s.roll;
		name=s.name;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}
}
class ConstType
{
	public static void main(String args[])
	{
		Stud s1=new Stud();
		Stud s2=new Stud(64,"Swapnill");
		Stud s3=new Stud(s2);
		s1.display();
		s2.display();
		s3.display();
	}

}
