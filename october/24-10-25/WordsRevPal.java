class WordsRevPal
{
	public static void main(String args[])
	{
		String s="madam arora teaches malayalam";
		String[] str=s.split(" ");
		for(String temp: str)
		{
			String word=temp;
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			if(word.contentEquals(sb))
				System.out.println(word);	
		}
	}
}
/*
madam
arora
malayalam
*/