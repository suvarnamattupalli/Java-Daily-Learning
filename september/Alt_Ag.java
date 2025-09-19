class Alt_Ag
{
	public static void main(String args[])
	{
		int num=1234564,count=0,sum=0,mul=1,rem=0,add=0,ag_num=0,ag=0;
		while(num!=0)
		{
			++count;
			rem=num%10;
			if(count%2==0)
				sum+=rem;
			else
				mul*=rem;
			num=num/10;
		}
		add=sum+mul;
		System.out.println("Sum: "+sum+" Mul: "+mul+" Add: "+add);
		count=0;
		ag_num=add;

		while(add!=0)
		{
			count++;
			add/=10;
			
		}

		rem=0;
		ag=ag_num;
		while(ag_num!=0)
		{
			rem=rem+(int)Math.pow(ag_num%10,count);
			ag_num/=10;
		}
		System.out.println((ag==rem)?("Armstrong Number"+rem):("Not Armstrong Number"));
		
	}
}