class UniqueChar
{
	public static void main(String args[])
	{
		String s="Suvarna";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c))
				System.out.print(c);			
		}

	}
}

/*
Suvrn
*/