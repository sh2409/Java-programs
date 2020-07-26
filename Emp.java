class Emp
{
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String args[])
	{
		Address add1=new Address("gzb","UP","India");
		Address add2=new Address("PQR","MH","India");

		Emp e1=new Emp(111,"abc",add1);
		Emp e2=new Emp(112,"pq",add2);

		e1.display();
		e2.display();
	}
}