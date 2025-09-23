class P1
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=3;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println(" ");

		}
	}
}
/*Output
AAA
BBB
CCC*/

class P2
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=3;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(ch++);
			}
			System.out.println(" ");

		}
	}
}
/*Output
ABC
DEF
GHI*/

class P3
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=3;
		
		for(int r=1;r<=rows;r++)
		{
			char ch='A';
			for(int c=1;c<=cols;c++)
			{
				System.out.print(ch++);
			}
			System.out.println(" ");

		}
	}
}
/*Output
ABC
ABC
ABC*/

class P4
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				System.out.print(ch);
				else
				System.out.print((char)(ch+32));
			ch++;
			}
			System.out.println(" ");

		}
	}
}
/*Output
ABCD
efgh
IJKL
mnop*/


class P5
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print(temp++);
				}
			}
			System.out.println(" ");

		}
	}
}
/*Output
ABCD
2345
EFGH
4567*/

class P6
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=4;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
			if(c%2!=0)
			{
				System.out.print(ch);
			}
			else
			{
				System.out.print((char)(ch+32));
			}
			ch++;
			}
			System.out.println(" ");
		}
	}
}
/*Output
AbCd
EfGh
IjKl*/

class P7
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4;
		char ch1='A';
		for(int r=1;r<=rows;r++)
		{	
			char ch2=ch1++;
			for(int c=1;c<=cols;c++)
			{
				System.out.print(ch2++);
			}
			System.out.println("");
		}	
	}
}
/*Output
ABCD
BCDE
CDEF
DEFG*/


class P8
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4;
		char ch1='A';
		char ch2='a';
		for(int r=1;r<=rows;r++)
		{	
			if(r%2!=0 && r!=1)
			{	
				ch1+=cols;
				ch2+=cols;
			}
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(ch1++);
				}
				else
				{
					System.out.print(ch2++);
				}
			}
			System.out.println("");
		}	
	}
}
/*Output
ABCD
abcd
IJKL
ijkl*/


class P9
{ 	
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=r;c++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}	
	}
}
/*Output
#
##
###
####
#####*/

class P10
{ 	
	public static void main(String args[])
	{
		int rows=6;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=r;c++)
			{
				if(c==1 || r==c || r==rows)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("$");
				}
			}
			System.out.println("");
		}	
	}
}
/*Output
#
##
#$#
#$$#
#$$$#
######*/

class P11
{ 	
	public static void main(String args[])
	{
		int rows=6;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=r;c++)
			{
				if(c==1 || r==c || r==rows) //
				{
					System.out.print("#"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}	
	}
}

/*Output
#
# #
#   #
#     #
#       #
# # # # # #
*/

class P12
{ 	
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=r;c<=rows;c++)
			{
				System.out.print("#"+" ");
			}
			System.out.println("");
		}	
	}
}

class P12a
{ 	
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=rows;c>=r;c--)
			{
				System.out.print("#"+" ");
			}
			System.out.println("");
		}	
	}
}

class P12b
{ 	
	public static void main(String args[])
	{
		int rows=5;
		for(int r=rows;r>=1;r--)
		{	
			for(int c=1;c<=r;c++)
			{
				System.out.print("#"+" ");
			}
			System.out.println("");
		}	
	}
}

/*Output
# # # # #
# # # #
# # #
# #
#*/

class P13
{ 	
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=rows;c>=r;c--)
			{
				if(c==5 || c==r || r==1 )
				System.out.print("#"+" ");
				else
				System.out.print("  ");
			}
			System.out.println("");
		}	
	}
}
/*Output
# # # # #
#     #
#   #
# #
#*/


class P14
{ 	
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{	
			int temp=r;
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp-- +" ");
			}
			System.out.println("");
		}	
	}
}
/*Output
1
2 1
3 2 1
4 3 2 1*/

class P15
{ 	
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			int temp=1;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(temp++ +" ");
			}
			System.out.println("");
		}	
	}
}

/*Output
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1*/

class P16
{ 	
	public static void main(String args[])
	{
		int rows=4,temp=1;
		for(int r=1;r<=rows;r++)
		{	
			
			for(int c=r;c>=1;c--)
			{
				System.out.print(temp++ +" ");
			}
			System.out.println("");
		}	
	}
}
/*Output
1
2 3
4 5 6
7 8 9 10*/

class P17
{
	public static void main(String args[])
	{
		int rows=9,cols=5;
		for(int r =1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if( c==1 || r==c || r+c==cols*2)
				System.out.print("# ");
				else
				System.out.print("  ");
			}
			System.out.println(" ");
		}
		
	}
}

/*Output
#
# #
#   #
#     #
#       #
#     #
#   #
# #
#*/

class P18
{
	public static void main(String args[])
	{
		int rows=4,temp=1;
		for(int r =1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print((int)(Math.pow(temp,2))+" ");
				temp++;
			}
			
			System.out.println("  ");
		}
		
	}
}

/*Output
1
4 9
16 25 36
49 64 81 100*/

