class k
{
	public static void main(String args[])
	{
		int id= 678;
		String name="Suvarna";
		int sal=50000;
		double ta=(11.5/100)*sal;
		double da=(3.5/100)*sal;
		double hra=(15.5/100)*sal;
		double total=sal+ta+da+hra;
		double cgst=(9.0/100)*total;
		double sgst=(9.0/100)*total;
		double salary=total+sgst+cgst;
		System.out.println(id+" "+ name+" "+ sal+" "+ total+" "+ salary);
	}
}