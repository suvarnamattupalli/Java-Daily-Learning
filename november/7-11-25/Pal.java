class Pal
{
	public static void main(String args[])
	{
		Pal p=new Pal();
		int c[]=p.integerPal();
		for(int temp1:c)
			System.out.print(temp1+" ");
		p.stringPal();
	}
	
	int[] integerPal()
	{
		int[] a=new int[]{121,656,78};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int rev=0;
			while(temp>0)
			{
				rev=10*rev+(temp%10);
				temp/=10;
			}
			if(a[i]==rev)
			count++;
		}
		
		int b[]=new int[count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int rev=0;
			while(a[i]>0)
			{
				rev=10*rev+(a[i]%10);
				a[i]/=10;
			}
			if(temp==rev)
			b[index++]=temp;		
		}
		return b;
			
	}
	void stringPal()
	{
		String[] s=new String[]{"madam","water","LOL"};
		for(int i=0;i<s.length;i++)
		{
			String s1=s[i];
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			String s2=sb.toString();
			if(s1.equals(s2))
				System.out.print(s1+" ");
		}
	}
}