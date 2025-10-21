import java.util.Arrays;
class Anagram
{
	public static void main(String args[])
	{
		String s1 = new String("chath");
		String s2 = new String("cathk");
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c1.length;j++)
			{
				if(c1[i]!=c2[j])
					count++;
					break;
									
			}
		}
		if(count==0)
			System.out.print("Anagram");
		else
			System.out.print("Not Anagram");
	}
}