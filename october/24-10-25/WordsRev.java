class WordsRev
{
	public static void main(String args[])
	{
		String s="hello all good morning";
		String[] str=s.split(" ");
		String res="";
		String words="";
		for(int i=0;i<str.length;i++)
		{ 
			StringBuffer sb = new StringBuffer(str[i]);
			//sb.reverse();
			//res=sb.toString();
			words=words+sb.reverse()+" ";
		}
		System.out.print(words);
	}
}
/*
olleh lla doog gninrom
*/