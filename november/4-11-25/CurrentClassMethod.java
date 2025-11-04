class CurrentClassMethod
{
	int id;
	String name;
	public static void main(String args[])
	{
		CurrentClassMethod main1=new CurrentClassMethod(10,"Kalyani");
		main1.calMethod();
		CurrentClassMethod main2=new CurrentClassMethod(20,"Kavya");
		main2.calMethod();
	}
	CurrentClassMethod(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void calMethod()
	{
		this.displayInfo();	//Calling one method in other using this keyword 
	}
	void displayInfo()
	{
		System.out.println(id+" "+name);
	}
}
