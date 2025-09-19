class HalfPal
{
	public static void main(String args[])
	{
		int num=426984,temp=num,first=0,last=0,c=0,count=0,sum=0,rem=0,count2=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		c=(int)Math.pow(10,count/2);
		first=temp/c;
		last=temp%c;
		sum=first+last;
		System.out.println("First Half: "+first+"\nSecond Half: "+last+"\nSum = "+sum);
		int max=0;
		while(sum!=0)
		{
			rem=sum%10;
			System.out.print(rem+": ");
			count2=0;
			for(int i=1;i<=rem;i++)
			{	
				if(rem%i==0)
				{
					count2++;
					System.out.print(i+" ");
				}
			}	
			System.out.println(rem==0?"No Factors":" ");
			if(count2>max)
				{max=count2;}
		sum/=10;
		}
		System.out.println(max);
		
	}
}
