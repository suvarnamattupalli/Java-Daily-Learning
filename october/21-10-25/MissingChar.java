import java.util.Arrays;
class MissingChar
{
	public static void main(String args[])
	{
		String s="a quick brown fox jumps over lazy";

		char[] c=s.toCharArray();
		Arrays.sort(c);
		boolean[] b= new boolean[26];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[j] || c[i]==' ')
					continue;
				char ch = (char)(j+'a');
				if(c[i]==ch)
				{
					b[j]=true;
					break;
				}
			}	
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==false)
				System.out.print((char)(i+'a'));
		}
	}
}