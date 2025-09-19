class Voting
{
	public static void main(String args[])
	{
		int age=0;
		String nationality="Indian";
		if(age>=18 && nationality=="Indian" || nationality=="India")
		{
			System.out.println("Allow to voting");
		}
		else
		{
			System.out.println("Not allowed to voting");
		}
	}
}
