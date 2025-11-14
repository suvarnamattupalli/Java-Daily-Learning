interface Bank
{
	int withDrawal();
	public int maxTransaction();
	public int changePin();
	static String getLocation()
	{
		return "Hyderabad";
	}
	static String loc="vjwd";
	int a=4;
}
class ICICI implements Bank
{
	int wd,mt,cp;
	ICICI(int wd,int mt,int cp)
	{
		this.wd=wd;this.mt=mt;this.cp=cp;	
	}
	public int withDrawal()
	{
		return wd;
	}
	public int maxTransaction()
	{
		return mt;
	}
	public int changePin()
	{
		return cp;
	}
}
class Union implements Bank
{
	int wd,mt,cp;
	Union(int wd,int mt,int cp)
	{
		this.wd=wd;this.mt=mt;this.cp=cp;	
	}
	public int withDrawal()
	{
		return wd;
	}
	public int maxTransaction()
	{
		return mt;
	}
	public int changePin()
	{
		return cp;
	}
}
class Axis implements Bank
{
	int wd,mt,cp;
	Axis(int wd,int mt,int cp)
	{
		this.wd=wd;this.mt=mt;this.cp=cp;	
	}
	public int withDrawal()
	{
		return wd;
	}
	public int maxTransaction()
	{
		return mt;
	}
	public int changePin()
	{
		return cp;
	}
}
class Main
{
	public static void main(String args[])
	{
		ICICI ib =new ICICI(7000,5,1);
		System.out.println("ICICI "+ib.withDrawal()+" "+ib.maxTransaction()+" "+ib.changePin()+" "+Bank.getLocation()+" "+Bank.loc);
		Union ub=new Union(8000,3,2);
		System.out.println("Union "+ub.withDrawal()+" "+ub.maxTransaction()+" "+ub.changePin()+" "+Bank.getLocation());
		Axis ab=new Axis(10000,5,4);
		System.out.println("Axis "+ab.withDrawal()+" "+ab.maxTransaction()+" "+ab.changePin()+" "+Bank.getLocation()+" "+Bank.a);	
	}
}