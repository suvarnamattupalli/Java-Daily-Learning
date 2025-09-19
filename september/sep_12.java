class nthfib
{ 	
	public static void main(String args[])
	{
		int f=0,s=1,t,i,num=9;
		for(i=1;i<=num;i++)
		{
			if(i==num)
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
			
		}
		
			
	}
}

class nthfib2
{ 	
	public static void main(String args[])
	{
		int f=0,s=1,t,i,num=9,temp=0;
		for(i=1;i<=num;i++)
		{
			
			t=f+s;
			temp=f;
			f=s;
			s=t;
			
		}
		System.out.println(temp);
			
	}
}

class PrimeRange
{ 	
	public static void main(String args[])
	{
		int y,num,factor=0,x,count=0,sum=0;
		for(y=478;y<=658;y++)
		{	
			num=y;factor=0;
			for(x=2;x<=num/2;x++)
			{
				if(num%x==0)
				{
					factor++;
					break;
				}
			}
			if(factor==0)
			{
				count++;
				System.out.println(num);
				sum+=num;
			}
		}
		System.out.println(count);
		System.out.println(sum);

			
	}
}

class PalindromeRange
{ 	
	public static void main(String args[])
	{
		int count=0,sum=0;
		for(int i=1;i<=1000;i++)
		{
			int num=i,rem=0,rev=0,temp=num;
			while(num!=0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
		if(temp==rev)
		{
			count++;
			sum+=rev;
			//System.out.println(rev);
		}
		}
		System.out.println("Number of Palindromes from 1 to 1000 is "+count);
		System.out.println("Sum of Palindromes is "+sum);	
	}
}

class ArmstrongRange
{ 	
	public static void main(String args[])
	{
		int count1=0;
		System.out.println("Armstrong numbers between 1 to 1000");
		for(int i=1;i<=1000;i++)
		{
			int num=i,temp=num,og=num,count=0,ag=0;
			while(temp!=0)
			{
				count++;
				temp/=10;
			}
			while(num!=0)
			{
				ag=ag+(int)Math.pow(num%10,count);
				num/=10;
			}
			if(og==ag)
			{
			System.out.println(ag);
			count1++;
			}
		}
		System.out.println("Num of ag nums btw 1 to 1000: "+count1);
	}
}

class TenFactors //Factors for 1 to 10 number
{ 	
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
		System.out.print("\n"+i+"-");
			for(int j=1;j<=10;j++)
			{
				if(i%j==0)
				{
					System.out.print(j+",");	
				}
			}
		}
	}
}