class Pal
{
	public static void main(String args[])
	{
		String s="hello1 all2 good3 Mornin2g1";
		char[] c=s.toCharArray();
		int num=0,temp=0,n=0,p=0;
		for(int i=0;i<c.length;i++)
		{
			if(Character.isDigit(c[i]))
				num=num*10+Character.getNumericValue(c[i]);
		}
		System.out.println(num);
		temp=num;
		while(num!=0)
		{
			n=num%10;
			p=p*10+n;
			num/=10;
		}
		System.out.print(temp==p?"Pal":"Not PAl");
	}
}