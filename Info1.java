class Stud
{
	int roll;
	String name;
	String College="ITS";
	Stud(int r,String n)
	{
		roll=r;
		name=n;
	}
	/*void display()
	{
		System.out.println(roll+" "+name+" "+College);
	}*/
}
 class Info1
{
	public static void main(String args[])
	{
		Stud s1=new Stud(11,"ABC");
		System.out.println(s1.roll+" "+s1.name+" "+s1.College);
		
		Stud s2=new Stud(24,"pqr");
		s2.College="BITS";
		System.out.println(s2.roll+" "+s2.name+" "+s2.College);
		
	}
}