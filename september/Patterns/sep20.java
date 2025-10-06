class Q1
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

class Q2
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

class Q3
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

class Q4
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

class Q5
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


class Q6
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

class Q7
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

class Q8
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

class Q9
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

class Q10
{
	public static void main(String args[])
	{
		int rows=5;
		int first=rows/2;
		int second=rows-first;
		for(int r =1;r<=first;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(r==c)
				System.out.print(1+" ");	
				else
				System.out.print(0+" ");		
			}
			
			System.out.println(" ");
		}
		for(int i=1;i<=second;i++)
		{
			for(int j=second;j>=i;j--)
			{
				if(i==j)
				System.out.print(1+" ");	
				else
				System.out.print(0+" ");		
			}
			
			System.out.println(" ");
		}

	}
}
/*Output
1
0 1
0 0 1
0 1
1*/

class Q11
{
	public static void main(String args[])
	{
		int rows=7,first=rows/2+1,temp=1;
		for(int r=1;r<=first;r++)
		{	temp=r;
			for(int c=1;c<=r;c++)
			{	
				int sq=(int)(Math.pow(temp,2));
				System.out.print(sq<10?sq:0);
				temp--;
			}
			System.out.println("");
		}
		
		for(int r=1;r<=rows-first;r++)
		{	temp=rows-first-r+1;
			for(int c=rows-first;c>=r;c--)
			{	
				int sq=(int)(Math.pow(temp,2));
				System.out.print(sq);
				temp--;
			}
			System.out.println("");
		}
	}
}
/*Output
1
41
941
0941
941
41
1*/

class Q12
{
	public static void main(String args[])
	{
		int rows=7;
		int half_rows=rows/2;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r)
		}
	}
}