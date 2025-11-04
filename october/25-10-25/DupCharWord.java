class DupCharWord
{
	public static void main(String args[])
	{
		String s="Hello! Good Morning";
		String[] s1=s.split(" ");
		String s2="",word="";		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
			word=s1[i];
			for(int j=0;j<word.length();j++)
			{
				char c=word.charAt(j);
				if(word.indexOf(c)!=word.lastIndexOf(c))
					System.out.print(c);		
			}
			System.out.println();
		}
	}
}

/*
Hello!
ll
Good
oo
Morning
nn
*/