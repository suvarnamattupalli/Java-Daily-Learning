class ProBtw
{
	public static void main(String args[])
	{
		int num=22234,pro=1,temp=num,count=0;
		System.out.println("Given Number: "+num);
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		num=num/10;
		while(num!=0)
		{
			count--;
			if(count<2)
				break;
			pro=pro*(num%10);
			//System.out.println(pro);
			num/=10;
		}
		System.out.println("Product of numbers btw first and last: "+pro);
	}
}