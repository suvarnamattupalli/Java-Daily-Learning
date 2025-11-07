class Hierarchial
{
	public static void main(String args[])
	{
		Programmer programmer=new Programmer("Developer",5001,"Java","Hyd",50000);
		System.out.println(programmer.printData());
		System.out.println("Salary: "+programmer.getSalary());
		System.out.println("Bonus: "+programmer.getBonus());

		Hr hr=new Hr("Recruiter","FullStack","Hyd",9,80000);
		System.out.println(hr.printData());
		System.out.println("Recruited: "+hr.getStatus());
		System.out.println("Salary: "+hr.getSalary());

		Tester tester=new Tester("Security Tester","Python","Bangalore","ABCD",70000);
		System.out.println(tester.printData());
		System.out.println("Errors Found: "+tester.getErrors());
		System.out.println("Salary: "+tester.getSalary());
	}
}
class Employee
{
	int id;
	String name;
	String gender;
	long mobile;
	double salary;
	Employee(int id,String name,String gender,long mobile)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.mobile=mobile;
	}
	String printData()
	{
		System.out.println();
		return id+" "+name+" "+gender+" "+mobile;
	}
	double getSalary()
	{
		return salary;
	}
}
class Programmer extends Employee
{
	String role;
	int project_id;
	String technology;
	String location;
	Programmer(String role,int project_id,String technology,String location,double salary)
	{
		super(12,"Raj","Male",12345);
		this.role=role;
		this.project_id=project_id;
		this.technology=technology;
		this.location=location;
		super.salary=salary;
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
class Hr extends Employee
{
	String role;
	String project;
	String location;
	int recruitment;
	Hr(String role,String project,String location,int recruitment,double salary)
	{
		super(13,"Harini","Female",123456789);
		this.role=role;
		this.project=project;
		this.location=location;
		this.recruitment=recruitment;
		super.salary=salary;
	}
	String printData()
	{
		System.out.println(super.printData());
		return role+" "+project+" "+location;
	}
	int getStatus()
	{
		return recruitment;
	}	
}
class Tester extends Employee
{
	String role;
	String technology;
	String location;
	String company;
	Tester(String role,String technology,String location,String company,double salary)
	{
		super(14,"Geetha","Female",9876542);
		this.role=role;
		this.technology=technology;
		this.location=location;
		this.company=company;
		super.salary=salary;
	}
	String printData()
	{
		System.out.println(super.printData());
		return role+" "+technology+" "+location+" "+company;
	}
	int getErrors()
	{
		return 10;
	}
}