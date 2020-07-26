class Bank
{
	int getInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getInterest()
	{
		return 9;
	}
}
class MOverride
{
	public static void main(String args[])
	{
		SBI s=new SBI();
		ICICI i=new ICICI();
		System.out.println("SBI rate of interest:"+s.getInterest());
		System.out.println("ICICI rate of interest:"+i.getInterest());
	}
}