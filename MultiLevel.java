class Animal
{
	Animal()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	Dog()
	{
		System.out.println("Barking");
	}
}
class BabyDog extends Dog
{
	BabyDog()
	{
		System.out.println("Weeping");
	}
}
class Multilevel
{
	public static void main(String args[])
	{
		BabyDog b=new BabyDog();
	}
}