//Reference
class Stud
{
	int id;
	String name;

}
class Ref
{
	public static void main(String args[])
	{
		Stud s1=new Stud();
		Stud s2=new Stud();
		s1.id=11;
		s1.name="Shruti";
		s2.id=24;
		s2.name="Swapnil";
		System.out.println(s1.id+" "+s1.name+"\n"+s2.id+" "+s2.name);
	}
}