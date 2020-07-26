class Employee
{
	int id;
	String name;
	float sal;
	Employee(int id,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	void display()
	{
		System.out.println("id:"+id+"\n name:"+name+"\n salary:"+sal);
	}
}
class Programmer extends Employee
{
	float bonus;
	String designation="Programmer";
	float total;
	Programmer(float bonus)
	{
		this.bonus=bonus;
	}
	void disp()
	{
		total=sal+bonus;
		System.out.println("designation:"+designation+"\n Bonus:"+bonus+"\n Total salary:"+total);	
	}
}
class Sin
{
	public static void main(String args[])
	{
		Employee e=new Employee(11,"ABC",40000f);
		Programmer p=new Programmer(5000f);
		//e.display();

		p.display();
		p.disp();
	}
}