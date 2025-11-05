class Constructor 
{
	int num;
	String name;
	Constructor()//def con
	{
		this(10,"Suvarna");//2.calls two param
		this.num=25;
		this.name="Kalyani";//6. 25,kalyani loaded
	}
	Constructor(int num,String name)//two param
	{
		this("Suvarna");//3.calls one param
		this.num=num;
		this.name=name;//5. 10,Suvarna loaded
	}
	Constructor(String name)//one param
	{
		this.name=name;//4. Suvarna loaded
	}
	String printData()
	{
		return num+" "+name; //7. returns 25 kalyani
	}
	public static void main(String args[])
	{
		Constructor c=new Constructor();//1.calls def cons
		System.out.println(c.printData());//8. prints
	}
}