class ESumMulExtract
{
	public static void main(String args[])
	{
		int num=3511,count=0,temp=num,c=0,n1=0,n2=0,sum1=0,sum2=0,mul=1;
		while(num!=0)
		{
			count++;
			num/=10;	
		}
		c=(int)Math.pow(10,count/2);
		n1=temp/c;
		n2=temp%c;
		//System.out.println(n2);
		while(n1!=0)
		{
			sum1=sum1+n1%10;
			n1/=10;
		}
		while(n2!=0)
		{
			sum2=sum2+n2%10;
			n2/=10;
		}
		mul=sum1*sum2;
		while(mul!=0)
		{
			System.out.println(mul%10);
			mul/=10;
		}
	}
}