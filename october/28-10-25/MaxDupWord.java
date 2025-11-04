class MaxDupWord
{
	public static void main(String args[])
	{
		String s="helo all good morning everyoone";
		int max=0;
		String max_word="";
		String[] str=s.split(" ");
		for(String word: str)
		{
			String s2="";
			for(int x=0;x<word.length();x++)
			{
				char c=word.charAt(x);
				if(word.indexOf(c)!=word.lastIndexOf(c))
				{
					if(s2.indexOf(c)==-1)
						s2=s2+c;
				}
			}
			if(s2.length()>=max)
			{
				if(s2.length()>max)
				{
					max_word=word+" ";
					max=s2.length();
				}
				else
					max_word=word+" ";
			}
		}
		System.out.print(max_word);
	}
}

//everyoone