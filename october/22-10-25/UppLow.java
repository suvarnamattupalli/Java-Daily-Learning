class UppLow
{
	public static void main(String args[])
	{
		String s1="Hello All Good Morning";
		String str[]=s1.split(" ");
		String res="";
		for(int x=0;x<str.length;x++)
		{
			String word=str[x];
			if(x%2==0)
				res=res+word.toUpperCase()+" ";
			else
				res=res+word.toLowerCase()+" ";
		}
		System.out.print(res);
	}
}

//HELLO all GOOD morning