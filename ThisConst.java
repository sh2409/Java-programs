class Student
{
	int roll;
	String name;
	float marks;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	Student(int roll,String name,float marks)
	{
		this(roll,name);
		this.marks=marks;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+marks);
	}
}
class ThisConst
{
	public static void main(String args[])
	{
		Student s1=new Student(11,"ABC");
		Student s2=new Student(24,"PQR",78f);
		s1.display();
		s2.display();
	}
}