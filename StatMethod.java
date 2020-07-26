class Stud
{
	int roll;
	String name;
	static String college="BBDT";
	static void change()
	{
		college="IITS";
	}
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
public class StatMethod
{
	public static void main(String args[])
	{
		Stud s1=new Stud(11,"ABC");
		Stud s2=new Stud(24,"PQR");
		Stud.change();
		s1.display();
		s2.display();
	}
}