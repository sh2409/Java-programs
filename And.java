class And
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b&&a<c);   //1st condn is false so it doesn,t check for 2nd
		System.out.println(a<b&a<c);    //false&true=false

	}
}