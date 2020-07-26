//without static var
class Stud
{
	int roll;
	String name;	
	String college="ITS";
}
class Info
{
	public static void main(String args[])
	{
		Stud s1=new Stud();
		System.out.println(s1.roll+" "+s1.name+" "+s1.college);
	}
}
