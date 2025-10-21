import java.util.Arrays;
class Anagram
{
	public static void main(String args[])
	{
		int[] a = new int[]{10,40,40,40,50};
		int[] b = new int[]{10,50,50,40};
		Arrays.sort(a);
		Arrays.sort(b);
		int count=0;
		if(a.length==b.length)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i]) //if not equal,enters into if loop and count increases else count will be 0.
			{
				count++;
				break;	
			}			
		}
		System.out.print(count==0?"Anagram":"Not Anagram");
		}
		else
			System.out.print("Not Anagram");
	}
		
}