class Stud
{
	int roll;
	String name;
	Stud(int roll,String name)
	{
		roll=roll;
		name=name;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}

}
class A1
{
	public static void main(String args[])
	{
		Stud s1=new Stud(11,"syt");
		Stud s2=new Stud(24,"slv");
		s1.display();
		s2.display();
	}
}