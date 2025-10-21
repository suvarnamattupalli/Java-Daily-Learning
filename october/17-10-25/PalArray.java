class PalArray
{
	public static void main(String args[])
	{	
		String s=new String("M$A12D#A1M");
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			//System.out.print(c[i]);
			if((c[i]>='A' && c[i]<='Z'))
				System.out.print(i);
		}
	}
}