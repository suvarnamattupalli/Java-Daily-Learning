import java.util.Arrays;
class StringAnagram
{
	public static void main(String args[])
	{
		String s1="silent",s2="listen";
		if(s1.length()==s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1,c2))
				System.out.print("Anagram");
			else
				System.out.print("Not Anagram");
		}
		else
			System.out.print("Not Anagram");
	}
}
