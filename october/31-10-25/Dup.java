class Dup //Print Duplicates only once.
{
	public static void main(String args[])
	{
		String s="Hello hi Hello";
		String[] str=s.split(" ");
		boolean[] b=new boolean[str.length];
		String word="";
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(b[i])
				continue;
			word=str[i];
			count=0;	
			for(int j=i+1;j<str.length-1;j++)
			{
				String word1=str[j];
				if(!(word.equals(word1)))
				{
					b[i]=true;
					count++;
				}
			}
			if(count>0)
				System.out.println(str[i]);		
		}
	}
	
}
//Hello