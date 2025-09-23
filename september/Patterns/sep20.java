class P1
{
	public static void main(String args[])
	{
		int rows=5,temp=0;
		for(int r =1;r<=rows;r++)
		{
			temp=rows-r+1;
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp++);
			}
			
			System.out.println(" ");
		}
		
	}
}
/*Output
5
45
345
2345
12345*/

class P2
{
	public static void main(String args[])
	{
		int rows=4;
		char ch='A';
		for(int r =1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch++);
			}
			
			System.out.println(" ");
		}
		
	}
}
/*Output
A
BC
DEF
GHIJ*/

class P3
{
	public static void main(String args[])
	{
		int rows=5,temp=0;
		for(int r=1;r<=rows;r++)
		{	
			temp=r;
			for(int c=1;c<=r;c++)
			{
				if(r==c || r==rows || c==1)
				{
					System.out.print(temp);
				}
				else
				{
					System.out.print(" ");
				}
				temp--;
			}
			System.out.println(" ");
		}
		
	}
}
/*Output
1
21
3 1
4  1
54321*/

class P4
{
	public static void main(String args[])
	{
		int rows=5,temp=1;
		char ch1='A';
		char ch2='a';
		for(int r =1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				if(temp%2!=0)
				{
					System.out.print(ch1++);
				}
				else
				{
					System.out.print(ch2++);
					
				}
				temp++;
			}
			
			System.out.println(" ");
		}
		
	}
}

/*Output
AaBbC
cDdE
eFf
Gg
H*/

class P5
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r =1;r<=rows;r++)
		{
			int temp=r;
			for(int c=1;c<=r;c++)
			{
				if(c==1 || r==rows || r==c)
				{
					System.out.print(temp);
					temp--;
					
				}
				else
				{		
					System.out.print(" ");
				}	
			}
			
			System.out.println(" ");
		}
		
	}
}
/*Output
1
21
3 2
4  3
54321*/


class P6
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r =1;r<=rows;r++)
		{
			int temp=1;
			for(int c=1;c<=r;c++)
			{
				if(c==1 || r==rows || r==c)
				{
					System.out.print(temp);
					
				}
				else
				{		
					System.out.print(" ");
				}
				temp++;	
			}
			
			System.out.println(" ");
		}
		
	}
}
/*Output
1
12
1 3
1  4
12345*/

class P7
{
	public static void main(String args[])
	{
		int rows=4,temp=1;
		for(int r =1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print((int)Math.pow(temp,2)+" ");				
				temp++;	
			}
			System.out.println(" ");
		}
		
	}
}
/*Output
1
4 9
16 25 36
49 64 81 100*/

class P8
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r =1;r<=rows;r++)
		{
			int temp=1;
			for(int c=1;c<=r;c++)
			{
				System.out.print((int)Math.pow(temp,2)+" ");				
				temp++;	
			}
			System.out.println(" ");
		}
		
	}
}
/*Output
1
1 4
1 4 9
1 4 9 16*/

class P9
{
	public static void main(String args[])
	{
		int rows=4,temp=2;
		for(int r =1;r<=rows;r++)
		{
			
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp+" ");				
				temp+=2;	
			}
			System.out.println(" ");
		}
		
	}
}
/*Output
2
4 6
8 10 12
14 16 18 20*/

class P10
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r =1;r<=rows;r++)
		{
			for(int c=1;c<=rows-2;c++)
			{
				if(r==c || r+c==rows+1)
				System.out.print(1+" ");	
				else
				System.out.print(0+" ");
					
			}
			
			System.out.println(" ");
		}

	}
}
