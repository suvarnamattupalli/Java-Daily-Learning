class NoCarryForward
{ 	
	public static void main(String args[])
	{
		int count=0;
		for(int i=4;i<=100;i++)
		{
			int num=i;
			for(int k=2;k<=(int)Math.sqrt(num);k++)
			{
				if(num%k==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && num!=1)
				System.out.println(i);
			else
				System.out.println("Not Prime"+i);

		}
		
	}
}


class CarryForward
{ 	
	public static void main(String args[])
	{
		for(int i=4;i<=100;i++)
		{
			int num=i,count=0;
			for(int k=2;k<=(int)Math.sqrt(num);k++)
			{
				if(num%k==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && num!=1)
				System.out.println(i);
			else
				System.out.println("Not Prime"+i);


		}
		
	}
}




class Factorial
{ 	
	public static void main(String args[])
	{
		int num=635;
		int sum=0; 
		while(num!=0)
		{
			int rem=num%10;
			int factorial=1;
			for(int i=rem;i>=1;i--)
			{
				factorial*=i;
			}
			sum=sum+factorial;
			System.out.println(rem+" factorial - "+factorial);
			num/=10;
		}
		
		System.out.println(sum);
	}
}

class Fib
{ 	
	public static void main(String args[])
	{
		int num=8463;
		while(num!=0)
		{
			int rem=num%10;
			int f=0,s=1,t=0;
			System.out.print(rem+":");
			for(int i=1;i<=rem;i++)
			{
				System.out.print(f+" ");
				t=f+s;
				f=s;
				s=t;
			}
			num/=10;
			System.out.println();
		}		
	}
}


class FibCont
{ 	
	public static void main(String args[])
	{
		int num=8463;
		int f=0,s=1,t=0;
		while(num!=0)
		{
			int rem=num%10;
			
			System.out.print(rem+":");
			for(int i=1;i<=rem;i++)
			{
				
				System.out.print(f+" ");
				t=f+s;
				f=s;
				s=t;
			}
			num/=10;
			System.out.println();
		}		
	}
}


class AsciiPalindrome
{ 	
	public static void main(String args[])
	{
		int num=675693;
		while(num!=0)
		{
			int rem=num%100;
			char ch=(char)rem; //print ascii
			System.out.println(ch);
			int rev=0;
			while(rem!=0)
			{
				rev=rev*10+(rem%10); //reverse num
				rem/=10;
			}
			char ch2=(char)rev; //print ascii for reverse num
			System.out.println(ch2);
			num/=100;
		}		
	}
}


class SumPalindrome
{ 	
	public static void main(String args[])
	{
		int num=349,temp,rev;
		boolean b=true;
		while(b)
		{
		temp=num;rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;			
		}
		if(rev==temp)
		{
			System.out.println("Palindrome"+rev);
			b=false;
		}
		else
		{
			System.out.println("Not Palindrome"+ rev);
			num=rev+temp;
			b=true;
		}
		}	
	}
}