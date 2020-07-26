class Stud
{
	int roll;
	String name;
	Stud()
	{
		System.out.println(roll+" "+name);
	}
	Stud(Stud s)
	{
		roll=s.roll;
		name=s.name;
		System.out.println(roll+" "+name);
	}
}
class Copy
{
	public static void main(String args[])
	{
		Stud s1=new Stud();
		s1.roll=100;
		Stud s2=new Stud(s1);
	}
}