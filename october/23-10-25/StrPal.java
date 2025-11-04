class StrPal
{
	public static void main(String args[])
	{
		String s="a man , a plan 1 & a canal , panama";
		String s2="",res="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' & c[i]<='z')
				s2=s2+c[i];
		}
		System.out.println(s2);
		StringBuffer sb=new StringBuffer(s2);
		sb.reverse();
		res=sb.toString();
		System.out.println(s2.equals(res)?"P":"Not P");
	}
}
/*
amanaplanacanalpanama
P
*/