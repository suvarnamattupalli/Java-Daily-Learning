class rev
{
	public static void main(String args[])
	{
		int num=342000,count1=0,count2=0,count=0,rem1=0,rem2=0,rev=0,copy=num,temp=0;
		while(num!=0)
		{
			count1++;
			rem1=num%10;
			rev=rev*10+rem1;
			num/=10;			
		}
		temp=rev;
		while(rev!=0)
		{
			count2++;
			rem2=rev%10;
			switch(rem2)
			{
				case 1 -> System.out.println("One");
				case 2 -> System.out.println("Two");
				case 3 -> System.out.println("Three");
				case 4 -> System.out.println("Four");
				case 5 -> System.out.println("Five");
				case 6 -> System.out.println("Six");
				case 7 -> System.out.println("Seven");
				case 8 -> System.out.println("Eight");
				case 9 -> System.out.println("Nine");
			}
			rev/=10;
		}
		count=count1-count2;
		while(count!=0)
		{
		count--;
		System.out.println("Zero");
		}
				
	}
}

