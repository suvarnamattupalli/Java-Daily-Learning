class SplitString
{
	public static void main(String args[])
	{
		String s1="hello all good morning";
		String str[]=s1.split(" ");
		for(int x=0;x<str.length;x++)
			System.out.println(str[x]);
	}
}