import java.util.*;
class Array
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}