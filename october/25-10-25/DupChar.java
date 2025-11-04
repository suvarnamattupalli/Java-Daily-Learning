class DupChar
{
	public static void main(String args[])
	{
		String s="Suvarna";
		String s2="";		//Take a empty String
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s.indexOf(c)!=s.lastIndexOf(c))
			{
				if(s2.indexOf(c)==-1) //Check if char is present in empty string,if not add it.(-1 means char is not present in string)
					s2=s2+c;
			}			
		}
		System.out.print(s2);

	}
}

/*
a
*/