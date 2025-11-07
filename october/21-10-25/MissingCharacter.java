class MissingCharacter
{
	public static void main(String args[])
	{
		String s="a quick brown fox jumps ovr th lazy dog";
		char[] c=s.toCharArray();
		boolean b=false;
		int count=0,j=0;
		boolean missing=false;
		for(char i='a';i<='z';i++)//a to z
		{
			b=false;
			for(j=0;j<c.length;j++)// every char in string
			{
				if(c[j]==i) // checking if present
				{
					b=true;
					break;
				}
			}
			
			if(!b) //if not present,print
			{
				count++;
				System.out.print(i);
				missing=true;
			}
		}
		if(count==0)
				System.out.print("No Missing Characters");
	}
}