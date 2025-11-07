class MultiLevel
{
	public static void main(String args[])
	{
		Developer developer=new Developer("BackEnd",538,"Java","vijayawada");
		System.out.println(developer.printData());
		System.out.println(developer.getBonus());
		System.out.println(developer.getSalary());
		System.out.println(developer.expenses());
	}
}
class Person	//GrandParent
{
	String name;
	int id;
	String s_o;
	String address;
	Person(String name,int id,String s_o,String address)
	{
		this.name=name;	
		this.id=id;
		this.s_o=s_o;
		this.address=address;
	}
	String printData()
	{
		return name+" "+id+" "+s_o+" "+address;
	}
	double expenses()
	{
		System.out.print("Expenses_Person: ");
		return 20000;
	}
}
class Employee extends Person	//Parent
{
	int id;
	String name;
	String gender;
	long mobile;
	Employee(int id,String name,String gender,long mobile)
	{
		super("Krishna",10,"Arjun","Vijayawada");
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.mobile=mobile;
	}
	String printData()
	{
		System.out.println(super.printData());
		return id+" "+name+" "+gender+" "+mobile;
	}
	double getSalary()
	{
		System.out.print("Salary: ");
		return 50000;
	}
	double expenses()
	{
		System.out.println(super.expenses());
		System.out.print("expenses_emp: ");
		return 10000;
	}
}
class Developer extends Employee	//Child
{
	String role;
	int project_id;
	String technology;
	String location;
	Developer(String role,int project_id,String technology,String location)
	{
		super(11,"Krishna","Male",123456789);
		this.role=role;
		this.project_id=project_id;
		this.technology=technology;
		this.location=location;
	}
	String printData()
	{
		System.out.println(super.printData());
		return role+" "+project_id+" "+technology+" "+location;
	}
	double getBonus()
	{
		System.out.print("Bonus: ");
		return 5000;
	}
}