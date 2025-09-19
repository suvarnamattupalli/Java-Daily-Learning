class AddLastFirst
{
	public static void main(String args[])
	{
		int num=456123,count=0,temp=num,rev=0,rem=0;
		while(num!=0)
		{
			count++;
			rev=rev*10+(num%10);
			num/=10;
		}
		int start=1,end=count/2; //for number of iterations
		while(start<=end)
		{
			System.out.println((temp%10)+(rev%10));
			temp/=10;
			rev/=10;
			start++;
		}
		if(count%2!=0)
			System.out.println(temp%10);
		
	}
}