class FirstLetter
{
	public static void main(String args[])
	{
		String s1="Hello all Good Morning evening";
		String str[]=s1.split(" ");
		for(int x=0;x<str.length;x++)
			System.out.print(str[x].charAt(0));

		System.out.println();

		String s2="Vital info resource under seize";
		String s[]=s2.split(" ");
		for(int x=0;x<s.length;x++)
			System.out.print(s[x].charAt(0));
	}
}

/*
HaGMe
Virus
*/