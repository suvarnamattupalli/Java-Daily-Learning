class ToggleArray
{
	public static void main(String a[])
	{
		char[] ch=new char[]{'a','B','h','Y','U','o'};
		
		for(int x=0;x<ch.length;x++)
		{
			System.out.print(ch[x]+" ");
		}
		System.out.println("\nAfter Converting:");
		for(int x=0;x<ch.length;x++)
		{
			if(ch[x]>='A' && ch[x]<='Z')
				System.out.print((char)(ch[x]+32)+" ");
			else if(ch[x]>='a' && ch[x]<='z')
				System.out.print((char)(ch[x]-32)+" ");

		}
	}
}
/*Output
a B h Y U o
After Converting:
A b H y u O
*/