class Emp
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Programmer extends Emp
{
	float sal;
	Programmer(int id,String name,float sal)
	{
		super(id,name);
		this.sal=sal;	
	}
}
class Super4
{
	public static void main(String args[])
	{
		Programmer p1=new Programmer(1,"ABC",25000);
		System.out.println(p1.id+" "+p1.name+" "+p1.sal);
	}
}