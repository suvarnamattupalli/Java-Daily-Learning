class ans
{
	public static void main(String args[])
	{
		char ch='p';
		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("Alphabet");
		}
		
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Symbol");
		}

	}
}



/*class ans
{
	public static void main(String args[])
	{
		char ch='A';
		if (ch>='a' && ch<='z')
		{
			System.out.println("Small Alphabet");
		}
		else if (ch>='A' && ch<='Z')
		{
			System.out.println("Capital Alphabet");
		}

		else if(ch>='0' && ch<='9')
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Symbol");
		}

	}
}*/