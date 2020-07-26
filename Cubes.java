class Calculate
{
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Cubes
{
	public static void main(String args[])
	{
		int r=Calculate.cube(5);
		System.out.println(r);
	}

}
	