class Animal
{
	Animal()
	{
		System.out.println("Eating....");
	}
}
class Dog extends Animal
{
	void display()
	{
		System.out.println("Barking....");
	}
}
class Cat extends Animal
{
	Cat()
	{
		System.out.println("Mewoing");
	}
}
class Hierarchical
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.display();
		Cat c=new Cat();
		//c.display();        //C.T error
	}
}