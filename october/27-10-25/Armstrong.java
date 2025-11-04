class Armstrong
{
	public static void main(String args[])
	{
		String s="C1H5H3";
		String s1="";
		int num=0,temp=0,count=0,y=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='0' & s.charAt(x)<='9')
			{
				s1=s1+s.charAt(x);
				num=num*10+Character.getNumericValue(s.charAt(x));
			}
		}
		//System.out.println("Extracted Number: "+s1);
		
		System.out.println("Number: "+num);
		
		temp=num;
		while(num!=0)
		{
			y=y+(int)Math.pow(num%10,s1.length());
			num/=10;
		}
		System.out.println(temp==y?"Armstrong":"Not Armstrong");
				
	}
}