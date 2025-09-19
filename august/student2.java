class student2
{
	public static void main(String args[])
	{
	int s1=90,s2=95,s3=95;
	int total=s1+s2+s3;
	double max_marks=300;
	double percentage=(total/max_marks*100);
		if(s1>=35 && s2>=35 && s3>=35)
		{
		System.out.println("Pass\n"+"Total: "+total+"\nPercentage: "+percentage);
		}
		else
		{
		System.out.println("Fail");
		}
	}
}