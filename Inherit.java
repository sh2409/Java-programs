class Employee
{
	int sal=40000;
}
class Programmer extends Employee
{
	int bonus=5000;
}
class Inherit
{
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		System.out.println("Salary is:"+p.sal+"\n Bonus is:"+p.bonus);

	}
}