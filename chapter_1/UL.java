class UL
{
	public static void main(String args[])
	{
		char ch='q';
		if(ch>='a' && ch<='z')
			ch-=32;
		else if(ch>='A' && ch<='Z')
			ch+=32;
		else
			System.out.print("Entered Character is not a alphabet ");
		System.out.println(ch);		
		
	}
}