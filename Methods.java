//Method
class stud
{
	int roll;
	String name;
	void insert(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}
	
}
class Methods
{
	public static void main(String args[])
	{
		stud s1=new stud();
		stud s2=new stud();
		s1.insert(11,"Shruti");
		s2.insert(24,"Swapnil");
		s1.display();
		s2.display();
	}
}