class unicode
{
	public static void main(String args[])
	{
		char ch='\20';
		if(ch>=65 && ch<=90)
		{
			System.out.println("Uppercase");
		}
		else if(ch>=97 && ch<='z')
		{
			System.out.println("Lowercase");
		}
		else if(ch>=48 && ch<='9')
		{
			System.out.println("Number");
		}
		else if(ch==' ')
		{
			System.out.println("Space");
		}
		else if(ch=='\00')
		{
			System.out.println("Null");
		}
		else
		{
			System.out.println("Symbols");
		}

	}
}