class SingleInherit
{
	public static void main(String args[])
	{
		Programmer programmer=new Programmer("Developer",5001,"Java","Hyd");
		System.out.println("Job Details: "+programmer.printData());
		System.out.println("Salary: "+programmer.getSalary());
		System.out.println("Bonus: "+programmer.getBonus());
	}
}
class Employee
{
	int id;
	String name;
	String gender;
	int mobile;
	Employee(int id,String name,String gender,int mobile)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.mobile=mobile;
	}
	String printData()
	{
		System.out.print("Personal Details: ");
		return id+" "+name+" "+gender+" "+mobile;
	}
	double getSalary()
	{
		return 50000;
	}
}
class Programmer extends Employee
{
	String role;
	int project_id;
	String technology;
	String location;
	Programmer(String role,int project_id,String technology,String location)
	{
		super(12,"Raj","Male",12345);
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
		return 30000;
	}
}