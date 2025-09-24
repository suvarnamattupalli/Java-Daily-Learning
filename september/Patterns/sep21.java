class R1
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("#");
			}
			for(int j=r;j<=rows;j++)
			{
				System.out.print("$");
			}
			System.out.println("");
		}		
	}
}
/*Output
#$$$$
##$$$
###$$
####$*/

class R2
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int j=r;j<=rows;j++)
			{
				System.out.print("#");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("$");
			}
			System.out.println("");
		}		
	}
}
/*Output
####$
###$$
##$$$
#$$$$*/

class R3
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int j=r;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("$");
			}
			System.out.println("");
		}		
	}
}
/*Output
    $
   $$
  $$$
 $$$$*/

class R4
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int j=r;j<=rows;j++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(" $  ");
			}
			System.out.println("");
		}		
	}
}
/*Output
         $
       $   $
     $   $   $
   $   $   $   $*/

class R5
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=r;j++)
			{
				if(r==j || r==rows || j==1)
				System.out.print("$ ");
				else
				System.out.print("  ");
			}
			System.out.println("");
		}	
	}
}
/*Output
          $
        $ $
      $   $
    $     $
  $ $ $ $ $*/

class R6
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				if(r==c || r==rows || c==1)
				System.out.print("$ ");
				else
				System.out.print("  ");
			}
			System.out.println("");
		}		
	}
}
/*Output
     $
    $ $
   $   $
  $     $
 $ $ $ $ $*/

class R7
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("$");
			}
			System.out.println("");
		}
	}
}
/*Output
$$$$$
 $$$$
  $$$
   $$
    $*/

class R8
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r*2;c++)
			{
				System.out.print("# ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			System.out.println("");
		}		
	}
}
/*Output
          # #
        # # # #
      # # # # # #
    # # # # # # # #
  # # # # # # # # # #*/

class R9
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r*2-1;c++)
			{
				System.out.print("# ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			System.out.println("");
		}	
	}
}
/*Output
          #
        # # #
      # # # # #
    # # # # # # #
  # # # # # # # # #*/

class R10
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r*2-1;c++)
			{
				if(c==1 || r==rows || c==r*2-1)
				System.out.print("# ");
				else
				System.out.print("  ");
			}
			/*for(int c=1;c<=r;c++)
			{
				if(c==1 || r==rows)
				System.out.print("# ");
				else
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				if(c==r || r==rows)
				System.out.print("# ");
				else
				System.out.print("  ");
			}*/
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			System.out.println("");
		}	
	}
}
/*Output
          #
        #   #
      #       #
    #           #
  # # # # # # # # #*/

class R11
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("# ");
			}
			for(int c=r;c<rows;c++)
			{
				System.out.print("# ");
			}
			System.out.println("");
		}	
	}
}
/*Output
  # # # # # # #
    # # # # #
      # # #
        #*/