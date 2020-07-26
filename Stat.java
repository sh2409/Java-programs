class Stud
{
	int roll;
	String name;
	static String college="BITS";
	Stud(int r,String n)
	{
		roll=r;
		name=n;	
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}
}
class Stat
{
	public static void main(String args[])
	{
		Stud s1=new Stud(11,"Shruu");
		Stud s2=new Stud(24,"Swapp");
		s1.display();
		Stud.college="IITS";
		s2.display();
		s1.display();
	}
}