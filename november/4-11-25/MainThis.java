class MainThis //CurrentClassInstanceVariable
{
	int id;
	String name;
	public static void main(String args[])
	{
		MainThis main1=new MainThis(10,"Kalyani");
		main1.displayInfo();
		MainThis main2=new MainThis(20,"Kavya");
		main2.displayInfo();
	}
	MainThis(int id,String name)
	{
		this.id=id;	//this keyword points to the instance variable(current class instance variable)
		this.name=name;
	}
	void displayInfo()
	{

		System.out.println(id+" "+name);
	}
}