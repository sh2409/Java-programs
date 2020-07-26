class Students
{
	int roll;
	double marks;
	Names name;
	Students(int roll,Names name,double marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	void display()
	{
		System.out.println(" roll no:"+roll+"\n Name:"+name.fname+" "+name.mname+" "+name.lname+"\n marks:"+marks);
	}
	public static void main(String args[])
	{
		Names n1=new Names("Swapnil","Lahu","Vasekar");
		Names n2=new Names("Shruti","Yashwant","Tawashe");
		
		Students s1=new Students(64,n1,78.88);
		Students s2=new Students(42,n2,79.06);
		s1.display();
		s2.display();
	}
}