class Stud
{
	int roll;
	String name;
	float marks;
	Stud(int r,String n)
	{
		roll=r;
		name=n;
	}
	Stud(int r,String n,float m)
	{
		roll=r;
		name=n;
		marks=m;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+marks);
	}
}
class ConstOverload
{
	public static void main(String args[])
	{
		Stud s1=new Stud(11,"Abc");
		Stud s2=new Stud(24,"Pqr",79);
		s1.display();
		s2.display();
	}
}